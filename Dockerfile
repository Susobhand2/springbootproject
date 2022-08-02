FROM java:8
ADD target/springbootproject-0.0.1-SNAPSHOT.jar springbootproject-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","springbootproject-0.0.1-SNAPSHOT.jar" ]
