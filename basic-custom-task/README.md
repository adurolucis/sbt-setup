This is a basic build.sbt setup with a custom Task

The name of the task will be set to the name of the variable used to define the task.  In this case it is called 'hello'.

Use a lazy val to ensure that the dependencies can be resolved as needed. 

The hello task has a return type of Unit since we aren't going to be returning anything useful. The parameter is the description for the task.

In the settings list, we define the code that will execute when the hello task is called. 

**If you omit the definition of hello or the implementation in the settings, it will cause an error**
