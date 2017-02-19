name := "herdingcats"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.4"
libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"
libraryDependencies += compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
libraryDependencies += compilerPlugin("org.spire-math" %% "kind-projector" % "0.6.3")
libraryDependencies += "org.scalamacros" %% "resetallattrs" % "1.0.0-M1"

