# Data store gRPC microservice

### Usage

To start an application you need to pass variables to `.env` file.

You can use example `.env.example` file with some predefined environments.

You can find Docker compose file
in [Data analyser gRPC service] `docker/docker-compose.yaml`.

Application is running on port `8083`.

All insignificant features (checkstyle, build check, dto validation) are not
presented.

Just after startup application will try to connect to gRPC server and begin to
fetch batch updates of `BATCH_SIZE` every 10s.
