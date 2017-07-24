-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 24, 2017 at 12:41 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `event_form`
--

-- --------------------------------------------------------

--
-- Table structure for table `eventform`
--

CREATE TABLE `eventform` (
  `id` int(11) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `time` varchar(100) NOT NULL,
  `topic` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventform`
--

INSERT INTO `eventform` (`id`, `firstname`, `lastname`, `email`, `date`, `time`, `topic`, `location`) VALUES
(1, 'Suriyan', 'S', 'suriyan.s@kggroup.com', '20/08/2017', '01:00', 'Big Data', 'Coimbatore'),
(4, 'Brighty', 'M', 'brightymartina.m@kggroup.com', '21/08/2018', '01:00', 'Big Data', 'Coimbatore'),
(5, 'Deepika', 'M', 'deepika.m@kggroup.com', '21/08/2018', '8.00', 'poS app', 'Bangalore'),
(12, 'Deepika', 'M', 'deepika.m@kggroup.com', '14/07/2018', '9.00', 'kotlin', 'Bangalore'),
(13, 'Brighty', 'R', 'brightymartina.m@kggroup.com', '14/07/2018', '8.00', 'poS app', 'Bangalore'),
(14, 'Raja Ram', 'S', 'rajaram.s@kgfsl.com', '21/08/2018', '01.00', 'Kotlin', 'Coimbatore');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `eventform`
--
ALTER TABLE `eventform`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `eventform`
--
ALTER TABLE `eventform`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
