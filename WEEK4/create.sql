-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema shop_car
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema shop_car
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `shop_car` DEFAULT CHARACTER SET utf8 ;
USE `shop_car` ;

-- -----------------------------------------------------
-- Table `shop_car`.`provider`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shop_car`.`provider` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `contactInformation` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `shop_car`.`car`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shop_car`.`car` (
  `id` INT NOT NULL,
  `brand` VARCHAR(45) NULL,
  `modelName` VARCHAR(45) NULL,
  `engineCapacity` TINYINT NULL,
  `fuel` VARCHAR(45) NULL,
  `numberOfSeats` VARCHAR(45) NULL,
  `colour` TINYINT NULL,
  `year` DATE NULL,
  `kmsDriven` VARCHAR(45) NULL,
  `wheelDrivenCount` TINYINT NULL,
  `driveSide` VARCHAR(45) NULL,
  `provider_id` INT NOT NULL,
  PRIMARY KEY (`id`, `provider_id`),
  INDEX `fk_car_provider1_idx` (`provider_id` ASC),
  CONSTRAINT `fk_car_provider1`
    FOREIGN KEY (`provider_id`)
    REFERENCES `shop_car`.`provider` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `shop_car`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shop_car`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `salary` DOUBLE NULL,
  `age` TINYINT NULL,
  `position` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `shop_car`.`client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shop_car`.`client` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `contactInformation` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `shop_car`.`sales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `shop_car`.`sales` (
  `id` INT NOT NULL,
  `amountPay` DOUBLE NULL,
  `date` DATE NULL,
  `car_id` INT NOT NULL,
  `employee_id` INT NOT NULL,
  `client_id` INT NOT NULL,
  PRIMARY KEY (`id`, `car_id`, `employee_id`, `client_id`),
  INDEX `fk_sales_car_idx` (`car_id` ASC),
  INDEX `fk_sales_employee1_idx` (`employee_id` ASC),
  INDEX `fk_sales_client1_idx` (`client_id` ASC),
  CONSTRAINT `fk_sales_car`
    FOREIGN KEY (`car_id`)
    REFERENCES `shop_car`.`car` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_sales_employee1`
    FOREIGN KEY (`employee_id`)
    REFERENCES `shop_car`.`employee` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_sales_client1`
    FOREIGN KEY (`client_id`)
    REFERENCES `shop_car`.`client` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

