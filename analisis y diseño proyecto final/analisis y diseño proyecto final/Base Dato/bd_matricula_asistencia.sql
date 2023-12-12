SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--creación de las tablas
CREATE TABLE `asistencia` (
  `idEstudiante` int(11) NOT NULL,
  `identificacion` varchar(45) DEFAULT NULL,
  `Nombres` varchar(45) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` varchar(45) DEFAULT NULL,
  `Lugar_de_nacimiento` varchar(45) DEFAULT NULL,
  `Madre` varchar(45) DEFAULT NULL,
  `Padre` varchar(45) DEFAULT NULL,
  `Domicilio` varchar(45) DEFAULT NULL,
  `Documento_Presentados` varchar(45) DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `estudiante` (`idEstudiante`, `identificacion`, `Nombres`, `Apellidos`, `fecha_nacimiento`, `Lugar_de_nacimiento`, `Madre`, `Padre`, `Domicilio`, `Documento_Presentados`) VALUES
(1, '98745879', 'luis', 'perales roca', '9/12/2015', 'lima', 'ana roca vicente', 'saul perales lomas', 'av sauce 14 lima', 'certificado estudio disponible');

