CREATE DATABASE  IF NOT EXISTS `LibraryTerm` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `LibraryTerm`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: LibraryTerm
-- ------------------------------------------------------
-- Server version	5.7.17

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
-- Table structure for table `libitems`
--

DROP TABLE IF EXISTS `libitems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libitems` (
  `bookid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  `dueDate` date DEFAULT NULL,
  `thumbURL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libitems`
--

LOCK TABLES `libitems` WRITE;
/*!40000 ALTER TABLE `libitems` DISABLE KEYS */;
INSERT INTO `libitems` VALUES (1,'I, Robot','Issac Asimov','1','2017-07-06','http://library.umbc.edu/speccoll/scifi/images/i_robot.jpg'),(2,'Humanity Prime','Bruce Mc Allister','1','2017-07-05','http://resonantfish.com/blogalopod/wp-content/uploads/2009/11/no_way_back.jpg'),(3,'The Robot Brains','Sydney Bounds','0',NULL,'http://people.uncw.edu/smithms/Ace%20singles/s5N-series/34900.jpg'),(4,'Astonding Science Fiction','Anthology','0',NULL,'https://s-media-cache-ak0.pinimg.com/originals/ec/79/1c/ec791c3953c43f26e965f6128c467838.jpg'),(5,'Stranger in A Strange Land','Robert A. Heinlein','0',NULL,'https://s-media-cache-ak0.pinimg.com/736x/80/5a/0e/805a0e88bd5d18934a35ed7625d1bff3.jpg'),(6,'Alien Planet','Flecther Pratt','1','2017-07-04','https://cheapscifi.files.wordpress.com/2011/01/alienplanetcoolestcover.jpg'),(10,'Doomed Planet','Lee Sheldon','0',NULL,'http://pzrservices.typepad.com/.a/6a00d83451ccbc69e2010536114a85970b-pi'),(14,'The great book','The great author','0',NULL,'image.jpg'),(15,'A good book','The great author','0',NULL,'option.jpg');
/*!40000 ALTER TABLE `libitems` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-19  9:29:52
