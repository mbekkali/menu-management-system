CREATE TABLE kitchen
(
id            SERIAL CONSTRAINT kitchen_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
create_date   DATE NOT NULL,
restaurant_id integer,
constraint fk_kitchen_restaurant foreign key (restaurant_id) REFERENCES restaurant (id)
);