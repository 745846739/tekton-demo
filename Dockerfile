FROM openjdk
COPY target/tekton-*.jar /root
USER root
CMD ["/bin/bash", "-c", "java -jar /root/tekton-*.jar"]