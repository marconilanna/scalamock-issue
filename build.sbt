scalaVersion in ThisBuild := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % Test
, "org.scalatest" %% "scalatest"                   % "2.2.6" % Test
)
