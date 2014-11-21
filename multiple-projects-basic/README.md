This is an example of a build containing multiple projects

A project is defined by declaring lazy val of type ```Project```.  By default, the name given to the val will be used as the ```baseDirectory``` for the project.  This can be changed from the default by specifying the directory name as an argument to the ```file``` function

```
lazy val specified = project in file("directoryName")
```


An aggregate project is specified by using the ```aggregate``` method on the ```Project``` type and specifying the projects of which it is an aggregate

```
lazy val combined = project.aggregate(otherProject, anotherProject)
```

## Classpath dependencies ##
If a project depends on another project, use the ```dependsOn``` method call

```
lazy val core = project.dependsOn(util)
```

### Per configuration ###
The dependency can be per configuration
```
//compile in core depends on test in util
lazy val core = project.dependsOn(util % "compile->test")

//omitting the ->config part implies ->compile
//test in core depends on compile in util
lazy val core = project.dependsOn(util % "test")

//multiple dependencies can be specified
lazy val core = project.dependsOn(util % "test->test;compile->compile")
```
## Selecting a Project ##
Use the ```project``` command to select a project as the current project.  Any command will only affect the current project

