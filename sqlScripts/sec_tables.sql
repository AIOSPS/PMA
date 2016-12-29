ALTER TABLE `pms`.`pms_communities`
DROP FOREIGN KEY `fk_pms_Communities_pms_locations1`;
ALTER TABLE `pms`.`pms_communities`
DROP INDEX `fk_pms_Communities_pms_locations1_idx` ;

ALTER TABLE `pms`.`pms_communities`
DROP COLUMN `loc_id`;
ALTER TABLE `pms`.`pms_communities`
ADD COLUMN `com_latitude` DECIMAL(18,14) NULL AFTER `time_stamp`,
ADD COLUMN `com_longitude` DECIMAL(18,14) NULL AFTER `com_latitude`;
ALTER TABLE `pms`.`pms_communities`
CHANGE COLUMN `com_latitude` `com_latitude` DECIMAL(18,14) NULL DEFAULT NULL AFTER `com_ecnonomic_activities_info`,
CHANGE COLUMN `com_longitude` `com_longitude` DECIMAL(18,14) NULL DEFAULT NULL AFTER `com_latitude`;


ALTER TABLE `pms`.`pms_projects_locations`
DROP FOREIGN KEY `fk_pms_locations_has_pms_projects_pms_locations1`;

ALTER TABLE `pms`.`pms_projects_locations`
DROP COLUMN `loc_id`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`pro_id`),
DROP INDEX `fk_pms_locations_has_pms_projects_pms_locations1_idx` ;

ALTER TABLE `pms`.`pms_projects_locations`
ADD COLUMN `com_latitude` DECIMAL(18,14) NOT NULL AFTER `pro_id`,
ADD COLUMN `com_longitude` DECIMAL(18,14) NOT NULL AFTER `com_latitude`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`pro_id`, `com_latitude`, `com_longitude`);


ALTER TABLE `pms`.`pms_incidents`
ADD COLUMN `inc_loc_latitude` DECIMAL(18,14) NULL AFTER `inc_Demolished_children`,
ADD COLUMN `inc_loc_longitude` DECIMAL(18,14) NULL AFTER `inc_loc_latitude`;



DROP TABLE `pms`.`pms_locations`;

ALTER TABLE `pms`.`pms_projects`
DROP FOREIGN KEY `fk_pms_projects_pms_cluster_types1`;
ALTER TABLE `pms`.`pms_projects`
DROP INDEX `fk_pms_projects_pms_cluster_types1_idx` ;


ALTER TABLE `pms`.`pms_projects`
CHANGE COLUMN `clu_id` `sec_id` VARCHAR(15) NULL DEFAULT NULL ,
CHANGE COLUMN `clu_type` `sec_type` VARCHAR(3) NULL DEFAULT NULL COMMENT 'human 1-8 cluster\ndevelopment -location' ;


ALTER TABLE `pms`.`pms_projects`
DROP COLUMN `sec_type`;



DROP TABLE `pms`.`pms_cluster_types`;

DROP TABLE `pms`.`pms_sub_sectors`;

ALTER TABLE `pms`.`pms_sectors`
ADD COLUMN `sec_type` VARCHAR(3) NOT NULL AFTER `time_stamp`,
ADD COLUMN `sec_parent_id` VARCHAR(15) NULL AFTER `sec_type`,
ADD INDEX `sec_sec_self_fk_idx` (`sec_parent_id` ASC);
ALTER TABLE `pms`.`pms_sectors`
ADD CONSTRAINT `sec_sec_self_fk`
  FOREIGN KEY (`sec_parent_id`)
  REFERENCES `pms`.`pms_sectors` (`sec_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


ALTER TABLE `pms`.`pms_projects`
ADD INDEX `fk_pms_projects_pms_sectors_idx` (`sec_id` ASC);
ALTER TABLE `pms`.`pms_projects`
ADD CONSTRAINT `fk_pms_projects_pms_sectors`
  FOREIGN KEY (`sec_id`)
  REFERENCES `pms`.`pms_sectors` (`sec_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;




ALTER TABLE `pms`.`pms_interventions`
DROP FOREIGN KEY `fk_pms_interventions_pms_sub_sectors1`;
ALTER TABLE `pms`.`pms_interventions`
DROP COLUMN `sub_id`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`int_id`, `sec_id`),
DROP INDEX `fk_pms_interventions_pms_sub_sectors1_idx` ,
ADD INDEX `fk_pms_interventions_pms_sub_sectors1_idx` (`sec_id` ASC);
ALTER TABLE `pms`.`pms_interventions`
ADD CONSTRAINT `fk_pms_intervention_sector`
  FOREIGN KEY (`sec_id`)
  REFERENCES `pms`.`pms_sectors` (`sec_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `pms`.`pms_projects`
DROP COLUMN `pro_timeStamp`,
DROP COLUMN `pro_userId`;

ALTER TABLE `pms`.`pms_activities`
DROP FOREIGN KEY `fk_pms_activities_pms_interventions1`;
ALTER TABLE `pms`.`pms_activities`
ADD CONSTRAINT `fk_pms_activities_pms_interventions1`
  FOREIGN KEY (`int_id` , `sec_id`)
  REFERENCES `pms`.`pms_interventions` (`int_id` , `sec_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `pms`.`pms_interventions`
DROP FOREIGN KEY `fk_pms_interventions_pms_master_plan1`;
ALTER TABLE `pms`.`pms_interventions`
CHANGE COLUMN `mas_id` `mas_id` VARCHAR(15) NULL ;
ALTER TABLE `pms`.`pms_interventions`
ADD CONSTRAINT `fk_pms_interventions_pms_master_plan1`
  FOREIGN KEY (`mas_id`)
  REFERENCES `pms`.`pms_master_plan` (`mas_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


create or replace  VIEW pms_project_vw AS
select pro_id,
pro_title,
pro_description,
pro_status,
CASE pro_status
WHEN 1 THEN 'New'
WHEN 2 THEN 'Stopped'
WHEN 2 THEN 'Completed'
ELSE 'Unknown Status' end
 pro_status_desc ,
pro_budget,
DATE_FORMAT(pro_startDate, '%d/%m/%Y') AS pro_startDate,
DATE_FORMAT(pro_endDate, '%d/%m/%Y') AS pro_endDate
from pms_projects
