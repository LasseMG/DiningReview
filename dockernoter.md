# Docker Cheatsheet

## Docker Images
- **List images:** `docker images`
- **Pull image:** `docker pull <image>`
- **Remove image:** `docker rmi <image>`
- **Build image:** `docker build -t <image-name> .`
- **Tag image:** `docker tag <image> <new-image-name>`

## Docker Containers
- **List running containers:** `docker ps`
- **List all containers:** `docker ps -a`
- **Run container:** `docker run -d --name <container-name> <image>`
- **Stop container:** `docker stop <container-id>`
- **Start container:** `docker start <container-id>`
- **Restart container:** `docker restart <container-id>`
- **Remove container:** `docker rm <container-id>`
- **View logs:** `docker logs <container-id>`
- **Execute command inside container:** `docker exec -it <container-id> bash`

## Docker Volumes
- **List volumes:** `docker volume ls`
- **Create volume:** `docker volume create <volume-name>`
- **Remove volume:** `docker volume rm <volume-name>`

## Docker Networks
- **List networks:** `docker network ls`
- **Create network:** `docker network create <network-name>`
- **Connect container to network:** `docker network connect <network-name> <container-id>`
- **Disconnect container from network:** `docker network disconnect <network-name> <container-id>`

## Docker Compose
- **Start services:** `docker-compose up -d`
- **Stop services:** `docker-compose down`
- **Restart services:** `docker-compose restart`
- **View logs:** `docker-compose logs`

## Cleanup
- **Remove all stopped containers:** `docker container prune`
- **Remove all unused images:** `docker image prune`
- **Remove all unused networks:** `docker network prune`
- **Remove all unused volumes:** `docker volume prune`