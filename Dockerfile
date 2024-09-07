# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
#WORKDIR server

# Add the Spring Boot JAR file to the container (replace with your JAR file name)
COPY app.jar /app/app.jar

# Expose port 8079 (or the port your app runs on)
EXPOSE 8079

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
