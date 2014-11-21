lazy val root = (project in file(".")).
	aggregate(alpha, beta)
	.settings(
		organization := "adurolucis"
	)

lazy val alpha = project

lazy val beta = project.dependsOn(other)

lazy val other = project in file("charlie")
