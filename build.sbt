name := "scalajs-todo"

scalaVersion := "2.11.5"

enablePlugins(ScalaJSPlugin)

jsDependencies ++= Seq(
  "org.webjars" % "jquery" % "1.11.1" / "jquery.js" commonJSName "JQuery"
)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.7.0"
)
