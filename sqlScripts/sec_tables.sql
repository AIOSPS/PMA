-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema pms
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pms
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pms` DEFAULT CHARACTER SET utf8 ;
USE `pms` ;

-- -----------------------------------------------------
-- Table `pms`.`sec_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pms`.`sec_role` ;

CREATE TABLE IF NOT EXISTS `pms`.`sec_role` (
  `ROL_ID` INT(11) NOT NULL,
  `ROL_NAME` VARCHAR(50) NOT NULL,
  `ROL_A_DESC` VARCHAR(100) NULL DEFAULT NULL,
  `ROL_L_DESC` VARCHAR(100) NULL DEFAULT NULL,
  `ROL_STATUS` VARCHAR(2) NULL DEFAULT NULL,
  `ROL_CAT` VARCHAR(10) NULL DEFAULT NULL,
  PRIMARY KEY (`ROL_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `pms`.`sec_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pms`.`sec_user` ;

CREATE TABLE IF NOT EXISTS `pms`.`sec_user` (
  `USR_ID` VARCHAR(15) NOT NULL,
  `USR_PASSWORD` VARCHAR(45) NULL DEFAULT NULL,
  `USR_STATUS` VARCHAR(2) NOT NULL,
  `USR_NAME` VARCHAR(100) NULL DEFAULT NULL,
  `USR_EMAIL` VARCHAR(30) NULL DEFAULT NULL,
  `USR_MOBILE` VARCHAR(10) NULL DEFAULT NULL,
  `username` VARCHAR(20) NOT NULL,
  `TIME_STAMP` DATETIME NOT NULL,
  PRIMARY KEY (`USR_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `pms`.`sec_user_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pms`.`sec_user_role` ;

CREATE TABLE IF NOT EXISTS `pms`.`sec_user_role` (
  `USR_ID` VARCHAR(15) NOT NULL,
  `ROL_ID` INT(11) NOT NULL,
  PRIMARY KEY (`USR_ID`, `ROL_ID`),
  INDEX `sec_user_role_fk1_idx` (`ROL_ID` ASC),
  CONSTRAINT `sec_user_role_fk1`
    FOREIGN KEY (`ROL_ID`)
    REFERENCES `pms`.`sec_role` (`ROL_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `sec_user_role_fk2`
    FOREIGN KEY (`USR_ID`)
    REFERENCES `pms`.`sec_user` (`USR_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

SET PASSWORD FOR 'root'@'localhost' = PASSWORD('mysql@btc123');
