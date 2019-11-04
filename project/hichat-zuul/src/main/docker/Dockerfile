FROM jdk8:191
VOLUME /tmp
ADD hichat-zuul-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
