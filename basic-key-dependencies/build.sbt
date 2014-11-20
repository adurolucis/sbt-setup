lazy val root = (project in file("."))
	.settings(
		//name is a Key[String]
		//baseDirectory is a Key[File]
		name := "project at " + baseDirectory.value.getName
	)
