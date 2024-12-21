import sbt.{Def, *}

object ChromiseryBuild extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  override def buildSettings: List[Def.Setting[?]] = List(
    buildPlatform := currentPlatform
  )

  // Define the sealed trait and case objects
  sealed trait Platform
  case object Windows extends Platform
  case object Linux extends Platform

  // Function to determine the current running platform
  def currentPlatform: Platform = {
    val osName = System.getProperty("os.name").toLowerCase
    if (osName.contains("win")) Windows
    else if (osName.contains("nux") || osName.contains("nix")) {
      Linux
    } else throw new UnsupportedOperationException(s"Unsupported OS: $osName")
  }

  val buildPlatform = settingKey[Platform]("The current running platform").withRank(KeyRanks.Invisible)

  object autoImport {

    val platform = ChromiseryBuild.buildPlatform
    type Platform = ChromiseryBuild.Platform
    val Windows = ChromiseryBuild.Windows
    val linux = ChromiseryBuild.Linux

  }
}
