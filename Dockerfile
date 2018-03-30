FROM openjdk:8-jre-alpine

ADD build/libs/*.jar app.jar

ENV SPRING_PROFILE="default"

EXPOSE 8080

ENTRYPOINT exec java -Dspring.profiles.active=$SPRING_PROFILE -jar /app.jar


