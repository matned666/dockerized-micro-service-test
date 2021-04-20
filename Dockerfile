FROM adoptopenjdk/openjdk8:ubi
ARG APP
ADD ${APP}-ChocoladeIcecream.jar ChocoladeIcecream.jar
CMD java -jar ChocoladeIcecream.jar
