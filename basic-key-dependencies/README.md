This is a basic project that shows how keys can be defined in terms of other keys.

In other words, one key can be a dependency of another key.  SBT will list a keys'
dependencies with ```inspect```.  In this project the ```name``` key is dependent
on the ```baseDirectory``` key.  

```
inspect name
```

Circular references are not allowed. SBT will throw an error
