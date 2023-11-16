-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2023 at 10:25 AM
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
  `AdminID` int(8) NOT NULL,
  `UserName` varchar(10) NOT NULL,
  `Password` int(8) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Full Name` varchar(30) NOT NULL,
  `Role` varchar(20) NOT NULL,
  `Profile Picture` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `FeedbackID` int(8) NOT NULL,
  `Rating` int(1) NOT NULL,
  `Comment` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `UserID` int(8) NOT NULL,
  `VehicleID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `LocationID` int(8) NOT NULL,
  `Location Name` varchar(30) NOT NULL,
  `AdminID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

-- --------------------------------------------------------

--
-- Table structure for table `rental payment`
--

CREATE TABLE `rental payment` (
  `PaymentID` int(8) NOT NULL,
  `Rental Start Time` float NOT NULL,
  `Rental End Time` float NOT NULL,
  `TransactionID` int(8) NOT NULL,
  `Payment Date` date NOT NULL,
  `Payment Method` varchar(10) NOT NULL,
  `VehicleID` int(8) NOT NULL,
  `UserID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `rents`
--

CREATE TABLE `rents` (
  `UserID` int(8) NOT NULL,
  `VehicleID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(8) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(8) NOT NULL,
  `NID Number` int(30) NOT NULL,
  `Profile picture` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `Name`, `Email`, `Password`, `NID Number`, `Profile picture`) VALUES
(20040850, 'Atfan', 'atfan@gmail.com', '20040855', 123456789, 0);

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `VehicleID` int(8) NOT NULL,
  `Vehicle Type` varchar(10) NOT NULL,
  `Availability Status` tinyint(1) NOT NULL,
  `Owner Type` varchar(10) NOT NULL,
  `Rental Price Per Hour` int(4) NOT NULL,
  `Model` varchar(30) NOT NULL,
  `Speical Features` varchar(30) NOT NULL,
  `UserID` int(8) NOT NULL,
  `LocationID` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  ADD PRIMARY KEY (`LocationID`);

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
  ADD PRIMARY KEY (`UserID`),
  ADD KEY `gg` (`VehicleID`);

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
  MODIFY `AdminID` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `FeedbackID` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `location`
--
ALTER TABLE `location`
  MODIFY `LocationID` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `maintenance`
--
ALTER TABLE `maintenance`
  MODIFY `MaintenanceID` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `rental payment`
--
ALTER TABLE `rental payment`
  MODIFY `PaymentID` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20040851;

--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `VehicleID` int(8) NOT NULL AUTO_INCREMENT;

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
-- Constraints for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD CONSTRAINT `aa` FOREIGN KEY (`AdminID`) REFERENCES `vehicle` (`VehicleID`),
  ADD CONSTRAINT `bb` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`);

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
  ADD CONSTRAINT `ff` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`),
  ADD CONSTRAINT `gg` FOREIGN KEY (`VehicleID`) REFERENCES `vehicle` (`VehicleID`);

--
-- Constraints for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD CONSTRAINT `A` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`),
  ADD CONSTRAINT `d` FOREIGN KEY (`LocationID`) REFERENCES `location` (`LocationID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
