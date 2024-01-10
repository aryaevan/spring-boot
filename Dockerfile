# Use the official OpenJDK base image with Java 8
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/Portofolio-0.0.1-SNAPSHOT.jar /app/spring-boot-app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8081

# Specify the command to run on container start
CMD ["java", "-jar", "spring-boot-app.jar"]
