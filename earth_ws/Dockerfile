FROM openjdk:15-oraclelinux8

RUN microdnf update -y
RUN echo 'root:xVHUCSH@eXZ7Lgw5' | chpasswd

COPY target/libs /app/libs
COPY target/earth_ws-1.0.jar /app/libs

ENTRYPOINT ["java","-cp","app:app/libs/*","com.casasky.earth_ws.EarthWsApplication","-Dlog4j2.contextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector"]