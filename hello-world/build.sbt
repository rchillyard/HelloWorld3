val scala3Version = "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies  ++= Seq(
        ("com.phasmidsoftware" %% "flog" % "1.0.8").cross(CrossVersion.for3Use2_13),
        "org.slf4j" % "slf4j-api" % "1.7.30",
        ("org.scalatest" % "scalatest" % "3.2.7" % "test").cross(CrossVersion.for3Use2_13),
        "com.novocode" % "junit-interface" % "0.11" % "test",
        "ch.qos.logback" % "logback-classic" % "1.2.3" % "test"
      )

  )
