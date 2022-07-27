-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2022 a las 23:55:55
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `eleccionesg8`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `candidatos`
--

CREATE TABLE `candidatos` (
  `id_candidato` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `tipo_documento` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `apellidos` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `partido_politico` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `ciudad_origen` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion` text COLLATE utf8_spanish2_ci NOT NULL,
  `mensaje_campania` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `estado` int(11) NOT NULL,
  `correo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `direccion` varchar(100) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `candidatos`
--

INSERT INTO `candidatos` (`id_candidato`, `tipo_documento`, `nombres`, `apellidos`, `partido_politico`, `ciudad_origen`, `descripcion`, `mensaje_campania`, `estado`, `correo`, `telefono`, `direccion`) VALUES
('1086498977', 'CC', 'GUSTAVO', 'PETRO', 'POLO DEMOCRATICO', 'CAUCA', 'nuestro compromiso social', 'PACTO HISTORIO', 1, 'gustavo@gmail.com', '7456789', 'calle 12 4534');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `elecciones`
--

CREATE TABLE `elecciones` (
  `id_eleccion` int(11) NOT NULL,
  `codigo` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion` text COLLATE utf8_spanish2_ci NOT NULL,
  `categoria` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `fecha_inscripcion` date NOT NULL,
  `estado` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `elecciones`
--

INSERT INTO `elecciones` (`id_eleccion`, `codigo`, `descripcion`, `categoria`, `fecha_inicio`, `fecha_fin`, `fecha_inscripcion`, `estado`, `nombre`) VALUES
(1, '', 'ELECCIONES PRESIDENCIALES SE LLEVARA EFECTO EL 5 DE JULIO DEL AÑO 2022\n', 'PRESIDENCIAL', '2022-07-01', '2026-07-31', '2022-07-27', 1, 'ELECCIONES PRESIDENCIALES SE LLEVARA EFECTO EL 5 DE JULIO DEL AÑO 2022\n');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripciones`
--

CREATE TABLE `inscripciones` (
  `id_inscripcion` int(11) NOT NULL,
  `id_eleccion` int(11) NOT NULL,
  `id_candidato` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_inscripcion` date NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `inscripciones`
--

INSERT INTO `inscripciones` (`id_inscripcion`, `id_eleccion`, `id_candidato`, `fecha_inscripcion`, `estado`) VALUES
(1, 1, '1086498977', '2022-07-27', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `votantes`
--

CREATE TABLE `votantes` (
  `id_votante` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `tipo_documento` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `apellidos` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `correo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `direccion_votacion` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `mesa_votacion` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `estado_votacion` int(11) NOT NULL,
  `direccion` varchar(70) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `votantes`
--

INSERT INTO `votantes` (`id_votante`, `tipo_documento`, `nombres`, `apellidos`, `telefono`, `correo`, `direccion_votacion`, `mesa_votacion`, `estado_votacion`, `direccion`) VALUES
('1111', 'CC', 'MARIO', 'MORENO', '9876543', 'mario@gmail.com', '', '', 1, ''),
('123456', 'CC', 'DANIEL', 'ERAZO', '745678', 'carlos@gmail.com', '', '', 1, ''),
('654321', 'CC', 'TATIANA', 'CAMUES', '3164647696', 'tatianacamues@gmail.com', '', '', 1, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `votos`
--

CREATE TABLE `votos` (
  `id_voto` bigint(20) NOT NULL,
  `id_inscripcion` int(11) NOT NULL,
  `fecha_voto` datetime NOT NULL,
  `estado` int(11) NOT NULL,
  `id_votante` varchar(20) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `votos`
--

INSERT INTO `votos` (`id_voto`, `id_inscripcion`, `fecha_voto`, `estado`, `id_votante`) VALUES
(1, 1, '2022-07-27 16:05:23', 1, '123456');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  ADD PRIMARY KEY (`id_candidato`);

--
-- Indices de la tabla `elecciones`
--
ALTER TABLE `elecciones`
  ADD PRIMARY KEY (`id_eleccion`);

--
-- Indices de la tabla `inscripciones`
--
ALTER TABLE `inscripciones`
  ADD PRIMARY KEY (`id_inscripcion`),
  ADD KEY `id_candidato` (`id_candidato`),
  ADD KEY `id_eleccion` (`id_eleccion`);

--
-- Indices de la tabla `votantes`
--
ALTER TABLE `votantes`
  ADD PRIMARY KEY (`id_votante`);

--
-- Indices de la tabla `votos`
--
ALTER TABLE `votos`
  ADD PRIMARY KEY (`id_voto`),
  ADD KEY `id_inscripcion` (`id_inscripcion`),
  ADD KEY `id_votante` (`id_votante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `elecciones`
--
ALTER TABLE `elecciones`
  MODIFY `id_eleccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `inscripciones`
--
ALTER TABLE `inscripciones`
  MODIFY `id_inscripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `votos`
--
ALTER TABLE `votos`
  MODIFY `id_voto` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripciones`
--
ALTER TABLE `inscripciones`
  ADD CONSTRAINT `inscripciones_ibfk_1` FOREIGN KEY (`id_candidato`) REFERENCES `candidatos` (`id_candidato`),
  ADD CONSTRAINT `inscripciones_ibfk_2` FOREIGN KEY (`id_eleccion`) REFERENCES `elecciones` (`id_eleccion`);

--
-- Filtros para la tabla `votos`
--
ALTER TABLE `votos`
  ADD CONSTRAINT `votos_ibfk_1` FOREIGN KEY (`id_inscripcion`) REFERENCES `inscripciones` (`id_inscripcion`),
  ADD CONSTRAINT `votos_ibfk_2` FOREIGN KEY (`id_votante`) REFERENCES `votantes` (`id_votante`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
