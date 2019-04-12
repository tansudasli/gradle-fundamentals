# GRADLE FUNDAMENTALS

It is really hard to practise some basic concepts of gradle esp. when it comes to
* multiple modules in same IntelliJ Project
* multiple projects in same IntelliJ Workspace
* no main manifest attribute, error when executing jars (step 5)
* no run task in gradle menu (step 4)

## How To Start
- [1] clone repository
- [2] `cd gradle-fundamentals `
      `chmod -R 777 .` if necessary
- [3]  To start testing, you should first run 
       <br>`./gradlew clean` to delete everything under **/build/** folder, and 
       <br>`./gradlew build` to create **/build/** folder. This creates **/build/libs/gradle.fundamentals-1.0-SNAPSHOT.jar** file.
- [4] to run application `./gradlew run`. This also **shows Run task in Gradle menu**<br>
  You will see console messages successfully. <br><br>
  to be able to to do that, you need some additional lines in your **build.gradle** file.<br>
     ```
     plugins {
         id 'java'
         id 'application' #add this
     }
     
     mainClassName = 'HelloWorld'  #add this
- [5] if you try to run w/ `java -jar ./build/libs/gradle.fundamentals-1.0-SNAPSHOT.jar `, you will get error message **no main manifest attribute, in ./build/libs/gradle.fundamentals-1.0-SNAPSHOT.jar** 
      <br><br>So, you should add below lines into your lines in your **build.gradle** file<br>
   ```
   jar {
       manifest {
           attributes('Implementation-Title': 'Gradle fundamentals',
                      'Implementation-Version': version,
                      'Class-Path': configurations.compile.collect { it.getName() }.join(' '),
                      'Main-Class': 'HelloWorld')
   
       }
   }
- [6]