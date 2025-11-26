# build stage
FROM maven:3.9-eclipse-temurin-17-alpine AS build

WORKDIR /app

# Copy pom and sources
COPY pom.xml .
COPY src ./src

# Build the jar
RUN mvn -B -e clean package -DskipTests

# runtime stage
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# copy the built jar from the build stage
COPY --from=build /app/target/empolyeedata-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
