ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.18"
lazy val kafkaVersion = "2.8.1"

libraryDependencies ++= Seq(
  "org.apache.kafka" %% "kafka" % kafkaVersion,
  "org.apache.kafka" % "kafka-clients" % kafkaVersion,
  "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.5.3",
  "org.apache.spark" %% "spark-sql" % "3.5.3" % Provided,
  "org.apache.spark" %% "spark-streaming" % "3.5.3" % Provided,
  "io.netty" % "netty-transport-native-epoll" % "4.1.96.Final" classifier "linux-x86_64",
  "io.netty" % "netty-transport-native-unix-common" % "4.1.96.Final"
)

lazy val root = (project in file("."))
  .settings(
    name := "scala"
  )
