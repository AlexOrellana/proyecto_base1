-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-09-2017 a las 03:13:52
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tasher`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `automoviles`
--

CREATE TABLE `automoviles` (
  `placa_Automovil` varchar(20) NOT NULL,
  `idCliente_Automovil` varchar(45) NOT NULL,
  `modelo_Automovil` varchar(20) NOT NULL,
  `numeroMotor_Automovil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `id_Cita` varchar(20) NOT NULL,
  `idCliente_Cita` varchar(45) NOT NULL,
  `placaVehiculo_Cita` varchar(20) NOT NULL,
  `idEmpleado_Cita` varchar(20) NOT NULL,
  `fechaEntrada_Cita` date NOT NULL,
  `tipo_Cita` varchar(20) NOT NULL,
  `estado_Cita` varchar(20) NOT NULL,
  `fechaEntrega_Cita` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_Cliente` varchar(45) NOT NULL,
  `primerNombre_Cliente` varchar(20) NOT NULL,
  `segundoNombre_Cliente` varchar(20) NOT NULL,
  `primerApellido_Cliente` varchar(20) NOT NULL,
  `segundoApellido_Cliente` varchar(20) NOT NULL,
  `direccion_Cliente` tinytext NOT NULL,
  `correoElectronico_Cliente` varchar(45) NOT NULL,
  `contra_Cliente` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id_Empleado` varchar(45) NOT NULL,
  `idAsesor_Empleado` varchar(45) DEFAULT NULL,
  `primerNombre_Empleado` varchar(20) NOT NULL,
  `segundoNombre_Empleado` varchar(20) NOT NULL,
  `primerApellido_Empleado` varchar(20) NOT NULL,
  `segundoApellido_Empleado` varchar(20) NOT NULL,
  `telefonoAsignado_Empleado` int(11) NOT NULL,
  `contra_Empleado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE `mantenimientos` (
  `idCita_Mantenimiento` varchar(20) NOT NULL,
  `tipo_Mantenimiento` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparaciones`
--

CREATE TABLE `reparaciones` (
  `idCita_Reparacion` varchar(20) NOT NULL,
  `tipo_Reparacion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_bitacora`
--

CREATE TABLE `tabla_bitacora` (
  `operacion` varchar(10) NOT NULL,
  `usuario` varchar(40) DEFAULT NULL,
  `hostBit` varchar(40) NOT NULL,
  `modificado` datetime NOT NULL,
  `tabla` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefonos`
--

CREATE TABLE `telefonos` (
  `idCliente_Telefono` varchar(45) NOT NULL,
  `numero_Telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IdUsuario` varchar(45) NOT NULL,
  `Contrasena_Usuario` varchar(45) NOT NULL,
  `categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `automoviles`
--
ALTER TABLE `automoviles`
  ADD PRIMARY KEY (`placa_Automovil`,`idCliente_Automovil`),
  ADD KEY `fk_Automoviles_Clientes1_idx` (`idCliente_Automovil`);

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`id_Cita`,`idCliente_Cita`,`placaVehiculo_Cita`,`idEmpleado_Cita`),
  ADD UNIQUE KEY `id_Cita_UNIQUE` (`id_Cita`),
  ADD UNIQUE KEY `idCliente_Cita_UNIQUE` (`idCliente_Cita`),
  ADD UNIQUE KEY `idEmpleado_Cita_UNIQUE` (`idEmpleado_Cita`),
  ADD UNIQUE KEY `placaVehiculo_Cita_UNIQUE` (`placaVehiculo_Cita`),
  ADD KEY `fk_Citas_Clientes1_idx` (`idCliente_Cita`),
  ADD KEY `fk_Citas_Empleados1_idx` (`idEmpleado_Cita`),
  ADD KEY `fk_Citas_Automoviles1_idx` (`placaVehiculo_Cita`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_Cliente`),
  ADD UNIQUE KEY `id_Cliente_UNIQUE` (`id_Cliente`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_Empleado`),
  ADD UNIQUE KEY `id_Empleado_UNIQUE` (`id_Empleado`),
  ADD UNIQUE KEY `id_Empleado` (`id_Empleado`,`idAsesor_Empleado`),
  ADD KEY `fk_Empleados_Empleados1_idx` (`idAsesor_Empleado`);

--
-- Indices de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD PRIMARY KEY (`idCita_Mantenimiento`),
  ADD UNIQUE KEY `idCita_Mantenimiento_UNIQUE` (`idCita_Mantenimiento`);

--
-- Indices de la tabla `reparaciones`
--
ALTER TABLE `reparaciones`
  ADD PRIMARY KEY (`idCita_Reparacion`),
  ADD UNIQUE KEY `idCita_Mantenimiento_UNIQUE` (`idCita_Reparacion`);

--
-- Indices de la tabla `tabla_bitacora`
--
ALTER TABLE `tabla_bitacora`
  ADD PRIMARY KEY (`modificado`,`operacion`);

--
-- Indices de la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD PRIMARY KEY (`idCliente_Telefono`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IdUsuario`,`Contrasena_Usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `automoviles`
--
ALTER TABLE `automoviles`
  ADD CONSTRAINT `fk_Automoviles_Clientes1` FOREIGN KEY (`idCliente_Automovil`) REFERENCES `clientes` (`id_Cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `fk_Citas_Automoviles1` FOREIGN KEY (`placaVehiculo_Cita`) REFERENCES `automoviles` (`placa_Automovil`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Citas_Clientes1` FOREIGN KEY (`idCliente_Cita`) REFERENCES `clientes` (`id_Cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Citas_Empleados1` FOREIGN KEY (`idEmpleado_Cita`) REFERENCES `empleados` (`id_Empleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `fk_Empleados_Empleados1` FOREIGN KEY (`idAsesor_Empleado`) REFERENCES `empleados` (`id_Empleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD CONSTRAINT `fk_Mantenimientos_Citas1` FOREIGN KEY (`idCita_Mantenimiento`) REFERENCES `citas` (`id_Cita`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reparaciones`
--
ALTER TABLE `reparaciones`
  ADD CONSTRAINT `fk_Reparaciones_Citas1` FOREIGN KEY (`idCita_Reparacion`) REFERENCES `citas` (`id_Cita`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD CONSTRAINT `fk_Telefonos_Clientes1` FOREIGN KEY (`idCliente_Telefono`) REFERENCES `clientes` (`id_Cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
