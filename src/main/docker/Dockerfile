#Based on example from spring.io
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD hello-world-0.0.1-SNAPSHOT.jar hello-world.jar
RUN sh -c 'touch /hello-world.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /hello-world.jar" ]
