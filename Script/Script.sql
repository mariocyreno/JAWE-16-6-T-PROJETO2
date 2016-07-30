/*
SQLyog Community v12.2.4 (64 bit)
MySQL - 10.1.8-MariaDB : Database - petshop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`petshop` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `petshop`;

/*Table structure for table `animal` */

DROP TABLE IF EXISTS `animal`;

CREATE TABLE `animal` (
  `Animal_id` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `id_Dono` int(11) DEFAULT NULL,
  `id_Tipo_Animal` int(11) DEFAULT NULL,
  PRIMARY KEY (`Animal_id`),
  KEY `id_Dono` (`id_Dono`),
  KEY `id_Tipo_Animal` (`id_Tipo_Animal`),
  CONSTRAINT `animal_ibfk_1` FOREIGN KEY (`id_Dono`) REFERENCES `cliente` (`Cliente_id`),
  CONSTRAINT `animal_ibfk_2` FOREIGN KEY (`id_Tipo_Animal`) REFERENCES `tipo_animal` (`Tipo_Animal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `animal` */

insert  into `animal`(`Animal_id`,`Nome`,`id_Dono`,`id_Tipo_Animal`) values 
(1,'Dan',2,2),
(2,'Apolo',2,1),
(3,'Mel',6,1),
(4,'Pandora',7,1),
(5,'Meia Nove',4,2),
(6,'Calops',1,3),
(7,'Stone',3,1),
(8,'Nix',6,2),
(9,'Kamicase',5,3),
(10,'Lilah',3,2);

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `Cliente_id` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `Cpf` varchar(11) NOT NULL,
  `Telefone` varchar(15) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Cliente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

insert  into `cliente`(`Cliente_id`,`Nome`,`Cpf`,`Telefone`,`Email`) values 
(1,'Maria José','12345678900','8144046788','maria.jose@gmail.com'),
(2,'Mario Cyreno','33344729877','81998765432','mr.cyreno@uol.com.br'),
(3,'Aiza Coutinho','08853564588','8133439980','aiza.coutinho@terra.com.br'),
(4,'Rafael Carvalho','43356790122','8145453673','raffacarv_@outlook.com'),
(5,'Nilza Silva','2109876555','81990224488','silva_nilza@gmail.com'),
(6,'Jaci Cyreno','21134545600','87998765433','jaci.cy@terra.com.br'),
(7,'Gabriel Henrique','01122355667','81993356447','gabriel_henrique@hotmail.com');

/*Table structure for table `tipo_animal` */

DROP TABLE IF EXISTS `tipo_animal`;

CREATE TABLE `tipo_animal` (
  `Tipo_Animal_id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(100) NOT NULL,
  PRIMARY KEY (`Tipo_Animal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_animal` */

insert  into `tipo_animal`(`Tipo_Animal_id`,`tipo`) values 
(1,'Cachorro'),
(2,'Gato'),
(3,'Passarinho');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
