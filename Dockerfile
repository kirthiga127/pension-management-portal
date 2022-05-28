FROM openjdk:8
EXPOSE 8500
ADD target/pensionmanagementportal.jar pensionmanagementportal.jar
ENTRYPOINT ["java","-jar","/pensionmanagementportal.jar"]
