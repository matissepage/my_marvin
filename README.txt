sudo docker build -t jenkins:jcasc .
sudo docker run --name jenkins --rm -p 8080:8080 jenkins:jcasc
sudo docker run --name jenkins --rm -p 8080:8080 --env USER_CHOCOLATEEN_PASSWORD=admin --env USER_VAUGIE_G_PASSWORD=password jenkins:jcasc