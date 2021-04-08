FROM adoptopenjdk/openjdk11:ubi
ADD credit/target/credit-ChocoladeIcecream.jar .
CMD java -jar credit-ChocoladeIcecream.jar
