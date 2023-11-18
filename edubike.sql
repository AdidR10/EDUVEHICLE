-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2023 at 11:54 PM
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
-- Database: `edubike`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AdminID` int(9) NOT NULL,
  `UserName` varchar(64) NOT NULL,
  `Password` int(32) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Full Name` varchar(64) NOT NULL,
  `Role` varchar(20) NOT NULL,
  `Profile Picture` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminID`, `UserName`, `Password`, `Email`, `Full Name`, `Role`, `Profile Picture`) VALUES
(1, 'op', 1, '989@gmail.com', '1', 'CEO', NULL),
(10000001, ':\'( :\'(', 1231432, 'riverside@yahoo.com', 'Sakib Safwan', 'CEO', 1),
(10000002, 'Bondhu_Nai :\'(', 1111, 'atfanbinnoor@xuet.com', 'Atfan Bin Noor', 'CEO', 1),
(10000003, 'Bondhu_ase', 11321132, 'adidr10@gmail.com', 'Adid Rahman', 'CEO', NULL),
(10000004, 'Bodd', 90913, 'kolqs2@jswil.com', 'Ashiqul Mustafa', 'Maintenance Manager', NULL),
(10000007, 'oadosadokka', 121313123, 'kolqs2@jswil.com', 'Adil Raihan', 'Location Manager', NULL),
(10000008, 'Oplqdoqdl33', 1321101031, 'kosakfdoasf@yahoo.com', 'Adil Rahman', 'Transaction Manager', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `FeedbackID` int(8) NOT NULL,
  `Rating` int(5) NOT NULL,
  `Comment` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `UserID` int(8) NOT NULL,
  `VehicleID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`FeedbackID`, `Rating`, `Comment`, `Date`, `UserID`, `VehicleID`) VALUES
(9999999, 4, 'car in good condition', '2023-11-12', 282844188, 50000005),
(10000001, 3, 'Decent', '2001-07-02', 282844216, 98801101),
(10000002, 4, 'Good', '2013-02-07', 282844197, 98801072),
(10000003, 3, 'Decent', '2003-09-25', 282844189, 98801095),
(10000004, 4, 'Good', '2022-06-18', 282844244, 98801113),
(10000005, 4, 'Good', '2021-11-10', 282844206, 98801101),
(10000006, 1, 'Very bad service', '2017-02-16', 282844246, 98801110),
(10000007, 3, 'Decent', '2019-11-08', 282844227, 98801095),
(10000008, 5, 'Very Good', '2009-10-23', 282844184, 98801084),
(10000009, 3, 'Decent', '2007-02-09', 282844256, 98801123),
(10000010, 5, 'Very Good', '2015-08-06', 282844232, 98801092),
(10000011, 5, 'Very Good', '2003-03-04', 282844246, 98801079),
(10000012, 5, 'Awesome Vehicle', '2003-04-17', 282844258, 98801105),
(10000013, 2, 'Expected better', '2002-03-22', 282844252, 98801095),
(10000014, 5, 'Awesome Vehicle', '2002-08-04', 282844206, 98801115),
(10000015, 5, 'Awesome Vehicle', '2020-09-01', 282844198, 98801104),
(10000016, 3, 'It was ok experience', '2023-09-09', 282844255, 98801072),
(10000017, 4, 'The vehicle was comfy', '2018-10-05', 282844228, 98801079),
(10000018, 1, 'Really Bad vehicle we had', '2014-03-21', 282844196, 98801116),
(10000019, 4, 'The vehicle was comfy', '2007-10-09', 282844217, 98801076),
(10000020, 4, 'The vehicle was comfy', '2014-07-02', 282844193, 98801084),
(10000021, 5, 'Awesome Vehicle', '2021-05-19', 282844203, 98801123),
(10000022, 4, 'Very satisfied with the vehicle. Comfortable and reliable.', '2021-09-22', 282844201, 98801111),
(10000023, 4, 'Very satisfied with the vehicle. Comfortable and reliable.', '2009-11-03', 282844189, 98801085),
(10000024, 5, 'Outstanding vehicle! Exceeded expectations. A pleasure to drive.', '2004-12-23', 282844212, 98801124),
(10000025, 3, 'A decent ride. Met expectations, but nothing extraordinary.', '2003-10-11', 282844213, 98801086),
(10000026, 2, 'Average vehicle, but could use improvements. Not entirely satisfied.', '2016-06-02', 282844252, 98801085),
(10000027, 3, 'A decent ride. Met expectations, but nothing extraordinary.', '2023-02-15', 282844190, 98801127),
(10000028, 4, 'Very satisfied with the vehicle. Comfortable and reliable.', '2005-08-12', 282844204, 98801086),
(10000029, 4, 'Very satisfied with the vehicle. Comfortable and reliable.', '2019-06-09', 282844256, 98801107),
(10000030, 5, 'Outstanding vehicle! Exceeded expectations. A pleasure to drive.', '2015-07-13', 282844238, 98801116),
(10000031, 4, 'Very satisfied with the vehicle. Comfortable and reliable.', '2010-02-15', 282844245, 98801128),
(10000032, 3, 'A so-so experience. The vehicle was okay, but I had hoped for more.', '2008-06-14', 282844248, 98801095),
(10000033, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2005-08-05', 282844256, 98801093),
(10000034, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2008-03-10', 282844195, 98801071),
(10000035, 3, 'A so-so experience. The vehicle was okay, but I had hoped for more.', '2008-07-03', 282844225, 98801101),
(10000036, 3, 'A so-so experience. The vehicle was okay, but I had hoped for more.', '2021-04-09', 282844187, 98801094),
(10000037, 5, 'Overjoyed! The vehicle exceeded all expectations. A truly remarkable experience!', '2021-10-17', 282844252, 98801109),
(10000038, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2014-09-23', 282844256, 98801091),
(10000039, 3, 'A so-so experience. The vehicle was okay, but I had hoped for more.', '2002-03-22', 282844225, 98801089),
(10000040, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2002-05-10', 282844211, 98801079),
(10000041, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2017-08-03', 282844239, 98801127),
(10000042, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2018-10-23', 282844186, 98801123),
(10000043, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2017-08-21', 282844203, 98801109),
(10000044, 3, 'A so-so experience. The vehicle was okay, but I had hoped for more.', '2023-08-09', 282844258, 98801120),
(10000045, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2006-08-03', 282844255, 98801112),
(10000046, 5, 'Overjoyed! The vehicle exceeded all expectations. A truly remarkable experience!', '2003-03-16', 282844198, 98801115),
(10000047, 3, 'A so-so experience. The vehicle was okay, but I had hoped for more.', '2001-05-06', 282844254, 98801097),
(10000048, 3, 'A so-so experience. The vehicle was okay, but I had hoped for more.', '2007-02-02', 282844183, 98801108),
(10000049, 5, 'Overjoyed! The vehicle exceeded all expectations. A truly remarkable experience!', '2019-10-06', 282844187, 98801084),
(10000050, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2011-06-04', 282844248, 98801122),
(10000051, 5, 'Overjoyed! The vehicle exceeded all expectations. A truly remarkable experience!', '2022-04-05', 282844209, 98801127),
(10000052, 4, 'Delighted with the vehicle! It provided a comfortable and enjoyable ride.', '2009-09-12', 282844230, 98801083),
(10000053, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2012-11-05', 282844189, 98801099),
(10000054, 1, 'Utterly dissatisfied with the vehicle. A regrettable choice.', '2015-03-06', 282844240, 98801112),
(10000055, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2004-11-18', 282844200, 98801097),
(10000056, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2004-10-11', 282844219, 98801112),
(10000057, 3, 'Neutral feelings. The vehicle was average; neither impressed nor disappointed.', '2016-09-07', 282844226, 98801121),
(10000058, 5, 'Ecstatic! The vehicle surpassed all expectations, making the journey unforgettable.', '2003-02-13', 282844249, 98801108),
(10000059, 1, 'Utterly dissatisfied with the vehicle. A regrettable choice.', '2007-07-02', 282844209, 98801112),
(10000060, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2005-11-13', 282844250, 98801081),
(10000061, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2019-01-08', 282844191, 98801103),
(10000062, 5, 'Ecstatic! The vehicle surpassed all expectations, making the journey unforgettable.', '2006-05-09', 282844227, 98801085),
(10000063, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2009-12-02', 282844238, 98801109),
(10000064, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2005-01-10', 282844202, 98801098),
(10000065, 5, 'Ecstatic! The vehicle surpassed all expectations, making the journey unforgettable.', '2017-04-11', 282844232, 98801083),
(10000066, 3, 'Neutral feelings. The vehicle was average; neither impressed nor disappointed.', '2017-06-14', 282844192, 98801077),
(10000067, 4, 'Pleased with the vehicle. It offered a comfortable and enjoyable ride.', '2023-04-15', 282844243, 98801121),
(10000068, 5, 'Ecstatic! The vehicle surpassed all expectations, making the journey unforgettable.', '2003-08-26', 282844248, 98801090);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `LocationID` int(8) NOT NULL,
  `Location_Name` varchar(30) NOT NULL,
  `AdminID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`LocationID`, `Location_Name`, `AdminID`) VALUES
(10000001, 'HotashaChottor', 10000001),
(10000002, 'TSC', 10000002),
(10000003, 'South Hall', 10000002),
(10000004, 'Pahartali', 10000001),
(10000005, 'Gourisonkor Hat', 10000002),
(10000006, 'ECE Building', 10000001),
(10000007, 'Sheikh Russel Hall', 10000004),
(10000008, 'Bangabandhu Hall', 10000003),
(10000009, 'CUET Main Gate', 10000001);

-- --------------------------------------------------------

--
-- Table structure for table `maintenance`
--

CREATE TABLE `maintenance` (
  `MaintenanceID` int(8) NOT NULL,
  `Cost` int(5) NOT NULL,
  `Start Date` date NOT NULL,
  `Expected Over Date` date NOT NULL,
  `Description` varchar(200) NOT NULL,
  `VehicleID` int(8) NOT NULL,
  `AdminID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `maintenance`
--

INSERT INTO `maintenance` (`MaintenanceID`, `Cost`, `Start Date`, `Expected Over Date`, `Description`, `VehicleID`, `AdminID`) VALUES
(13123132, 20, '2023-11-01', '2023-11-27', 'Really brada', 98801098, 10000008),
(13123134, 29, '2022-07-14', '2023-03-07', 'Accident', 98801075, 1);

-- --------------------------------------------------------

--
-- Table structure for table `rental payment`
--

CREATE TABLE `rental payment` (
  `PaymentID` int(8) NOT NULL,
  `Rental Start Time` int(11) NOT NULL,
  `Rental End Time` int(11) NOT NULL,
  `TransactionID` int(8) NOT NULL,
  `Payment Date` date NOT NULL,
  `Payment Method` varchar(10) NOT NULL,
  `VehicleID` int(8) NOT NULL,
  `UserID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rental payment`
--

INSERT INTO `rental payment` (`PaymentID`, `Rental Start Time`, `Rental End Time`, `TransactionID`, `Payment Date`, `Payment Method`, `VehicleID`, `UserID`) VALUES
(99999999, 60, 62, 12321313, '2023-11-22', 'Bkash', 50000005, 282844188),
(100000007, 193, 1108, 906636906, '2001-07-02', 'Bkash', 98801101, 282844216),
(100000008, 431, 887, 726338594, '2013-02-07', 'Bkash', 98801072, 282844197),
(100000009, 734, 1304, 450336081, '2003-09-25', 'Nagad', 98801095, 282844189),
(100000010, 1031, 1324, 358088118, '2022-06-18', 'Nagad', 98801113, 282844244),
(100000011, 874, 1311, 803243970, '2021-11-10', 'Bkash', 98801101, 282844206),
(100000012, 124, 921, 359230976, '2017-02-16', 'Nagad', 98801110, 282844246),
(100000013, 879, 895, 376915952, '2019-11-08', 'Bkash', 98801095, 282844227),
(100000014, 949, 1377, 686146268, '2009-10-23', 'Nagad', 98801084, 282844184),
(100000015, 487, 955, 607567408, '2007-02-09', 'Nagad', 98801123, 282844256),
(100000016, 95, 726, 771227125, '2015-08-06', 'Nagad', 98801092, 282844232),
(100000017, 62, 712, 716139087, '2003-03-04', 'Bkash', 98801079, 282844246),
(100000018, 915, 1391, 344353644, '2003-04-17', 'Nagad', 98801105, 282844258),
(100000019, 471, 1096, 650346766, '2002-03-22', 'Nagad', 98801095, 282844252),
(100000020, 138, 943, 410217793, '2002-08-04', 'Bkash', 98801115, 282844206),
(100000021, 27, 809, 494150740, '2020-09-01', 'Bkash', 98801104, 282844198),
(100000022, 896, 1364, 524317635, '2023-09-09', 'Bkash', 98801072, 282844255),
(100000023, 392, 646, 643324410, '2018-10-05', 'Nagad', 98801079, 282844228),
(100000024, 903, 1060, 819897935, '2014-03-21', 'Nagad', 98801116, 282844196),
(100000025, 720, 740, 147191660, '2007-10-09', 'Nagad', 98801076, 282844217),
(100000026, 135, 1198, 466851197, '2014-07-02', 'Nagad', 98801084, 282844193),
(100000027, 411, 1375, 433639117, '2021-05-19', 'Nagad', 98801123, 282844203),
(100000028, 970, 1092, 327357052, '2021-09-22', 'Bkash', 98801111, 282844201),
(100000029, 335, 349, 718384925, '2009-11-03', 'Nagad', 98801085, 282844189),
(100000030, 43, 904, 902480581, '2004-12-23', 'Bkash', 98801124, 282844212),
(100000031, 439, 520, 692663322, '2003-10-11', 'Bkash', 98801086, 282844213),
(100000032, 978, 1297, 371022687, '2016-06-02', 'Bkash', 98801085, 282844252),
(100000033, 202, 1305, 645878226, '2023-02-15', 'Bkash', 98801127, 282844190),
(100000034, 695, 968, 220291510, '2005-08-12', 'Bkash', 98801086, 282844204),
(100000035, 1060, 1208, 741310175, '2019-06-09', 'Nagad', 98801107, 282844256),
(100000036, 50, 180, 715703369, '2015-07-13', 'Bkash', 98801116, 282844238),
(100000037, 101, 870, 495560484, '2010-02-15', 'Nagad', 98801128, 282844245),
(100000038, 551, 900, 319056786, '2008-06-14', 'Nagad', 98801095, 282844248),
(100000039, 191, 1275, 116726151, '2005-08-05', 'Bkash', 98801093, 282844256),
(100000040, 370, 703, 630964364, '2008-03-10', 'Nagad', 98801071, 282844195),
(100000041, 809, 1015, 252155736, '2008-07-03', 'Nagad', 98801101, 282844225),
(100000042, 264, 1307, 333481958, '2021-04-09', 'Bkash', 98801094, 282844187),
(100000043, 480, 1185, 718852912, '2021-10-17', 'Nagad', 98801109, 282844252),
(100000044, 42, 1309, 799391171, '2014-09-23', 'Bkash', 98801091, 282844256),
(100000045, 807, 848, 360267305, '2002-03-22', 'Bkash', 98801089, 282844225),
(100000046, 511, 997, 538451014, '2002-05-10', 'Nagad', 98801079, 282844211),
(100000047, 1067, 1164, 182224527, '2017-08-03', 'Nagad', 98801127, 282844239),
(100000048, 370, 1045, 479011274, '2018-10-23', 'Nagad', 98801123, 282844186),
(100000049, 61, 1336, 384726119, '2017-08-21', 'Nagad', 98801109, 282844203),
(100000050, 15, 952, 467724680, '2023-08-09', 'Bkash', 98801120, 282844258),
(100000051, 606, 823, 147585317, '2006-08-03', 'Nagad', 98801112, 282844255),
(100000052, 93, 219, 214023445, '2003-03-16', 'Bkash', 98801115, 282844198),
(100000053, 674, 882, 643173472, '2001-05-06', 'Nagad', 98801097, 282844254),
(100000054, 466, 1330, 530662052, '2007-02-02', 'Nagad', 98801108, 282844183),
(100000055, 1036, 1210, 148477781, '2019-10-06', 'Bkash', 98801084, 282844187),
(100000056, 1020, 1137, 737086200, '2011-06-04', 'Bkash', 98801122, 282844248),
(100000057, 1071, 1389, 674311399, '2022-04-05', 'Bkash', 98801127, 282844209),
(100000058, 787, 1125, 526372209, '2009-09-12', 'Bkash', 98801083, 282844230),
(100000059, 730, 1197, 292443260, '2012-11-05', 'Bkash', 98801099, 282844189),
(100000060, 863, 1180, 394243179, '2015-03-06', 'Nagad', 98801112, 282844240),
(100000061, 327, 405, 161030449, '2004-11-18', 'Nagad', 98801097, 282844200),
(100000062, 813, 1008, 545259119, '2004-10-11', 'Bkash', 98801112, 282844219),
(100000063, 411, 778, 363087358, '2016-09-07', 'Bkash', 98801121, 282844226),
(100000064, 912, 1145, 621895802, '2003-02-13', 'Bkash', 98801108, 282844249),
(100000065, 116, 1108, 364406199, '2007-07-02', 'Nagad', 98801112, 282844209),
(100000066, 503, 1064, 705934255, '2005-11-13', 'Bkash', 98801081, 282844250),
(100000067, 13, 774, 231261887, '2019-01-08', 'Bkash', 98801103, 282844191),
(100000068, 52, 617, 177540858, '2006-05-09', 'Bkash', 98801085, 282844227),
(100000069, 474, 1391, 641353208, '2009-12-02', 'Bkash', 98801109, 282844238),
(100000070, 587, 775, 182718337, '2005-01-10', 'Nagad', 98801098, 282844202),
(100000071, 537, 1311, 851432870, '2017-04-11', 'Bkash', 98801083, 282844232),
(100000072, 889, 1367, 759927896, '2017-06-14', 'Nagad', 98801077, 282844192),
(100000073, 363, 410, 199136322, '2023-04-15', 'Nagad', 98801121, 282844243),
(100000074, 33, 607, 126091131, '2003-08-26', 'Bkash', 98801090, 282844248),
(100000075, 124, 243, 1213112, '2023-11-19', 'Bkash', 10001, 2),
(100000076, 126, 541, 13123213, '2023-11-19', 'Nagad', 98801085, 2);

-- --------------------------------------------------------

--
-- Table structure for table `rents`
--

CREATE TABLE `rents` (
  `UserID` int(8) NOT NULL,
  `VehicleID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rents`
--

INSERT INTO `rents` (`UserID`, `VehicleID`) VALUES
(2, 10001),
(2, 98801085),
(282844183, 98801108),
(282844184, 98801084),
(282844186, 98801123),
(282844187, 98801084),
(282844187, 98801094),
(282844189, 98801085),
(282844189, 98801095),
(282844189, 98801099),
(282844190, 98801127),
(282844191, 98801103),
(282844192, 98801077),
(282844193, 98801084),
(282844195, 98801071),
(282844196, 98801116),
(282844197, 98801072),
(282844198, 98801104),
(282844198, 98801115),
(282844199, 98801083),
(282844200, 98801097),
(282844201, 98801111),
(282844202, 98801098),
(282844203, 98801109),
(282844203, 98801123),
(282844204, 98801086),
(282844206, 98801101),
(282844206, 98801115),
(282844209, 98801112),
(282844209, 98801127),
(282844211, 98801079),
(282844212, 98801124),
(282844213, 98801086),
(282844216, 98801101),
(282844217, 98801076),
(282844219, 98801112),
(282844225, 98801089),
(282844225, 98801101),
(282844226, 98801121),
(282844227, 98801085),
(282844227, 98801095),
(282844228, 98801079),
(282844230, 98801083),
(282844232, 98801083),
(282844232, 98801092),
(282844238, 98801109),
(282844238, 98801116),
(282844239, 98801127),
(282844240, 98801112),
(282844243, 98801121),
(282844244, 98801113),
(282844245, 98801128),
(282844246, 98801079),
(282844246, 98801110),
(282844248, 98801090),
(282844248, 98801095),
(282844248, 98801122),
(282844249, 98801108),
(282844250, 98801081),
(282844252, 98801085),
(282844252, 98801095),
(282844252, 98801109),
(282844254, 98801097),
(282844255, 98801072),
(282844255, 98801112),
(282844256, 98801091),
(282844256, 98801093),
(282844256, 98801107),
(282844256, 98801123),
(282844258, 98801105),
(282844258, 98801120);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(8) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(32) NOT NULL,
  `NID_Number` int(30) NOT NULL,
  `Profile picture` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `Name`, `Email`, `Password`, `NID_Number`, `Profile picture`) VALUES
(2, '1', '1', '2', 2, 2),
(20000084, 'Sakib Safwan', 'kolki2@gmail.com', 'popqlqpd', 1323134142, NULL),
(20040850, 'Atfan', 'atfan@gmail.com', '20040855', 123456789, 0),
(215071577, 'Adil Rahman', 'adnanjayed@gmail.com', '900013', 900013, NULL),
(216792514, 'TAF', 'tafaf@gmail.com', 'paoi', 21231, NULL),
(239579032, 'pagla_adod', 'adad@paglacuet.com', '6996', 6996, NULL),
(265800377, 'lmlamdlamsdla', 'adasdadsadad', '12345678', 132231231, NULL),
(282844183, 'nahin', 'rocket_nahin@palga.com', '0092', 131313, NULL),
(282844184, 'John Doe', 'john.doe@example.com', 'password', 123456, NULL),
(282844185, 'Jane Smith', 'jane.smith@example.com', 'securepa', 789012, NULL),
(282844186, 'Bob Johnson', 'bob.johnson@example.com', 'mypasswo', 345678, NULL),
(282844187, 'Alice Brown', 'alice.brown@example.com', 'pass123', 567890, NULL),
(282844188, 'Charlie Davis', 'charlie.davis@example.com', 'letmein', 901234, NULL),
(282844189, 'Eva White', 'eva.white@example.com', 'password', 123789, NULL),
(282844190, 'Frank Black', 'frank.black@example.com', 'abc123', 456123, NULL),
(282844191, 'Grace Miller', 'grace.miller@example.com', 'p@ssword', 789456, NULL),
(282844192, 'Harry Wilson', 'harry.wilson@example.com', 'secretwo', 234567, NULL),
(282844193, 'Ivy Turner', 'ivy.turner@example.com', 'qwerty', 890123, NULL),
(282844194, 'Oliver Martinez', 'oliver.martinez@example.com', 'letmein4', 678901, NULL),
(282844195, 'Penelope Adams', 'penelope.adams@example.com', 'pass789', 345678, NULL),
(282844196, 'Quincy Baker', 'quincy.baker@example.com', 'qwerty12', 901234, NULL),
(282844197, 'Rose Carter', 'rose.carter@example.com', 'password', 123456, NULL),
(282844198, 'Samuel Evans', 'samuel.evans@example.com', 'abc456', 789012, NULL),
(282844199, 'Tina Foster', 'tina.foster@example.com', 'securepa', 345678, NULL),
(282844200, 'Ulysses Garcia', 'ulysses.garcia@example.com', 'myp@sswo', 901234, NULL),
(282844201, 'Victoria Hall', 'victoria.hall@example.com', 'letmein7', 567890, NULL),
(282844202, 'Walter Irwin', 'walter.irwin@example.com', 'pass456', 234567, NULL),
(282844203, 'Xander Johnson', 'xander.johnson@example.com', 'qwerty78', 890123, NULL),
(282844204, 'Yvonne King', 'yvonne.king@example.com', 'password', 456789, NULL),
(282844205, 'Zachary Lee', 'zachary.lee@example.com', 'abc789', 123456, NULL),
(282844206, 'John Doe', 'john.doe@example.com', 'password', 123456, NULL),
(282844207, 'Jane Smith', 'jane.smith@example.com', 'securepa', 789012, NULL),
(282844208, 'Bob Johnson', 'bob.johnson@example.com', 'mypasswo', 345678, NULL),
(282844209, 'Alice Brown', 'alice.brown@example.com', 'pass123', 567890, NULL),
(282844210, 'Charlie Davis', 'charlie.davis@example.com', 'letmein1', 901234, NULL),
(282844211, 'Eva White', 'eva.white@example.com', 'password', 123789, NULL),
(282844212, 'Frank Black', 'frank.black@example.com', 'abc12345', 456123, NULL),
(282844213, 'Grace Miller', 'grace.miller@example.com', 'p@ssword', 789456, NULL),
(282844214, 'Harry Wilson', 'harry.wilson@example.com', 'secretwo', 234567, NULL),
(282844215, 'Ivy Turner', 'ivy.turner@example.com', 'qwertyui', 890123, NULL),
(282844216, 'Oliver Martinez', 'oliver.martinez@example.com', 'letmein4', 678901, NULL),
(282844217, 'Penelope Adams', 'penelope.adams@example.com', 'pass7890', 345678, NULL),
(282844218, 'Quincy Baker', 'quincy.baker@example.com', 'qwerty12', 901234, NULL),
(282844219, 'Rose Carter', 'rose.carter@example.com', 'password', 123456, NULL),
(282844220, 'Samuel Evans', 'samuel.evans@example.com', 'abc45678', 789012, NULL),
(282844221, 'Tina Foster', 'tina.foster@example.com', 'securep@', 345678, NULL),
(282844222, 'Ulysses Garcia', 'ulysses.garcia@example.com', 'myp@sswo', 901234, NULL),
(282844223, 'Victoria Hall', 'victoria.hall@example.com', 'letmein7', 567890, NULL),
(282844224, 'Walter Irwin', 'walter.irwin@example.com', 'pass4567', 234567, NULL),
(282844225, 'Xander Johnson', 'xander.johnson@example.com', 'qwerty78', 890123, NULL),
(282844226, 'Yvonne King', 'yvonne.king@example.com', 'password', 456789, NULL),
(282844227, 'Zachary Lee', 'zachary.lee@example.com', 'abc78901', 123456, NULL),
(282844228, 'Alice Smith', 'alice.smith@example.com', 'p@ssword', 789012, NULL),
(282844229, 'Brian Wilson', 'brian.wilson@example.com', 'letmein1', 345678, NULL),
(282844230, 'Catherine Davis', 'catherine.davis@example.com', 'pass1234', 901234, NULL),
(282844231, 'David Brown', 'david.brown@example.com', 'qwertyui', 567890, NULL),
(282844232, 'Emma Taylor', 'emma.taylor@example.com', 'password', 234567, NULL),
(282844233, 'Freddie Harris', 'freddie.harris@example.com', 'secure12', 890123, NULL),
(282844234, 'Gloria White', 'gloria.white@example.com', 'mypasswo', 456789, NULL),
(282844235, 'Henry Johnson', 'henry.johnson@example.com', 'letmein7', 123456, NULL),
(282844236, 'Iris Turner', 'iris.turner@example.com', 'pass4567', 789012, NULL),
(282844237, 'Jackie Martinez', 'jackie.martinez@example.com', 'qwerty12', 345678, NULL),
(282844238, 'Kevin Adams', 'kevin.adams@example.com', 'password', 901234, NULL),
(282844239, 'Lucy Carter', 'lucy.carter@example.com', 'abc45678', 567890, NULL),
(282844240, 'Mike Evans', 'mike.evans@example.com', 'securep@', 234567, NULL),
(282844241, 'Natalie Foster', 'natalie.foster@example.com', 'myp@sswo', 890123, NULL),
(282844242, 'Oscar Hall', 'oscar.hall@example.com', 'letmein7', 456789, NULL),
(282844243, 'Paul Irwin', 'paul.irwin@example.com', 'pass4567', 123456, NULL),
(282844244, 'Quinn Johnson', 'quinn.johnson@example.com', 'qwerty78', 789012, NULL),
(282844245, 'Rachel King', 'rachel.king@example.com', 'password', 345678, NULL),
(282844246, 'Steve Lee', 'steve.lee@example.com', 'abc78901', 901234, NULL),
(282844247, 'Tina Smith', 'tina.smith@example.com', 'p@ssword', 567890, NULL),
(282844248, 'Ulysses Wilson', 'ulysses.wilson@example.com', 'letmein1', 234567, NULL),
(282844249, 'Vera Davis', 'vera.davis@example.com', 'pass1234', 890123, NULL),
(282844250, 'Wendy Brown', 'wendy.brown@example.com', 'qwertyui', 456789, NULL),
(282844251, 'Xander Taylor', 'xander.taylor@example.com', 'password', 123456, NULL),
(282844252, 'Yvonne Harris', 'yvonne.harris@example.com', 'secure12', 789012, NULL),
(282844253, 'Zane White', 'zane.white@example.com', 'mypasswo', 345678, NULL),
(282844254, 'Abby Johnson', 'abby.johnson@example.com', 'letmein7', 901234, NULL),
(282844255, 'Benjamin Turner', 'benjamin.turner@example.com', 'pass4567', 567890, NULL),
(282844256, 'Cindy Martinez', 'cindy.martinez@example.com', 'qwerty12', 234567, NULL),
(282844257, 'Derek Adams', 'derek.adams@example.com', 'password', 890123, NULL),
(282844258, 'Emma Carter', 'emma.carter@example.com', 'abc45678', 456789, NULL),
(287804607, 'adil rahman', 'nnnkothay@gmail.com', 'Davidvilla08', 1289129, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `VehicleID` int(8) NOT NULL,
  `Vehicle_Type` varchar(10) NOT NULL,
  `Availability_Status` tinyint(1) NOT NULL DEFAULT 0,
  `Owner_Type` int(10) NOT NULL DEFAULT 0,
  `Hourly_Rate` int(4) NOT NULL,
  `Model` varchar(30) NOT NULL,
  `Special_Features` varchar(200) NOT NULL,
  `UserID` int(8) NOT NULL,
  `LocationID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`VehicleID`, `Vehicle_Type`, `Availability_Status`, `Owner_Type`, `Hourly_Rate`, `Model`, `Special_Features`, `UserID`, `LocationID`) VALUES
(10001, 'Bicycle', 0, 0, 2, 'Bangla', 'Bangla', 20040850, 10000002),
(13213134, 'Bike', 1, 0, 3, 'R15', 'Super Fast', 216792514, 10000002),
(31031282, 'Bike', 1, 0, 2, 'Pulser', 'Good Milage', 20040850, 10000005),
(42562899, 'Bicycle', 0, 0, 2, 'Bangla-007', 'Joy Bangla', 20040850, 10000004),
(50000002, 'Car', 1, 0, 50, 'Lamborghini', 'Super Car', 20000084, 10000006),
(50000003, 'Car', 1, 0, 35, 'Dodge Viper', 'Super Car', 20000084, 10000002),
(50000004, 'Car', 1, 0, 5, 'Toyota Corolla', 'Good Brakes', 216792514, 10000001),
(50000005, 'Car', 1, 0, 8, 'Toyota Premio', 'Comfortable', 215071577, 10000009),
(88012339, 'Bicycle', 0, 0, 2, 'Tesla-003', 'Good', 20040850, 10000006),
(98801070, 'Bicycle', 1, 0, 3, 'Trek FX 3', 'Lightweight frame', 282844183, 10000002),
(98801071, 'Bicycle', 0, 1, 2, 'Giant Escape 2', 'Foldable design', 2, 10000003),
(98801072, 'Bicycle', 1, 0, 4, 'Specialized Turbo Vado SL', 'Electric assist', 282844185, 10000004),
(98801073, 'Bicycle', 1, 1, 5, 'Cannondale Quick CX 3', 'Hydraulic brakes', 2, 10000005),
(98801074, 'Bicycle', 0, 0, 1, 'Schwinn Wayfarer', 'Reflective paint', 282844187, 10000006),
(98801075, 'Bicycle', 0, 1, 3, 'Raleigh Redux 2', 'Adjustable seat', 2, 10000007),
(98801076, 'Bicycle', 0, 0, 2, 'Fuji Absolute 1.9', 'LED lights', 282844189, 10000008),
(98801077, 'Bicycle', 0, 1, 5, 'Canyon Endurace AL', 'Carbon fiber frame', 2, 10000002),
(98801078, 'Bicycle', 1, 0, 3, 'Jamis Coda Sport', 'Water bottle holder', 282844215, 10000003),
(98801079, 'Bicycle', 0, 1, 4, 'VanMoof S3', 'GPS tracker', 2, 10000004),
(98801080, 'Bicycle', 1, 0, 3, 'Trek Domane AL 2', 'Lightweight aluminum frame', 282844183, 10000002),
(98801081, 'Bicycle', 0, 1, 2, 'Cannondale SuperSix Evo', 'Aerodynamic design', 2, 10000003),
(98801082, 'Bicycle', 1, 0, 4, 'Giant Defy Advanced 2', 'Advanced carbon frame', 282844185, 10000004),
(98801083, 'Bicycle', 1, 1, 5, 'Specialized Sirrus X 5.0', 'Hydraulic disc brakes', 2, 10000005),
(98801084, 'Bicycle', 0, 0, 1, 'Scott Addict RC 20', 'Reflective detailing for safet', 282844187, 10000006),
(98801085, 'Bicycle', 0, 1, 3, 'Cervélo Aspero-5', 'Gravel bike with adjustable se', 2, 10000007),
(98801086, 'Bicycle', 1, 0, 2, 'BMC Roadmachine 02', 'Integrated LED lights', 282844189, 10000008),
(98801087, 'Bicycle', 0, 1, 5, 'Ribble Endurance SL', 'Carbon fiber frame for speed', 2, 10000002),
(98801088, 'Bicycle', 1, 0, 3, 'Fuji Jari 1.1', 'Water bottle holder included', 282844191, 10000003),
(98801089, 'Bicycle', 0, 1, 4, 'Yeti SB130', 'Mountain bike with GPS tracker', 2, 10000004),
(98801090, 'Car', 1, 0, 50, 'Toyota Camry', 'Automatic transmission', 282844193, 10000005),
(98801091, 'Car', 0, 0, 40, 'Honda Accord', 'Fuel-efficient sedan', 282844194, 10000006),
(98801092, 'Car', 1, 0, 60, 'Chevrolet Malibu', 'Comfortable interior', 282844195, 10000007),
(98801093, 'Car', 0, 0, 30, 'Ford Fusion', 'SYNC infotainment system', 282844196, 10000008),
(98801094, 'Car', 1, 0, 70, 'Nissan Altima', 'Advanced safety features', 282844197, 10000002),
(98801095, 'Car', 0, 0, 20, 'Hyundai Sonata', 'Sleek design', 282844198, 10000003),
(98801096, 'Car', 1, 0, 80, 'Kia Optima', 'Spacious interior', 282844199, 10000004),
(98801097, 'Car', 0, 0, 35, 'Mazda6', 'Sporty sedan', 282844200, 10000005),
(98801098, 'Car', 1, 0, 90, 'Volkswagen Passat', 'European styling', 282844201, 10000006),
(98801099, 'Car', 0, 0, 25, 'Subaru Legacy', 'All-wheel-drive capability', 282844202, 10000007),
(98801100, 'Car', 1, 0, 80, 'BMW 3 Series', 'Luxury sedan with advanced fea', 282844203, 10000008),
(98801101, 'Car', 0, 0, 70, 'Mercedes-Benz C-Class', 'Premium interior and performan', 282844204, 10000002),
(98801102, 'Car', 1, 0, 90, 'Audi A4', 'Quattro all-wheel drive system', 282844205, 10000003),
(98801103, 'Car', 0, 0, 60, 'Lexus ES', 'Elegant design and comfortable', 282844206, 10000004),
(98801104, 'Car', 1, 0, 75, 'Infiniti Q50', 'Responsive handling and techno', 282844207, 10000005),
(98801105, 'Car', 0, 0, 45, 'Volvo S60', 'Safety-focused luxury sedan', 282844208, 10000006),
(98801106, 'Car', 1, 0, 100, 'Jaguar XF', 'Performance and style combined', 282844209, 10000007),
(98801107, 'Car', 0, 0, 50, 'Tesla Model 3', 'Electric vehicle with autopilo', 282844210, 10000008),
(98801108, 'Car', 1, 0, 95, 'Porsche Panamera', 'Sports sedan with powerful eng', 282844211, 10000002),
(98801109, 'Car', 0, 0, 65, 'Genesis G80', 'Luxury features at an affordab', 282844212, 10000003),
(98801110, 'Bike', 1, 0, 15, 'Cannondale Synapse', 'Lightweight road bike', 282844213, 10000008),
(98801111, 'Bike', 0, 0, 12, 'Trek Checkpoint', 'Gravel bike for diverse terrai', 282844214, 10000002),
(98801112, 'Bike', 1, 0, 8, 'Giant Talon', 'Mountain bike with front suspe', 282844215, 10000003),
(98801113, 'Bike', 0, 0, 10, 'Specialized Sirrus', 'Hybrid bike for city commuting', 282844216, 10000004),
(98801114, 'Bike', 1, 0, 18, 'Scott Addict', 'High-performance road bike', 282844217, 10000005),
(98801115, 'Bike', 0, 0, 7, 'Cervélo Caledonia', 'Versatile all-road bike', 282844218, 10000006),
(98801116, 'Bike', 1, 0, 14, 'BMC Teammachine', 'Carbon frame for speed', 282844219, 10000007),
(98801117, 'Bike', 0, 0, 9, 'Ribble CGR', 'Gravel bike with comfortable g', 282844220, 10000008),
(98801118, 'Bike', 1, 0, 13, 'Fuji Jari', 'Adventure bike with wide tires', 282844221, 10000002),
(98801119, 'Bike', 0, 0, 11, 'Yeti SB140', 'Trail bike with full suspensio', 282844222, 10000003),
(98801120, 'Bike', 1, 0, 17, 'Trek Remedy', 'Full-suspension trail bike', 282844223, 10000004),
(98801121, 'Bike', 0, 0, 10, 'Giant Stance', 'Affordable entry-level mountai', 282844224, 10000005),
(98801122, 'Bike', 1, 0, 8, 'Specialized Rockhopper', 'Durable hardtail mountain bike', 282844225, 10000006),
(98801123, 'Bike', 0, 0, 15, 'Scott Spark', 'Cross-country race-ready bike', 282844226, 10000007),
(98801124, 'Bike', 1, 0, 19, 'Cannondale Scalpel', 'High-performance XC mountain b', 282844227, 10000008),
(98801125, 'Bike', 0, 0, 12, 'BMC Fourstroke', 'Dual-suspension for smooth tra', 282844228, 10000002),
(98801126, 'Bike', 1, 0, 14, 'Ribble SL', 'Lightweight carbon road bike', 282844229, 10000003),
(98801127, 'Bike', 0, 0, 7, 'Fuji Nevada', 'Versatile hardtail for various', 282844230, 10000004),
(98801128, 'Bike', 1, 0, 16, 'Yeti SB115', 'Trail bike with efficient clim', 282844231, 10000005),
(98801129, 'Bike', 0, 0, 11, 'Trek X-Caliber', 'Fast and versatile cross-count', 282844232, 10000006),
(98801130, 'Bicycle', 1, 1, 3, 'Roadmaster Granite Peak', 'Good suspension, gear and dura', 2, 10000009),
(98801131, 'Bicycle', 1, 1, 2, 'Velonce kokabura', 'Good suspension, gear and durable', 2, 10000007),
(98801132, 'Bicycle', 1, 1, 2, 'Velonce kokabura', 'Good suspension, gear and durable', 2, 10000005),
(98801133, 'Bicycle', 1, 1, 2, 'Velonce kokabura', 'Good suspension, gear and durable', 2, 10000006),
(98801134, 'Bicycle', 1, 1, 2, 'Velonce kokabura', 'Good suspension, gear and durable', 2, 10000004),
(98801135, 'Bicycle', 1, 1, 2, 'Velonce kokabura', 'Good suspension, gear and durable', 2, 10000003),
(98801136, 'Bicycle', 1, 1, 2, 'Hiland Road Hybrid Bike', 'Good suspension, gear and durable', 2, 10000001),
(98801137, 'Bicycle', 1, 1, 2, 'Hiland Road Hybrid Bike', 'Good suspension, gear and durable', 2, 10000007),
(98801138, 'Bicycle', 1, 1, 2, 'Hiland Road Hybrid Bike', 'Good suspension, gear and durable', 2, 10000007),
(98801139, 'Bicycle', 1, 1, 2, 'Hiland Road Hybrid Bike', 'Good suspension, gear and durable', 2, 10000001),
(98801140, 'Bicycle', 1, 1, 2, 'Hiland Road Hybrid Bike', 'Good suspension, gear and durable', 2, 10000006),
(98801141, 'Bicycle', 1, 1, 2, 'Roadmaster Granite Peak ', 'Good suspension, gear and durable', 2, 10000006),
(98801142, 'Bicycle', 1, 1, 2, 'Roadmaster Granite Peak ', 'Good suspension, gear and durable', 2, 10000001),
(98801143, 'Bicycle', 1, 1, 2, 'Roadmaster Granite Peak ', 'Good suspension, gear and durable', 2, 10000003),
(98801144, 'Bicycle', 1, 1, 2, 'Roadmaster Granite Peak ', 'Good suspension, gear and durable', 2, 10000002),
(98801145, 'Bicycle', 1, 1, 2, 'Roadmaster Granite Peak ', 'Good suspension, gear and durable', 2, 10000001),
(98801146, 'Bicycle', 1, 1, 2, 'Vilano R2 Commuter', 'Good suspension, gear and durable', 2, 10000007),
(98801147, 'Bicycle', 1, 1, 2, 'Vilano R2 Commuter', 'Good suspension, gear and durable', 2, 10000002),
(98801148, 'Bicycle', 1, 1, 2, 'Vilano R2 Commuter', 'Good suspension, gear and durable', 2, 10000004),
(98801149, 'Bicycle', 1, 1, 2, 'Vilano R2 Commuter', 'Good suspension, gear and durable', 2, 10000004),
(98801150, 'Bicycle', 1, 1, 2, 'Vilano R2 Commuter', 'Good suspension, gear and durable', 2, 10000002);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`FeedbackID`),
  ADD KEY `ss` (`UserID`),
  ADD KEY `dd` (`VehicleID`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`LocationID`),
  ADD KEY `location_ibfk_1` (`AdminID`);

--
-- Indexes for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD PRIMARY KEY (`MaintenanceID`),
  ADD KEY `bb` (`VehicleID`),
  ADD KEY `aa` (`AdminID`);

--
-- Indexes for table `rental payment`
--
ALTER TABLE `rental payment`
  ADD PRIMARY KEY (`PaymentID`),
  ADD KEY `b` (`VehicleID`),
  ADD KEY `c` (`UserID`);

--
-- Indexes for table `rents`
--
ALTER TABLE `rents`
  ADD PRIMARY KEY (`UserID`,`VehicleID`),
  ADD KEY `rents_ibfk_2` (`VehicleID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`VehicleID`),
  ADD KEY `A` (`UserID`),
  ADD KEY `d` (`LocationID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `AdminID` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10000009;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `FeedbackID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10000069;

--
-- AUTO_INCREMENT for table `location`
--
ALTER TABLE `location`
  MODIFY `LocationID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10000010;

--
-- AUTO_INCREMENT for table `maintenance`
--
ALTER TABLE `maintenance`
  MODIFY `MaintenanceID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13123135;

--
-- AUTO_INCREMENT for table `rental payment`
--
ALTER TABLE `rental payment`
  MODIFY `PaymentID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100000077;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=287804608;

--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `VehicleID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=98801151;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `dd` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`),
  ADD CONSTRAINT `ss` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `location`
--
ALTER TABLE `location`
  ADD CONSTRAINT `location_ibfk_1` FOREIGN KEY (`AdminID`) REFERENCES `admin` (`AdminID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD CONSTRAINT `maintenance_ibfk_2` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `maintenance_ibfk_3` FOREIGN KEY (`AdminID`) REFERENCES `admin` (`AdminID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rental payment`
--
ALTER TABLE `rental payment`
  ADD CONSTRAINT `b` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`),
  ADD CONSTRAINT `c` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `rents`
--
ALTER TABLE `rents`
  ADD CONSTRAINT `rents_ibfk_2` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rents_ibfk_3` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD CONSTRAINT `A` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `d` FOREIGN KEY (`LocationID`) REFERENCES `location` (`LocationID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
