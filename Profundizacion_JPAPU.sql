-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `idArt` int(50) NOT NULL,
  `codigo` varchar(30) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`idArt`, `codigo`, `nombre`, `descripcion`, `precio`) 
VALUES (5,'IP-001','Ipad Mini 2','Año: 2016',500),
(6,'MC-001','MacBook Air','Año: 2016',800),
(9,'IPH-002','Iphone 6','Año: 2012',300),
(11,'XI-001','Xiaomi Mi 8','Año: 2019',500),
(14,'AS-001','Asus Zenphone 2','Año: 2016',300);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idCli` int(50) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `identificacion` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `ciudad` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idCli`, `nombres`, `apellidos`, `identificacion`, `correo`, `telefono`, `ciudad`, `direccion`) 
VALUES (18,'Juan Camilo','Andrade','123456','camilo@gmail.com','3118697430','Neiva','Calle 5 #9-36'),
(19,'Maria','Clavijo','1234659','maria@gmail.com','3146982014','Neiva','Calle 5 #3-46'),
(20,'Juan Andres','Borrero','1234659','juan@gmail.com','3132366855','Neiva','Calle 25G #2W-47');
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturaarticulo`
--

CREATE TABLE `facturaarticulo` (
  `idFacArt` int(50) NOT NULL,
  `cliente` int(50) NOT NULL,
  `articulo` int(50) NOT NULL,
  `cantidad` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `facturaarticulo`
--

INSERT INTO `facturaarticulo` (`idFacArt`, `cliente`, `articulo`, `cantidad`) VALUES
(25,18,11,3),(26,18,5,2),(27,19,14,3),(28,19,6,1),(29,19,9,1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `idFac` int(50) NOT NULL,
  `fecha` varchar(30) NOT NULL,
  `cliente` int(50) NOT NULL,
  `total` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`idFac`, `fecha`, `cliente`, `total`) VALUES
(22,'31-05-2020 18:55:10',18,'2500'),
(23,'31-05-2020 19:17:48',19,'2000');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`idArt`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCli`);

--
-- Indices de la tabla `facturaarticulo`
--
ALTER TABLE `facturaarticulo`
  ADD PRIMARY KEY (`idFacArt`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`idFac`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `idArt` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCli` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `facturaarticulo`
--
ALTER TABLE `facturaarticulo`
  MODIFY `idFacArt` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `idFac` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
