FROM openjdk:8
COPY ./target/SPE_Miniproject_withLogs-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
ENV TZ="Asia/Kolkata"
