# Data analyser gRPC microservice


### Usage

To start an application you need to pass variables to `.env` file.

You can use example `.env.example` file with some predefined environments.

You can find Docker compose file in `docker/docker-compose.yaml`.

Application is running on port `8082`.

All insignificant features (checkstyle, build check, dto validation) are not
presented.

### Docker

You can run all course applications via `docker-compose.yaml` from `docker`
folder.

It contains all needed configs.

Note that all services must be in the same network to communicate with each
other.