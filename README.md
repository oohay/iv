# Java Interview Starter Kit

While I am looking for the next job I need to demonstrate my java coding skills in short interviews by sharing my 
screen. This repo helps me do that by building a simple Java application with JUnit tests. Please feel free to create a 
branch to show your skills. I recommend using this along with your IDE for debugging. Good luck!

## Maven instructions

### Dependency

To use JUnit in Maven, it is necessary to put the test classes under `src/test/java`.  
It is also necessary to have the following dependency (already implemented):

```
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.6.0</version>
        <scope>test</scope>
    </dependency>
```

The scope says that the library should only be used for testing.

### Commands

To print the project dependencies:

```
mvn dependency:tree
```

To compile the source code:

```
mvn compile
```

To test the source code:

```
  mvn test
```

### Acknowledgment

Thank you https://github.com/miguelpardal for the Junit example that I used here.