# Create credit 

Simple test web app including 3 modules - credit, client, product<br>
It is run with `docker-compose up`<br>
Steps:
- credit receive data, saves new credit and forwards data to product<br>
- product saves product data and returns it to credit.
- credit sends data to client
- client saves client data and returns it to credit
- credit shows written data with generated credit
----------------------------
# Architecture

create-credit(Parent) - main dependencies<br>
|<br>
|-------> common(Child) - classes used for all applications <br>
|<br>
|-------> credit(Child) - port 8089 main application<br>
|<br>
|-------> client(Child) - port 8090 - client service<br>
|<br>
|-------> product(Child) - port 8091 - product service<br>

--------------------------------
# Authentication!

no security included

--------------------------------------
# Requirements

- docker, docker-compose
- maven
--------------------------
# Usage

POST to `host:8089`<br>
with json body (required) (as example):<br>
`{`<br>
`"firstName":"John",`(min 2 signs, not null)<br>
`"lastName":"Smith",`(min 2 signs, not null)<br>
`"pesel":"xxxxxxxxxx",` (provide a valid pesel, not null)<br>
`"productName":"Luxury car",`(min 5 signs, not null)<br>
`"productValue":"100000.90"`(valid double number in String, not null)<br>
`}`<br>

---------------------------------------

GET to `host:8089`<br>
received data are all credits with client and product data<br>

additional parameters:<br>
amount - amount of records per page<br>
page - page<br>
sort[] - sorting option<br>

example:<br>
GET: localhost:8089?page=1&&amount=10&&sort=firstName,asc&&sort=creditName<br>
shows records from page 1 with 10 records per page, sorted by first name asc and credit name asc

------------------------------
#Tests

TODO

-----------------------------------------
# Docker

Dockerfile and docker-compose.yml<br>
entrypoint.sh includes jar files generation.<br>
otherwise:<br>
`mvn clean install -Dmaven.test.skip=true`<br>
`docker-compose up`

--------------------------

# Made by:

Mateusz N.