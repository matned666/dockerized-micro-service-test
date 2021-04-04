cd src/main/docker || exit
sudo docker-compose down
cd ../../.. || exit
sudo mvn clean package -o -Dmaven.test.skip=true
sudo rm src/main/docker/create-credit-ChocoladeIcecream.jar
sudo cp target/create-credit-ChocoladeIcecream.jar src/main/docker
cd src/main/docker || exit
sudo docker-compose up --force-recreate --build
cd ../../.. || exit
