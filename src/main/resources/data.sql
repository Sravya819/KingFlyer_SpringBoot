CREATE SCHEMA `kingflyer` ;

INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('1', '2020-11-19', 'Goa', '2020-11-19', 'Hyderabad');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('2', '2020-11-19', 'Delhi', '2020-11-19', 'Vizag');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('3', '2020-11-19', 'Mumbai', '2020-11-19', 'Vijayawada');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('4', '2020-11-19', 'Goa', '2020-11-19', 'Hyderabad');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('5', '2020-11-19', 'Delhi', '2020-11-19', 'Vizag');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('6', '2020-11-19', 'Mumbai', '2020-11-19', 'Vijayawada');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('7', '2020-11-19', 'Goa', '2020-11-19', 'Hyderabad');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('8', '2020-11-19', 'Delhi', '2020-11-19', 'Vizag');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('9', '2020-11-19', 'Mumbai', '2020-11-19', 'Vijayawada');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('10', '2020-11-20', 'Goa', '2020-11-20', 'Hyderabad');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('11', '2020-11-20', 'Delhi', '2020-11-20', 'Vizag');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('12', '2020-11-20', 'Mumbai', '2020-11-20', 'Vijayawada');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('13', '2020-11-20', 'Goa', '2020-11-20', 'Hyderabad');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('14', '2020-11-20', 'Delhi', '2020-11-20', 'Vizag');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('15', '2020-11-20', 'Mumbai', '2020-11-20', 'Vijayawada');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('16', '2020-11-20', 'Goa', '2020-11-20', 'Hyderabad');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('17', '2020-11-20', 'Delhi', '2020-11-20', 'Vizag');
INSERT INTO `kingflyer`.`flight_master` (`flight_id`, `arrival_date`, `arrival_location`, `departure_date`, `departure_location`) VALUES ('18', '2020-11-20', 'Mumbai', '2020-11-20', 'Vijayawada');

INSERT INTO `kingflyer`.`person` (`person_id`, `first_name`, `last_name`, `password`, `user_name`) VALUES ('1', 'Sravya', 'Atmakuri', 'Sra3@451', 'Sravya');
INSERT INTO `kingflyer`.`person` (`person_id`, `first_name`, `last_name`, `password`, `user_name`) VALUES ('2', 'Vasavi', 'Kanna', 'V@s54ri', 'keerthi');
INSERT INTO `kingflyer`.`person` (`person_id`, `first_name`, `last_name`, `password`, `user_name`) VALUES ('3', 'Chandu', 'Pasupuleti', 'Ch#n65du', 'Chandu');

INSERT INTO `kingflyer`.`booking` (`booking_number`, `arrival_location`, `class`, `departure_location`, `gender`, `passenger_name`, `travel_date`) VALUES ('1', 'Delhi', 'Business class', 'Vizag', 'Female', 'Sravya', '2020-11-19');
INSERT INTO `kingflyer`.`booking` (`booking_number`, `arrival_location`, `class`, `departure_location`, `gender`, `passenger_name`, `travel_date`) VALUES ('2', 'Mumbai', 'Economy class', 'Vijayawada', 'Female', 'Vasavi', '2020-11-19');
INSERT INTO `kingflyer`.`booking` (`booking_number`, `arrival_location`, `class`, `departure_location`, `gender`, `passenger_name`, `travel_date`) VALUES ('3', 'Goa', 'Premium class', 'Hyderabad', 'Female', 'Chandu', '2020-11-20');