-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: sql5.freemysqlhosting.net    Database: sql5100650
-- ------------------------------------------------------
-- Server version	5.5.46-0ubuntu0.14.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `application`
--

DROP TABLE IF EXISTS `application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application` (
  `school_school_id` int(11) NOT NULL,
  `student_student_id` int(11) NOT NULL,
  `a_open_date` datetime DEFAULT NULL,
  `a_statue` varchar(45) DEFAULT NULL,
  `a_deposit` int(11) DEFAULT NULL,
  `a_pay_statue` varchar(45) DEFAULT NULL,
  `a_resident_fee` int(11) DEFAULT NULL,
  `a_submit_date` datetime DEFAULT NULL,
  `a_grade` varchar(45) DEFAULT NULL,
  `comment` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`school_school_id`,`student_student_id`),
  KEY `fk_case_student_idx` (`student_student_id`),
  KEY `fk_case_school1_idx` (`school_school_id`),
  CONSTRAINT `fk_case_student` FOREIGN KEY (`student_student_id`) REFERENCES `student` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_case_school1` FOREIGN KEY (`school_school_id`) REFERENCES `school` (`school_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `application_doc`
--

DROP TABLE IF EXISTS `application_doc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application_doc` (
  `i-20` int(11) DEFAULT NULL,
  `case_student_student_id` int(11) NOT NULL,
  `case_school_school_id` int(11) NOT NULL,
  `comment` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`case_student_student_id`,`case_school_school_id`),
  CONSTRAINT `fk_case_doc_case1` FOREIGN KEY (`case_student_student_id`, `case_school_school_id`) REFERENCES `application` (`student_student_id`, `school_school_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application_doc`
--

LOCK TABLES `application_doc` WRITE;
/*!40000 ALTER TABLE `application_doc` DISABLE KEYS */;
/*!40000 ALTER TABLE `application_doc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sch_doc`
--

DROP TABLE IF EXISTS `sch_doc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sch_doc` (
  `i-20` int(11) DEFAULT NULL,
  `school_school_id` int(11) NOT NULL,
  `comment` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`school_school_id`),
  CONSTRAINT `fk_sch_doc_school1` FOREIGN KEY (`school_school_id`) REFERENCES `school` (`school_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sch_doc`
--

LOCK TABLES `sch_doc` WRITE;
/*!40000 ALTER TABLE `sch_doc` DISABLE KEYS */;
/*!40000 ALTER TABLE `sch_doc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `school`
--

DROP TABLE IF EXISTS `school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `school` (
  `school_id` int(11) NOT NULL,
  `schoolName` varchar(45) DEFAULT NULL,
  `sch_city` varchar(45) DEFAULT NULL,
  `sch_state` varchar(45) DEFAULT NULL,
  `sch_street` varchar(45) DEFAULT NULL,
  `sch_zipCode` int(11) DEFAULT NULL,
  `web_site` varchar(45) DEFAULT NULL,
  `est` varchar(45) DEFAULT NULL,
  `app_grade` varchar(45) DEFAULT NULL,
  `capcity` int(11) DEFAULT NULL,
  `pt_ratio` int(11) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `religon` varchar(45) DEFAULT NULL,
  `ESL` varchar(45) DEFAULT NULL,
  `chinese_population` int(11) DEFAULT NULL,
  `SAT` int(11) DEFAULT NULL,
  `group` varchar(45) DEFAULT NULL,
  `resident` varchar(45) DEFAULT NULL,
  `sch_deposit` int(11) DEFAULT NULL,
  `tuition_fee` int(11) DEFAULT NULL,
  `total_fee` int(11) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `dead_line` datetime DEFAULT NULL,
  `comment` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school`
--

LOCK TABLES `school` WRITE;
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
/*!40000 ALTER TABLE `school` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `referrence` varchar(45) DEFAULT NULL,
  `grade` varchar(45) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `stu_street` varchar(45) DEFAULT NULL,
  `stu_city` varchar(45) DEFAULT NULL,
  `stu_province` varchar(45) DEFAULT NULL,
  `stu_zipcode` varchar(45) DEFAULT NULL,
  `decision` varchar(45) DEFAULT NULL,
  `comment` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-21 22:48:49
