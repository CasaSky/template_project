# Deployment guide
- specify which sub module / service you want to deploy and select the corresponding ecr path  
- login to ecr service  
```
aws ecr get-login-password --region eu-central-1 | docker login --username AWS --password-stdin 182355820400.dkr.ecr.eu-central-1.amazonaws.com
```
- create new jar files for all mvn modules  
```
./mvnw clean install
```
- change directory to the sub module you want to deploy  
```
cd earth_ws
```
- build docker image  
```
docker build -t earthws .
```
- tag the new docker image  
```
docker tag earthws:latest 182355820400.dkr.ecr.eu-central-1.amazonaws.com/earthws:latest
```
- push the newly created docker image to the related ecr repository  
```
docker push 182355820400.dkr.ecr.eu-central-1.amazonaws.com/earthws:latest
```
- pick the cluster and service name for the webservice you want to deploy  
- trigger an update for ecs to start a new task / container using the last available docker image in the related ecr repository   
```
aws ecs update-service --force-new-deployment --cluster earthws-fg-cluster --service earthws-fg-service --region eu-central-1
```