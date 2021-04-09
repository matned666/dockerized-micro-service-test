# Create credit 

Simple test web app including 3 modules - credit, client, product<br>
It is run with `docker-compose`<br>
Steps:<br>
- credit receive data, saves new credit and forwards data to product<br>
- product saves product data and returns it to credit.
- credit sends data to client
- client saves client data and returns it to credit
- credit shows written data with generated credit

# Authentication!

no security included

# Requirements

- docker, docker-compose
- maven

# Usage

making POST to `host:8089`<br>
with json body as example:<br>
`{`<br>
`"firstName":"John",`<br>
`"lastName":"Smith",`<br>
`"pesel":"12345678",`<br>
`"productName":"Luxury car",`<br>
`"productValue":100000`<br>
`}`<br>

#Tests

TODO

# Docker

Dockerfile and docker-compose.yml<br>
entrypoint.sh includes jar files generation.<br>
otherwise:<br>
`mvn clean install -Dmaven.test.skip=true`<br>
`docker-compose up`

# Kubernetes

TODO

# Made by:

Mateusz N.