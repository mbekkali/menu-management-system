CREATE TABLE restaurant
(
id            SERIAL CONSTRAINT restaurant_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
create_date   DATE NOT NULL,
customer_id integer,
constraint fk_restaurant_customer foreign key (customer_id) REFERENCES customer (id)
);