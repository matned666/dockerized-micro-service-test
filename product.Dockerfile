FROM adoptopenjdk/openjdk11:ubi
ADD product/target/product-ChocoladeIcecream.jar .
CMD java -jar product-ChocoladeIcecream.jar