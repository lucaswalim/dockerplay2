FROM openjdk:11
COPY ./src /app/
WORKDIR /app
RUN javac Execute.java
ENTRYPOINT ["java", "Execute"]