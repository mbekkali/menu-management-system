drop table IF EXISTS kitchen;
drop table IF EXISTS dining_table;
drop table IF EXISTS restaurant;
drop table IF EXISTS customer;

CREATE TABLE customer
(
id            SERIAL CONSTRAINT customer_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
created_date  DATE NOT NULL
);
CREATE TABLE restaurant
(
id            SERIAL CONSTRAINT restaurant_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
create_date   DATE NOT NULL,
customer_id integer,
constraint fk_restaurant_customer foreign key (customer_id) REFERENCES customer (id)
);
CREATE TABLE kitchen
(
id            SERIAL CONSTRAINT kitchen_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
create_date   DATE NOT NULL,
restaurant_id integer,
constraint fk_kitchen_restaurant foreign key (restaurant_id) REFERENCES restaurant (id)
);

CREATE TABLE dining_table
(
id            SERIAL CONSTRAINT dining_table_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
create_date   DATE NOT NULL,
restaurant_id integer,
constraint fk_dining_table_restaurant foreign key (restaurant_id) REFERENCES restaurant (id)
);