import _root_.sbt.Keys._
import _root_.sbt.TestFrameworks
import _root_.sbt.Tests

name := "string calculator kata"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")
