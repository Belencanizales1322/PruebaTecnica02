
CREATE DATABASE Biblioteca;
USE Biblioteca;

CREATE TABLE Libros (
    id INT PRIMARY KEY Identity ,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    ano_publicacion INT
);
