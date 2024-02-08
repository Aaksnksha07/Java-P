CREATE DATABASE CarRentalSys;

USE CarRentalSys;

CREATE TABLE Vehicle(
vehicleID INT AUTO_INCREMENT PRIMARY KEY,
make VARCHAR(50),
model VARCHAR(50),
year year ,
dailyRate VARCHAR(50),
status VARCHAR(15),
passengerCapacity INT,
engineCapacity varchar(50)
);


CREATE TABLE Customer(
customerID INT AUTO_INCREMENT PRIMARY KEY,
firstName VARCHAR(50),
lastName VARCHAR(50),
email VARCHAR(50),
phoneNumber VARCHAR(15)
);


CREATE TABLE Lease(
 leaseID INT AUTO_INCREMENT PRIMARY KEY,
 vehicleID INT,
 FOREIGN KEY (vehicleID) references Vehicle(vehicleID),
 customerID INT,
 FOREIGN KEY (customerID) references Customer(customerID),
 startDate DATE, 
 endDate DATE,
 type VARCHAR(50)
);


CREATE TABLE Payment(
paymentID INT AUTO_INCREMENT PRIMARY KEY,
leaseID INT,
FOREIGN KEY (leaseID) references Lease(leaseID),
paymentDate DATE,
amount INT
);




INSERT INTO Vehicle
( vehicleID, make, model, year, dailyRate, status, passengerCapacity, engineCapacity )
VALUES
( 1, "Hyundai", "Elite i20",'2014'," Rs.2799 ", "Available", 5 , "1197 cc"),
( 2, "Honda", "City", '2008'," Rs.2499 ", "Available", 5 ,"1497 cc" ),
( 3, "Toyota", "Innova-Crysta",'2016'," Rs.4599 ", "Available ", 7 ,"2393 cc" );
select * from Vehicle;




INSERT INTO Customer
( customerID, firstName, lastName, email, phoneNumber )
VALUES
( 1, "Aditi", "Rane", "aditi2@gmail.com", "9124685973" ),
( 2, "Anushka", "Patil", "anushkap5@gmail.com", "9124685875" ),
( 3, "Amisha", "Avhad", "amisha21@gmail.com", "7856379875" );
select * from Customer;



INSERT INTO Lease
( leaseID, vehicleID, customerID, startDate, endDate, type)
VALUES
( 1, 1, 1, '2019-08-05', '2019-09-04', "Monthly" ),
( 2, 2, 2, '2019-07-06', '2019-08-05', "Monthly"),
( 3, 3, 3, '2019-09-11', '2019-09-15',"Daily");
select * from Lease;



INSERT INTO Payment
( paymentID, leaseID, paymentDate, amount)
VALUES
( 1, 1,'2019-08-05', 86769 ),
( 2, 2,'2019-07-06', 77469 ),
( 3, 3,'2019-09-11', 22995 );
select * from Payment;

