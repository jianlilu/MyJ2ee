DROP TABLE IF EXISTS `hero`;
 
CREATE TABLE `hero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `hp` float DEFAULT NULL,
  `damage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into hero values (null, '¸ÇÂ×', 616, 100);

insert into hero values (null, 'haha', 617, 101);

insert into hero values (null, 'lala', 618, 102);

insert into hero values (null, 'hehe', 619, 103);

insert into hero values (null, 'lu', 611, 110);

select * from hero;

delete  from hero;












