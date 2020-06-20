libraryDependencies += "ch.epfl.lamp" %% "dotty-staging" % scalaVersion.value

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-example-project",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",

    scalaVersion := "3.0.0-M3",

    libraryDependencies += "org.scala-lang" %% "scala3-tasty-inspector" % scalaVersion.value,

    useScala3doc := true,
  )
