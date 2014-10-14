organization  := "com.geowarin"

version       := "0.1"

//scalaVersion  := "2.11.2"
scalaVersion := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/service/local/repositories/snapshots/content"

resolvers += "Sprest Snapshots" at "http://sprest.io/snapshots"

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  Seq(
//    "io.spray"            %%  "spray-can"           % sprayV,
//    "io.spray"            %%  "spray-routing"       % sprayV,
//    "io.spray"            %%  "spray-json"          % "1.3.0",
//    "io.spray"            %%  "spray-testkit"       % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"          % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"        % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"         % "2.3.11" % "test",
//    "sprest"              %% "sprest-slick"         % "0.3.3-SNAPSHOT",
    "sprest"              %% "sprest-reactivemongo" % "0.3.3-SNAPSHOT"
  )
}

Revolver.settings
