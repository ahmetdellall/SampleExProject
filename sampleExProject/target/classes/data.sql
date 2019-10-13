ALTER TABLE staff DROP FOREIGN KEY fk_staff_store ;

Insert into language
 (`language_id`,`name`,`last_update`)
Values
('1','English','2006-02-15 05:02:19.000')
;
Insert into language
 (`language_id`,`name`,`last_update`)
Values
('2','Italian','2006-02-15 05:02:19.000')
;
Insert into language
 (`language_id`,`name`,`last_update`)
Values
('3','Japanese','2006-02-15 05:02:19.000')
;
Insert into language
 (`language_id`,`name`,`last_update`)
Values
('4','Mandarin','2006-02-15 05:02:19.000')
;
Insert into language
 (`language_id`,`name`,`last_update`)
Values
('5','French','2006-02-15 05:02:19.000')
;
Insert into language
 (`language_id`,`name`,`last_update`)
Values
('6','German','2006-02-15 05:02:19.000')
;


-- INSERT COUNTRY
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('1','Afghanistan','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('2','Algeria','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('3','American Samoa','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('4','Angola','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('5','Anguilla','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('6','Argentina','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('7','Armenia','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('8','Australia','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('9','Austria','2006-02-15 04:44:00.000')
;
Insert into country
 (`country_id`,`country`,`last_update`)
Values
('10','Azerbaijan','2006-02-15 04:44:00.000')
;


-- table city
-- Start of script
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('1','A Corua (La Corua)','1','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('2','Abha','2','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('3','Abu Dhabi','3','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('4','Acua','4','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('5','Adana','5','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('6','Addis Abeba','6','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('7','Aden','7','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('8','Adoni','8','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('9','Ahmadnagar','9','2006-02-15 04:45:25.000')
;
Insert into city
 (`city_id`,`city`,`country_id`,`last_update`)
Values
('10','Akishima','10','2006-02-15 04:45:25.000')
;



Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('1','47 MySakila Drive',NULL,' ','1',NULL,' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('2','28 MySQL Boulevard',NULL,' ','2',NULL,' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('3','23 Workhaven Lane',NULL,' ','3',NULL,' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('4','1411 Lillydale Drive',NULL,' ','4',NULL,' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('5','1913 Hanoi Way',NULL,' ','5','35200',' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('6','1121 Loja Avenue',NULL,' ','6','17886',' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('7','692 Joliet Street',NULL,' ','7','83579',' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('8','1566 Inegl Manor',NULL,' ','8','53561',' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('9','53 Idfu Parkway',NULL,' ','9','42399',' ','2006-02-15 04:45:30.000')
;
Insert into address
 (`address_id`,`address`,`address2`,`district`,`city_id`,`postal_code`,`phone`,`last_update`)
Values
 ('10','1795 Santiago de Compostela Way',NULL,' ','10','18743',' ','2006-02-15 04:45:30.000')
;


-- table actor
-- Start of script
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('1','PENELOPE','GUINESS','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('2','NICK','WAHLBERG','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('3','ED','CHASE','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('4','JENNIFER','DAVIS','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('5','JOHNNY','LOLLOBRIGIDA','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('6','BETTE','NICHOLSON','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('7','GRACE','MOSTEL','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('8','MATTHEW','JOHANSSON','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('9','JOE','SWANK','2006-02-15 04:34:33.000')
;
Insert into actor
 (`actor_id`,`first_name`,`last_name`,`last_update`)
Values
('10','CHRISTIAN','GABLE','2006-02-15 04:34:33.000')
;


Insert into staff
 (`staff_id`,`first_name`,`last_name`,`address_id`,`picture`,`email`,`store_id`,`active`,`username`,`password`,`last_update`)
Values
 ('1','Mike','Hillyer','3',NULL,'Mike.Hillyer@sakilastaff.com','1','1','Mike','8cb2237d0679ca88db6464eac60da96345513964','2006-02-15 04:57:16.000')
;
Insert into staff
 (`staff_id`,`first_name`,`last_name`,`address_id`,`picture`,`email`,`store_id`,`active`,`username`,`password`,`last_update`)
Values
 ('2','Jon','Stephens','4',NULL,'Jon.Stephens@sakilastaff.com','2','1','Jon','8cb2237d0679ca88db6464eac60da96345513964','2006-02-15 04:57:16.000')
;

-- table store
-- Start of script
Insert into store
 (`store_id`,`manager_staff_id`,`address_id`,`last_update`)
Values
('1','1','1','2006-02-15 04:57:12.000')
;
Insert into store
 (`store_id`,`manager_staff_id`,`address_id`,`last_update`)
Values
('2','2','2','2006-02-15 04:57:12.000')
;


Insert into category
 (`category_id`,`name`,`last_update`)
Values
('1','Action','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('2','Animation','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('3','Children','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('4','Classics','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('5','Comedy','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('6','Documentary','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('7','Drama','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('8','Family','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('9','Foreign','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('10','Games','2006-02-15 04:46:27.000')
;
Insert into category
 (`category_id`,`name`,`last_update`)
Values
('11','Horror','2006-02-15 04:46:27.000')
;

-- table film
-- Start of script
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('1','ACADEMY DINOSAUR','A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies','2006','1',NULL,'6','0.99','86','20.99','PG','Deleted Scenes,Behind the Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('2','ACE GOLDFINGER','A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China','2006','1',NULL,'3','4.99','48','12.99','G','Trailers,Deleted Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('3','ADAPTATION HOLES','A Astounding Reflection of a Lumberjack And a Car who must Sink a Lumberjack in A Baloon Factory','2006','1',NULL,'7','2.99','50','18.99','NC-17','Trailers,Deleted Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('4','AFFAIR PREJUDICE','A Fanciful Documentary of a Frisbee And a Lumberjack who must Chase a Monkey in A Shark Tank','2006','1',NULL,'5','2.99','117','26.99','G','Commentaries,Behind the Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('5','AFRICAN EGG','A Fast-Paced Documentary of a Pastry Chef And a Dentist who must Pursue a Forensic Psychologist in The Gulf of Mexico','2006','1',NULL,'6','2.99','130','22.99','G','Deleted Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('6','AGENT TRUMAN','A Intrepid Panorama of a Robot And a Boy who must Escape a Sumo Wrestler in Ancient China','2006','1',NULL,'3','2.99','169','17.99','PG','Deleted Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('7','AIRPLANE SIERRA','A Touching Saga of a Hunter And a Butler who must Discover a Butler in A Jet Boat','2006','1',NULL,'6','4.99','62','28.99','PG-13','Trailers,Deleted Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('8','AIRPORT POLLOCK','A Epic Tale of a Moose And a Girl who must Confront a Monkey in Ancient India','2006','1',NULL,'6','4.99','54','15.99','R','Trailers','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('9','ALABAMA DEVIL','A Thoughtful Panorama of a Database Administrator And a Mad Scientist who must Outgun a Mad Scientist in A Jet Boat','2006','1',NULL,'3','2.99','114','21.99','PG-13','Trailers,Deleted Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('10','ALADDIN CALENDAR','A Action-Packed Tale of a Man And a Lumberjack who must Reach a Feminist in Ancient China','2006','1',NULL,'6','4.99','63','24.99','NC-17','Trailers,Deleted Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('11','ALAMO VIDEOTAPE','A Boring Epistle of a Butler And a Cat who must Fight a Pastry Chef in A MySQL Convention','2006','1',NULL,'6','0.99','126','16.99','G','Commentaries,Behind the Scenes','2006-02-15 05:03:42.000')
;
Insert into film
 (`film_id`,`title`,`description`,`release_year`,`language_id`,`original_language_id`,`rental_duration`,`rental_rate`,`length`,`replacement_cost`,`rating`,`special_features`,`last_update`)
Values
('12','ALASKA PHANTOM','A Fanciful Saga of a Hunter And a Pastry Chef who must Vanquish a Boy in Australia','2006','1',NULL,'6','0.99','136','22.99','PG','Commentaries,Deleted Scenes','2006-02-15 05:03:42.000')
;


-- table inventory
-- Start of script
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('1','1','1','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('2','1','1','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('3','1','1','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('4','1','1','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('5','1','2','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('6','1','2','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('7','1','2','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('8','1','2','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('9','2','2','2006-02-15 05:09:17.000')
;
Insert into inventory
 (`inventory_id`,`film_id`,`store_id`,`last_update`)
Values
('10','2','2','2006-02-15 05:09:17.000')
;


-- table film_category
-- Start of script
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('1','6','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('2','11','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('3','6','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('4','11','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('5','8','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('6','9','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('7','5','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('8','11','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('9','11','2006-02-15 05:07:09.000')
;
Insert into film_category
 (`film_id`,`category_id`,`last_update`)
Values
('10','6','2006-02-15 05:07:09.000')
;



-- table customer
-- Start of script
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('1','1','MARY','SMITH','MARY.SMITH@sakilacustomer.org','5','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('2','1','PATRICIA','JOHNSON','PATRICIA.JOHNSON@sakilacustomer.org','6','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('3','1','LINDA','WILLIAMS','LINDA.WILLIAMS@sakilacustomer.org','7','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('4','2','BARBARA','JONES','BARBARA.JONES@sakilacustomer.org','8','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('5','1','ELIZABETH','BROWN','ELIZABETH.BROWN@sakilacustomer.org','9','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('6','2','JENNIFER','DAVIS','JENNIFER.DAVIS@sakilacustomer.org','10','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('7','1','MARIA','MILLER','MARIA.MILLER@sakilacustomer.org','4','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('8','2','SUSAN','WILSON','SUSAN.WILSON@sakilacustomer.org','5','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('9','2','MARGARET','MOORE','MARGARET.MOORE@sakilacustomer.org','6','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('10','1','DOROTHY','TAYLOR','DOROTHY.TAYLOR@sakilacustomer.org','7','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;
Insert into customer
 (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`,`last_update`)
Values
('11','2','LISA','ANDERSON','LISA.ANDERSON@sakilacustomer.org','8','1','2006-02-14 22:04:36.000','2006-02-15 04:57:20.000')
;








-- table rental
-- Start of script
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('1','2005-05-24 22:53:30.000','2','3','2005-05-26 22:04:30.000','1','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('2','2005-05-24 22:54:33.000','3','4','2005-05-28 19:40:33.000','1','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('3','2005-05-24 23:03:39.000','6','3','2005-06-01 22:12:39.000','1','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('4','2005-05-24 23:04:41.000','4','6','2005-06-03 01:43:41.000','2','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('5','2005-05-24 23:05:21.000','5','7','2005-06-02 04:33:21.000','1','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('6','2005-05-24 23:08:07.000','6','7','2005-05-27 01:32:07.000','1','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('7','2005-05-24 23:11:53.000','5','7','2005-05-29 20:34:53.000','2','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('8','2005-05-24 23:31:46.000','5','6','2005-05-27 23:33:46.000','2','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('9','2005-05-25 00:00:40.000','8','9','2005-05-28 00:22:40.000','1','2006-02-15 21:30:53.000')
;
Insert into rental
 (`rental_id`,`rental_date`,`inventory_id`,`customer_id`,`return_date`,`staff_id`,`last_update`)
Values
('10','2005-05-25 00:02:21.000','6','5','2005-05-31 22:44:21.000','2','2006-02-15 21:30:53.000')
;

-- table payment
-- Start of script
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('1','1','1','1','2.99','2005-05-25 11:30:37.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('2','1','1','2','0.99','2005-05-28 10:35:23.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('3','1','1','3','5.99','2005-06-15 00:54:12.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('4','1','2','4','0.99','2005-06-15 18:02:53.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('5','1','2','5','9.99','2005-06-15 21:08:46.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('6','1','1','6','4.99','2005-06-16 15:18:57.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('7','1','1','7','4.99','2005-06-18 08:41:48.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('8','1','2','8','0.99','2005-06-18 13:33:59.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('9','1','1','9','3.99','2005-06-21 06:24:45.000','2006-02-15 22:12:30.000')
;
Insert into payment
 (`payment_id`,`customer_id`,`staff_id`,`rental_id`,`amount`,`payment_date`,`last_update`)
Values
('10','1','2','3','5.99','2005-07-08 03:17:05.000','2006-02-15 22:12:30.000')
;

alter table staff add constraint fk_staff_store foreign key(store_id) references store(store_id);
