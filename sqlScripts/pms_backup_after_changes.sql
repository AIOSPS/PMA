-- MySQL dump 10.13  Distrib 5.7.16, for Win64 (x86_64)
--
-- Host: localhost    Database: pms
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `pms_access_to_land`
--

DROP TABLE IF EXISTS `pms_access_to_land`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_access_to_land` (
  `acc_id` varchar(15) NOT NULL,
  `acc_desc` varchar(100) NOT NULL,
  `acc_area_class_id` varchar(15) NOT NULL,
  `acc_risk` varchar(1) NOT NULL,
  `acc_sensitive` varchar(1) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `com_id` varchar(15) NOT NULL,
  PRIMARY KEY (`acc_id`),
  KEY `fk_pms_access_to_land_pms_Communities1_idx` (`com_id`),
  CONSTRAINT `fk_pms_access_to_land_pms_Communities1` FOREIGN KEY (`com_id`) REFERENCES `pms_communities` (`com_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_access_to_land`
--

LOCK TABLES `pms_access_to_land` WRITE;
/*!40000 ALTER TABLE `pms_access_to_land` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_access_to_land` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_activities`
--

DROP TABLE IF EXISTS `pms_activities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_activities` (
  `act_id` varchar(15) NOT NULL,
  `int_id` varchar(15) NOT NULL,
  `sec_id` varchar(15) NOT NULL,
  `act_desc` varchar(100) NOT NULL,
  `act_unit` varchar(10) NOT NULL,
  `act_unit_qty` int(11) NOT NULL,
  `act_estimated_budget` int(11) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL,
  PRIMARY KEY (`act_id`,`int_id`,`sec_id`),
  KEY `fk_pms_activities_pms_interventions1_idx` (`int_id`,`sec_id`),
  CONSTRAINT `fk_pms_activities_pms_interventions1` FOREIGN KEY (`int_id`, `sec_id`) REFERENCES `pms_interventions` (`int_id`, `sec_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_activities`
--

LOCK TABLES `pms_activities` WRITE;
/*!40000 ALTER TABLE `pms_activities` DISABLE KEYS */;
INSERT INTO `pms_activities` VALUES ('001','001','1','Activity1','Cm',10,1000,'','2016-12-11 22:37:01');
/*!40000 ALTER TABLE `pms_activities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_agriculture_socio`
--

DROP TABLE IF EXISTS `pms_agriculture_socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_agriculture_socio` (
  `agr_id` varchar(15) NOT NULL,
  `agr_area` int(11) NOT NULL,
  `agr_no_cow_year` int(11) NOT NULL,
  `agr_no_sheep_year` int(11) NOT NULL,
  `agr_cost_water_tank` int(11) NOT NULL,
  `agr_herding_area` int(11) NOT NULL,
  `agr_military_area` int(11) NOT NULL,
  `agr_bypass_road_area` int(11) NOT NULL,
  `agr_survey_date` date NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `com_id` varchar(15) NOT NULL,
  PRIMARY KEY (`agr_id`),
  KEY `fk_pms_agriculture_socio_pms_Communities1_idx` (`com_id`),
  CONSTRAINT `fk_pms_agriculture_socio_pms_Communities1` FOREIGN KEY (`com_id`) REFERENCES `pms_communities` (`com_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_agriculture_socio`
--

LOCK TABLES `pms_agriculture_socio` WRITE;
/*!40000 ALTER TABLE `pms_agriculture_socio` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_agriculture_socio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_benificiary_types`
--

DROP TABLE IF EXISTS `pms_benificiary_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_benificiary_types` (
  `btp_id` varchar(15) NOT NULL,
  `btp_desc` varchar(100) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`btp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_benificiary_types`
--

LOCK TABLES `pms_benificiary_types` WRITE;
/*!40000 ALTER TABLE `pms_benificiary_types` DISABLE KEYS */;
INSERT INTO `pms_benificiary_types` VALUES ('10','Whole community','Admin\r','2016-12-27 12:05:30'),('100','Kids with Disabilities','Admin\r','2016-12-27 12:05:30'),('20','Whole cluster','Admin\r','2016-12-27 12:05:30'),('30','Children','Admin\r','2016-12-27 12:05:30'),('40','Women','Admin\r','2016-12-27 12:05:30'),('50','Youth','Admin\r','2016-12-27 12:05:30'),('60','Men','Admin\r','2016-12-27 12:05:30'),('70','Older','Admin\r','2016-12-27 12:05:30'),('80','Women with Disabilities','Admin\r','2016-12-27 12:05:30'),('90','Youth with Disabilities','Admin\r','2016-12-27 12:05:30');
/*!40000 ALTER TABLE `pms_benificiary_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_communities`
--

DROP TABLE IF EXISTS `pms_communities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_communities` (
  `com_id` varchar(15) NOT NULL,
  `gov_id` varchar(15) DEFAULT NULL,
  `com_pcbs_code` varchar(15) NOT NULL,
  `com_ocha_code` varchar(15) NOT NULL,
  `com_name` varchar(100) DEFAULT NULL,
  `typ_id` varchar(15) NOT NULL,
  `com_total_area_land` int(11) NOT NULL,
  `com_location_short_description` varchar(100) NOT NULL,
  `com_residents_total` int(11) NOT NULL,
  `com_male_total` int(11) NOT NULL,
  `com_female_total` int(11) DEFAULT NULL,
  `com_kids_total` int(11) DEFAULT NULL,
  `com_schools_info` varchar(100) DEFAULT NULL,
  `com_health_schools_info` varchar(100) DEFAULT NULL,
  `com_religion_centers` varchar(100) DEFAULT NULL,
  `com_topology` varchar(100) DEFAULT NULL,
  `com_cemetery` varchar(100) DEFAULT NULL,
  `com_water_network_info` varchar(100) DEFAULT NULL,
  `com_sewerage_network_info` varchar(100) DEFAULT NULL,
  `com_electrical_network_info` varchar(100) DEFAULT NULL,
  `com_solid_waste_service_info` varchar(100) DEFAULT NULL,
  `com_road_network_info` varchar(100) DEFAULT NULL,
  `com_transport_network_info` varchar(100) DEFAULT NULL,
  `com_ecnonomic_activities_info` varchar(100) DEFAULT NULL,
  `com_latitude` decimal(18,14) DEFAULT NULL,
  `com_longitude` decimal(18,14) DEFAULT NULL,
  `com_percent_area_c` varchar(2) DEFAULT NULL,
  `com_touching_border` varchar(2) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`com_id`),
  KEY `fk_pms_Communities_pms_community_types1_idx` (`typ_id`),
  KEY `fk_pms_Communities_pms_governates1_idx` (`gov_id`),
  CONSTRAINT `fk_pms_Communities_pms_community_types1` FOREIGN KEY (`typ_id`) REFERENCES `pms_community_types` (`typ_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_Communities_pms_governates1` FOREIGN KEY (`gov_id`) REFERENCES `pms_governates` (`gov_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_communities`
--

LOCK TABLES `pms_communities` WRITE;
/*!40000 ALTER TABLE `pms_communities` DISABLE KEYS */;
INSERT INTO `pms_communities` VALUES ('001','30','001','00123','Salfit','1',10,'Near Nablus',12000,4000,0,2000,'no info','no info','no Info','city','3','no info','no info','no info','no info','no info','no info','no info',31.00002340000000,12.43434000000000,'2','3','pms','2016-12-30 23:08:18'),('002','30','001','00123','Salfit','1',10,'Near Nablus',12000,4000,0,2000,'no info','no info','no Info','city','3','no info','no info','no info','no info','no info','no info','no info',31.00002340000000,12.43434000000000,NULL,NULL,'pms','2016-12-25 11:44:32'),('003','30','001','00123','Salfit','1',10,'Near Nablus',12000,4000,0,2000,'no info','no info','no Info','city','3','no info','no info','no info','no info','no info','no info','no info',31.00002340000000,12.43434000000000,'1','1','pms','2016-12-30 23:10:30');
/*!40000 ALTER TABLE `pms_communities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `pms_communities_vw`
--

DROP TABLE IF EXISTS `pms_communities_vw`;
/*!50001 DROP VIEW IF EXISTS `pms_communities_vw`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `pms_communities_vw` AS SELECT
 1 AS `com_id`,
 1 AS `com_name`,
 1 AS `typ_desc`,
 1 AS `gov_desc`,
 1 AS `com_pcbs_code`,
 1 AS `com_ocha_code`,
 1 AS `gov_id`,
 1 AS `com_topology`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `pms_community_types`
--

DROP TABLE IF EXISTS `pms_community_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_community_types` (
  `typ_id` varchar(15) NOT NULL,
  `typ_desc` varchar(100) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`typ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_community_types`
--

LOCK TABLES `pms_community_types` WRITE;
/*!40000 ALTER TABLE `pms_community_types` DISABLE KEYS */;
INSERT INTO `pms_community_types` VALUES ('1','City','sys','2016-12-11 00:00:00'),('100','Hamlet/encampment','Admin\r','2016-12-27 09:10:17'),('2','Town','sys','2016-12-25 00:00:00'),('200','Village','Admin\r','2016-12-27 09:10:17'),('3','Refugee','sys','2016-12-25 00:00:00'),('300','City/Town','Admin\r','2016-12-27 09:10:17'),('400','Hamlet/encampment, City/town','Admin\r','2016-12-27 09:10:17'),('500','Refugee Camp','Admin\r','2016-12-27 09:10:17'),('600','Hamlet/encampment, village','Admin\r','2016-12-27 09:10:17');
/*!40000 ALTER TABLE `pms_community_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_contries`
--

DROP TABLE IF EXISTS `pms_contries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_contries` (
  `con_id` varchar(15) NOT NULL,
  `con_name` varchar(100) NOT NULL,
  `con_abbreviation` varchar(2) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_contries`
--

LOCK TABLES `pms_contries` WRITE;
/*!40000 ALTER TABLE `pms_contries` DISABLE KEYS */;
INSERT INTO `pms_contries` VALUES ('1','Palestine','ps','sys','2016-12-11 00:00:00');
/*!40000 ALTER TABLE `pms_contries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_datasources`
--

DROP TABLE IF EXISTS `pms_datasources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_datasources` (
  `dat_id` varchar(15) NOT NULL,
  `dat_desc` varchar(100) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`dat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_datasources`
--

LOCK TABLES `pms_datasources` WRITE;
/*!40000 ALTER TABLE `pms_datasources` DISABLE KEYS */;
INSERT INTO `pms_datasources` VALUES ('1','Btc Site','pms','2016-12-22 08:02:44');
/*!40000 ALTER TABLE `pms_datasources` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_development_agencies`
--

DROP TABLE IF EXISTS `pms_development_agencies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_development_agencies` (
  `dev_id` varchar(15) NOT NULL,
  `dev_abb_name` varchar(10) DEFAULT NULL,
  `dev_desc` varchar(100) DEFAULT NULL,
  `con_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`dev_id`),
  KEY `fk_pms_development_agencies_pms_contries1_idx` (`con_id`),
  CONSTRAINT `fk_pms_development_agencies_pms_contries1` FOREIGN KEY (`con_id`) REFERENCES `pms_contries` (`con_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_development_agencies`
--

LOCK TABLES `pms_development_agencies` WRITE;
/*!40000 ALTER TABLE `pms_development_agencies` DISABLE KEYS */;
INSERT INTO `pms_development_agencies` VALUES ('1','GIZ','GIZ','1','sys','2016-12-18 00:00:00');
/*!40000 ALTER TABLE `pms_development_agencies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_donors`
--

DROP TABLE IF EXISTS `pms_donors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_donors` (
  `don_id` varchar(15) NOT NULL,
  `con_id` varchar(15) NOT NULL,
  `don_name` varchar(100) NOT NULL,
  `don_abb_name` varchar(10) NOT NULL,
  `don_type` varchar(10) NOT NULL COMMENT 'regional\nnational',
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`don_id`),
  KEY `fk_pms_donors_pms_contries1_idx` (`con_id`),
  CONSTRAINT `fk_pms_donors_pms_contries1` FOREIGN KEY (`con_id`) REFERENCES `pms_contries` (`con_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_donors`
--

LOCK TABLES `pms_donors` WRITE;
/*!40000 ALTER TABLE `pms_donors` DISABLE KEYS */;
INSERT INTO `pms_donors` VALUES ('1','1','BTC','BTC','L','sys','2016-12-18 00:00:00');
/*!40000 ALTER TABLE `pms_donors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_governates`
--

DROP TABLE IF EXISTS `pms_governates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_governates` (
  `gov_id` varchar(15) NOT NULL,
  `gov_desc` varchar(100) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`gov_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_governates`
--

LOCK TABLES `pms_governates` WRITE;
/*!40000 ALTER TABLE `pms_governates` DISABLE KEYS */;
INSERT INTO `pms_governates` VALUES ('10','Bethlehem\r','Admin','2016-12-27 12:38:17'),('100','Tubas\r','Admin','2016-12-27 12:38:17'),('110','Tulkarm\r','Admin','2016-12-27 12:38:17'),('20','Hebron\r','Admin','2016-12-27 12:38:17'),('30','Jenin\r','Admin','2016-12-27 12:38:17'),('40','Jericho\r','Admin','2016-12-27 12:38:17'),('50','Jerusalem\r','Admin','2016-12-27 12:38:17'),('60','Nablus\r','Admin','2016-12-27 12:38:17'),('70','Qalqiliya\r','Admin','2016-12-27 12:38:17'),('80','Ramallah\r','Admin','2016-12-27 12:38:17'),('90','Salfit\r','Admin','2016-12-27 12:38:17');
/*!40000 ALTER TABLE `pms_governates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_implementers`
--

DROP TABLE IF EXISTS `pms_implementers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_implementers` (
  `imp_id` varchar(15) NOT NULL,
  `imp_name` varchar(100) NOT NULL,
  `imp_type` varchar(2) NOT NULL,
  `con_id` varchar(15) NOT NULL,
  `imp_abb_name` varchar(10) NOT NULL COMMENT 'giz\nfkw\nusaid',
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`imp_id`),
  KEY `fk_pms_implementers_pms_contries1_idx` (`con_id`),
  CONSTRAINT `fk_pms_implementers_pms_contries1` FOREIGN KEY (`con_id`) REFERENCES `pms_contries` (`con_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_implementers`
--

LOCK TABLES `pms_implementers` WRITE;
/*!40000 ALTER TABLE `pms_implementers` DISABLE KEYS */;
INSERT INTO `pms_implementers` VALUES ('1','BTC','N','1','BTC','sys','2016-12-11 00:00:00');
/*!40000 ALTER TABLE `pms_implementers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_incidents`
--

DROP TABLE IF EXISTS `pms_incidents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_incidents` (
  `inc_id` varchar(15) NOT NULL,
  `inc_type` varchar(10) NOT NULL,
  `inc_ocha_id` varchar(15) DEFAULT NULL,
  `inc_description` text NOT NULL,
  `inc_Affected_women` int(11) DEFAULT NULL,
  `inc_Affected_men` int(11) DEFAULT NULL,
  `inc_Affected_adaults` int(11) DEFAULT NULL,
  `inc_Affected_children` int(11) DEFAULT NULL,
  `inc_Displaced_women` int(11) DEFAULT NULL,
  `inc_SourceLink` varchar(15) DEFAULT NULL,
  `inc_timeStamp` datetime NOT NULL,
  `dat_id` varchar(15) NOT NULL,
  `com_id` varchar(15) NOT NULL,
  `ocha_loc_latitude` decimal(18,14) DEFAULT NULL,
  `ocha_loc_longitude` decimal(18,14) DEFAULT NULL,
  `pro_id` varchar(30) NOT NULL,
  `inc_Displaced_men` int(11) DEFAULT NULL,
  `inc_Displaced_adult` int(11) DEFAULT NULL,
  `inc_Displaced_children` int(11) DEFAULT NULL,
  `inc_loc_latitude` decimal(18,14) DEFAULT NULL,
  `inc_loc_longitude` decimal(18,14) DEFAULT NULL,
  `inc_demolished_structure` int(11) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`inc_id`),
  KEY `fk_pms_incidents_pms_datasources1_idx` (`dat_id`),
  KEY `fk_pms_incidents_pms_Communities1_idx` (`com_id`),
  KEY `fk_pms_incidents_pms_projects1_idx` (`pro_id`),
  CONSTRAINT `fk_pms_incidents_pms_Communities1` FOREIGN KEY (`com_id`) REFERENCES `pms_communities` (`com_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_incidents_pms_datasources1` FOREIGN KEY (`dat_id`) REFERENCES `pms_datasources` (`dat_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_incidents_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_incidents`
--

LOCK TABLES `pms_incidents` WRITE;
/*!40000 ALTER TABLE `pms_incidents` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_incidents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_indicator_measures`
--

DROP TABLE IF EXISTS `pms_indicator_measures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_indicator_measures` (
  `ind_id` varchar(15) NOT NULL,
  `res_id` varchar(15) NOT NULL,
  `obj_id` varchar(15) NOT NULL,
  `msr_date` date NOT NULL,
  `ind_target` int(11) NOT NULL,
  `ind_value` int(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ind_id`,`res_id`,`obj_id`,`msr_date`),
  CONSTRAINT `pms_ind_measures_pms_ind` FOREIGN KEY (`ind_id`, `res_id`, `obj_id`) REFERENCES `pms_indicators` (`ind_id`, `res_id`, `obj_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_indicator_measures`
--

LOCK TABLES `pms_indicator_measures` WRITE;
/*!40000 ALTER TABLE `pms_indicator_measures` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_indicator_measures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_indicators`
--

DROP TABLE IF EXISTS `pms_indicators`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_indicators` (
  `ind_id` varchar(15) NOT NULL,
  `res_id` varchar(15) NOT NULL,
  `obj_id` varchar(15) NOT NULL,
  `ind_title` varchar(50) NOT NULL,
  `ind_date` date NOT NULL,
  `ind_long_desc` text NOT NULL,
  `ind_baseline` int(11) NOT NULL,
  `ind_frequency` int(11) NOT NULL,
  `ind_collection_method` varchar(45) NOT NULL,
  `ind_statistical_method` varchar(45) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ind_id`,`res_id`,`obj_id`),
  KEY `fk_pms_indicators_pms_results1_idx` (`res_id`,`obj_id`),
  CONSTRAINT `fk_pms_indicators_pms_results1` FOREIGN KEY (`res_id`, `obj_id`) REFERENCES `pms_results` (`res_id`, `obj_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_indicators`
--

LOCK TABLES `pms_indicators` WRITE;
/*!40000 ALTER TABLE `pms_indicators` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_indicators` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_interventions`
--

DROP TABLE IF EXISTS `pms_interventions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_interventions` (
  `int_id` varchar(15) NOT NULL,
  `int_desc` varchar(100) NOT NULL,
  `int_estimated_budget` int(11) NOT NULL,
  `int_source` varchar(50) DEFAULT NULL COMMENT 'domain (set of values will be provided to us by Hanaa)',
  `mas_id` varchar(15) DEFAULT NULL,
  `sec_id` varchar(15) NOT NULL,
  `int_priority` varchar(1) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`int_id`,`sec_id`),
  KEY `fk_pms_interventions_pms_master_plan1_idx` (`mas_id`),
  KEY `fk_pms_interventions_pms_sub_sectors1_idx` (`sec_id`),
  CONSTRAINT `fk_pms_intervention_sector` FOREIGN KEY (`sec_id`) REFERENCES `pms_sectors` (`sec_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_interventions_pms_master_plan1` FOREIGN KEY (`mas_id`) REFERENCES `pms_master_plan` (`mas_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_interventions`
--

LOCK TABLES `pms_interventions` WRITE;
/*!40000 ALTER TABLE `pms_interventions` DISABLE KEYS */;
INSERT INTO `pms_interventions` VALUES ('001','Intervention1',1000,'MOLG','1','1',NULL,'pms','2016-12-26 10:13:12'),('002','Intervention1',1000,'MOLG','1','1',NULL,'pms','2016-12-25 12:28:18');
/*!40000 ALTER TABLE `pms_interventions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_master_plan`
--

DROP TABLE IF EXISTS `pms_master_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_master_plan` (
  `mas_id` varchar(15) NOT NULL,
  `mas_mp_no` varchar(15) NOT NULL,
  `mas_mp_name` varchar(45) NOT NULL,
  `mas_status` varchar(10) DEFAULT NULL COMMENT 'Domain: Rejected, stucked, progressing',
  `mas_status_ica` varchar(10) NOT NULL,
  `mas_first_submit_date_to_ica` date NOT NULL,
  `mas_last_submit_date_to_ica` date NOT NULL,
  `mas_no_session_with_ica` int(11) NOT NULL,
  `mas_submit_to_mod` varchar(1) NOT NULL COMMENT 'mod: ministry of defense (Y or N)',
  `mas_approval_date` date NOT NULL,
  `mas_publication_date` date NOT NULL,
  `mas_last_date_for_objection` date NOT NULL,
  `mas_date_of_final_publication` date NOT NULL,
  `mas_approved_planed_area` int(11) NOT NULL COMMENT 'Approved planned area (Donum)',
  `mas_village_admin_boarder` varchar(2) NOT NULL COMMENT 'if the boreder touch( A, b, or A&b, or East Jursalem)',
  `mas_note` varchar(100) NOT NULL,
  `imp_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`mas_id`),
  KEY `fk_pms_master_plan_pms_implementers1_idx` (`imp_id`),
  CONSTRAINT `fk_pms_master_plan_pms_implementers1` FOREIGN KEY (`imp_id`) REFERENCES `pms_implementers` (`imp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_master_plan`
--

LOCK TABLES `pms_master_plan` WRITE;
/*!40000 ALTER TABLE `pms_master_plan` DISABLE KEYS */;
INSERT INTO `pms_master_plan` VALUES ('1','1','master1','1','1','2016-12-11','2016-12-11',1,'1','2016-12-11','2016-12-11','2016-12-11','2016-12-11',1,'1','no','1','sys','2016-12-11 00:00:00');
/*!40000 ALTER TABLE `pms_master_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_master_plan_communities`
--

DROP TABLE IF EXISTS `pms_master_plan_communities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_master_plan_communities` (
  `mas_id` varchar(15) NOT NULL,
  `com_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`mas_id`,`com_id`),
  KEY `fk_pms_master_plan_communities_pms_Communities1_idx` (`com_id`),
  CONSTRAINT `fk_pms_master_plan_communities_pms_Communities1` FOREIGN KEY (`com_id`) REFERENCES `pms_communities` (`com_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_master_plan_communities_pms_master_plan1` FOREIGN KEY (`mas_id`) REFERENCES `pms_master_plan` (`mas_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_master_plan_communities`
--

LOCK TABLES `pms_master_plan_communities` WRITE;
/*!40000 ALTER TABLE `pms_master_plan_communities` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_master_plan_communities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_master_plan_donors`
--

DROP TABLE IF EXISTS `pms_master_plan_donors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_master_plan_donors` (
  `mas_id` varchar(15) NOT NULL,
  `don_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`mas_id`,`don_id`),
  KEY `fk_pms_master_plan_donors_pms_donors1_idx` (`don_id`),
  CONSTRAINT `fk_pms_master_plan_donors_pms_donors1` FOREIGN KEY (`don_id`) REFERENCES `pms_donors` (`don_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_master_plan_donors_pms_master_plan1` FOREIGN KEY (`mas_id`) REFERENCES `pms_master_plan` (`mas_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_master_plan_donors`
--

LOCK TABLES `pms_master_plan_donors` WRITE;
/*!40000 ALTER TABLE `pms_master_plan_donors` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_master_plan_donors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_objectives`
--

DROP TABLE IF EXISTS `pms_objectives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_objectives` (
  `obj_id` varchar(15) NOT NULL,
  `obj_desc` varchar(100) NOT NULL,
  `obj_long_desc` text,
  `str_doc_id` varchar(15) NOT NULL,
  `obj_define_date` date NOT NULL,
  `obj_status` varchar(5) NOT NULL COMMENT 'achived, pending, ongoing,…',
  `obj_close_date` date NOT NULL,
  `ojb_user_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`obj_id`),
  KEY `fk_pms_objectives_pms_strategic_pan_documents1_idx` (`str_doc_id`),
  CONSTRAINT `fk_pms_objectives_pms_strategic_pan_documents1` FOREIGN KEY (`str_doc_id`) REFERENCES `pms_strategic_plan_documents` (`str_doc_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_objectives`
--

LOCK TABLES `pms_objectives` WRITE;
/*!40000 ALTER TABLE `pms_objectives` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_objectives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_permits`
--

DROP TABLE IF EXISTS `pms_permits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_permits` (
  `per_id` varchar(15) NOT NULL,
  `per_title` varchar(100) NOT NULL,
  `per_type` varchar(2) NOT NULL,
  `per_submit_date` date NOT NULL,
  `per_issue_date` date NOT NULL,
  `per_period` int(11) NOT NULL,
  `per_status` varchar(2) NOT NULL,
  `per_issuing_agency` varchar(10) NOT NULL COMMENT 'ICA\nMLOG',
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`per_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_permits`
--

LOCK TABLES `pms_permits` WRITE;
/*!40000 ALTER TABLE `pms_permits` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_permits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_programmes`
--

DROP TABLE IF EXISTS `pms_programmes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_programmes` (
  `prg_id` varchar(15) NOT NULL,
  `prg_title` varchar(100) NOT NULL,
  `prg_desc` varchar(100) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`prg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_programmes`
--

LOCK TABLES `pms_programmes` WRITE;
/*!40000 ALTER TABLE `pms_programmes` DISABLE KEYS */;
INSERT INTO `pms_programmes` VALUES ('1','Education','Education','sys','2016-12-18 00:00:00');
/*!40000 ALTER TABLE `pms_programmes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_project_album`
--

DROP TABLE IF EXISTS `pms_project_album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_project_album` (
  `pro_id` varchar(30) NOT NULL,
  `alb_id` varchar(3) NOT NULL,
  `alb_image` blob NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`,`alb_id`),
  KEY `fk_pms_project_album_pms_projects1_idx` (`pro_id`),
  CONSTRAINT `fk_pms_project_album_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_project_album`
--

LOCK TABLES `pms_project_album` WRITE;
/*!40000 ALTER TABLE `pms_project_album` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_project_album` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_project_donors`
--

DROP TABLE IF EXISTS `pms_project_donors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_project_donors` (
  `pro_id` varchar(30) NOT NULL,
  `don_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`,`don_id`),
  KEY `fk_pms_project_donors_pms_donors1_idx` (`don_id`),
  CONSTRAINT `fk_pms_project_donors_pms_donors1` FOREIGN KEY (`don_id`) REFERENCES `pms_donors` (`don_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_project_donors_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_project_donors`
--

LOCK TABLES `pms_project_donors` WRITE;
/*!40000 ALTER TABLE `pms_project_donors` DISABLE KEYS */;
INSERT INTO `pms_project_donors` VALUES ('001','1','pms','2016-12-25 23:11:07');
/*!40000 ALTER TABLE `pms_project_donors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `pms_project_vw`
--

DROP TABLE IF EXISTS `pms_project_vw`;
/*!50001 DROP VIEW IF EXISTS `pms_project_vw`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `pms_project_vw` AS SELECT
 1 AS `pro_id`,
 1 AS `pro_title`,
 1 AS `pro_description`,
 1 AS `pro_status`,
 1 AS `pro_status_desc`,
 1 AS `pro_budget`,
 1 AS `pro_startDate`,
 1 AS `pro_endDate`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `pms_projects`
--

DROP TABLE IF EXISTS `pms_projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_projects` (
  `pro_id` varchar(30) NOT NULL,
  `pro_title` varchar(100) NOT NULL,
  `pro_description` text,
  `pro_status` varchar(10) NOT NULL COMMENT 'New project\n Ongoing project\n Stopped project (Israeli stopping order)\n Damaged project\n Achieved (finished) project',
  `pro_budget` decimal(15,2) NOT NULL,
  `pro_startDate` datetime NOT NULL,
  `pro_endDate` datetime NOT NULL,
  `pro_needPermit` varchar(1) NOT NULL DEFAULT 'Y' COMMENT 'Y,N',
  `pro_hasCluster` varchar(1) NOT NULL DEFAULT 'Y' COMMENT 'Y=Yes,N=No',
  `pro_notes` varchar(500) DEFAULT NULL,
  `prg_id` varchar(15) DEFAULT NULL,
  `pro_area` varchar(2) NOT NULL COMMENT 'A\nB\nC\nEJ',
  `dev_id` varchar(15) NOT NULL,
  `sec_id` varchar(15) DEFAULT NULL,
  `per_id` varchar(15) DEFAULT NULL,
  `sec_type` varchar(3) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`),
  UNIQUE KEY `per_id_UNIQUE` (`per_id`),
  KEY `fk_pms_projects_pms_programmes1_idx` (`prg_id`),
  KEY `fk_pms_projects_pms_development_agencies1_idx` (`dev_id`),
  KEY `fk_pms_projects_pms_permits1_idx` (`per_id`),
  KEY `fk_pms_projects_pms_sectors_idx` (`sec_id`),
  CONSTRAINT `fk_pms_projects_pms_development_agencies1` FOREIGN KEY (`dev_id`) REFERENCES `pms_development_agencies` (`dev_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_pms_permits1` FOREIGN KEY (`per_id`) REFERENCES `pms_permits` (`per_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_pms_programmes1` FOREIGN KEY (`prg_id`) REFERENCES `pms_programmes` (`prg_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_pms_sectors` FOREIGN KEY (`sec_id`) REFERENCES `pms_sectors` (`sec_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_projects`
--

LOCK TABLES `pms_projects` WRITE;
/*!40000 ALTER TABLE `pms_projects` DISABLE KEYS */;
INSERT INTO `pms_projects` VALUES ('001','sdssd','sdsdsd','1',1000.00,'2016-12-25 00:00:00','2016-12-31 00:00:00','0','0','xcsxc','1','A','1',NULL,NULL,NULL,'pms','2016-12-25 23:11:07');
/*!40000 ALTER TABLE `pms_projects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_projects_benificiaries`
--

DROP TABLE IF EXISTS `pms_projects_benificiaries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_projects_benificiaries` (
  `pro_id` varchar(30) NOT NULL,
  `btp_id` varchar(15) NOT NULL,
  `ben_total` int(11) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`,`btp_id`),
  KEY `fk_pms_projects_has_pms_benificiaries_pms_projects1_idx` (`pro_id`),
  KEY `fk_pms_projects_benificiaries_types_idx` (`btp_id`),
  CONSTRAINT `fk_pms_projects_benificiaries_types` FOREIGN KEY (`btp_id`) REFERENCES `pms_benificiary_types` (`btp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_has_pms_benificiaries_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_projects_benificiaries`
--

LOCK TABLES `pms_projects_benificiaries` WRITE;
/*!40000 ALTER TABLE `pms_projects_benificiaries` DISABLE KEYS */;
INSERT INTO `pms_projects_benificiaries` VALUES ('001','10',89,'pms','2016-12-25 23:11:07');
/*!40000 ALTER TABLE `pms_projects_benificiaries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_projects_communities`
--

DROP TABLE IF EXISTS `pms_projects_communities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_projects_communities` (
  `pro_id` varchar(30) NOT NULL,
  `com_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`,`com_id`),
  KEY `fk_pms_projects_has_pms_Communities_pms_Communities1_idx` (`com_id`),
  KEY `fk_pms_projects_has_pms_Communities_pms_projects_idx` (`pro_id`),
  CONSTRAINT `fk_pms_projects_has_pms_Communities_pms_Communities1` FOREIGN KEY (`com_id`) REFERENCES `pms_communities` (`com_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_has_pms_Communities_pms_projects` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_projects_communities`
--

LOCK TABLES `pms_projects_communities` WRITE;
/*!40000 ALTER TABLE `pms_projects_communities` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_projects_communities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_projects_implementers`
--

DROP TABLE IF EXISTS `pms_projects_implementers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_projects_implementers` (
  `imp_id` varchar(15) NOT NULL,
  `pro_id` varchar(30) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`imp_id`,`pro_id`),
  KEY `fk_pms_implementers_has_pms_projects_pms_projects1_idx` (`pro_id`),
  KEY `fk_pms_implementers_has_pms_projects_pms_implementers1_idx` (`imp_id`),
  CONSTRAINT `fk_pms_implementers_has_pms_projects_pms_implementers1` FOREIGN KEY (`imp_id`) REFERENCES `pms_implementers` (`imp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_implementers_has_pms_projects_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_projects_implementers`
--

LOCK TABLES `pms_projects_implementers` WRITE;
/*!40000 ALTER TABLE `pms_projects_implementers` DISABLE KEYS */;
INSERT INTO `pms_projects_implementers` VALUES ('1','001','pms','2016-12-25 23:11:07');
/*!40000 ALTER TABLE `pms_projects_implementers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_projects_indicators`
--

DROP TABLE IF EXISTS `pms_projects_indicators`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_projects_indicators` (
  `pro_id` varchar(30) NOT NULL,
  `ind_id` varchar(15) NOT NULL,
  `res_id` varchar(15) NOT NULL,
  `obj_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`,`ind_id`,`res_id`,`obj_id`),
  KEY `fk_table1_pms_indicators1_idx` (`ind_id`,`res_id`,`obj_id`),
  CONSTRAINT `fk_table1_pms_indicators1` FOREIGN KEY (`ind_id`, `res_id`, `obj_id`) REFERENCES `pms_indicators` (`ind_id`, `res_id`, `obj_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_table1_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_projects_indicators`
--

LOCK TABLES `pms_projects_indicators` WRITE;
/*!40000 ALTER TABLE `pms_projects_indicators` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_projects_indicators` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_projects_locations`
--

DROP TABLE IF EXISTS `pms_projects_locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_projects_locations` (
  `pro_id` varchar(30) NOT NULL,
  `com_latitude` decimal(18,14) NOT NULL,
  `com_longitude` decimal(18,14) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`,`com_latitude`,`com_longitude`),
  KEY `fk_pms_locations_has_pms_projects_pms_projects1_idx` (`pro_id`),
  CONSTRAINT `fk_pms_locations_has_pms_projects_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_projects_locations`
--

LOCK TABLES `pms_projects_locations` WRITE;
/*!40000 ALTER TABLE `pms_projects_locations` DISABLE KEYS */;
INSERT INTO `pms_projects_locations` VALUES ('001',31.00002340000000,12.43434000000000,'pms','2016-12-25 23:11:07');
/*!40000 ALTER TABLE `pms_projects_locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_results`
--

DROP TABLE IF EXISTS `pms_results`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_results` (
  `res_id` varchar(15) NOT NULL,
  `obj_id` varchar(15) NOT NULL,
  `res_desc` varchar(100) NOT NULL,
  `res_long_desc` text,
  `res_define_date` date NOT NULL,
  `res_status` varchar(10) NOT NULL COMMENT 'achived, pending, ongoing,…',
  `res_close_date` date DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`res_id`,`obj_id`),
  KEY `fk_pms_results_pms_objectives1_idx` (`obj_id`),
  CONSTRAINT `fk_pms_results_pms_objectives1` FOREIGN KEY (`obj_id`) REFERENCES `pms_objectives` (`obj_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_results`
--

LOCK TABLES `pms_results` WRITE;
/*!40000 ALTER TABLE `pms_results` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_results` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_sectors`
--

DROP TABLE IF EXISTS `pms_sectors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_sectors` (
  `sec_id` varchar(15) NOT NULL,
  `sec_name` varchar(100) NOT NULL,
  `sec_desc` varchar(2000) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `sec_type` varchar(3) NOT NULL,
  `sec_parent_id` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`sec_id`),
  KEY `sec_sec_self_fk_idx` (`sec_parent_id`),
  CONSTRAINT `sec_sec_self_fk` FOREIGN KEY (`sec_parent_id`) REFERENCES `pms_sectors` (`sec_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_sectors`
--

LOCK TABLES `pms_sectors` WRITE;
/*!40000 ALTER TABLE `pms_sectors` DISABLE KEYS */;
INSERT INTO `pms_sectors` VALUES ('1000','Education','\r','Admin','2016-12-26 23:51:25','H','\r'),('110','EDUCATION','\r','Admin','2016-12-26 23:51:25','D','\r'),('111','Education, level unspecified','The codes in this category are to be used only when level of education is unspecified or unknown (e.g. training of primary school teachers should be coded under 11220).\r','Admin','2016-12-26 23:51:25','D','110\r'),('11110','Education policy and administrative management','Education sector policy, planning and programmes, aid to education ministries, administration and management systems, institution capacity building and advice, school management and governance, curriculum and materials development, unspecified education activities.\r','Admin','2016-12-26 23:51:25','D','111\r'),('11120','Education facilities and training','Educational buildings, equipment, materials, subsidiary services to education (boarding facilities, staff housing), language training, colloquia, seminars, lectures, etc.\r','Admin','2016-12-26 23:51:25','D','111\r'),('11130','Teacher training','Teacher education (where the level of education is unspecified), in-service and pre-service training, materials development.\r','Admin','2016-12-26 23:51:25','D','111\r'),('11182','Educational research','Research and studies on education effectiveness, relevance and quality, systematic evaluation and monitoring.\r','Admin','2016-12-26 23:51:25','D','111\r'),('112','Basic education','\r','Admin','2016-12-26 23:51:25','D','110\r'),('11220','Primary education','Formal and non-formal primary education for children, all elementary and first cycle systematic instruction, provision of learning materials.\r','Admin','2016-12-26 23:51:25','D','112\r'),('11230','Basic life skills for youth and adults','Formal and non-formal education for basic life skills for young people and adults (adults education), literacy and numeracy training.\r','Admin','2016-12-26 23:51:25','D','112\r'),('11231','Basic life skills for youth','Formal and non-formal education for basic life skills for young people.\r','Admin','2016-12-26 23:51:25','D','11230\r'),('11232','Primary education equivalent for adults','Formal primary education for adults.\r','Admin','2016-12-26 23:51:25','D','11230\r'),('11240','Early childhood education','Formal and non-formal pre-school education.\r','Admin','2016-12-26 23:51:25','D','112\r'),('113','Secondary education','\r','Admin','2016-12-26 23:51:25','D','110\r'),('11320','Secondary education','Second cycle systematic instruction at both junior and senior levels.\r','Admin','2016-12-26 23:51:25','D','113\r'),('11321','Lower secondary education','Second cycle systematic instruction at junior level.\r','Admin','2016-12-26 23:51:25','D','11320\r'),('11322','Upper secondary education','Second cycle systematic instruction at senior level.\r','Admin','2016-12-26 23:51:25','D','11320\r'),('11330','Vocational training','Elementary vocational training and secondary level technical education, on-the job training, apprenticeships, including informal vocational training.\r','Admin','2016-12-26 23:51:25','D','113\r'),('114','Post-secondary education','\r','Admin','2016-12-26 23:51:25','D','110\r'),('11420','Higher education','Degree and diploma programmes at universities, colleges and polytechnics, scholarships.\r','Admin','2016-12-26 23:51:25','D','114\r'),('11430','Advanced technical and managerial training','Professional-level vocational training programmes and in-service training.\r','Admin','2016-12-26 23:51:25','D','114\r'),('120','HEALTH','\r','Admin','2016-12-26 23:51:25','D','\r'),('121','Health, general','\r','Admin','2016-12-26 23:51:25','D','120\r'),('12110','Health policy and administrative management','Health sector policy, planning and programmes, aid to health ministries, public health administration, institution capacity building and advice, medical insurance programmes, unspecified health activities.\r','Admin','2016-12-26 23:51:25','D','121\r'),('12181','Medical education/training','Medical education and training for tertiary level services.\r','Admin','2016-12-26 23:51:25','D','121\r'),('12182','Medical research','General medical research (excluding basic health research).\r','Admin','2016-12-26 23:51:25','D','121\r'),('12191','Medical services','Laboratories, specialised clinics and hospitals (including equipment and supplies), ambulances, dental services, mental health care, medical rehabilitation, control of non-infectious diseases, drug and substance abuse control [excluding narcotics traffic control (16063)].\r','Admin','2016-12-26 23:51:25','D','121\r'),('122','Basic health','\r','Admin','2016-12-26 23:51:25','D','120\r'),('12220','Basic health care','Basic and primary health care programmes, paramedical and nursing care programmes, supply of drugs, medicines and vaccines related to basic health care.\r','Admin','2016-12-26 23:51:25','D','122\r'),('12230','Basic health infrastructure','District-level hospitals, clinics and dispensaries and related medical equipment, excluding specialised hospitals and clinics (12191).\r','Admin','2016-12-26 23:51:25','D','122\r'),('12240','Basic nutrition','Direct feeding programmes (maternal feeding, breastfeeding and weaning foods, child feeding, school feeding), determination of micro-nutrient deficiencies, provision of vitamin A, iodine, iron etc., monitoring of nutritional status, nutrition and food hygiene education, household food security.\r','Admin','2016-12-26 23:51:25','D','122\r'),('12250','Infectious disease control','Immunisation, prevention and control of infectious and parasite diseases, except malaria (12262), tuberculosis (12263), HIV/AIDS and other STDs (13040). It includes diarrheal diseases, vector-borne diseases (e.g. river blindness and guinea worm), viral diseases, mycosis, helminthiasis, zoonosis, diseases by other bacteria and viruses, pediculosis, etc.\r','Admin','2016-12-26 23:51:25','D','122\r'),('12261','Health education','Information, education and training of the population for improving health knowledge and practices, public health and awareness campaigns, promotion of improved personal hygiene practices, including use of sanitation facilities and handwashing with soap.\r','Admin','2016-12-26 23:51:25','D','122\r'),('12262','Malaria control','Prevention and control of malaria.\r','Admin','2016-12-26 23:51:25','D','122\r'),('12263','Tuberculosis control','Immunisation, prevention and control of tuberculosis.\r','Admin','2016-12-26 23:51:25','D','122\r'),('12281','Health personnel development','Training of health staff for basic health care services.\r','Admin','2016-12-26 23:51:25','D','122\r'),('130','POPULATION POLICIES/ PROGRAMMES AND REPRODUCTIVE HEALTH','\r','Admin','2016-12-26 23:51:25','D','\r'),('13010','Population policy and administrative management','Population/development policies, census work, vital registration, migration data, demographic research/analysis, reproductive health research, unspecified population activities.\r','Admin','2016-12-26 23:51:25','D','130\r'),('13020','Reproductive health care','Promotion of reproductive health, prenatal and postnatal care including delivery, prevention and treatment of infertility, prevention and management of consequences of abortion, safe motherhood activities.\r','Admin','2016-12-26 23:51:25','D','130\r'),('13030','Family planning','Family planning services including counselling, information, education and communication (IEC) activities, delivery of contraceptives, capacity building and training.\r','Admin','2016-12-26 23:51:25','D','130\r'),('13040','STD control including HIV/AIDS','All activities related to sexually transmitted diseases and HIV/AIDS control e.g. information, education and communication, testing, prevention, treatment, care.\r','Admin','2016-12-26 23:51:25','D','130\r'),('13081','Personnel development for population and reproductive health','Education and training of health staff for population and reproductive health care services.\r','Admin','2016-12-26 23:51:25','D','\r'),('140','WATER AND SANITATION','\r','Admin','2016-12-26 23:51:25','D','\r'),('14010','Water sector policy and administrative management','Water sector policy and governance, including legislation, regulation, planning and management as well as transboundary management of water, institutional capacity development, activities supporting the Integrated Water Resource Management approach (IWRM: see box below).\r','Admin','2016-12-26 23:51:25','D','140\r'),('14015','Water resources conservation (including data collection)','Collection and usage of quantitative and qualitative data on water resources, creation and sharing of water knowledge, conservation and rehabilitation of inland surface waters (rivers, lakes etc.), ground water and coastal waters, prevention of water contamination.\r','Admin','2016-12-26 23:51:25','D','140\r'),('14020','Water supply and sanitation - large systems','Programmes where components according to 14021 and 14022 cannot be identified. When components are known, they should individually be reported under their respective purpose codes: water supply (14021), sanitation (14022), and hygiene (12261).\r','Admin','2016-12-26 23:51:25','D','140\r'),('14021','Water supply - large systems','Potable water treatment plants, intake works, storage, water supply pumping stations, large scale transmission / conveyance and distribution systems.\r','Admin','2016-12-26 23:51:25','D','140\r'),('14022','Sanitation - large systems','Large scale sewerage including trunk sewers and sewage pumping stations, domestic and industrial waste water treatment plants.\r','Admin','2016-12-26 23:51:25','D','140\r'),('14030','Basic drinking water supply and basic sanitation','Programmes where components according to 14031 and 14032 cannot be identified. When components are known, they should individually be reported under their respective purpose codes: water supply (14031), sanitation (14032), and hygiene (12261).\r','Admin','2016-12-26 23:51:25','D','140\r'),('14031','Basic drinking water supply','Rural water supply schemes using handpumps, spring catchments, gravity-fed systems, rainwater collection and fog harvesting, storage tanks, small distribution systems typically with shared connections/points of use. Urban schemes using handpumps and local neighbourhood networks including those with shared connections.\r','Admin','2016-12-26 23:51:25','D','140\r'),('14032','Basic sanitation','Latrines, on-site disposal and alternative sanitation systems, including the promotion of household and community investments in the construction of these facilities. (Use code 12261 for activities promoting improved personal hygiene practices.)\r','Admin','2016-12-26 23:51:25','D','140\r'),('14040','River basins’ development','Infrastructure-focused integrated river basin projects and related institutional activities, river flow control, dams and reservoirs [excluding dams primarily for irrigation (31140) and hydropower (23065) and activities related to river transport (21040)].\r','Admin','2016-12-26 23:51:25','D','140\r'),('14050','Waste management / disposal','Municipal and industrial solid waste management, including hazardous and toxic waste, collection, disposal and treatment, landfill areas, composting and reuse.\r','Admin','2016-12-26 23:51:25','D','140\r'),('14081','Education and training in water supply and sanitation','Education and training for sector professionals and service providers.\r','Admin','2016-12-26 23:51:25','D','140\r'),('150','GOVERNMENT AND CIVIL SOCIETY','Includes assistance to strengthen the administrative apparatus and government.\r','Admin','2016-12-26 23:51:25','D','\r'),('151','Government and civil society, general','N.B. Use code 51010 for general budget support.\r','Admin','2016-12-26 23:51:25','D','150\r'),('15110','Public sector policy and administrative management','Institution-building assistance to strengthen core public sector management systems and capacities. This includes macro-economic and other policy management, co-ordination, planning and reform, human resource management, organisational development, civil service reform, e-government, development planning, monitoring and evaluation, support to ministries involved in aid co-ordination, other ministries and government departments when sector cannot be specified. (Use specific sector codes for development of systems and capacities in sector ministries.)\r','Admin','2016-12-26 23:51:25','D','151\r'),('15111','Public Finance Management (PFM)','Fiscal policy and planning, support to ministries of finance, strengthening financial and managerial accountability, public expenditure management, improving financial management systems, budget drafting, inter-governmental fiscal relations, public audit, public debt. (Use code 15114 for domestic revenue mobilisation and code 33120 for customs).\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15112','Decentralisation and support to subnational government','Decentralisation processes (including political, administrative and fiscal dimensions), intergovernmental relations and federalism, strengthening departments of regional and local government, regional and local authorities and their national associations. (Use specific sector codes for decentralisation of sector management and services.)\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15113','Anti-corruption organisations and institutions','Specialised organisations, institutions and frameworks for the prevention of and combat against corruption, bribery, money- laundering and other aspects of organised crime, with or without law enforcement powers, e.g. anti-corruption commissions and monitoring bodies, special investigation services, institutions and initiatives of integrity and ethics oversight, specialised NGOs, other civil society and citizensÆ organisations directly concerned with corruption.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15114','Domestic Revenue Mobilisation','Support to domestic revenue mobilisation/tax policy, analysis and administration as well as non-tax public revenue, which includes work with ministries of finance, line ministries, revenue authorities or other local, regional or national public bodies. (Use code 16010 for social security and other social protection.)\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15116','Tax collection','Operation of the inland revenue authority.\r','Admin','2016-12-26 23:51:25','D','15114\r'),('15117','Budget planning','Operation of the budget office and planning as part of the budget process.\r','Admin','2016-12-26 23:51:25','D','15111\r'),('15118','National audit','Operation of the accounting and audit services.\r','Admin','2016-12-26 23:51:25','D','15111\r'),('15119','Debt and aid management','Management of public debt and foreign aid received (in the partner country). For reporting on debt reorganisation, use codes 600xx.\r','Admin','2016-12-26 23:51:25','D','15111\r'),('15121','Foreign affairs','Administration of external affairs and services.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15122','Diplomatic missions','Operation of diplomatic and consular missions stationed abroad or at offices of international organisations.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15123','Administration of developing countries\' foreign aid','Support to administration of developing countries\' foreign aid (including triangular and south-south cooperation).\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15124','General personnel services','Administration and operation of the civil service including policies, procedures and regulations.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15125','Central procurement','Administration and operation of centralised supply and purchasing services.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15126','Other general public services','Maintenance and storage of government records and archives, operation of government-owned or occupied buildings, central motor vehicle pools, government-operated printing offices, centralised computer and data processing services, etc.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15127','National monitoring and evaluation','Operation or support of institutions providing national monitoring and evaluation.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15128','Local government finance','Financial transfers to local government, support to institutions managing such transfers. (Use specific sector codes for sector-related transfers.)\r','Admin','2016-12-26 23:51:25','D','15112\r'),('15129','Other central transfers to institutions','Transfers to non sector-specific autonomous bodies or state-owned enterprises outside of local government finance, support to institutions managing such transfers. (Use specific sector codes for sector-related transfers.)\r','Admin','2016-12-26 23:51:25','D','15112\r'),('15130','Legal and judicial development','Support to institutions, systems and procedures of the justice sector, both formal and informal, support to ministries of justice, the interior and home affairs, judges and courts, legal drafting services, bar and lawyers associations, professional legal education, maintenance of law and order and public safety, border management, law enforcement agencies, police, prisons and their supervision, ombudsmen, alternative dispute resolution, arbitration and mediation, legal aid and counsel, traditional, indigenous and paralegal practices that fall outside the formal legal system. Measures that support the improvement of legal frameworks, constitutions, laws and regulations, legislative and constitutional drafting and review, legal reform, integration of formal and informal systems of law. Public legal education, dissemination of information on entitlements and remedies for injustice, awareness campaigns. (Use codes 152xx for activities that are primarily aimed at supporting security system reform or undertaken in connection with post-conflict and peace building activities.)\r','Admin','2016-12-26 23:51:25','D','151\r'),('15131','Justice, law and order policy, planning and administration','Judicial law and order sectors, policy development within ministries of justice or equivalents.\r','Admin','2016-12-26 23:51:25','D','15130\r'),('15132','Police','Police affairs and services.\r','Admin','2016-12-26 23:51:25','D','15130\r'),('15133','Fire and rescue services','Fire-prevention and fire-fighting affairs and services.\r','Admin','2016-12-26 23:51:25','D','15130\r'),('15134','Judicial affairs','Civil and criminal law courts and the judicial system, including enforcement of fines and legal settlements imposed by the courts and operation of parole and probation systems.\r','Admin','2016-12-26 23:51:25','D','15130\r'),('15135','Ombudsman','Independent service representing the interests of the public by investigating and addressing complaints of unfair treatment or maladministration.\r','Admin','2016-12-26 23:51:25','D','15130\r'),('15136','Immigration','Immigration affairs and services, including alien registration, issuing work and travel documents to immigrants.\r','Admin','2016-12-26 23:51:25','D','15130\r'),('15137','Prisons','\r','Admin','2016-12-26 23:51:25','D','15130\r'),('15142','Macroeconomic policy','Macroeconomic policy development and implementation.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15143','Meteorological services','Operation or support of institutions dealing with weather forecasting.\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15144','National standards development','Operation or support of institutions dealing with national standards development. (Use code 16062 for statistical capacity-building.)\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15150','Democratic participation and civil society','Support to the exercise of democracy and diverse forms of participation of citizens beyond elections (15151), direct democracy instruments such as referenda and citizensÆ initiatives, support to organisations to represent and advocate for their members, to monitor, engage and hold governments to account, and to help citizens learn to act in the public sphere, curricula and teaching for civic education at various levels. (This purpose code is restricted to activities targeting governance issues. When assistance to civil society is for non-governance purposes use other appropriate purpose codes.)\r','Admin','2016-12-26 23:51:25','D','151\r'),('15151','Elections','Electoral management bodies and processes, election observation, voters\' education. (Use code 15230 when in the context of an international peacekeeping operation).\r','Admin','2016-12-26 23:51:25','D','15150\r'),('15152','Legislatures and political parties','Assistance to strengthen key functions of legislatures/ parliaments including subnational assemblies and councils (representation, oversight, legislation), such as improving the capacity of legislative bodies, improving legislaturesÆ committees and administrative procedures,, research and information management systems, providing training programmes for legislators and support personnel. Assistance to political parties and strengthening of party systems.\r','Admin','2016-12-26 23:51:25','D','15150\r'),('15153','Media and free flow of information','Activities that support free and uncensored flow of information on public issues, activities that increase the editorial and technical skills and the integrity of the print and broadcast media, e.g. training of journalists. (Use codes 22010-22040 for provision of equipment and capital assistance to media.)\r','Admin','2016-12-26 23:51:25','D','15150\r'),('15154','Executive office','Administration, operation or support of executive office. Includes office of the chief executive at all levels of government (monarch, governor-general, president, prime minister, governor, mayor, etc.).\r','Admin','2016-12-26 23:51:25','D','15110\r'),('15155','Tax policy and administration support','\r','Admin','2016-12-26 23:51:25','D','15114\r'),('15156','Other non-tax revenue mobilisation','Non-tax public revenue, which includes line ministries, revenue authorities or other local, regional or national public bodies. \r','Admin','2016-12-26 23:51:25','D','15114\r'),('15160','Human rights','Measures to support specialised official human rights institutions and mechanisms at universal, regional, national and local levels in their statutory roles to promote and protect civil and political, economic, social and cultural rights as defined in international conventions and covenants, translation of international human rights commitments into national legislation, reporting and follow-up, human rights dialogue.\r','Admin','2016-12-26 23:51:25','D','151\r'),('15170','Women’s equality organisations and institutions','Support for institutions and organisations (governmental and non-governmental) working for gender equality and womenÆs empowerment.\r','Admin','2016-12-26 23:51:25','D','151\r'),('15180','Ending violence against women and girls (taking effect as from 2017 reporting on 2016 flows)','Support to programmes designed to prevent and eliminate all forms of violence against women and girls/gender-based violence. This encompasses a broad range of forms of physical, sexual and psychological violence including but not limited to: intimate partner violence (domestic violence), sexual violence, female genital mutilation/cutting (FGM/C), child, early and forced marriage, acid throwing, honour killings, and trafficking of women and girls.\r','Admin','2016-12-26 23:51:25','D','151\r'),('15185','Local government administration','Decentralisation processes (including political, administrative and fiscal dimensions), intergovernmental relations and federalism, strengthening local authorities.\r','Admin','2016-12-26 23:51:25','D','15112\r'),('152','Conflict prevention and resolution, peace and security','N.B. Further notes on ODA eligibility (and exclusions) of conflict, peace and security related activities are given in paragraphs 76-81 of the Directives.\r','Admin','2016-12-26 23:51:25','D','150\r'),('15210','Security system management and reform','Technical co-operation provided to parliament, government ministries, law enforcement agencies and the judiciary to assist review and reform of the security system to improve democratic governance and civilian control, technical co-operation provided to government to improve civilian oversight and democratic control of budgeting, management, accountability and auditing of security expenditure, including military budgets, as part of a public expenditure management programme, assistance to civil society to enhance its competence and capacity to scrutinise the security system so that it is managed in accordance with democratic norms and principles of accountability, transparency and good governance. [Other than in the context of an international peacekeeping operation (15230).]\r','Admin','2016-12-26 23:51:25','D','152\r'),('15220','Civilian peace-building, conflict prevention and resolution','Support for civilian activities related to peace building, conflict prevention and resolution, including capacity building, monitoring, dialogue and information exchange. Bilateral participation in international civilian peace missions such as those conducted by the UN Department of Political Affairs (UNDPA) or the European Union (European Security and Defence Policy), and contributions to civilian peace funds or commissions (e.g. Peacebuilding Commission, Peacebuilding thematic window of the MDG achievement fund etc.). The contributions can take the form of financing or provision of equipment or civilian or military personnel (e.g. for training civilians). (Use code 15230 for bilateral participation in international peacekeeping operations).\r','Admin','2016-12-26 23:51:25','D','152\r'),('15230','Participation in international peacekeeping operations','Bilateral participation in peacekeeping operations mandated or authorised by the United Nations (UN) through Security Council resolutions, and conducted by international organisations, e.g. UN, NATO, the European Union (Security and Defence Policy security-related operations), or regional groupings of developing countries.\r','Admin','2016-12-26 23:51:25','D','152\r'),('15240','Reintegration and SALW control','Reintegration of demobilised military personnel into the economy, conversion of production facilities from military to civilian outputs, technical co-operation to control, prevent and/or reduce the proliferation of small arms and light weapons (SALW) û see para. 80 of the Directives for definition of SALW activities covered. [Other than in the context of an international peacekeeping operation (15230) or child soldiers (15261)].\r','Admin','2016-12-26 23:51:25','D','152\r'),('15250','Removal of land mines and explosive remnants of war','All activities related to land mines and explosive remnants of war which have benefits to developing countries as their main objective, including removal of land mines and explosive remnants of war, and stockpile destruction for developmental purposes [other than in the context of an international peacekeeping operation (15230)], risk education and awareness raising, rehabilitation, reintegration and assistance to victims, and research and development on demining and clearance. Only activities for civilian purposes are ODA-eligible.\r','Admin','2016-12-26 23:51:25','D','152\r'),('15261','Child soldiers (Prevention and demobilisation)','Technical co-operation provided to government û and assistance to civil society organisations û to support and apply legislation designed to prevent the recruitment of child soldiers, and to demobilise, disarm, reintegrate, repatriate and resettle (DDR) child soldiers.\r','Admin','2016-12-26 23:51:25','D','152\r'),('160','OTHER SOCIAL INFRASTRUCTURE AND SERVICES','\r','Admin','2016-12-26 23:51:25','D','\r'),('16010','Social/ welfare services','Social legislation and administration, institution capacity building and advice, social security and other social schemes, special programmes for the elderly, orphans, the disabled, street children, social dimensions of structural adjustment, unspecified social infrastructure and services, including consumer protection.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16011','Social protection and welfare services policy, planning and administration','Administration of overall social protection policies, plans, programmes and budgets including legislation, standards and statistics on social protection.\r','Admin','2016-12-26 23:51:25','D','16010\r'),('16012','Social security (excl pensions)','Social protection shemes in the form of cash or in-kind benefits to people unable to work due to sickness or injury.\r','Admin','2016-12-26 23:51:25','D','16010\r'),('16013','General pensions','Social protection schemes in the form of cash or in-kind benefits, including pensions, against the risks linked to old age.\r','Admin','2016-12-26 23:51:25','D','16010\r'),('16014','Civil service pensions','Pension schemes for government personnel.\r','Admin','2016-12-26 23:51:25','D','16010\r'),('16015','Social services (incl youth development and women+ children)','Social protection schemes in the form of cash or in-kind benefits to households with dependent children, including parental leave benefits.\r','Admin','2016-12-26 23:51:25','D','16010\r'),('16020','Employment policy and administrative management','Employment policy and planning, labour law, labour unions, institution capacity building and advice, support programmes for unemployed, employment creation and income generation programmes, occupational safety and health, combating child labour.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16030','Housing policy and administrative management','Housing sector policy, planning and programmes, excluding low-cost housing and slum clearance (16040).\r','Admin','2016-12-26 23:51:25','D','160\r'),('16040','Low-cost housing','Including slum clearance.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16050','Multisector aid for basic social services','Basic social services are defined to include basic education, basic health, basic nutrition, population/reproductive health and basic drinking water supply and basic sanitation.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16061','Culture and recreation','Including libraries and museums.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16062','Statistical capacity building','Both in national statistical offices and any other government ministries.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16063','Narcotics control','In-country and customs controls including training of the police, educational programmes and awareness campaigns to restrict narcotics traffic and in-country distribution 1.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16064','Social mitigation of HIV/AIDS','Special programmes to address the consequences of HIV/AIDS, e.g. social, legal and economic assistance to people living with HIV/AIDS including food security and employment, support to vulnerable groups and children orphaned by HIV/AIDS, human rights of HIV/AIDS affected people.\r','Admin','2016-12-26 23:51:25','D','160\r'),('16065','Recreation and sport','\r','Admin','2016-12-26 23:51:25','D','16061\r'),('16066','Culture','\r','Admin','2016-12-26 23:51:25','D','16061\r'),('2','DSector1','DevSec1','sys','2016-12-25 00:00:00','Dev',NULL),('2000','Health','\r','Admin','2016-12-26 23:51:25','H','\r'),('210','TRANSPORT AND STORAGE','Note: Manufacturing of transport equipment should be included under code 32172.\r','Admin','2016-12-26 23:51:25','D','\r'),('21010','Transport policy and administrative management','Transport sector policy, planning and programmes, aid to transport ministries, institution capacity building and advice, unspecified transport, activities that combine road, rail, water and/or air transport. Whenever possible, report transport of goods under the sector of the good being transported.\r','Admin','2016-12-26 23:51:25','D','210\r'),('21011','Transport policy, planning and administration','Administration of affairs and services concerning transport systems.\r','Admin','2016-12-26 23:51:25','D','21010\r'),('21012','Public transport services','Administration of affairs and services concerning public transport.\r','Admin','2016-12-26 23:51:25','D','21010\r'),('21013','Transport regulation','Supervision and regulation of users, operations, construction and maintenance of transport systems (registration, licensing, inspection of equipment, operator skills and training, safety standards, franchises, tarriffs, levels of service, etc.).\r','Admin','2016-12-26 23:51:25','D','21010\r'),('21020','Road transport','Road infrastructure, road vehicles, passenger road transport, motor passenger cars.\r','Admin','2016-12-26 23:51:25','D','210\r'),('21021','Feeder road construction','Construction or operation of feeder road transport systems and facilities.\r','Admin','2016-12-26 23:51:25','D','21020\r'),('21022','Feeder road maintenance','Maintenance of feeder road transport systems and facilities.\r','Admin','2016-12-26 23:51:25','D','21020\r'),('21023','National road construction','Construction or operation of national road transport systems and facilities.\r','Admin','2016-12-26 23:51:25','D','21020\r'),('21024','National road maintenance','Maintenance of national road transport systems and facilities.\r','Admin','2016-12-26 23:51:25','D','21020\r'),('21030','Rail transport','Rail infrastructure, rail equipment, locomotives, other rolling stock, including light rail (tram) and underground systems.\r','Admin','2016-12-26 23:51:25','D','210\r'),('21040','Water transport','Harbours and docks, harbour guidance systems, ships and boats, river and other inland water transport, inland barges and vessels.\r','Admin','2016-12-26 23:51:25','D','210\r'),('21050','Air transport','Airports, airport guidance systems, aeroplanes, aeroplane maintenance equipment.\r','Admin','2016-12-26 23:51:25','D','210\r'),('21061','Storage','Whether or not related to transportation. Whenever possible, report storage projects under the sector of the resource being stored.\r','Admin','2016-12-26 23:51:25','D','210\r'),('21081','Education and training in transport and storage','\r','Admin','2016-12-26 23:51:25','D','210\r'),('220','COMMUNICATIONS','\r','Admin','2016-12-26 23:51:25','D','\r'),('22010','Communications policy and administrative management','Communications sector policy, planning and programmes, institution capacity building and advice, including postal services development, unspecified communications activities.\r','Admin','2016-12-26 23:51:25','D','220\r'),('22011','Communications policy, planning and administration','\r','Admin','2016-12-26 23:51:25','D','22010\r'),('22012','Postal services','Development and operation of postal services.\r','Admin','2016-12-26 23:51:25','D','22010\r'),('22013','Information services','Provision of information services.\r','Admin','2016-12-26 23:51:25','D','22010\r'),('22020','Telecommunications','Telephone networks, telecommunication satellites, earth stations.\r','Admin','2016-12-26 23:51:25','D','220\r'),('22030','Radio/television/print media','Radio and TV links, equipment, newspapers, printing and publishing.\r','Admin','2016-12-26 23:51:25','D','220\r'),('22040','Information and communication technology (ICT)','Computer hardware and software, internet access, IT training. When sector cannot be specified.\r','Admin','2016-12-26 23:51:25','D','220\r'),('230','ENERGY GENERATION, DISTRIBUTION AND EFFICIENCY','Categories 231 through 235 include both electric power plants and combined heat and power (CHP) plants. Heat-only plants, whatever the type of fuel, are reportable under category 236. Activities relating to fuelwood/charcoal production, energy manufacturing and natural resources extraction (including oil and gas pipelines) are reportable under categories 312, 321 et 322 respectively.\r','Admin','2016-12-26 23:51:25','D','\r'),('231','Energy generation, distribution and efficiency – general','\r','Admin','2016-12-26 23:51:25','D','230\r'),('23110','Energy policy and administrative management','Energy sector policy, planning, aid to energy ministries, institution capacity building and advice, unspecified energy activities.\r','Admin','2016-12-26 23:51:25','D','231\r'),('23111','Energy sector policy, planning and administration','\r','Admin','2016-12-26 23:51:25','D','23110\r'),('23112','Energy regulation','Regulation of the energy sector, including wholesale and retail electricity provision.\r','Admin','2016-12-26 23:51:25','D','23110\r'),('23181','Energy education/training','All levels of training not included elsewhere.\r','Admin','2016-12-26 23:51:25','D','231\r'),('23182','Energy research','Including general inventories, surveys.\r','Admin','2016-12-26 23:51:25','D','231\r'),('23183','Energy conservation and demand-side efficiency','All projects in support of energy demand reduction, e.g. building and industry upgrades, smart grids, metering and tariffs. Also includes efficient cook-stoves and biogas projects.\r','Admin','2016-12-26 23:51:25','D','231\r'),('232','Energy generation, renewable sources','\r','Admin','2016-12-26 23:51:25','D','230\r'),('23210','Energy generation, renewable sources – multiple technologies','Renewable energy generation programmes that cannot be attributed to one single technology (codes 23220 through 23280 below). Fuelwood/charcoal production should be included under forestry 31261.\r','Admin','2016-12-26 23:51:25','D','232\r'),('23220','Hydro-electric power plants','Including energy generating river barges.\r','Admin','2016-12-26 23:51:25','D','232\r'),('23230','Solar energy','Including photo-voltaic cells, solar thermal applications and solar heating.\r','Admin','2016-12-26 23:51:25','D','232\r'),('23240','Wind energy','Wind energy for water lifting and electric power generation.\r','Admin','2016-12-26 23:51:25','D','232\r'),('23250','Marine energy','Including ocean thermal energy conversion, tidal and wave power.\r','Admin','2016-12-26 23:51:25','D','232\r'),('23260','Geothermal energy','Use of geothermal energy for generating electric power or directly as heat for agriculture, etc.\r','Admin','2016-12-26 23:51:25','D','232\r'),('23270','Biofuel-fired power plants','Use of solids and liquids produced from biomass for direct power generation. Also includes biogases from anaerobic fermentation (e.g. landfill gas, sewage sludge gas, fermentation of energy crops and manure) and thermal processes (also known as syngas), waste-fired power plants making use of biodegradable municipal waste (household waste and waste from companies and public services that resembles household waste, collected at installations specifically designed for their disposal with recovery of combustible liquids, gases or heat). See code 23360 for non- renewable waste-fired power plants.\r','Admin','2016-12-26 23:51:25','D','232\r'),('233','Energy generation, non-renewable sources','\r','Admin','2016-12-26 23:51:25','D','\r'),('23310','Energy generation, non-renewable sources – unspecified','Thermal power plants including when energy source cannot be determined, combined gas-coal power plants.\r','Admin','2016-12-26 23:51:25','D','233\r'),('23320','Coal-fired electric power plants','Thermal electric power plants that use coal as the energy source.\r','Admin','2016-12-26 23:51:25','D','233\r'),('23330','Oil-fired electric power plants','Thermal electric power plants that use fuel oil or diesel fuel as the energy source.\r','Admin','2016-12-26 23:51:25','D','233\r'),('23340','Natural gas-fired electric power plants','Electric power plants that are fuelled by natural gas.\r','Admin','2016-12-26 23:51:25','D','233\r'),('23350','Fossil fuel electric power plants with carbon capture and storage (CCS)','Fossil fuel electric power plants employing technologies to capture carbon dioxide emissions. CCS not related to power plants should be included under 41020. CCS activities are not reportable as ODA.\r','Admin','2016-12-26 23:51:25','D','233\r'),('23360','Non-renewable waste-fired electric power plants','Electric power plants that use non-biodegradable industrial and municipal waste as the energy source.\r','Admin','2016-12-26 23:51:25','D','233\r'),('234','Hybrid energy electric power plants','\r','Admin','2016-12-26 23:51:25','D','\r'),('23410','Hybrid energy electric power plants','Electric power plants that make use of both non-renewable and renewable energy sources.\r','Admin','2016-12-26 23:51:25','D','234\r'),('235','Nuclear energy electric power plants','\r','Admin','2016-12-26 23:51:25','D','\r'),('23510','Nuclear energy electric power plants','Including nuclear safety.\r','Admin','2016-12-26 23:51:25','D','235\r'),('236','Heating, cooling and energy distribution','\r','Admin','2016-12-26 23:51:25','D','\r'),('23610','Heat plants','Power plants which are designed to produce heat only.\r','Admin','2016-12-26 23:51:25','D','236\r'),('23620','District heating and cooling','Distribution of heat generated in a centralised location, or delivery of chilled water, for residential and commercial heating or cooling purposes.\r','Admin','2016-12-26 23:51:25','D','236\r'),('23630','Electric power transmission and distribution','Grid distribution from power source to end user, transmission lines. Also includes storage of energy to generate power (e.g. pumped hydro, batteries) and the extension of grid access, often to rural areas.\r','Admin','2016-12-26 23:51:25','D','236\r'),('23640','Gas distribution','Delivery for use by ultimate consumer.\r','Admin','2016-12-26 23:51:25','D','236\r'),('240','BANKING AND FINANCIAL SERVICES','\r','Admin','2016-12-26 23:51:25','D','\r'),('24010','Financial policy and administrative management','Finance sector policy, planning and programmes, institution capacity building and advice, financial markets and systems.\r','Admin','2016-12-26 23:51:25','D','240\r'),('24020','Monetary institutions','Central banks.\r','Admin','2016-12-26 23:51:25','D','240\r'),('24030','Formal sector financial intermediaries','All formal sector financial intermediaries, credit lines, insurance, leasing, venture capital, etc. (except when focused on only one sector).\r','Admin','2016-12-26 23:51:25','D','240\r'),('24040','Informal/semi-formal financial intermediaries','Micro credit, savings and credit co-operatives etc.\r','Admin','2016-12-26 23:51:25','D','240\r'),('24081','Education/training in banking and financial services','\r','Admin','2016-12-26 23:51:25','D','240\r'),('250','BUSINESS AND OTHER SERVICES','\r','Admin','2016-12-26 23:51:25','D','\r'),('25010','Business support services and institutions','Support to trade and business associations, chambers of commerce, legal and regulatory reform aimed at improving business and investment climate, private sector institution capacity building and advice, trade information, public-private sector networking including trade fairs, e-commerce. Where sector cannot be specified: general support to private sector enterprises (in particular, use code 32130 for enterprises in the industrial sector).\r','Admin','2016-12-26 23:51:25','D','250\r'),('25020','Privatisation','When sector cannot be specified. Including general state enterprise restructuring or demonopolisation programmes, planning, programming, advice.\r','Admin','2016-12-26 23:51:25','D','250\r'),('3','OSector1','OtherSec1','sys','2016-12-25 00:00:00','Oth',NULL),('3000','Access to land','\r','Admin','2016-12-26 23:51:25','H','\r'),('311','AGRICULTURE','\r','Admin','2016-12-26 23:51:25','D','\r'),('31110','Agricultural policy and administrative management','Agricultural sector policy, planning and programmes, aid to agricultural ministries, institution capacity building and advice, unspecified agriculture.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31120','Agricultural development','Integrated projects, farm development.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31130','Agricultural land resources','Including soil degradation control, soil improvement, drainage of water logged areas, soil desalination, agricultural land surveys, land reclamation, erosion control, desertification control.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31140','Agricultural water resources','Irrigation, reservoirs, hydraulic structures, ground water exploitation for agricultural use.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31150','Agricultural inputs','Supply of seeds, fertilizers, agricultural machinery/equipment.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31161','Food crop production','Including grains (wheat, rice, barley, maize, rye, oats, millet, sorghum), horticulture, vegetables, fruit and berries, other annual and perennial crops. [Use code 32161 for agro-industries.]\r','Admin','2016-12-26 23:51:25','D','311\r'),('31162','Industrial crops/export crops','Including sugar, coffee, cocoa, tea, oil seeds, nuts, kernels, fibre crops, tobacco, rubber. [Use code 32161 for agro-industries.]\r','Admin','2016-12-26 23:51:25','D','311\r'),('31163','Livestock','Animal husbandry, animal feed aid.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31164','Agrarian reform','Including agricultural sector adjustment.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31165','Agricultural alternative development','Projects to reduce illicit drug cultivation through other agricultural marketing and production opportunities (see code 43050 for non-agricultural alternative development).\r','Admin','2016-12-26 23:51:25','D','311\r'),('31166','Agricultural extension','Non-formal training in agriculture.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31181','Agricultural education/training','\r','Admin','2016-12-26 23:51:25','D','311\r'),('31182','Agricultural research','Plant breeding, physiology, genetic resources, ecology, taxonomy, disease control, agricultural bio-technology, including livestock research (animal health, breeding and genetics, nutrition, physiology).\r','Admin','2016-12-26 23:51:25','D','311\r'),('31191','Agricultural services','Marketing policies & organisation, storage and transportation, creation of strategic reserves.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31192','Plant and post-harvest protection and pest control','Including integrated plant protection, biological plant protection activities, supply and management of agrochemicals, supply of pesticides, plant protection policy and legislation.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31193','Agricultural financial services','Financial intermediaries for the agricultural sector including credit schemes, crop insurance.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31194','Agricultural co-operatives','Including farmersÆ organisations.\r','Admin','2016-12-26 23:51:25','D','311\r'),('31195','Livestock/veterinary services','Animal health and management, genetic resources, feed resources.\r','Admin','2016-12-26 23:51:25','D','311\r'),('312','FORESTRY','\r','Admin','2016-12-26 23:51:25','D','\r'),('31210','Forestry policy and administrative management','Forestry sector policy, planning and programmes, institution capacity building and advice, forest surveys, unspecified forestry and agro-forestry activities.\r','Admin','2016-12-26 23:51:25','D','312\r'),('31220','Forestry development','Afforestation for industrial and rural consumption, exploitation and utilisation, erosion control, desertification control, integrated forestry projects.\r','Admin','2016-12-26 23:51:25','D','312\r'),('31261','Fuelwood/charcoal','Forestry development whose primary purpose is production of fuelwood and charcoal.\r','Admin','2016-12-26 23:51:25','D','312\r'),('31281','Forestry education/training','\r','Admin','2016-12-26 23:51:25','D','312\r'),('31282','Forestry research','Including artificial regeneration, genetic improvement, production methods, fertilizer, harvesting.\r','Admin','2016-12-26 23:51:25','D','312\r'),('31291','Forestry services','\r','Admin','2016-12-26 23:51:25','D','312\r'),('313','FISHING','\r','Admin','2016-12-26 23:51:25','D','\r'),('31310','Fishing policy and administrative management','Fishing sector policy, planning and programmes, institution capacity building and advice, ocean and coastal fishing, marine and freshwater fish surveys and prospecting, fishing boats/equipment, unspecified fishing activities.\r','Admin','2016-12-26 23:51:25','D','313\r'),('31320','Fishery development','Exploitation and utilisation of fisheries, fish stock protection, aquaculture, integrated fishery projects.\r','Admin','2016-12-26 23:51:25','D','313\r'),('31381','Fishery education/training','\r','Admin','2016-12-26 23:51:25','D','313\r'),('31382','Fishery research','Pilot fish culture, marine/freshwater biological research.\r','Admin','2016-12-26 23:51:25','D','313\r'),('31391','Fishery services','Fishing harbours, fish markets, fishery transport and cold storage.\r','Admin','2016-12-26 23:51:25','D','313\r'),('321','INDUSTRY','\r','Admin','2016-12-26 23:51:25','D','\r'),('32110','Industrial policy and administrative management','Industrial sector policy, planning and programmes, institution capacity building and advice, unspecified industrial activities, manufacturing of goods not specified below.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32120','Industrial development','\r','Admin','2016-12-26 23:51:25','D','321\r'),('32130','Small and medium-sized enterprises (SME) development','Direct support to the development of small and medium-sized enterprises in the industrial sector, including accounting, auditing and advisory services.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32140','Cottage industries and handicraft','\r','Admin','2016-12-26 23:51:25','D','321\r'),('32161','Agro-industries','Staple food processing, dairy products, slaughter houses and equipment, meat and fish processing and preserving, oils/fats, sugar refineries, beverages/tobacco, animal feeds production.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32162','Forest industries','Wood production, pulp/paper production.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32163','Textiles, leather and substitutes','Including knitting factories.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32164','Chemicals','Industrial and non-industrial production facilities, includes pesticides production.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32165','Fertilizer plants','\r','Admin','2016-12-26 23:51:25','D','321\r'),('32166','Cement/lime/plaster','\r','Admin','2016-12-26 23:51:25','D','321\r'),('32167','Energy manufacturing','Including gas liquefaction, petroleum refineries.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32168','Pharmaceutical production','Medical equipment/supplies, drugs, medicines, vaccines, hygienic products.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32169','Basic metal industries','Iron and steel, structural metal production.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32170','Non-ferrous metal industries','\r','Admin','2016-12-26 23:51:25','D','321\r'),('32171','Engineering','Manufacturing of electrical and non-electrical machinery, engines/turbines.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32172','Transport equipment industry','Shipbuilding, fishing boats building, railroad equipment, motor vehicles and motor passenger cars, aircraft, navigation/guidance systems.\r','Admin','2016-12-26 23:51:25','D','321\r'),('32182','Technological research and development','Including industrial standards, quality management, metrology, testing, accreditation, certification.\r','Admin','2016-12-26 23:51:25','D','321\r'),('322','MINERAL RESOURCES AND MINING','\r','Admin','2016-12-26 23:51:25','D','\r'),('32210','Mineral/mining policy and administrative management','Mineral and mining sector policy, planning and programmes, mining legislation, mining cadastre, mineral resources inventory, information systems, institution capacity building and advice, unspecified mineral resources exploitation.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32220','Mineral prospection and exploration','Geology, geophysics, geochemistry, excluding hydrogeology (14010) and environmental geology (41010), mineral extraction and processing, infrastructure, technology, economics, safety and environment management.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32261','Coal','Including lignite and peat.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32262','Oil and gas','Petroleum, natural gas, condensates, liquefied petroleum gas (LPG), liquefied natural gas (LNG), including drilling and production, and oil and gas pipelines.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32263','Ferrous metals','Iron and ferro-alloy metals.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32264','Nonferrous metals','Aluminium, copper, lead, nickel, tin, zinc.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32265','Precious metals/materials','Gold, silver, platinum, diamonds, gemstones.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32266','Industrial minerals','Baryte, limestone, feldspar, kaolin, sand, gypsym, gravel, ornamental stones.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32267','Fertilizer minerals','Phosphates, potash.\r','Admin','2016-12-26 23:51:25','D','322\r'),('32268','Offshore minerals','Polymetallic nodules, phosphorites, marine placer deposits.\r','Admin','2016-12-26 23:51:25','D','322\r'),('323','CONSTRUCTION','\r','Admin','2016-12-26 23:51:25','D','\r'),('32310','Construction policy and administrative management','Construction sector policy and planning, excluding construction activities within specific sectors (e.g., hospital or school construction).\r','Admin','2016-12-26 23:51:25','D','323\r'),('331','TRADE POLICY AND REGULATIONS AND TRADE- RELATED ADJUSTMENT','\r','Admin','2016-12-26 23:51:25','D','\r'),('33110','Trade policy and administrative Management','Trade policy and planning, support to ministries and departments responsible for trade policy, trade-related legislation and regulatory reforms, policy analysis and implementation of multilateral trade agreements e.g. technical barriers to trade and sanitary and phytosanitary measures (TBT/SPS) except at regional level (see 33130), mainstreaming trade in national development strategies (e.g. poverty reduction strategy papers), wholesale/retail trade, unspecified trade and trade promotion activities.\r','Admin','2016-12-26 23:51:25','D','331\r'),('33120','Trade facilitation','Simplification and harmonisation of international import and export procedures (e.g. customs valuation, licensing procedures, transport formalities, payments, insurance), support to customs departments, tariff reforms.\r','Admin','2016-12-26 23:51:25','D','331\r'),('33130','Regional trade agreements (RTAs)','Support to regional trade arrangements [e.g. Southern African Development Community (SADC), Association of Southeast Asian Nations (ASEAN), Free Trade Area of the Americas (FTAA), African Caribbean Pacific/European Union (ACP/EU)], including work on technical barriers to trade and sanitary and phytosanitary measures (TBT/SPS) at regional level, elaboration of rules of origin and introduction of special and differential treatment in RTAs.\r','Admin','2016-12-26 23:51:25','D','331\r'),('33140','Multilateral trade negotiations','Support developing countriesÆ effective participation in multilateral trade negotiations, including training of negotiators, assessing impacts of negotiations, accession to the World Trade Organisation (WTO) and other multilateral trade-related organisations.\r','Admin','2016-12-26 23:51:25','D','331\r'),('33150','Trade-related adjustment','Contributions to the government budget to assist the implementation of recipientsÆ own trade reforms and adjustments to trade policy measures by other countries, assistance to manage shortfalls in the balance of payments due to changes in the world trading environment.\r','Admin','2016-12-26 23:51:25','D','331\r'),('33181','Trade education/training','Human resources development in trade not included under any of the above codes. Includes university programmes in trade.\r','Admin','2016-12-26 23:51:25','D','331\r'),('332','TOURISM','\r','Admin','2016-12-26 23:51:25','D','\r'),('33210','Tourism policy and administrative management','\r','Admin','2016-12-26 23:51:25','D','332\r'),('4000','WASH','\r','Admin','2016-12-26 23:51:25','H','\r'),('410','General environmental protection','Covers activities concerned with conservation, protection or amelioration of the physical environment without sector allocation.\r','Admin','2016-12-26 23:51:25','D','\r'),('41010','Environmental policy and administrative management','Environmental policy, laws, regulations and economic instruments, administrational institutions and practices, environmental and land use planning and decision-making procedures, seminars, meetings, miscellaneous conservation and protection measures not specified below.\r','Admin','2016-12-26 23:51:25','D','410\r'),('41020','Biosphere protection','Air pollution control, ozone layer preservation, marine pollution control.\r','Admin','2016-12-26 23:51:25','D','410\r'),('41030','Bio-diversity','Including natural reserves and actions in the surrounding areas, other measures to protect endangered or vulnerable species and their habitats (e.g. wetlands preservation).\r','Admin','2016-12-26 23:51:25','D','410\r'),('41040','Site preservation','Applies to unique cultural landscape, including sites/objects of historical, archeological, aesthetic, scientific or educational value.\r','Admin','2016-12-26 23:51:25','D','410\r'),('41050','Flood prevention/control','Floods from rivers or the sea, including sea water intrusion control and sea level rise related activities.\r','Admin','2016-12-26 23:51:25','D','410\r'),('41081','Environmental education/ training','\r','Admin','2016-12-26 23:51:25','D','410\r'),('41082','Environmental research','Including establishment of databases, inventories/accounts of physical and natural resources, environmental profiles and impact studies if not sector specific.\r','Admin','2016-12-26 23:51:25','D','410\r'),('430','Other multisector','\r','Admin','2016-12-26 23:51:25','D','\r'),('43010','Multisector aid','\r','Admin','2016-12-26 23:51:25','D','\r'),('43030','Urban development and management','Integrated urban development projects, local development and urban management, urban infrastructure and services, municipal finances, urban environmental management, urban development and planning, urban renewal and urban housing, land information systems.\r','Admin','2016-12-26 23:51:25','D','430\r'),('43031','Urban land policy and management','Urban development and planning, urban management, land information systems.\r','Admin','2016-12-26 23:51:25','D','43030\r'),('43032','Urban development','Integrated urban development projects, local development, urban infrastructure and services, municipal finances, urban environment systems, urban renewal and urban housing.\r','Admin','2016-12-26 23:51:25','D','43030\r'),('43040','Rural development','Integrated rural development projects, e.g. regional development planning, promotion of decentralised and multi-sectoral competence for planning, co-ordination and management, implementation of regional development and measures (including natural reserve management), land management, land use planning, land settlement and resettlement activities [excluding resettlement of refugees and internally displaced persons (72010)], functional integration of rural and urban areas, geographical information systems.\r','Admin','2016-12-26 23:51:25','D','430\r'),('43041','Rural land policy and management','Regional development planning, promotion of decentralised and multi-sectoral competence for planning, co-ordination and management, land management, land use planning, geographical information systems.\r','Admin','2016-12-26 23:51:25','D','43040\r'),('43042','Rural development','Integrated rural development projects, implementation of regional development and measures (including natural reserve management), land settlement and resettlement activities [excluding resettlement of refugees and internally displaced persons (72010)], functional integration of rural and urban areas.\r','Admin','2016-12-26 23:51:25','D','43040\r'),('43050','Non-agricultural alternative development','Projects to reduce illicit drug cultivation through, for example, non-agricultural income opportunities, social and physical infrastructure (see code 31165 for agricultural alternative development).\r','Admin','2016-12-26 23:51:25','D','430\r'),('43081','Multisector education/training','Including scholarships.\r','Admin','2016-12-26 23:51:25','D','430\r'),('43082','Research/scientific institutions','When sector cannot be identified.\r','Admin','2016-12-26 23:51:25','D','430\r'),('5000','Protection','\r','Admin','2016-12-26 23:51:25','H','\r'),('510','General budget support','Budget support in the form of sector-wide approaches (SWAps) should be included in the respective sectors.\r','Admin','2016-12-26 23:51:25','D','\r'),('51010','General budget support-related aid','Unearmarked contributions to the government budget, support for the implementation of macroeconomic reforms (structural adjustment programmes, poverty reduction strategies), general programme assistance (when not allocable by sector).\r','Admin','2016-12-26 23:51:25','D','510\r'),('520','Developmental food aid/Food security assistance','\r','Admin','2016-12-26 23:51:25','D','\r'),('52010','Food aid/Food security programmes','Supply of edible human food under national or international programmes including transport costs, cash payments made for food supplies, project food aid and food aid for market sales when benefiting sector not specified, excluding emergency food aid.\r','Admin','2016-12-26 23:51:25','D','520\r'),('530','Other commodity assistance','Non-food commodity assistance (when benefiting sector not specified).\r','Admin','2016-12-26 23:51:25','D','\r'),('53030','Import support (capital goods)','Capital goods and services, lines of credit.\r','Admin','2016-12-26 23:51:25','D','530\r'),('53040','Import support (commodities)','Commodities, general goods and services, oil imports.\r','Admin','2016-12-26 23:51:25','D','530\r'),('600','Debt relief','\r','Admin','2016-12-26 23:51:25','D','\r'),('6000','Settler Violance','\r','Admin','2016-12-26 23:51:25','H','\r'),('60010','Action relating to debt','Actions falling outside the code headings below.\r','Admin','2016-12-26 23:51:25','D','600\r'),('60020','Debt forgiveness','\r','Admin','2016-12-26 23:51:25','D','600\r'),('60030','Relief of multilateral debt','Grants or credits to cover debt owed to multilateral financial institutions, including contributions to Heavily Indebted Poor Countries (HIPC) Trust Fund.\r','Admin','2016-12-26 23:51:25','D','600\r'),('60040','Rescheduling and refinancing','\r','Admin','2016-12-26 23:51:25','D','600\r'),('60061','Debt for development swap','Allocation of debt claims to use for development (e.g., debt for education, debt for environment).\r','Admin','2016-12-26 23:51:25','D','600\r'),('60062','Other debt swap','Where the debt swap benefits an external agent i.e. is not specifically for development purposes.\r','Admin','2016-12-26 23:51:25','D','600\r'),('60063','Debt buy-back','Purchase of debt for the purpose of cancellation.\r','Admin','2016-12-26 23:51:25','D','600\r'),('7000','Shelter','\r','Admin','2016-12-26 23:51:25','H','\r'),('720','Emergency Response','An emergency is a situation which results from man made crises and/or natural disasters.\r','Admin','2016-12-26 23:51:25','D','\r'),('72010','Material relief assistance and services','Shelter, water, sanitation and health services, supply of medicines and other non-food relief items for the benefit of affected people and to facilitate the return to normal lives and livelihoods, assistance to refugees and internally displaced people in developing countries other than for food (72040) or protection (72050).\r','Admin','2016-12-26 23:51:25','D','720\r'),('72040','Emergency food aid','Food aid normally for general free distribution or special supplementary feeding programmes, short-term relief to targeted population groups affected by emergency situations. Excludes non-emergency food security assistance programmes/food aid (52010).\r','Admin','2016-12-26 23:51:25','D','720\r'),('72050','Relief co-ordination, protection and support services','Measures to co-ordinate delivery of humanitarian aid, including logistics and communications systems, measures to promote and protect the safety, well- being, dignity and integrity of civilians and those no longer taking part in hostilities. (Activities designed to protect the security of persons or property through the use or display of force are not reportable as ODA.)\r','Admin','2016-12-26 23:51:25','D','720\r'),('730','Reconstruction relief and rehabilitation','This relates to activities during and in the aftermath of an emergency situation. Longer-term activities to improve the level of infrastructure or social services should be reported under the relevant economic and social sector codes. See also guideline on distinguishing humanitarian from sector- allocable aid.\r','Admin','2016-12-26 23:51:25','D','\r'),('73010','Reconstruction relief and rehabilitation','Short-term reconstruction work after emergency or conflict limited to restoring pre-existing infrastructure (e.g. repair or construction of roads, bridges and ports, restoration of essential facilities, such as water and sanitation, shelter, health care services), social and economic rehabilitation in the aftermath of emergencies to facilitate transition and enable populations to return to their previous livelihood or develop a new livelihood in the wake of an emergency situation (e.g. trauma counselling and treatment, employment programmes).\r','Admin','2016-12-26 23:51:25','D','730\r'),('740','Disaster prevention and preparedness','See codes 41050 and 15220 for prevention of floods and conflicts.\r','Admin','2016-12-26 23:51:25','D','\r'),('74010','Disaster prevention and preparedness','Disaster risk reduction activities (e.g. developing knowledge, natural risks cartography, legal norms for construction), early warning systems, emergency contingency stocks and contingency planning including preparations for forced displacement.\r','Admin','2016-12-26 23:51:25','D','740\r'),('8000','Agriculture','\r','Admin','2016-12-26 23:51:25','H','\r'),('910','ADMINISTRATIVE COSTS OF DONORS','\r','Admin','2016-12-26 23:51:25','D','\r'),('91010','Administrative costs (non-sector allocable)','\r','Admin','2016-12-26 23:51:25','D','910\r'),('930','REFUGEES IN DONOR COUNTRIES','\r','Admin','2016-12-26 23:51:25','D','\r'),('93010','Refugees in donor countries (non-sector allocable)','\r','Admin','2016-12-26 23:51:25','D','930\r'),('998','UNALLOCATED/  UNSPECIFIED','\r','Admin','2016-12-26 23:51:25','D','\r'),('99810','Sectors not specified','Contributions to general development of the recipient should be included under programme assistance (51010).\r','Admin','2016-12-26 23:51:25','D','998\r'),('99820','Promotion of development awareness (non-sector allocable)','Spending in donor country for heightened awareness/interest in development co-operation (brochures, lectures, special research projects, etc.).\r','Admin','2016-12-26 23:51:25','D','998\r');
/*!40000 ALTER TABLE `pms_sectors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_strategic_plan_documents`
--

DROP TABLE IF EXISTS `pms_strategic_plan_documents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_strategic_plan_documents` (
  `str_doc_id` varchar(15) NOT NULL,
  `str_plan_title` varchar(100) NOT NULL,
  `str_document` blob NOT NULL,
  `str_start_date` date NOT NULL,
  `str_end_date` date NOT NULL,
  `con_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`str_doc_id`),
  KEY `fk_pms_strategic_plan_documents_pms_contries1_idx` (`con_id`),
  CONSTRAINT `fk_pms_strategic_plan_documents_pms_contries1` FOREIGN KEY (`con_id`) REFERENCES `pms_contries` (`con_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_strategic_plan_documents`
--

LOCK TABLES `pms_strategic_plan_documents` WRITE;
/*!40000 ALTER TABLE `pms_strategic_plan_documents` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_strategic_plan_documents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pms_water_socio`
--

DROP TABLE IF EXISTS `pms_water_socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pms_water_socio` (
  `wat_id` varchar(15) NOT NULL,
  `wat_isconnected` varchar(1) NOT NULL COMMENT 'is connect to network or not',
  `wat_network` int(11) NOT NULL,
  `wat_use_wat_tanker` varchar(1) NOT NULL,
  `wat_rain_water_well` varchar(1) NOT NULL,
  `wat_no_springs` int(11) NOT NULL,
  `wat_price_water` decimal(2,1) NOT NULL,
  `wat_filling_point` int(11) NOT NULL,
  `wat_quantity` int(11) NOT NULL,
  `wat_survey_date` date NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `com_id` varchar(15) NOT NULL,
  PRIMARY KEY (`wat_id`),
  KEY `fk_pms_water_socio_pms_Communities1_idx` (`com_id`),
  CONSTRAINT `fk_pms_water_socio_pms_Communities1` FOREIGN KEY (`com_id`) REFERENCES `pms_communities` (`com_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pms_water_socio`
--

LOCK TABLES `pms_water_socio` WRITE;
/*!40000 ALTER TABLE `pms_water_socio` DISABLE KEYS */;
/*!40000 ALTER TABLE `pms_water_socio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sec_role`
--

DROP TABLE IF EXISTS `sec_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sec_role` (
  `ROL_ID` int(11) NOT NULL,
  `ROL_NAME` varchar(50) NOT NULL,
  `ROL_A_DESC` varchar(100) DEFAULT NULL,
  `ROL_L_DESC` varchar(100) DEFAULT NULL,
  `ROL_STATUS` varchar(2) DEFAULT NULL,
  `ROL_CAT` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ROL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sec_role`
--

LOCK TABLES `sec_role` WRITE;
/*!40000 ALTER TABLE `sec_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `sec_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sec_user`
--

DROP TABLE IF EXISTS `sec_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sec_user` (
  `USR_ID` varchar(15) NOT NULL,
  `USR_PASSWORD` varchar(45) DEFAULT NULL,
  `USR_STATUS` varchar(2) NOT NULL,
  `USR_NAME` varchar(100) DEFAULT NULL,
  `USR_EMAIL` varchar(30) DEFAULT NULL,
  `USR_MOBILE` varchar(10) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `TIME_STAMP` datetime NOT NULL,
  PRIMARY KEY (`USR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sec_user`
--

LOCK TABLES `sec_user` WRITE;
/*!40000 ALTER TABLE `sec_user` DISABLE KEYS */;
INSERT INTO `sec_user` VALUES ('orayyan','123','1','Ola Rayyan','orayyan@gmail.com','0599124616','sys','2016-12-11 00:00:00');
/*!40000 ALTER TABLE `sec_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sec_user_role`
--

DROP TABLE IF EXISTS `sec_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sec_user_role` (
  `USR_ID` varchar(15) NOT NULL,
  `ROL_ID` int(11) NOT NULL,
  PRIMARY KEY (`USR_ID`,`ROL_ID`),
  KEY `sec_user_role_fk1_idx` (`ROL_ID`),
  CONSTRAINT `sec_user_role_fk1` FOREIGN KEY (`ROL_ID`) REFERENCES `sec_role` (`ROL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `sec_user_role_fk2` FOREIGN KEY (`USR_ID`) REFERENCES `sec_user` (`USR_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sec_user_role`
--

LOCK TABLES `sec_user_role` WRITE;
/*!40000 ALTER TABLE `sec_user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `sec_user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `pms_communities_vw`
--

/*!50001 DROP VIEW IF EXISTS `pms_communities_vw`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `pms_communities_vw` AS select `com`.`com_id` AS `com_id`,`com`.`com_name` AS `com_name`,`comtyp`.`typ_desc` AS `typ_desc`,`gov`.`gov_desc` AS `gov_desc`,`com`.`com_pcbs_code` AS `com_pcbs_code`,`com`.`com_ocha_code` AS `com_ocha_code`,`com`.`gov_id` AS `gov_id`,`com`.`com_topology` AS `com_topology` from ((`pms_communities` `com` join `pms_community_types` `comtyp`) join `pms_governates` `gov`) where ((`com`.`typ_id` = `comtyp`.`typ_id`) and (`com`.`gov_id` = `gov`.`gov_id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `pms_project_vw`
--

/*!50001 DROP VIEW IF EXISTS `pms_project_vw`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `pms_project_vw` AS select `pms_projects`.`pro_id` AS `pro_id`,`pms_projects`.`pro_title` AS `pro_title`,`pms_projects`.`pro_description` AS `pro_description`,`pms_projects`.`pro_status` AS `pro_status`,(case `pms_projects`.`pro_status` when 1 then 'New' when 2 then 'Stopped' when 2 then 'Completed' else 'Unknown Status' end) AS `pro_status_desc`,`pms_projects`.`pro_budget` AS `pro_budget`,date_format(`pms_projects`.`pro_startDate`,'%d/%m/%Y') AS `pro_startDate`,date_format(`pms_projects`.`pro_endDate`,'%d/%m/%Y') AS `pro_endDate` from `pms_projects` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-31  8:41:39
