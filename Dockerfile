FROM adoptopenjdk/openjdk15:ubi
ADD target/user-mysql-2.jar user-mysql-2.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "user-mysql-2.jar"]