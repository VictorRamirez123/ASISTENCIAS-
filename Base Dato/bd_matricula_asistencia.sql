
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";



CREATE TABLE `asistencia` (
  `idasistencia` int(11) NOT NULL,
  `idestudiante` int(11) DEFAULT NULL,
  `idgrado` int(11) DEFAULT NULL,
  `Tarde` varchar(45) DEFAULT NULL,
  `Falto` varchar(45) DEFAULT NULL,
  `Justificado` varchar(45) DEFAULT NULL,
  `F_Asistencia` varchar(45) DEFAULT NULL,
  `cod_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `estudiante` (
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



INSERT INTO `estudiante` (`idEstudiante`, `identificacion`, `Nombres`, `Apellidos`, `fecha_nacimiento`, `Lugar_de_nacimiento`, `Madre`, `Padre`, `Domicilio`, `Documento_Presentados`) VALUES
(1, '98745879', 'luis', 'perales roca', '9/12/2015', 'lima', 'ana roca vicente', 'saul perales lomas', 'av sauce 14 lima', 'certificado estudio disponible');



CREATE TABLE `grado` (
  `idgrado` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `nivel` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



INSERT INTO `grado` (`idgrado`, `nombre`, `nivel`, `descripcion`) VALUES
(1, 'primero', 'primaria', 'insturccion grado'),
(2, 'segundo', 'primaria', 'instruccion grado');



CREATE TABLE `matricula` (
  `idmatricula` int(11) NOT NULL,
  `idestudiante` int(11) DEFAULT NULL,
  `idgrado` int(11) DEFAULT NULL,
  `periodo` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



INSERT INTO `matricula` (`idmatricula`, `idestudiante`, `idgrado`, `periodo`, `estado`) VALUES
(1, 1, 1, '2023', 'Activo');



CREATE TABLE `usuario` (
  `cod_usuario` int(11) NOT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `cargo` varchar(45) DEFAULT NULL,
  `persona` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



INSERT INTO `usuario` (`cod_usuario`, `usuario`, `contraseña`, `cargo`, `persona`, `direccion`, `telefono`, `estado`) VALUES
(1, 'admin', '123', 'Administrador', 'luis perales roca', 'av lince 17', '3256478', 'disponible'),
(2, 'luis', '12', 'Supervisor', 'luis', 'av  sauce 14', '6547874', 'disponible');


ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`idasistencia`),
  ADD KEY `idestudiante` (`idestudiante`),
  ADD KEY `idgrado` (`idgrado`),
  ADD KEY `cod_usuario` (`cod_usuario`);


ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`idEstudiante`);


ALTER TABLE `grado`
  ADD PRIMARY KEY (`idgrado`);


ALTER TABLE `matricula`
  ADD PRIMARY KEY (`idmatricula`),
  ADD KEY `idestudiante` (`idestudiante`),
  ADD KEY `idgrado` (`idgrado`);


ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cod_usuario`);


ALTER TABLE `asistencia`
  MODIFY `idasistencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;


ALTER TABLE `estudiante`
  MODIFY `idEstudiante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;


ALTER TABLE `grado`
  MODIFY `idgrado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


ALTER TABLE `matricula`
  MODIFY `idmatricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;


ALTER TABLE `usuario`
  MODIFY `cod_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;




ALTER TABLE `asistencia`
  ADD CONSTRAINT `asistencia_ibfk_1` FOREIGN KEY (`idestudiante`) REFERENCES `estudiante` (`idEstudiante`),
  ADD CONSTRAINT `asistencia_ibfk_2` FOREIGN KEY (`idgrado`) REFERENCES `grado` (`idgrado`),
  ADD CONSTRAINT `asistencia_ibfk_3` FOREIGN KEY (`cod_usuario`) REFERENCES `usuario` (`cod_usuario`);

ALTER TABLE `matricula`
  ADD CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`idestudiante`) REFERENCES `estudiante` (`idEstudiante`),
  ADD CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`idgrado`) REFERENCES `grado` (`idgrado`);
COMMIT;

