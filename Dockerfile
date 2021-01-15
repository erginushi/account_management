FROM maven:3.6.0-jdk-8-alpine AS build  
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean install

FROM openjdk:8-jdk-alpine  
COPY --from=build /usr/src/app/target/account-management-1.0.0.jar /usr/app/account-management-1.0.0.jar  
ENTRYPOINT ["java","-jar","/usr/app/account-management-1.0.0.jar"]
