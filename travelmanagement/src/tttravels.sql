-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2023 at 05:57 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tttravels`
--

-- --------------------------------------------------------

--
-- Table structure for table `admininfo`
--

CREATE TABLE `admininfo` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admininfo`
--

INSERT INTO `admininfo` (`username`, `password`) VALUES
('admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `interfaceadmin`
--

CREATE TABLE `interfaceadmin` (
  `serialno` varchar(30) NOT NULL,
  `transportname` varchar(30) NOT NULL,
  `staringpoint` varchar(30) NOT NULL,
  `endpoint` varchar(30) NOT NULL,
  `journeydate` varchar(30) NOT NULL,
  `totalseats` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `interfaceadmin`
--

INSERT INTO `interfaceadmin` (`serialno`, `transportname`, `staringpoint`, `endpoint`, `journeydate`, `totalseats`) VALUES
('1', 'Goldenline', 'Faridpur', 'Dhaka', '10:00', '23'),
('2', 'Hanif', 'Jossore', 'Dhaka', '10:00', '32'),
('3', 'Shohag', 'Gabtoli', 'Barisal', '11:00', '28'),
('4', 'Eagle', 'Faridpur', 'Jossore', '1:00', '30');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `username` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `birth` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`username`, `email`, `address`, `phone`, `birth`, `gender`, `password`) VALUES
('tabib', 'tabib.arham@gmail.com', 'savar', '01625135092', '29-07-2000', 'Male', 'tabib1234'),
('swarnaly sarker', 'swarnaly sarker@gmail.com', 'bramanbariya', '01754886604', '10-10-2001', 'Female', 'swarnalyswarnaly'),
('salehin', 'salehin@gmail.com', 'tangi', '01763547894', '15-06-2000', 'Male', 'salehin1234'),
('Sumyia Sabrin Liza', 'lizamoni@gmail.com', 'uttara', '01945687123', '23-08-2002', 'Female', 'liza1234');

-- --------------------------------------------------------

--
-- Table structure for table `userinterface`
--

CREATE TABLE `userinterface` (
  `transportname` varchar(30) NOT NULL,
  `passengername` varchar(30) NOT NULL,
  `startingpoint` varchar(30) NOT NULL,
  `endpoint` varchar(30) NOT NULL,
  `journeytime` varchar(30) NOT NULL,
  `totalseats` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userinterface`
--

INSERT INTO `userinterface` (`transportname`, `passengername`, `startingpoint`, `endpoint`, `journeytime`, `totalseats`) VALUES
('Goldenline', 'salehin', 'Faridpur', 'Barisal', '9:00', '4'),
('Hanif', 'tabib', 'Gabtoli', 'Barisal', '1:00', '4'),
('Eagle', 'Liza', 'Faridpur', 'Barisal', '5:00', '3'),
('Hanif', 'Mahi', 'Dhaka', 'Faridpur', '4:00', '4');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
