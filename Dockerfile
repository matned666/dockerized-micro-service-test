FROM adoptopenjdk/openjdk8:ubi
ARG APP
ADD ${APP}/target/${APP}-ChocoladeIcecream.jar ChocoladeIcecream.jar
CMD java -jar ChocoladeIcecream.jar
