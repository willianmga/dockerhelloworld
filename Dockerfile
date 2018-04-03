FROM openjdk:8-jdk-alpine

ADD target/dockerhelloworld.jar dockerhelloworld.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerhelloworld.jar"]