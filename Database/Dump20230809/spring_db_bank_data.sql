CREATE DATABASE  IF NOT EXISTS `spring_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spring_db`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: spring_db
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bank_data`
--

DROP TABLE IF EXISTS `bank_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank_data` (
  `accountno` int(11) NOT NULL AUTO_INCREMENT,
  `micrno` int(11) DEFAULT NULL,
  `pin` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `accounttype` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `initialbalance` double DEFAULT NULL,
  `name` varchar(35) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `nationality` varchar(12) DEFAULT NULL,
  `religion` varchar(10) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `sec_questions` varchar(45) DEFAULT NULL,
  `sec_ans` varchar(45) DEFAULT NULL,
  `img` varchar(45) DEFAULT NULL,
  `status` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`accountno`)
) ENGINE=InnoDB AUTO_INCREMENT=100011 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_data`
--

LOCK TABLES `bank_data` WRITE;
/*!40000 ALTER TABLE `bank_data` DISABLE KEYS */;
INSERT INTO `bank_data` VALUES (100001,5668,111,'arifrubel408@gmail.com','Current','Mirpur-14, Dhaka','Male',39500,'MOHAMMAD ARIFUZZAMAN','1993-01-02','Bangladeshi','Islam','01764010102','What is your nick name?','Rubel','arif.png','active'),(100002,3445,222,'mahfuz@gmail.com','Savings','Kishorgonj','Male',14000,'Mahfuz Ullah','1995-06-07','Bangladeshi','Islam','01784739475','What is your favourite sports?','football ','mahfuz.JPG','active'),(100003,6519,751005,'shahidul123@gmail.com','Fixed Deposite','Barishal Sadar','Male',38000,'Shahidul Islam','1996-03-14','Bangladeshi','Islam','01784797895','What is your mother`s occupation?','Housewife','shohidur.JPG','active'),(100004,9248,169899,'mohinurrahman1995@gmail.com','Current','Kustiwa','Male',34000,'Mohinur Rahman','1994-02-25','Bangladeshi','Islam','01765432143','What is your nick name?','Mohin','mohinur.JPG','active'),(100005,1724,665070,'selim123@gmail.com','Savings','Agargaon','Male',44500,'Selim Rayhan','1993-05-02','Bangladeshi','Islam','01543456890','What is your favourite sports?','Chase','selim.JPG','deactive'),(100006,9559,306225,'mohammedrejwan8@gmail.com','Savings','Laxmipur','Male',5000,'Rejwan Sharif','1993-06-09','Bangladeshi','Islam','01398765637','What is your nick name?','rejwan','rejwan.JPG','active'),(100007,8855,654321,'arifrubel408@gmail.com','Savings','Khamatpara','Male',45400,'Shahidr','1994-03-04','Bangladeshi','Islam','01784797895','What is your favourite sports?','football ','shohidur.JPG','active'),(100008,6576,322226,'rubel408@gmail.com','Current','Mirpur','Male',30000,'Rubel Hossain','1994-07-07','Bangladeshi','Islam','01543456890','What is your nick name?','Rubel','selim.JPG','deactive'),(100009,9689,478851,NULL,NULL,NULL,NULL,0,'Maruf',NULL,NULL,NULL,NULL,NULL,NULL,'selim.JPG','active'),(100010,2371,851657,'mohammedrejwan8@gmail.com','Current','Basundhara R/A','Male',30000,'Rejwan Shraif','1997-01-09','Bangladeshi','Islam','01304229984','What is your nick name?','Tanvir','rejwan.JPG','active');
/*!40000 ALTER TABLE `bank_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-09 17:52:38
