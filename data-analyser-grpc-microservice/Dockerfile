FROM maven:3.9.9-amazoncorretto-24 AS build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY /src /src
RUN mvn clean package -DskipTests

FROM openjdk:24-jdk-slim
COPY --from=build /target/*.jar application.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "application.jar"]