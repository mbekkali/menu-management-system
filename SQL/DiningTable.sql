CREATE TABLE dining_table
(
id            SERIAL CONSTRAINT dining_table_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
create_date   DATE NOT NULL,
restaurant_id integer,
constraint fk_dining_table_restaurant foreign key (restaurant_id) REFERENCES restaurant (id)
);