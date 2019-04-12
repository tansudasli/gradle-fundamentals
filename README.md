# GRADLE FUNDAMENTALS

It is really hard to practise some basic concepts of gradle esp. when it comes to
* multiple modules in same IntelliJ Project
* multiple projects in same IntelliJ Workspace
* no main manifest attribute, error when executing jars

## How To Start
- [1] clone repository
- [2] `cd gradle-fundamentals `
      `chmod -R 777 .` if necessary
- [3]  To start testing, you should first run 
       <br>`./gradlew clean` and 
       <br>`./gradlew build` to create **/build/** folder. This creates **/build/libs/gradle.fundamentals-1.0-SNAPSHOT.jar** file.
- [4] to run application `./gradlew run`. You will see console messages successfully. 
- [5] if you try to run w/ `java -jar ./build/libs/gradle.fundamentals-1.0-SNAPSHOT.jar `, you will get error message *no main manifest attribute, in ./build/libs/gradle.fundamentals-1.0-SNAPSHOT.jar
*
