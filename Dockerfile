FROM	openjdk:11.0.16
WORKDIR	/app
EXPOSE	8080
ADD	./target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT	["java","-jar","/app/demo-0.0.1-SNAPSHOT.jar"]
