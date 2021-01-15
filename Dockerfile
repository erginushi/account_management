FROM maven:3.6.0-jdk-8-alpine
COPY src src
COPY pom.xml pom.xml
RUN mvn clean install


FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} account-management-1.0.0.jar
ENTRYPOINT ["java","-jar","account-management-1.0.0.jar"]
