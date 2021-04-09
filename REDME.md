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
`"firstName":"John",`(min 2 signs, not null)<br>
`"lastName":"Smith",`(min 2 signs, not null)<br>
`"pesel":"xxxxxxxxxx",` (provide a valid pesel, not null)<br>
`"productName":"Luxury car",`(min 5 signs, not null)<br>
`"productValue":"100000.90"`(valid double number in String, not null)<br>
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