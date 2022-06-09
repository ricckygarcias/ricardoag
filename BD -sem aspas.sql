CREATE DATABASE teste /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE teste;
CREATE TABLE paciente (
  idpaciente int NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  cpf varchar(11) NOT NULL,
  idade int NOT NULL,
  PRIMARY KEY (idpaciente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE medico (
  idmedico int NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  especialidade int NOT NULL,
  crm int NOT NULL,
  cpf varchar(45) NOT NULL,
  PRIMARY KEY (idmedico)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE consulta (
  idconsulta int NOT NULL AUTO_INCREMENT,
  id_medico int NOT NULL,
  id_paciente int NOT NULL,
  convenio varchar(50) NOT NULL,
  PRIMARY KEY (idconsulta),
  KEY medico_da_consulta_idx (id_medico),
  KEY paciente_da_consulta_idx (id_paciente),
  CONSTRAINT medico_da_consulta FOREIGN KEY (id_medico) REFERENCES medico (idmedico),
  CONSTRAINT paciente_da_consulta FOREIGN KEY (id_paciente) REFERENCES paciente(idpaciente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
