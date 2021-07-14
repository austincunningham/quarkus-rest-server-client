# README
Quarkus REST server and REST client. Server connects to a Cassandra NoSQL DB.

## Prerequisites 
- podman or docker running 
- https://quarkus.io/get-started/

## Running Server
```bash
cd NoSql-cassandra
# starts a docker image and seeds the data from data.cql and schema.cql
./start_cassandra.sh
cd ../room-service
./mvnw compile quarkus:dev
```

## Running Client
```bash
cd room-batch
./mvnw compile quarkus:dev
```

## Stopping the Cassandra DB
```bash
cd NoSql-cassandra
./stop_cassandra.sh
```
