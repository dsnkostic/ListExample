name := "ListExample"
version := "1.0"
scalaVersion := "2.12.4"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
