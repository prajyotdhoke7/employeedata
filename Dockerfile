FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# copy the built jar (Render will build with your Dockerfile after mvn package)
COPY target/empolyeedata-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
