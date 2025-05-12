#
# Build stage
#
FROM gradle:jdk21-jammy AS build
COPY --chown=gradle:gradle src /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon --stacktrace --info

LABEL org.name="najlaass"
#
# Package stage
#
FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /home/gradle/src/build/libs/webtech-project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
