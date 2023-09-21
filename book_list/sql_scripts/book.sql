CREATE DATABASE  IF NOT EXISTS `book_list`;
USE `book_list`;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
 `summary` varchar(400) DEFAULT NULL,
 `cover_image` varchar(45) DEFAULT NULL,
     `genres` varchar(45) DEFAULT NULL,
	`author` varchar(45) DEFAULT NULL,
    `tags` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `book`
--

INSERT INTO `book` VALUES 
	(1,'Healing Her Heart','Dr. Gabe Allen has a rule about dating colleagues','Image','Romance','Laura Scoot','Romance'),
    (2,'Call of duty','This book is about the soldier','Image','war','Mike','war'),
    (3,'Tom and Jerry','This book is about cat and mouse','Image','Funny','Jaston','funny'),
    (5,'Healing Her Heart','Dr. Gabe Allen has a rule about dating colleagues','Image','Romance','Laura Scoot','Romance');

