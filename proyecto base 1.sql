-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-09-2017 a las 01:06:56
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auto`
--

CREATE TABLE `auto` (
  `ID_Auto` varchar(10) NOT NULL,
  `No_Motor` varchar(30) NOT NULL,
  `MODELO` varchar(20) DEFAULT NULL,
  `ID_Cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `ID_Cita` int(11) NOT NULL,
  `Estado` varchar(30) NOT NULL,
  `Tipo_Mantenimiento` int(11) DEFAULT NULL,
  `Reparacion` varchar(100) DEFAULT NULL,
  `Fecha_Entrega` date DEFAULT NULL,
  `ID_Auto` varchar(10) NOT NULL,
  `ID_Supervisor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita_mecanico`
--

CREATE TABLE `cita_mecanico` (
  `ID_Empleado` int(11) NOT NULL,
  `ID_Cita` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `ID_Cliente` int(11) NOT NULL,
  `Nombre` varchar(40) NOT NULL,
  `Telefono` varchar(500) DEFAULT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `ID_Empleado` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Telefono` varchar(500) DEFAULT NULL,
  `Tipo` varchar(15) NOT NULL,
  `Contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `auto`
--
ALTER TABLE `auto`
  ADD PRIMARY KEY (`ID_Auto`),
  ADD KEY `ID_Cliente` (`ID_Cliente`);

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`ID_Cita`),
  ADD KEY `ID_Auto` (`ID_Auto`),
  ADD KEY `ID_Supervisor` (`ID_Supervisor`);

--
-- Indices de la tabla `cita_mecanico`
--
ALTER TABLE `cita_mecanico`
  ADD KEY `ID_Empleado` (`ID_Empleado`),
  ADD KEY `ID_Cita` (`ID_Cita`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID_Cliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`ID_Empleado`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `ID_Cita` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `ID_Cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `ID_Empleado` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `auto`
--
ALTER TABLE `auto`
  ADD CONSTRAINT `auto_ibfk_1` FOREIGN KEY (`ID_Cliente`) REFERENCES `cliente` (`ID_Cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`ID_Auto`) REFERENCES `auto` (`ID_Auto`),
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`ID_Supervisor`) REFERENCES `empleado` (`ID_Empleado`);

--
-- Filtros para la tabla `cita_mecanico`
--
ALTER TABLE `cita_mecanico`
  ADD CONSTRAINT `cita_mecanico_ibfk_1` FOREIGN KEY (`ID_Empleado`) REFERENCES `empleado` (`ID_Empleado`),
  ADD CONSTRAINT `cita_mecanico_ibfk_2` FOREIGN KEY (`ID_Cita`) REFERENCES `cita` (`ID_Cita`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
