import sbt._
import Import._

object PluginDef extends Build {
  override def projects = Seq(root)
  lazy val root = Project("plugins", file(".")) dependsOn(proguard, git)
  lazy val proguard = uri("git://github.com/sbt/sbt-proguard.git#e7b4732969c137db1b5")
  lazy val git = uri("git://github.com/sbt/sbt-git.git#2e7c2503850698d60bb")
}