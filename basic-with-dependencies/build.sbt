lazy val root = (project in file("."))
	.settings(
		name := "example with two dependencies",
		libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3",
		libraryDependencies += "org.unitils.jodatime" % "unitils-jodatime" % "1.0.2",
		libraryDependencies ++= Seq(
			"org.tinygroup" % "mongodb" % "0.0.12",
			"org.atmosphere" % "atmosphere-redis" % "2.2.1" % "test"
		),
		resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"	
	)
