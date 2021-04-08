FROM adoptopenjdk/openjdk11:ubi
ADD client/target/client-ChocoladeIcecream.jar .
CMD java -jar client-ChocoladeIcecream.jar
