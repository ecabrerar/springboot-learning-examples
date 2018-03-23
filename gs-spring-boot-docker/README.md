# Getting Started
## [Spring Boot with Docker] (https://spring.io/guides/gs/spring-boot-docker)

#### Build a tagged docker image
./gradlew clean build docker

./gradlew --build-cache clean build docker


#### Run the docker image
docker run -p 8080:8080 -t eudriscabrera/gs-spring-boot-docker


#### Using Spring Profiles
docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 8080:8080 -t eudriscabrera/gs-spring-boot-docker 


docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -t eudriscabrera/gs-spring-boot-docker

#### Debugging the application in a Docker container
docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 8080:8080 -p 5005:5005 -t eudriscabrera/gs-spring-boot-docker

