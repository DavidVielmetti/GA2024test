FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/demoH-0.0.1.jar
COPY ${JAR_FILE} demoH.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demoH.jar"]