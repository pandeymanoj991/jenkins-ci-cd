FROM openjdk:17
WORKDIR /appContainer
copy ./target/jenkins-ci-cd.jar /appContainer
EXPOSE 8282
CMD ["java","-jar","jenkins-ci-cd.jar"]