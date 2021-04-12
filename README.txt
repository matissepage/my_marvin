sudo docker build -t jenkins:jcasc .
sudo docker run --name jenkins --rm -p 8080:8080 jenkins:jcasc