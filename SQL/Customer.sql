CREATE TABLE customer
(
id            SERIAL CONSTRAINT customer_pk PRIMARY KEY,
name          VARCHAR(255),
status        VARCHAR(20),
created_date  DATE NOT NULL
);