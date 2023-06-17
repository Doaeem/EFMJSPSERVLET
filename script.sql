CREATE DATABASE dbEfm;

USE dbEfm;

CREATE TABLE Etablissement (
    code_etab INT PRIMARY KEY,
    Nom_Etab VARCHAR(100),
    Adresse_etab VARCHAR(100),
    Tel_etab VARCHAR(20)
);

INSERT INTO Etablissement (code_etab, Nom_Etab, Adresse_etab, Tel_etab)
VALUES
  (1, 'Etablissement A', 'Adresse A', '1234567890'),
  (2, 'Etablissement B', 'Adresse B', '9876543210'),
  (3, 'Etablissement C', 'Adresse C', '5678901234');
