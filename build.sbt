val scala3Version = "3.1.1" // TODO: Scala 3 version

inThisBuild(
  Seq(
    organization := "io.github.mutsuhiro6",
    homepage := Some(url("https://github.com/mutsuhiro6/TODO")), // TODO: repo name
    licenses := Seq(
      "The MIT License" -> url("http://opensource.org/licenses/MIT") // TODO: confirm license
    ),
    developers := List(
      Developer(
        id = "mutsuhiro6",
        name = "Mutsuhiro Iwamoto",
        email = "mutsuhiro6@icloud.com",
        url = url("https://github.com/mutsuhiro6")
      )
    ),
    versionScheme := Some("semver-spec"),
    sonatypeCredentialHost := "s01.oss.sonatype.org",
    sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
  )
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "TODO", // Specify library name
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.10" % "test" // TODO: confirm version
    )
  )
