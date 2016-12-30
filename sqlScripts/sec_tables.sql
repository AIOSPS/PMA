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

--------------------------


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
--------------------------------

-- updates 28-12-2016

ALTER TABLE `pms`.`pms_communities`
ADD COLUMN `com_percent_area_c` VARCHAR(2) NULL AFTER `com_longitude`,
ADD COLUMN `com_touching_border` VARCHAR(2) NULL AFTER `com_percent_area_c`;

ALTER TABLE `pms`.`pms_interventions`
ADD COLUMN `int_priority` VARCHAR(1) NULL AFTER `sec_id`;

ALTER TABLE `pms`.`pms_interventions`
CHANGE COLUMN `username` `username` VARCHAR(15) NOT NULL AFTER `int_priority`,
CHANGE COLUMN `time_stamp` `time_stamp` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP AFTER `username`;


ALTER TABLE `pms`.`pms_projects`
ADD COLUMN `sec_type` VARCHAR(3) NULL AFTER `per_id`;


ALTER TABLE `pms`.`pms_projects_benificiaries`
DROP FOREIGN KEY `fk_pms_projects_has_pms_benificiaries_pms_benificiaries1`;
ALTER TABLE `pms`.`pms_projects_benificiaries`
DROP INDEX `fk_pms_projects_has_pms_benificiaries_pms_benificiaries1_idx` ;



ALTER TABLE `pms`.`pms_projects_benificiaries`
ADD COLUMN `btp_id` VARCHAR(15) NULL AFTER `ben_id`,
ADD COLUMN `ben_total` INT(11) NULL AFTER `btp_id`;


ALTER TABLE `pms`.`pms_projects_benificiaries`
DROP COLUMN `ben_id`,
CHANGE COLUMN `btp_id` `btp_id` VARCHAR(15) NOT NULL ,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`pro_id`, `btp_id`);



ALTER TABLE `pms`.`pms_projects_benificiaries`
ADD INDEX `fk_pms_projects_benificiaries_types_idx` (`btp_id` ASC);
ALTER TABLE `pms`.`pms_projects_benificiaries`
ADD CONSTRAINT `fk_pms_projects_benificiaries_types`
  FOREIGN KEY (`btp_id`)
  REFERENCES `pms`.`pms_benificiary_types` (`btp_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;



DROP TABLE `pms`.`pms_benificiaries`;


ALTER TABLE `pms`.`pms_incidents`
DROP COLUMN `inc_Demolished_children`,
DROP COLUMN `inc_Demolished_adult`,
DROP COLUMN `inc_Demolished_men`,
DROP COLUMN `inc_Demolished_women`;


ALTER TABLE `pms`.`pms_incidents`
ADD COLUMN `inc_demolished_structure` INT(11) NULL AFTER `inc_loc_longitude`;


ALTER TABLE `pms`.`pms_indicators`
DROP COLUMN `ind_value`,
DROP COLUMN `ind_target`;



CREATE TABLE `pms`.`pms_indicator_measures` (
  `ind_id` VARCHAR(15) NOT NULL,
  `res_id` VARCHAR(15) NOT NULL,
  `obj_id` VARCHAR(15) NOT NULL,
  `msr_date` DATE NOT NULL,
  `ind_target` INT(11) NOT NULL,
  `ind_value` INT(11) NOT NULL,
  `username` VARCHAR(15) NOT NULL,
  `time_stamp` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ind_id`, `res_id`, `obj_id`, `msr_date`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;



ALTER TABLE `pms`.`pms_indicator_measures`
ADD CONSTRAINT `pms_ind_measures_pms_ind`
  FOREIGN KEY (`ind_id` , `res_id` , `obj_id`)
  REFERENCES `pms`.`pms_indicators` (`ind_id` , `res_id` , `obj_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

create or replace  VIEW pms_communities_vw AS
select com.com_id,
com.com_name,
comtyp.typ_desc,
gov.gov_desc

from pms_communities com,
     pms_community_types comtyp,
     pms_governates gov
where com.typ_id = comtyp.typ_id
  and com.gov_id = gov.gov_id






