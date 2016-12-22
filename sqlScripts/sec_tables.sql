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
  CONSTRAINT `fk_pms_activities_pms_interventions1` FOREIGN KEY (`int_id`) REFERENCES `pms_interventions` (`int_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `pms_benificiaries` (
  `ben_id` varchar(15) NOT NULL,
  `ben_desc` varchar(100) NOT NULL,
  `ben_total` int(11) NOT NULL,
  `btp_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ben_id`),
  KEY `fk_pms_benificiaries_pms_benificiary_types1_idx` (`btp_id`),
  CONSTRAINT `fk_pms_benificiaries_pms_benificiary_types1` FOREIGN KEY (`btp_id`) REFERENCES `pms_benificiary_types` (`btp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_benificiary_types` (
  `btp_id` varchar(15) NOT NULL,
  `btp_desc` varchar(100) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`btp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_cluster_types` (
  `clu_id` varchar(15) NOT NULL,
  `clu_type` varchar(3) NOT NULL COMMENT 'Hum\nDev',
  `clu_desc` varchar(100) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`clu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_communities` (
  `com_id` varchar(15) NOT NULL,
  `gov_id` varchar(15) DEFAULT NULL,
  `loc_id` varchar(15) NOT NULL,
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
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`com_id`),
  KEY `fk_pms_Communities_pms_community_types1_idx` (`typ_id`),
  KEY `fk_pms_Communities_pms_governates1_idx` (`gov_id`),
  KEY `fk_pms_Communities_pms_locations1_idx` (`loc_id`),
  CONSTRAINT `fk_pms_Communities_pms_community_types1` FOREIGN KEY (`typ_id`) REFERENCES `pms_community_types` (`typ_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_Communities_pms_governates1` FOREIGN KEY (`gov_id`) REFERENCES `pms_governates` (`gov_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_Communities_pms_locations1` FOREIGN KEY (`loc_id`) REFERENCES `pms_locations` (`loc_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_community_types` (
  `typ_id` varchar(15) NOT NULL,
  `typ_desc` varchar(100) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`typ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_contries` (
  `con_id` varchar(15) NOT NULL,
  `con_name` varchar(100) NOT NULL,
  `con_abbreviation` varchar(2) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_datasources` (
  `dat_id` varchar(15) NOT NULL,
  `dat_desc` varchar(100) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`dat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `pms_governates` (
  `gov_id` varchar(15) NOT NULL,
  `gov_desc` varchar(100) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`gov_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  `inc_Demolished_women` int(11) DEFAULT NULL,
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
  `inc_Demolished_men` int(11) DEFAULT NULL,
  `inc_Demolished_adult` int(11) DEFAULT NULL,
  `inc_Demolished_children` int(11) DEFAULT NULL,
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
  `ind_target` int(11) NOT NULL,
  `ind_value` int(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ind_id`,`res_id`,`obj_id`),
  KEY `fk_pms_indicators_pms_results1_idx` (`res_id`,`obj_id`),
  CONSTRAINT `fk_pms_indicators_pms_results1` FOREIGN KEY (`res_id`, `obj_id`) REFERENCES `pms_results` (`res_id`, `obj_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_interventions` (
  `int_id` varchar(15) NOT NULL,
  `int_desc` varchar(100) NOT NULL,
  `int_estimated_budget` int(11) NOT NULL,
  `int_source` varchar(50) DEFAULT NULL COMMENT 'domain (set of values will be provided to us by Hanaa)',
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mas_id` varchar(15) NOT NULL,
  `sub_id` varchar(15) NOT NULL,
  `sec_id` varchar(15) NOT NULL,
  PRIMARY KEY (`int_id`,`sub_id`,`sec_id`),
  KEY `fk_pms_interventions_pms_master_plan1_idx` (`mas_id`),
  KEY `fk_pms_interventions_pms_sub_sectors1_idx` (`sub_id`,`sec_id`),
  CONSTRAINT `fk_pms_interventions_pms_master_plan1` FOREIGN KEY (`mas_id`) REFERENCES `pms_master_plan` (`mas_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_interventions_pms_sub_sectors1` FOREIGN KEY (`sub_id`, `sec_id`) REFERENCES `pms_sub_sectors` (`sub_id`, `sec_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_locations` (
  `loc_id` varchar(15) NOT NULL,
  `loc_latitude` decimal(18,14) NOT NULL COMMENT 'Y coordinate',
  `loc_longitude` decimal(18,14) NOT NULL COMMENT 'X coordinate',
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`loc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `pms_programmes` (
  `prg_id` varchar(15) NOT NULL,
  `prg_title` varchar(100) NOT NULL,
  `prg_desc` varchar(100) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`prg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  `pro_userId` varchar(15) NOT NULL,
  `pro_timeStamp` datetime NOT NULL,
  `prg_id` varchar(15) DEFAULT NULL,
  `pro_area` varchar(2) NOT NULL COMMENT 'A\nB\nC\nEJ',
  `dev_id` varchar(15) NOT NULL,
  `clu_id` varchar(15) DEFAULT NULL,
  `clu_type` varchar(3) DEFAULT NULL COMMENT 'human 1-8 cluster\ndevelopment -location',
  `per_id` varchar(15) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`),
  UNIQUE KEY `per_id_UNIQUE` (`per_id`),
  KEY `fk_pms_projects_pms_programmes1_idx` (`prg_id`),
  KEY `fk_pms_projects_pms_development_agencies1_idx` (`dev_id`),
  KEY `fk_pms_projects_pms_permits1_idx` (`per_id`),
  KEY `fk_pms_projects_pms_cluster_types1_idx` (`clu_id`),
  CONSTRAINT `fk_pms_projects_pms_cluster_types1` FOREIGN KEY (`clu_id`) REFERENCES `pms_cluster_types` (`clu_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_pms_development_agencies1` FOREIGN KEY (`dev_id`) REFERENCES `pms_development_agencies` (`dev_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_pms_permits1` FOREIGN KEY (`per_id`) REFERENCES `pms_permits` (`per_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_pms_programmes1` FOREIGN KEY (`prg_id`) REFERENCES `pms_programmes` (`prg_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pms_projects_benificiaries` (
  `pro_id` varchar(30) NOT NULL,
  `ben_id` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pro_id`,`ben_id`),
  KEY `fk_pms_projects_has_pms_benificiaries_pms_benificiaries1_idx` (`ben_id`),
  KEY `fk_pms_projects_has_pms_benificiaries_pms_projects1_idx` (`pro_id`),
  CONSTRAINT `fk_pms_projects_has_pms_benificiaries_pms_benificiaries1` FOREIGN KEY (`ben_id`) REFERENCES `pms_benificiaries` (`ben_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_projects_has_pms_benificiaries_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `pms_projects_locations` (
  `loc_id` varchar(15) NOT NULL,
  `pro_id` varchar(30) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`loc_id`,`pro_id`),
  KEY `fk_pms_locations_has_pms_projects_pms_projects1_idx` (`pro_id`),
  KEY `fk_pms_locations_has_pms_projects_pms_locations1_idx` (`loc_id`),
  CONSTRAINT `fk_pms_locations_has_pms_projects_pms_locations1` FOREIGN KEY (`loc_id`) REFERENCES `pms_locations` (`loc_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pms_locations_has_pms_projects_pms_projects1` FOREIGN KEY (`pro_id`) REFERENCES `pms_projects` (`pro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `pms_sectors` (
  `sec_id` varchar(15) NOT NULL,
  `sec_name` varchar(100) NOT NULL,
  `sec_desc` varchar(100) NOT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`sec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `pms_sub_sectors` (
  `sub_id` varchar(15) NOT NULL,
  `sec_id` varchar(15) NOT NULL,
  `sub_name` varchar(100) DEFAULT NULL,
  `sub_desc` varchar(100) DEFAULT NULL,
  `username` varchar(15) NOT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`sub_id`,`sec_id`),
  KEY `fk_pms_sub_sectors_pms_sectors1_idx` (`sec_id`),
  CONSTRAINT `fk_pms_sub_sectors_pms_sectors1` FOREIGN KEY (`sec_id`) REFERENCES `pms_sectors` (`sec_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `sec_role` (
  `ROL_ID` int(11) NOT NULL,
  `ROL_NAME` varchar(50) NOT NULL,
  `ROL_A_DESC` varchar(100) DEFAULT NULL,
  `ROL_L_DESC` varchar(100) DEFAULT NULL,
  `ROL_STATUS` varchar(2) DEFAULT NULL,
  `ROL_CAT` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ROL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `sec_user_role` (
  `USR_ID` varchar(15) NOT NULL,
  `ROL_ID` int(11) NOT NULL,
  PRIMARY KEY (`USR_ID`,`ROL_ID`),
  KEY `sec_user_role_fk1_idx` (`ROL_ID`),
  CONSTRAINT `sec_user_role_fk1` FOREIGN KEY (`ROL_ID`) REFERENCES `sec_role` (`ROL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `sec_user_role_fk2` FOREIGN KEY (`USR_ID`) REFERENCES `sec_user` (`USR_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
