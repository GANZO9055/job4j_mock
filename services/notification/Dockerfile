# 1 Этап - Сборка проекта в jar
FROM maven:3.6.3-openjdk-17 as maven
RUN mkdir notification
WORKDIR notification
COPY . .
RUN mvn package -Dmaven.test.skip=true
CMD ["mvn", "liquibase:update", "-Pdocker"]

# 2 Этап - Указание как запустить проект
FROM openjdk:17.0.2-jdk
WORKDIR notification
COPY --from=maven /notification/target/notification.jar app.jar
CMD java -jar app.jar