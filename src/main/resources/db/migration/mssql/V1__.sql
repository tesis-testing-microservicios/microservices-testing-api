CREATE SEQUENCE example_seq START WITH 1 INCREMENT BY 50
    GO

CREATE TABLE example
(
    id         bigint NOT NULL,
    first_name varchar(255),
    last_name  varchar(255),
    age        int    NOT NULL,
    CONSTRAINT pk_example PRIMARY KEY (id)
)
    GO