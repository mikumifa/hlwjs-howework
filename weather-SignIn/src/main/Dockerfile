FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD hlwjs_sign.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]