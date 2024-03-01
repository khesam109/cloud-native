To run test:
./gradlew test

To compiles the code and packages the application as a JAR file:
./gradlew bootJar

Combines the operations of the bootJar and test tasks:
./gradlew build

To run the application:
./gradlew bootRun

To package application as a container image:
./gradlew bootBuildImage
