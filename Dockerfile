FROM openjdk:8-jdk-alpine

ADD target/helloworldspringboot.jar helloworldspringboot.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/helloworldspringboot.jar"]