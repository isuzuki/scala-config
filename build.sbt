name := "scala-config"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-target:jvm-1.8",
  "-Xfatal-warnings",
  "-Xfuture",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused",
  "-Ywarn-unused-import",
  "-Yno-adapted-args"
)

libraryDependencies ++= Seq(
  "com.iheart"    %% "ficus"     % "1.4.3",
  "com.typesafe"  %  "config"    % "1.3.2",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)
