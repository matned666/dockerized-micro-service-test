BEGIN;

SET client_encoding = 'LATIN1';

create table IF NOT EXISTS client_entity (
	id INTEGER NOT NULL   ,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	credit_id INTEGER NOT NULL,
	made_by VARCHAR(100) NOT NULL,
	updated_by VARCHAR(100) NOT NULL,
	create_time DATE NOT NULL,
	update_time DATE NOT NULL,
    version INTEGER NOT NULL
);

create table IF NOT EXISTS credit_entity (
	id INTEGER NOT NULL,
	credit_name VARCHAR(150) NOT NULL,
	made_by VARCHAR(100) NOT NULL,
	updated_by VARCHAR(100) NOT NULL,
	create_time DATE NOT NULL,
	update_time DATE NOT NULL,
    version INTEGER NOT NULL
);

create table IF NOT EXISTS product_entity (
	id INTEGER NOT NULL,
	product_name VARCHAR(200),
	product_value NUMERIC(19, 2) NOT NULL,
	credit_id INTEGER NOT NULL,
	made_by VARCHAR(100) NOT NULL,
	updated_by VARCHAR(100) NOT NULL,
	create_time DATE NOT NULL,
	update_time DATE NOT NULL,
    version INTEGER NOT NULL
);


insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time, version) values (1, 'Gracia', 'Margach', 1, 'gmargach0@soup.io', 'gmargach0@yale.edu', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 1);
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time, version) values (2, 'Katti', 'Grigs', 2, 'kgrigs1@addtoany.com', 'kgrigs1@fema.gov', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 2);
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time, version) values (3, 'Steven', 'Manilove', 3, 'smanilove2@prlog.org', 'smanilove2@google.co.uk', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 2);

insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time, version) values (1, 'jcb', 'wcorran0@yahoo.co.jp', 'jwallworth0@telegraph.co.uk', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 1);
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time, version) values (2, 'jcb', 'hirnis1@icq.com', 'hblumfield1@netlog.com', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 2);
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time, version) values (3, 'maestro', 'epicopp2@wsj.com', 'dronchi2@cargocollective.com', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 2);

insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time, version) values (1, 'Technology', '7755.78', 1, 'afierman0@usda.gov', 'lpatten0@freewebs.com', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 1);
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time, version) values (2, 'Public Utilities', '42447.50', 2, 'smctrustam1@mac.com', 'rpetican1@vistaprint.com', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 2);
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time, version) values (3, 'Consumer Services', '19044.58', 3, 'mdemanuele2@yahoo.co.jp', 'tarbuckle2@photobucket.com', '2021-03-03T03:49:52Z', '2021-03-26T19:58:08Z', 2);

ALTER TABLE ONLY credit_entity
    ADD CONSTRAINT credit_entity_pkey PRIMARY KEY (id);

ALTER TABLE ONLY client_entity
    ADD CONSTRAINT client_entity_pkey PRIMARY KEY (id);

ALTER TABLE ONLY product_entity
    ADD CONSTRAINT product_entity_pkey PRIMARY KEY (id);

ALTER TABLE ONLY client_entity
    ADD CONSTRAINT client_entity_fkey FOREIGN KEY (credit_id) REFERENCES credit_entity(id);

ALTER TABLE ONLY product_entity
    ADD CONSTRAINT product_entity_fkey FOREIGN KEY (credit_id) REFERENCES credit_entity(id);


COMMIT;

ANALYZE credit_entity;
ANALYZE client_entity;
ANALYZE product_entity;