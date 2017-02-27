name := "sbt-pillar"
organization := "com.chrisomeara"
version := "3.0.0"
scalaVersion := "2.10.6"
homepage := Some(url("https://github.com/comeara/sbt-pillar"))
licenses := Seq("MIT license" -> url("http://www.opensource.org/licenses/mit-license.php"))
libraryDependencies ++= Seq(
  "com.chrisomeara" %% "pillar-core" % "3.0.0"
)
publishMavenStyle := true
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
publishArtifact in Test := false
pomIncludeRepository := { _ => false }

pomExtra := (
  <scm>
    <url>git@github.com:comeara/sbt-pillar.git</url>
    <connection>scm:git:git@github.com:comeara/sbt-pillar.git</connection>
  </scm>
  <developers>
    <developer>
      <id>comeara</id>
      <name>Chris O'Meara</name>
      <url>https://github.com/comeara</url>
    </developer>
  </developers>)

sbtPlugin := true
