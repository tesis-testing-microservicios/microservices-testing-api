CREATE SEQUENCE IF NOT EXISTS example_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE example
(
    id         BIGINT NOT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    CONSTRAINT pk_example PRIMARY KEY (id)
);