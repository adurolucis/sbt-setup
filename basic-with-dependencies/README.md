This is a basic build.sbt setup that shows how to add managed dependencies to the project

This is done by appending to the ```libraryDependencies``` key

It uses the maven format where the first param is the GroupId, the 2nd is the arfifactId and the 3rd is the desired version

Example:
```
libraryDependencies += "org.unitils.jodatime" % "unitils-jodatime" % "1.0.2"
```



