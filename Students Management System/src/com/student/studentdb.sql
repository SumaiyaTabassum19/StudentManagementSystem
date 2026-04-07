-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 07, 2026 at 05:40 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(20) NOT NULL,
  `name` varchar(25) NOT NULL,
  `vrstyname` varchar(27) NOT NULL,
  `cgpa` double NOT NULL,
  `age` int(20) NOT NULL,
  `semester` varchar(20) NOT NULL,
  `credit` int(24) NOT NULL,
  `department` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `vrstyname`, `cgpa`, `age`, `semester`, `credit`, `department`) VALUES
(101, 'maisa', 'iiuc', 3.87, 20, '6th', 24, 'CSE'),
(102, 'tabassom', 'iiuc', 3.76, 21, '6th', 23, 'CSE'),
(103, 'jihan', 'iiuc', 3.86, 23, '6th', 22, 'CSE'),
(105, 'afrin', 'iiuc', 4, 21, '6', 20, 'cse'),
(106, 'raisa', 'iiuc', 3.98, 23, '5th', 23, 'CSE');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
