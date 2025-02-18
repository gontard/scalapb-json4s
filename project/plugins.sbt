addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.1.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.5")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.0-RC7-1")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.9"

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.8.1")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")
