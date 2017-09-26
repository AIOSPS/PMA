CREATE
    ALGORITHM = UNDEFINED
    DEFINER = `pma`@`localhost`
    SQL SECURITY DEFINER
VIEW `pma_programs_view` AS
    SELECT DISTINCT
        `pi`.`intr_no` AS `intr_no`,
        `pi`.`intr_title` AS `intr_title`,
        `pi`.`intr_duration` AS `intr_duration`,
        `pi`.`sec_code` AS `sec_code`,
        `ps`.`sec_name` AS `sec_name`,
        `ab`.`btp_id` AS `btp_id`,
        `ab`.`bene_count` AS `bene_count`,
        `bt`.`btp_desc` AS `btp_desc`,
        `ab`.`actv_no` AS `actv_no`,
        `ai`.`actv_title` AS `actv_title`,
        `ai`.`actv_proposed_start_date` AS `actv_proposed_start_date`,
        `ai`.`actv_proposed_end_date` AS `actv_proposed_end_date`,
        `ai`.`actv_total_cost` AS `actv_total_cost`,
        `ai`.`act_challenges` AS `act_challenges`,
        `ai`.`actv_status` AS `actv_status`,
        `aimp`.`imp_id` AS `imp_id`,
        `pimp`.`imp_name` AS `imp_name`,
        `pimp`.`imp_Type` AS `imp_Type`,
        `pimp`.`imp_abb_name` AS `imp_abb_name`,
        `aimp`.`com_id` AS `com_id`,
        `comm`.`com_name` AS `com_name`,
        `spobj`.`sobj_description` AS `sobj_description`,
        `gov`.`gov_desc` AS `gov_desc`,
        `gov`.`gov_id` AS `gov_id`
    FROM
        (((((((((`pma_programme_info` `pi`
        JOIN `pms_sectors` `ps`)
        JOIN `pma_activity_beneficiares` `ab`)
        JOIN `pms_benificiary_types` `bt`)
        JOIN `pma_activity_info` `ai`)
        JOIN `pma_activity_implementers` `aimp`)
        JOIN `pms_implementers` `pimp`)
        JOIN `pms_communities` `comm`)
        JOIN `pma_specific_objective` `spobj`)
        JOIN `pms_governates` `gov`)
    WHERE
        ((`pi`.`sec_code` = `ps`.`sec_id`)
            AND (`pi`.`intr_no` = `ab`.`intr_no`)
            AND (`ab`.`btp_id` = `bt`.`btp_id`)
            AND (`ai`.`actv_no` = `ab`.`actv_no`)
            AND (`pi`.`intr_no` = `ai`.`intr_no`)
            AND (`ai`.`actv_no` = `aimp`.`actv_no`)
            AND (`aimp`.`intr_no` = `pi`.`intr_no`)
            AND (`pimp`.`imp_id` = `aimp`.`imp_id`)
            AND (`aimp`.`com_id` = `comm`.`com_id`)
            AND (`spobj`.`intr_no` = `pi`.`intr_no`)
            AND (`comm`.`gov_id` = `gov`.`gov_id`))