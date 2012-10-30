seq(webSettings :_*)

name := "football-stats"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq("org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
"net.liftweb" %% "lift-webkit" % "2.5-M2" % "compile->default"
)