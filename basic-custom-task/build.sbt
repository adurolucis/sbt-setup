lazy val hello = taskKey[Unit]("Say hello to the world")

lazy val root = (project in file(".")).
	settings(
		name := "Custom Key",
		version:= "0.2",
		hello := {println("this is how we do it")}
	)
