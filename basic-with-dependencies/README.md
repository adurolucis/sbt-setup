This is a basic build.sbt setup that shows how to add managed dependencies to the project

This is done by appending to the ```libraryDependencies``` key

It uses the maven format where the first param is the GroupId, the 2nd is the arfifactId and the 3rd is the desired version

Example:
```
libraryDependencies += "org.unitils.jodatime" % "unitils-jodatime" % "1.0.2"
```

A 4th parameter can be used to specify the configuration in which the dependency is needed:

```
libraryDependencies += "org.unitils.jodatime" % "unitils-jodatime" % "1.0.2" % "test"
```

The list of default respositories that sbt uses (such as maven central) is stored in a key called
```externalResolvers```.  To add a repo to the list that sbt will use, it should be added to the Key
 ```resolvers```. The ```at``` method creates a resolver from two strings:

 ```
 resolvers += "<Repo Name>" at "<Repo URL>"
 ```



