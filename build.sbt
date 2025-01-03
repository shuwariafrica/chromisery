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

lazy val `chromisery-pos` = project
  .in(file("modules/chromisery-pos"))
  .enablePlugins(JFXPlugin)
  .enablePlugins(NetbeansPlugin)
  .settings(jfxModules ++= Set(JFXModule.Fxml, JFXModule.Web, JFXModule.Swing))
  .settings(javaCompilerOptions)
  .settings(
    libraryDependencies ++= Dependencies.posDependencies,
    Compile / unmanagedJars ++= Dependencies.posUnmanagedDependencies,
    fork := true,
    Compile / mainClass := Some("uk.chromis.pos.forms.StartPOS")
  )

lazy val `chromisery-pos-root` =
  project
    .in(file("."))
    .notPublished
    .gplv3Licensed
    .aggregate(`chromisery-pos`)

inThisBuild(
  List(
    developers := List(
      Developer(
        "shuwari-dev",
        "Shuwari Africa Ltd. Developer Team",
        "developers at shuwari dot africa",
        url("https://shuwari.africa")
      )
    ),
    versionScheme := Some("semver-spec"),
    headerCopyrightHolder := Some("the original author(s)"),
    crossPaths := false,
    autoScalaLibrary := false,
    managedScalaInstance := false
  )
)
