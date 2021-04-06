BEGIN;

SET client_encoding = 'LATIN1';

create table IF NOT EXISTS client_entity (
                                             id INTEGER NOT NULL   ,
                                             first_name VARCHAR(50) NOT NULL,
                                             last_name VARCHAR(50) NOT NULL,
                                             credit_id INTEGER NOT NULL
);

create table IF NOT EXISTS credit_entity (
                                             id INTEGER NOT NULL,
                                             credit_name VARCHAR(150) NOT NULL
);

create table IF NOT EXISTS product_entity (
                                              id INTEGER NOT NULL,
                                              product_name VARCHAR(200),
                                              product_value NUMERIC(19, 2) NOT NULL,
                                              credit_id INTEGER NOT NULL
);


insert into client_entity (id, first_name, last_name, credit_id) values (1, 'Gracia', 'Margach', 1);
insert into client_entity (id, first_name, last_name, credit_id) values (3, 'Steven', 'Manilove', 3);
insert into client_entity (id, first_name, last_name, credit_id) values (4, 'Blayne', 'McGrane', 4);
insert into client_entity (id, first_name, last_name, credit_id) values (5, 'Carma', 'Boreland', 5);
insert into client_entity (id, first_name, last_name, credit_id) values (6, 'Evvie', 'Passe', 6);
insert into client_entity (id, first_name, last_name, credit_id) values (7, 'Magdalene', 'Westover', 7);
insert into client_entity (id, first_name, last_name, credit_id) values (8, 'Wilbert', 'Nuton', 8);
insert into client_entity (id, first_name, last_name, credit_id) values (9, 'Belle', 'Cotterill', 9);
insert into client_entity (id, first_name, last_name, credit_id) values (10, 'Redford', 'Ridwood', 10);
insert into client_entity (id, first_name, last_name, credit_id) values (11, 'Marieann', 'McGillecole', 11);
insert into client_entity (id, first_name, last_name, credit_id) values (12, 'Brigit', 'Boice', 12);
insert into client_entity (id, first_name, last_name, credit_id) values (13, 'Ericka', 'Bayly', 13);
insert into client_entity (id, first_name, last_name, credit_id) values (14, 'Jewel', 'Sorey', 14);
insert into client_entity (id, first_name, last_name, credit_id) values (15, 'Danya', 'MacMoyer', 15);
insert into client_entity (id, first_name, last_name, credit_id) values (16, 'Melessa', 'Hardwicke', 16);
insert into client_entity (id, first_name, last_name, credit_id) values (17, 'Janek', 'Filipputti', 17);
insert into client_entity (id, first_name, last_name, credit_id) values (18, 'Pierrette', 'Watkiss', 18);
insert into client_entity (id, first_name, last_name, credit_id) values (19, 'Raeann', 'Heel', 19);
insert into client_entity (id, first_name, last_name, credit_id) values (20, 'Brittaney', 'Lichtfoth', 20);
insert into client_entity (id, first_name, last_name, credit_id) values (21, 'Markus', 'Cornewell', 21);
insert into client_entity (id, first_name, last_name, credit_id) values (22, 'Thalia', 'Mather', 22);
insert into client_entity (id, first_name, last_name, credit_id) values (23, 'Staci', 'Epsly', 23);
insert into client_entity (id, first_name, last_name, credit_id) values (24, 'Hedwiga', 'Ferrieres', 24);
insert into client_entity (id, first_name, last_name, credit_id) values (25, 'Even', 'Larraway', 25);
insert into client_entity (id, first_name, last_name, credit_id) values (26, 'Athene', 'Hartrick', 26 );
insert into client_entity (id, first_name, last_name, credit_id) values (27, 'Holmes', 'Filde', 27);
insert into client_entity (id, first_name, last_name, credit_id) values (28, 'Ronnica', 'Forster', 28);
insert into client_entity (id, first_name, last_name, credit_id) values (29, 'Sonny', 'Stedman', 29);
insert into client_entity (id, first_name, last_name, credit_id) values (30, 'Theresita', 'De Zamudio', 30);

insert into credit_entity (id, credit_name) values (1, 'jcb');
insert into credit_entity (id, credit_name) values (2, 'jcb');
insert into credit_entity (id, credit_name) values (3, 'maestro');
insert into credit_entity (id, credit_name) values (4, 'jcb');
insert into credit_entity (id, credit_name) values (5, 'switch');
insert into credit_entity (id, credit_name) values (6, 'visa');
insert into credit_entity (id, credit_name) values (7, 'jcb');
insert into credit_entity (id, credit_name) values (8, 'americanexpress');
insert into credit_entity (id, credit_name) values (9, 'visa');
insert into credit_entity (id, credit_name) values (10, 'switch');
insert into credit_entity (id, credit_name) values (11, 'bankcard');
insert into credit_entity (id, credit_name) values (12, 'mastercard');
insert into credit_entity (id, credit_name) values (13, 'mastercard');
insert into credit_entity (id, credit_name) values (14, 'jcb');
insert into credit_entity (id, credit_name) values (15, 'jcb');
insert into credit_entity (id, credit_name) values (16, 'jcb');
insert into credit_entity (id, credit_name) values (17, 'jcb');
insert into credit_entity (id, credit_name) values (18, 'jcb');
insert into credit_entity (id, credit_name) values (19, 'solo');
insert into credit_entity (id, credit_name) values (20, 'bankcard');
insert into credit_entity (id, credit_name) values (21, 'jcb');
insert into credit_entity (id, credit_name) values (22, 'switch');
insert into credit_entity (id, credit_name) values (23, 'diners');
insert into credit_entity (id, credit_name) values (24, 'jcb');
insert into credit_entity (id, credit_name) values (25, 'jcb');
insert into credit_entity (id, credit_name) values (26, 'diners');
insert into credit_entity (id, credit_name) values (27, 'diners');
insert into credit_entity (id, credit_name) values (28, 'jcb');
insert into credit_entity (id, credit_name) values (29, 'china');
insert into credit_entity (id, credit_name) values (30, 'maestro');


insert into product_entity (id, product_name, product_value, credit_id) values (1, 'Technology', '€7755,78', 1);
insert into product_entity (id, product_name, product_value, credit_id) values (2, 'Public Utilities', '€42447,50', 2);
insert into product_entity (id, product_name, product_value, credit_id) values (3, 'Consumer Services', '€19044,58', 3);
insert into product_entity (id, product_name, product_value, credit_id) values (4, 'Finance', '€97653,99', 4);
insert into product_entity (id, product_name, product_value, credit_id) values (5, 'Consumer Services', '€84779,79', 5);
insert into product_entity (id, product_name, product_value, credit_id) values (6, 'Energy', '€61760,65', 6);
insert into product_entity (id, product_name, product_value, credit_id) values (7, 'n/a', '€77818,60', 7);
insert into product_entity (id, product_name, product_value, credit_id) values (8, 'Health Care', '€54433,32', 8);
insert into product_entity (id, product_name, product_value, credit_id) values (9, 'Finance', '€89950,42', 9);
insert into product_entity (id, product_name, product_value, credit_id) values (10, 'Health Care', '€99581,91', 10);
insert into product_entity (id, product_name, product_value, credit_id) values (11, 'Health Care', '€10490,75', 11);
insert into product_entity (id, product_name, product_value, credit_id) values (12, 'Consumer Services', '€51193,53', 12);
insert into product_entity (id, product_name, product_value, credit_id) values (13, 'Finance', '€40165,44', 13);
insert into product_entity (id, product_name, product_value, credit_id) values (14, 'n/a', '€30128,59', 14);
insert into product_entity (id, product_name, product_value, credit_id) values (15, 'Finance', '€96098,05', 15);
insert into product_entity (id, product_name, product_value, credit_id) values (16, 'Consumer Services', '€22766,03', 16);
insert into product_entity (id, product_name, product_value, credit_id) values (17, 'Consumer Services', '€33306,59', 17);
insert into product_entity (id, product_name, product_value, credit_id) values (18, 'Energy', '€46325,26', 18);
insert into product_entity (id, product_name, product_value, credit_id) values (19, 'Transportation', '€73597,49', 19);
insert into product_entity (id, product_name, product_value, credit_id) values (20, 'Consumer Durables', '€7157,31', 20);
insert into product_entity (id, product_name, product_value, credit_id) values (21, 'Energy', '€17309,81', 21);
insert into product_entity (id, product_name, product_value, credit_id) values (22, 'Capital Goods', '€42599,16', 22);
insert into product_entity (id, product_name, product_value, credit_id) values (23, 'Health Care', '€1024,14', 23);
insert into product_entity (id, product_name, product_value, credit_id) values (24, 'Technology', '€42327,81', 24);
insert into product_entity (id, product_name, product_value, credit_id) values (25, 'Finance', '€12704,74', 25);
insert into product_entity (id, product_name, product_value, credit_id) values (26, 'Miscellaneous', '€70336,35', 26);
insert into product_entity (id, product_name, product_value, credit_id) values (27, 'Miscellaneous', '€53028,46', 27);
insert into product_entity (id, product_name, product_value, credit_id) values (28, 'Finance', '€68172,92', 28);
insert into product_entity (id, product_name, product_value, credit_id) values (29, 'Capital Goods', '€11855,24', 29);
insert into product_entity (id, product_name, product_value, credit_id) values (30, 'Miscellaneous', '€61928,77', 30);

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