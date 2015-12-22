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
-- Table structure for table `t_application`
--

DROP TABLE IF EXISTS `t_application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_application` (
  `a_id` int(10) NOT NULL AUTO_INCREMENT,
  `a_open_date` datetime DEFAULT NULL,
  `a_statue` varchar(45) DEFAULT NULL,
  `a_deposit` int(11) DEFAULT NULL,
  `a_pay_statue` varchar(45) DEFAULT NULL,
  `a_resident_fee` int(11) DEFAULT NULL,
  `a_submit_date` datetime DEFAULT NULL,
  `a_grade` varchar(45) DEFAULT NULL,
  `comment` varchar(140) DEFAULT NULL,
  `t_school_sch_id` int(11) NOT NULL,
  `t_student_stu_id` int(11) NOT NULL,
  PRIMARY KEY (`a_id`),
  KEY `t_school_sch_id_idx` (`t_school_sch_id`),
  KEY `t_student_stu_id_idx` (`t_student_stu_id`),
  CONSTRAINT `t_school_sch_id` FOREIGN KEY (`t_school_sch_id`) REFERENCES `t_school` (`sch_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `t_student_stu_id` FOREIGN KEY (`t_student_stu_id`) REFERENCES `t_student` (`stu_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_application`
--

LOCK TABLES `t_application` WRITE;
/*!40000 ALTER TABLE `t_application` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_application` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_school`
--

DROP TABLE IF EXISTS `t_school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_school` (
  `sch_id` int(11) NOT NULL AUTO_INCREMENT,
  `sch_name` varchar(45) DEFAULT NULL,
  `sch_website` varchar(45) DEFAULT NULL,
  `deadline` datetime DEFAULT NULL,
  `sch_grade` varchar(45) DEFAULT NULL,
  `sch_Est` int(10) DEFAULT NULL,
  `sch_cap` int(11) DEFAULT NULL,
  `sch_pt_ratio` varchar(45) DEFAULT NULL,
  `sch_street` varchar(45) DEFAULT NULL,
  `sch_city` varchar(45) DEFAULT NULL,
  `sch_state` varchar(45) DEFAULT NULL,
  `sch_zip` varchar(45) DEFAULT NULL,
  `sch_Sat` int(11) DEFAULT NULL,
  `sch_TF` int(11) DEFAULT NULL,
  `sch_Esl` int(11) DEFAULT NULL,
  `sch_chn_pop` int(11) DEFAULT NULL,
  `sch_deps` int(11) DEFAULT NULL,
  `sch_fee` int(11) DEFAULT NULL,
  `total_fee` int(11) DEFAULT NULL,
  `sch_des` varchar(45) DEFAULT NULL,
  `sch_group` varchar(45) DEFAULT NULL,
  `sch_religon` varchar(45) DEFAULT NULL,
  `sch_type` varchar(45) DEFAULT NULL,
  `sch_res_fee` int(11) DEFAULT NULL,
  `sch_start_date` datetime DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_school`
--

LOCK TABLES `t_school` WRITE;
/*!40000 ALTER TABLE `t_school` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_school` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_student`
--

DROP TABLE IF EXISTS `t_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_student` (
  `stu_id` int(11) NOT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `stu_gender` varchar(45) DEFAULT NULL,
  `stu_ref` varchar(45) DEFAULT NULL,
  `stu_age` int(11) DEFAULT NULL,
  `stu_phone` int(11) DEFAULT NULL,
  `stu_street` varchar(45) DEFAULT NULL,
  `stu_city` varchar(45) DEFAULT NULL,
  `stu_pvn` varchar(45) DEFAULT NULL,
  `stu_zip` varchar(45) DEFAULT NULL,
  `stu_Sat` int(11) DEFAULT NULL,
  `stu_TF` int(11) DEFAULT NULL,
  `stu_deci` varchar(45) DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_student`
--

LOCK TABLES `t_student` WRITE;
/*!40000 ALTER TABLE `t_student` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-22 16:28:10
