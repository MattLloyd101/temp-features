import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "temp-features"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "info.cukes" % "cucumber-scala" % "1.0.9"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
    )

}
