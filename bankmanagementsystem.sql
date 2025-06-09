-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2024 at 04:42 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `pin` varchar(30) NOT NULL,
  `date` varchar(50) NOT NULL,
  `type` varchar(30) NOT NULL,
  `amount` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`pin`, `date`, `type`, `amount`) VALUES
('3448', 'Sun Sep 01 19:34:46 IST 2024', 'Deposit', '200000'),
('3448', 'Sun Sep 01 19:34:56 IST 2024', 'Withdraw', '2000'),
('3448', 'Sun Sep 01 19:35:03 IST 2024', 'Withdrawl', '5000'),
('3770', 'Sun Sep 01 19:41:17 IST 2024', 'Deposit', '200000'),
('123', 'Mon Sep 02 19:12:03 IST 2024', 'Deposit', '120000'),
('2139', 'Mon Sep 02 20:51:48 IST 2024', 'Deposit', '56000000'),
('2542', 'Tue Sep 03 10:21:05 IST 2024', 'Deposit', '566000000'),
('1362', 'Tue Sep 03 12:01:19 IST 2024', 'Deposit', '960000'),
('1362', 'Tue Sep 03 12:01:39 IST 2024', 'Withdraw', '500'),
('123', 'Tue Sep 03 12:27:43 IST 2024', 'Deposit', '50000'),
('123', 'Tue Sep 03 12:27:55 IST 2024', 'Withdraw', '5000'),
('123', 'Tue Sep 03 12:28:07 IST 2024', 'Withdrawl', '5000'),
('123', 'Tue Sep 03 12:32:04 IST 2024', 'Deposit', '4000'),
('1234', 'Thu Sep 05 18:48:03 IST 2024', 'Deposit', '12000'),
('1234', 'Thu Sep 05 18:48:11 IST 2024', 'Withdraw', '1000'),
('1234', 'Thu Sep 05 18:48:15 IST 2024', 'Withdrawl', '1000'),
('8511', 'Fri Sep 06 10:02:11 IST 2024', 'Deposit', '10000'),
('8511', 'Fri Sep 06 10:02:23 IST 2024', 'Deposit', '10000'),
('8511', 'Fri Sep 06 10:02:34 IST 2024', 'Withdraw', '5000'),
('5959', 'Fri Sep 06 11:26:30 IST 2024', 'Deposit', '95000'),
('5959', 'Fri Sep 06 11:26:49 IST 2024', 'Withdraw', '5000'),
('5959', 'Fri Sep 06 11:26:55 IST 2024', 'Withdrawl', '5000'),
('123', 'Wed Sep 11 17:58:17 IST 2024', 'Deposit', '1222'),
('123', 'Wed Sep 11 17:58:21 IST 2024', 'Withdraw', '12'),
('123', 'Wed Sep 11 17:58:47 IST 2024', 'Withdrawl', '100'),
('123', 'Thu Sep 26 19:08:31 IST 2024', 'Deposit', '20000'),
('123', 'Thu Sep 26 19:08:39 IST 2024', 'Withdrawl', '500'),
('1909', 'Fri Sep 27 12:00:13 IST 2024', 'Deposit', '100000000000'),
('1909', 'Fri Sep 27 12:01:34 IST 2024', 'Deposit', '1222'),
('123', 'Thu Oct 03 20:46:12 IST 2024', 'Deposit', '10000'),
('123', 'Thu Oct 03 20:46:24 IST 2024', 'Withdraw', '100'),
('123', 'Thu Oct 03 20:46:33 IST 2024', 'Withdrawl', '100'),
('5147', 'Thu Oct 03 20:46:56 IST 2024', 'Deposit', '12222'),
('5147', 'Thu Oct 03 20:47:00 IST 2024', 'Withdraw', '12'),
('123', 'Tue Oct 08 17:04:23 IST 2024', 'Deposit', '10000'),
('123', 'Tue Oct 08 17:04:31 IST 2024', 'Withdraw', '2000'),
('123', 'Tue Oct 08 17:04:39 IST 2024', 'Withdrawl', '2000'),
('1932', 'Thu Oct 10 08:11:51 IST 2024', 'Deposit', '500000'),
('1932', 'Thu Oct 10 08:12:00 IST 2024', 'Withdraw', '600000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `formno` varchar(30) NOT NULL,
  `cardnumber` varchar(30) NOT NULL,
  `pinnumber` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`formno`, `cardnumber`, `pinnumber`) VALUES
('5620', '5040935993494718', '123'),
('2257', '5040936071304649', '4056'),
('1795', '5040935998302493', '3770'),
('5571', '5040935940730861', '2139'),
('5104', '5040936031484809', '2542'),
('9708', '5040936029397750', '1362'),
('1474', '5040936037044529', '123'),
('6992', '5040936069253009', '1234'),
('5897', '5040935921513817', '8511'),
('7216', '5040935993212592', '5959'),
('148', '5040936004291208', '1909'),
('2094', '5040936001939500', '123'),
('3282', '5040935964747325', '123'),
('901', '5040936062620077', '1932');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `Form_no` varchar(30) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Father_name` varchar(30) NOT NULL,
  `Date_of_Birh` varchar(30) NOT NULL,
  `Gender` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Marital` varchar(30) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `City` varchar(30) NOT NULL,
  `State` varchar(30) NOT NULL,
  `Pincode` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`Form_no`, `Name`, `Father_name`, `Date_of_Birh`, `Gender`, `Email`, `Marital`, `Address`, `City`, `State`, `Pincode`) VALUES
('1795', 'Aashutosh', 'Avadhesh Sinh', '6 Sept 2024', 'Married', 'dwefewff', 'null', 'fwefewf', 'fwefewf', 'fewfewf', 'wfeewfewf'),
('5571', 'Sagar', 'Avadhesh SInh', '11 Dec 2007', 'Male', 'sagar@gmail.com', 'Married', 'Rajkot', 'Rajkot', 'Gujarat', '360022'),
('5104', 'Anis', 'Kaida', '21 Sept 2004', 'Male', 'aniskaida@gmail.com', 'Married', 'Kotharia', 'Rajkot', 'Gujarat', '360022'),
('9708', 'Karan', 'kmk', '30 Nov 2004', 'Male', 'dewdde', 'Married', 'dewdeddewdew', 'frfrf', 'ferferfref', 'erfrfref'),
('1474', 'Vishal', 'mkmk', '1 Oct 2005', 'Male', 'ece', 'Married', 'cecece', 'cece', 'cecece', 'ceecec'),
('6992', 'Aashu', 'Avadhesh Sinh', '1 Nov 2024', 'Male', 'aa', 'Married', 'aa', 'aaa', 'aa', 'aaa'),
('5897', 'Anis', 'Kaida', '6 Sept 2024', 'Male', 'aniskaida@gmail.com', 'Married', 'Rajkot', 'Rajkot', 'Gujarat', '360022'),
('7216', 'yuddu', 'yuuy', '6 Sept 2024', 'Male', 'uigweci@gmail.com', 'Married', 'Rajkot', 'Rajkot', 'Gujarat', '360022'),
('148', 'sagar', 'aaaa', '11 Sep, 2007', 'Male', 'dsfgghhh', 'Unmarried', 'ssssssssssssssssss', 'sssssssssss', 'sss', 'ssss'),
('2094', 'Aashutosh', 'Avadheshsinh', '3 Oct, 2024', 'Male', 'aashutoshk2003@gmail.com', 'Unmarried', 'Kotharia', 'Rajkot', 'Gujarat', '360022'),
('3282', 'Savan', 'Yash', '8 Oct, 2024', 'Male', 'savan@gmail.com', 'Married', 'Rajkot', 'Rajkot', 'Gujarat', '360022'),
('901', 'Anis Kaida', 'SatarBHai', '10 Oct, 2024', 'Male', 'aniskaida@gmail.com', 'Married', 'Rajkot', 'Rajkot', 'Rajkot', '360022');

-- --------------------------------------------------------

--
-- Table structure for table `signupthree`
--

CREATE TABLE `signupthree` (
  `formno` varchar(20) NOT NULL,
  `accountType` varchar(40) NOT NULL,
  `cardnumber` varchar(25) NOT NULL,
  `pin` varchar(10) NOT NULL,
  `facility` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signupthree`
--

INSERT INTO `signupthree` (`formno`, `accountType`, `cardnumber`, `pin`, `facility`) VALUES
('1795', 'Recurring Deposit Account', '5040935998302493', '3770', '  ATM Card'),
('5571', 'Savaing Account', '5040935940730861', '2139', '  ATM Card'),
('5104', 'Savaing Account', '5040936031484809', '2542', '  ATM Card'),
('9708', 'Fixed Deposit Account', '5040936029397750', '1362', '  ATM Card'),
('1474', 'Fixed Deposit Account', '5040936037044529', '123', '  Mobile Banking'),
('6992', 'Current Account', '5040936069253009', '1234', '  ATM Card'),
('5897', 'Savaing Account', '5040935921513817', '8511', '  ATM Card'),
('7216', 'Savaing Account', '5040935993212592', '5959', '  ATM Card'),
('148', 'Fixed Deposit Account', '5040936004291208', '1909', '  ATM Card'),
('2094', 'Fixed Deposit Account', '5040936001939500', '123', '  ATM Card'),
('3282', 'Recurring Deposit Account', '5040935964747325', '123', '  Mobile Banking'),
('901', 'Savaing Account', '5040936062620077', '1932', '  ATM Card');

-- --------------------------------------------------------

--
-- Table structure for table `signuptwo`
--

CREATE TABLE `signuptwo` (
  `Form_no` varchar(30) NOT NULL,
  `Religion` varchar(30) NOT NULL,
  `Categorydd` varchar(30) NOT NULL,
  `Incomedd` varchar(30) NOT NULL,
  `Educationaldd` varchar(30) NOT NULL,
  `Occupationdd` varchar(30) NOT NULL,
  `pan_number` varchar(30) NOT NULL,
  `aadhar_number` varchar(30) NOT NULL,
  `Senior` varchar(30) NOT NULL,
  `Account` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signuptwo`
--

INSERT INTO `signuptwo` (`Form_no`, `Religion`, `Categorydd`, `Incomedd`, `Educationaldd`, `Occupationdd`, `pan_number`, `aadhar_number`, `Senior`, `Account`) VALUES
('1795', 'Hindu', 'General', '< 2,50,000', 'Graduate', 'Self Employed', 'fwefewfewf', 'fwefefew', 'YES', 'YES'),
('5571', 'Hindu', 'General', 'NULL', 'Non Graduation', 'Student', '151515151515', '151515151515', 'YES', 'YES'),
('5104', 'Muslim', 'OBC', '< 1,50,000', 'Graduate', 'Student', '151515155151', '151551151', 'NO', 'YES'),
('9708', 'Hindu', 'General', 'NULL', 'Non Graduation', 'Salaried', 'ceec', 'cerfce', 'NO', 'NO'),
('1474', 'Hindu', 'General', 'NULL', 'Non Graduation', 'Salaried', 'ceec', 'cece', 'NO', 'NO'),
('6992', 'Hindu', 'OBC', '< 2,50,000', 'Graduate', 'Self Employed', 'aaa', 'aaa', 'YES', 'YES'),
('5897', 'Hindu', 'General', 'NULL', 'Graduate', 'Student', '12121212121212', '121212211212', 'NO', 'NO'),
('7216', 'Hindu', 'General', '< 2,50,000', 'Post Graduation', 'Salaried', 'ibcuwuocuwec', 'cwejbcewcoew', 'NO', 'NO'),
('148', 'Hindu', 'General', 'Upto 10,00,000', 'Post Graduation', 'Bussiness', 'sdaa', 'fsddfd', 'NO', 'YES'),
('2094', 'Hindu', 'General', 'NULL', 'Non Graduation', 'Student', 'aeeaeaeae', '1245787845451212', 'NO', 'NO'),
('3282', 'Hindu', 'General', 'NULL', 'Non Graduation', 'Salaried', 'qwqwqwqw', 'qwqwqw', 'YES', 'YES'),
('901', 'Hindu', 'General', 'NULL', 'Non Graduation', 'Salaried', 'qwqwqwqwqw', 'asasasasas', 'YES', 'YES');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
