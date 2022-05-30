FROM adoptopenjdk/openjdk15:alpine-jre
VOLUME /tmp
EXPOSE 8500
ADD target/*.jar pensionmanagementportal.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /pensionmanagementportal.jar" ]

#FROM openjdk:8
#EXPOSE 8500
#ADD target/pensionmanagementportal.jar pensionmanagementportal.jar
#ENTRYPOINT ["java","-jar","pensionmanagementportal.jar"]
#
