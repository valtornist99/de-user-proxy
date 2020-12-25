FROM adoptopenjdk/openjdk11:ubi
ADD target/user-proxy.jar /app.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=docker","/app.jar"]