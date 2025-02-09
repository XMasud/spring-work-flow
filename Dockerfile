FROM openjdk:17-jdk

WORKDIR /app

COPY target/spring-work-flow-0.0.1-SNAPSHOT.jar  /app/spring-work-flow.jar

EXPOSE 8080

CMD["java", "-jar", "spring-work-flow.jar"]