FROM adoptopenjdk/openjdk11:ubi
ADD credit/target/credit-ChocoladeIcecream.jar .
CMD java -jar credit-ChocoladeIcecream.jar

FROM adoptopenjdk/openjdk11:ubi
ADD client/target/client-ChocoladeIcecream.jar .
CMD java -jar client-ChocoladeIcecream.jar

FROM adoptopenjdk/openjdk11:ubi
ADD product/target/product-ChocoladeIcecream.jar .
CMD java -jar product-ChocoladeIcecream.jar