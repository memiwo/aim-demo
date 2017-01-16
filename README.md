# aim-demo

A Demo Spring boot with docker created for AIM.

A Simple Hello World application


#Build - this command will create a docker image with name hello-world
gradle buildDocker
#Run 
docker run -p 8080:8080 hello-world
