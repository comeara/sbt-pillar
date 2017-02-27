lazy val root = Project("plugins", file(".")) dependsOn(pillarPlugin)
lazy val pillarPlugin = file("..").getAbsoluteFile.toURI
