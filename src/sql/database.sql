CREATE TABLE administrator (
    id SERIAL PRIMARY KEY NOT NULL,
    login VARCHAR(50),
    password VARCHAR(255)
);

CREATE TABLE informations (
    id SERIAL PRIMARY KEY NOT NULL,
    title VARCHAR(255),
    description VARCHAR(255),
    url VARCHAR(100)
);

CREATE TABLE news (
    id SERIAL PRIMARY KEY NOT NULL,
    title VARCHAR(255),
    description VARCHAR(255),
    posted_on DATE,
    url VARCHAR(100)
);

CREATE TABLE comments (
    id SERIAL PRIMARY KEY NOT NULL,
    description VARCHAR(255),
    posted_on DATE,
    can_be_posted BOOLEAN
);
ALTER TABLE informations ADD rewriting VARCHAR(100);
ALTER TABLE news ADD rewriting VARCHAR(100);