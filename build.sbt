name := "Chromisery"

organization := "com.kokkoscafe.chromisery"

organizationName := "Kokkos Cafe Ltd."

organizationHomepage := Some(url("https://kokkoscafe.com"))

startYear := Some(2024)

// Java compiler options to be shared across modules
val javaCompilerOptions =
  javacOptions ++= Seq(
    "-Xlint:all", // Enable all recommended warnings
    "-Xlint:-processing", // Disable warnings about annotation processing
    //  "-Werror",                    // Treat warnings as errors TODO: One Day!
    "-deprecation" // Show warnings about using deprecated APIs
  )

lazy val `chromisery-common` = project
  .in(file("modules/chromisery-common"))
  .shuwariProject
  .enablePlugins(JFXPlugin)
  .enablePlugins(NetbeansPlugin)
  .settings(jfxModules ++= Set(JFXModule.Fxml, JFXModule.Web, JFXModule.Swing))
  .settings(javaCompilerOptions)
  .settings(
    autoScalaLibrary := true,
    managedScalaInstance := true
  )

lazy val `chromisery-pos` = project // TODO: Handle native libraries / extensions correctly (rxtx, etc.) [task]
  .in(file("modules/chromisery-pos"))
  .dependsOn(`chromisery-common`)
  .enablePlugins(JFXPlugin)
  .enablePlugins(NetbeansPlugin)
  .settings(jfxModules ++= Set(JFXModule.Fxml, JFXModule.Web, JFXModule.Swing))
  .settings(javaCompilerOptions)
  .settings(
    libraryDependencies ++= Dependencies.posDependencies,
    Compile / unmanagedJars ++= Dependencies.posUnmanagedDependencies,
    fork := true,
    Compile / mainClass := Some("uk.chromis.pos.forms.StartPOS"),
    autoScalaLibrary := false,
    managedScalaInstance := false
  )

lazy val `chromisery-pos-root` =
  project
    .in(file("."))
    .shuwariProject
    .notPublished
    .gplv3Licensed
    .aggregate(`chromisery-common`)
    .aggregate(`chromisery-pos`)
    .settings(
      version := versionSetting.value,
      dynver := versionSetting.toTaskable.toTask.value,
      developers := List(
        Developer(
          "shuwari-dev",
          "Shuwari Africa Ltd. Developer Team",
          "developers at shuwari dot africa",
          url("https://shuwari.africa")
        )
      )
    )

inThisBuild(
  List(
    scalaVersion := "3.4.3",
    scmInfo := ScmInfo(
      url("https://github.com/shuwariafrica/laminae"),
      "scm:git:https://github.com/shuwariafrica/laminae.git",
      Some("scm:git:git@github.com:shuwariafrica/laminae.git")
    ).some,
    headerCopyrightHolder := Some("the original author(s)"),
    crossPaths := false,
    semanticdbEnabled := true
  )
)

def packagingSettings = List(
  packageOptions += Package.ManifestAttributes(
    "Built-By" -> System.getProperty("os.name"),
    "Build-Jdk" -> System.getProperty("java.version"),
    "Specification-Title" -> name.value,
    "Specification-Version" -> version.value,
    "Specification-Vendor" -> organizationName.value,
    "Implementation-Title" -> name.value,
    "Implementation-Version" -> implementationVersionSetting.value,
    "Implementation-Vendor-Id" -> organization.value,
    "Implementation-Vendor" -> organizationName.value
  )
)

def baseVersionSetting(appendMetadata: Boolean): Def.Initialize[String] = {
  def baseVersionFormatter(in: sbtdynver.GitDescribeOutput) = {
    val meta = if (appendMetadata) s"+${in.commitSuffix.distance}.${in.commitSuffix.sha}" else ""
    if (!in.isSnapshot()) in.ref.dropPrefix
    else {
      val parts = in.ref.dropPrefix
        .split("\\.")
        .map(_.toInt)
        .updated(in.ref.dropPrefix.split("\\.").length - 1, in.ref.dropPrefix.split("\\.").last.toInt + 1)
      s"${parts.mkString(".")}-SNAPSHOT$meta"
    }
  }
  Def.setting(dynverGitDescribeOutput.value.mkVersion(baseVersionFormatter, "SNAPSHOT"))
}

def versionSetting = baseVersionSetting(appendMetadata = false)
def implementationVersionSetting = baseVersionSetting(appendMetadata = true)
