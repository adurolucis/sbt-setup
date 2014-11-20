lazy val root = (project in file("."))
	.settings(
		name := "example with two dependencies",
		libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3",
		libraryDependencies += "org.unitils.jodatime" % "unitils-jodatime" % "1.0.2"
	)
