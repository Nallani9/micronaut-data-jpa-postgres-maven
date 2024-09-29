# micronaut-data-jpa-postgres-maven

## Micronaut 4.6.2 Documentation

- [User Guide](https://docs.micronaut.io/4.6.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.6.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.6.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---
## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)


## Feature lombok documentation

- [Micronaut Project Lombok documentation](https://docs.micronaut.io/latest/guide/index.html#lombok)

- [https://projectlombok.org/features/all](https://projectlombok.org/features/all)



# Docker Local:

## Start Docker:
```shell
/c/Program\ Files/Docker/Docker/Docker\ Desktop.exe &
```
````powershell
powershell.exe -Command "Start-Process 'C:\\Program Files\\Docker\\Docker\\Docker Desktop.exe'"
````
## Start Docker:

````powershell
powershell.exe -Command "Get-Process -Name 'com.docker.backend' | Stop-Process -Force"
````

## MY SQL:

```shell
docker run -it --rm \
-p 3306:3306 \
-e MYSQL_DATABASE=db \
-e MYSQL_USER=sherlock \
-e MYSQL_PASSWORD=elementary \
-e MYSQL_ALLOW_EMPTY_PASSWORD=true \
mysql:8
```

## Postgres:

```shell
docker run -it --rm \
-p 5432:5432 \
--name nallani \
-e POSTGRES_USER=nallani \
-e POSTGRES_PASSWORD=nallani \
-e POSTGRES_DB=sri \
library/postgres
```

## PgAdmin with Docker:

```shell
docker run \
-p 5050:80 \
-e "PGADMIN_DEFAULT_EMAIL=nallanisrikanth99@gmail.com" \
-e "PGADMIN_DEFAULT_PASSWORD=nallani" \
-d dpage/pgadmin4
```

## Connection String for PgAdmin
http://localhost:5050/browser/

### Pg Admin Login:
* nallanisrikanth99@gmail.com
* nallani

### DB Connection:
* name: local
* host: host.docker.internal
* database: sri
* user: nallani
* password: nallani

### SQL Strings:

````
CREATE TABLE IF NOT EXISTS public.nallani
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    city character varying(255) COLLATE pg_catalog."default",
    code character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT nallani_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.nallani
    OWNER to nallani;

````

```
SELECT id, name, city, code FROM public.nallani;
```

```
INSERT INTO public.nallani(id, name, city, code)
VALUES ('1', 'Raleigh Durham Airport', 'Raleigh', 'RDU');
```

### Terminate Port:

````shell
netstat -ano | findstr :8080
````
````shell
taskkill //PID 21988 //F
````

### Postman Curl's:

````shell
curl --location 'http://localhost:8080/nallani/1'
````

````shell
curl --location 'http://localhost:8080/nallani'
````
````shell
curl --location 'http://localhost:8080/nallani/ids' \
--header 'Content-Type: application/json' \
--data '{
    "ids":[
        "1",
        "2",
        "3",
        "4"
    ]
}'
````