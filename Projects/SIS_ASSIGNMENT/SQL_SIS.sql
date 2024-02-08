-- TASK 1
-- 1. Create the database named "SISDB"

CREATE DATABASE SISDB;
USE SISDB;

-- 2. Define the schema for the Students, Courses, Enrollments, Teacher, and Payments tables with appropriate 
----- data types, constraints, and relationships. 

CREATE TABLE Students(
student_id INT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
date_of_birth DATE DEFAULT NULL,
email VARCHAR(50),
phone_number VARCHAR(15)
);

CREATE TABLE Teacher(
teacher_id INT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(50)
);

-- 4. Create appropriate Primary Key and Foreign Key constraints for referential integrity.

CREATE TABLE Courses(
course_id INT PRIMARY KEY,
course_name VARCHAR(50),
credits INT,
teacher_id INT,
FOREIGN KEY (teacher_id) references Teacher(teacher_id)
ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE Enrollments(
 enrollment_id INT PRIMARY KEY,
 student_id INT,
 FOREIGN KEY (student_id) references Students(student_id)
 ON DELETE CASCADE
 ON UPDATE CASCADE,
 course_id INT,
 FOREIGN KEY (course_id) references Courses(course_id)
 ON DELETE CASCADE
 ON UPDATE CASCADE,
 enrollment_date DATE DEFAULT NULL
);

CREATE TABLE Payments(
payment_id INT PRIMARY KEY,
student_id INT,
FOREIGN KEY (student_id) references Students(student_id)
ON DELETE CASCADE
ON UPDATE CASCADE,
amount INT,
payment_date DATE DEFAULT NULL
);

-- 5. Insert at least 10 sample records into each of the tables.

INSERT INTO Students
( student_id, first_name, last_name, date_of_birth, email, phone_number )
VALUES
( 1, "Aditi", "Rane", '2000-08-05', "aditi2@gmail.com", "9124685973" ),
( 2, "Anushka", "Patil", '2001-11-07', "anushkap5@gmail.com", "9124685875" ),
( 3, "Amisha", "Avhad", '2000-08-21', "amisha21@gmail.com", "7856379875" ),
( 4, "Bhushan", "Singh", '2004-12-04', "sing04@gmail.com", "9847629075" ),
( 5, "Chetan", "Wagh", '2003-09-10', "cwagh@gmail.com", "9756008327" ),
( 6, "Devika", "Lokhande", '2005-01-07', "devika@gmail.com", "8914680879" ),
( 7, "Fateh", "Khan", '2004-06-17', "fateh@gmail.com", "9194605805" ),
( 8, "Gita", "Pujari", '2008-03-19', "gita08@gmail.com", "7620605800" ),
( 9, "Krishn", "Jain", '2007-05-16', "krishn07@gmail.com", "8924545805" ),
( 10, "Radha", "Kishan", '2006-02-23', "radhakishan@gmail.com", "9174625105" );

SELECT * FROM Students;

INSERT INTO Teacher
( teacher_id, first_name, last_name, email)
VALUES
( 1001, "Rashmi", "Mishra", "rashmi8@gmail.com" ),
( 1002, "Bindu", "Nair", "bindu5@gmail.com" ),
( 1003, "Sarat", "Jena", "sarat9@gmail.com" ),
( 1004, "Rakesh", "Sahoo", "rakesh@gmail.com" ),
( 1005, "Nalini", "Seth", "seth@gmail.com" ),
( 1006, "Pradip", "Nayak", "nayak@gmail.com" ),
( 1007, "Lalit", "Suna", "lalit@gmail.com" ),
( 1008, "Nila", "Chandra", "nilach6@gmail.com" ),
( 1009, "Binoy", "Saha", "binoy67@gmail.com" ),
( 1010, "Gopi", "Das", "gopidas8@gmail.com" ),
( 1011, "Ajay", "Rao", "ajay2@gmail.com" );

INSERT INTO Teacher
( teacher_id, first_name, last_name, email)
VALUES
( 1012, "Meghna", "Joshi", "mj@gmail.com" );
SELECT * FROM Teacher;

USE sisdb;

INSERT INTO Courses
( course_id, course_name, credits, teacher_id)
VALUES
( 1, "Communication-English", 3, 1001),
( 2, "Mathematics-1", 3, 1002),
( 3, "Mathematics-2", 3, 1004),
( 4, "Graphics-1", 6, 1003),
( 5, "Graphics-2", 6, 1007),
( 6, "Mathematics-3", 3, 1009),
( 7, "Mathematics-4", 3, 1010),
( 8, "Physics-1", 3, 1006),
( 9, "Physics-2", 2, 1011),
( 10, "Chemistry-1", 2, 1005),
( 11, "Chemistry-2", 3, 1008),
( 12, "Science-1", 2, 1004),
( 13, "Science-2", 3, 1007);

SELECT * FROM Courses;

INSERT INTO Enrollments
( enrollment_id, student_id, course_id, enrollment_date)
VALUES
( 1, 1, 2, '2019-08-05' ),
( 2, 2, 4, '2019-08-05' ),
( 3, 3, 8, '2019-08-05' ),
( 4, 4, 9, '2019-08-05' ),
( 5, 5, 3, '2019-09-04' ),
( 6, 6, 1, '2019-09-04' ),
( 7, 7, 11, '2019-09-04' ),
( 8, 8, 5, '2019-08-06' ),
( 9, 9, 9, '2019-08-06' ),
( 10, 10, 10,'2019-08-06' );

INSERT INTO Enrollments
( enrollment_id, student_id, course_id, enrollment_date)
VALUES
( 11, 11, 4, '2019-09-06'),
( 12, 1, 7, '2019-08-05' ),
( 13, 2, 9, '2019-08-05' ),
( 14, 11, 7, '2019-09-06' ),
( 15, 1, 3, '2019-08-05' ),
( 16, 2, 3, '2019-08-05' );

SELECT * FROM Enrollments;


INSERT INTO Payments
( payment_id, student_id, amount, payment_date)
VALUES
( 1908051, 1, 34000, '2019-08-05' ),
( 1908052, 2, 45000, '2019-08-05' ),
( 1908053, 3, 75000, '2019-08-05' ),
( 1908054, 4, 35000, '2019-08-05' ),
( 1909045, 5, 20000, '2019-09-04' ),
( 1909046, 6, 30000, '2019-09-04' ),
( 1909047, 7, 28000, '2019-09-04' ),
( 1908068, 8, 47000, '2019-08-06' ),
( 1908069, 9, 40000, '2019-08-06' ),
( 19080610, 8,36000, '2019-08-06' );

SELECT * FROM Payments;

INSERT INTO Payments
( payment_id, student_id, amount, payment_date)
VALUES
( 19080511, 1, 40000, '2019-09-05' );

-- alter table payments
		-- add column payfor_course_id int;

		-- UPDATE payments
		-- SET payfor_course_id = CASE
		--     WHEN payment_id = 1908051 THEN 2
		--     WHEN payment_id = 1908052 THEN 4
		--     WHEN payment_id = 1908053 THEN 8
		--     WHEN payment_id = 1908054 THEN 9
		--     WHEN payment_id = 1908068 THEN 7
		--     WHEN payment_id = 1908069 THEN 9
		-- 	   WHEN payment_id = 1909046 THEN 1
		-- 	   WHEN payment_id = 1909047 THEN 11
		--     WHEN payment_id = 19070210 THEN 5
		--     WHEN payment_id = 19080511 THEN 7
		--     WHEN payment_id = 19090511 THEN 3
		--     ELSE payfor_course_id
		-- END
		-- WHERE payment_id IN (1908051,1908052,1908053,1908054,1908068,1908069,1909046,1909047,19070210,19080511,19090511);
		-- DELETE FROM payments WHERE student_id = 7 ;


-- update Payments
-- set student_id= 8
-- where student_id = 10;



-- TASK-2
-- 1. Write an SQL query to insert a new student into the "Students" table with the following details:

INSERT INTO Students
( student_id, first_name, last_name, date_of_birth, email, phone_number )
VALUES
( 11, "John", "Doe", '1995-08-15', "john.doe@example.com", "1234567890" );

INSERT INTO Students
( student_id, first_name, last_name, date_of_birth, email, phone_number )
VALUES
( 12, "Jonas", "Leo", '1996-08-13', "johnle@example.com", "1222335690" ),
( 13, "mona", "oni", '1999-09-03', "monaonie@example.com", "1332375690" );

SELECT * FROM Students;

-- 2. Write an SQL query to enroll a student in a course. Choose an existing student and course and 
-- insert a record into the "Enrollments" table with the enrollment date.

INSERT INTO Enrollments
( enrollment_id, student_id, course_id, enrollment_date)
VALUES
( 17, 8, 7, '2019-09-06' );

INSERT INTO Enrollments
( enrollment_id, student_id, course_id, enrollment_date)
VALUES
( 18, 4, 7, '2019-09-06' );

SELECT * FROM Enrollments;

-- 3. Update the email address of a specific teacher in the "Teacher" table. Choose any teacher and 
-- modify their email address.

UPDATE Teacher
SET email="rsahoo@gmail.com"
WHERE  email="rakesh@gmail.com";
SELECT * FROM Teacher;


-- 4. Write an SQL query to delete a specific enrollment record from the "Enrollments" table. Select 
--    an enrollment record based on the student and course.

DELETE FROM Enrollments
WHERE student_id = 10 AND course_id = 110;

-- 5. Update the "Courses" table to assign a specific teacher to a course. Choose any course and 
--    teacher from the respective tables.

UPDATE Courses
SET teacher_id=1008 
WHERE teacher_id=1001;

SELECT * FROM Courses;

-- 6. Delete a specific student from the "Students" table and remove all their enrollment records 
-- from the "Enrollments" table. Be sure to maintain referential integrity.

DELETE
FROM Students 
WHERE student_id=5;
-- SELECT * FROM Students;
-- SELECT * FROM Enrollments;

-- 7. Update the payment amount for a specific payment record in the "Payments" table. Choose any 
-- payment record and modify the payment amount.

SELECT * FROM Payments
WHERE amount BETWEEN 29000 AND 36000;

UPDATE Payments
SET amount=33000 
WHERE amount BETWEEN 29000 AND 36000;

UPDATE Payments
SET payment_date = '2019-07-02'
WHERE amount BETWEEN 29000 AND 36000;

UPDATE Payments
SET amount = 36000
WHERE payment_id = 19080610;
select * from Payments;





-- Task 3

-- 1. Write an SQL query to calculate the total payments made by a specific student. You will need to 
-- join the "Payments" table with the "Students" table based on the student's ID.

use sisdb;
--  (for individual records)
-- SELECT Students.student_id, Students.first_name, Students.last_name,
--   Payments.amount, Payments.payment_date 
--   FROM Students
--   INNER JOIN or JOIN Payments
--   ON Students.student_id = Payments.student_id ;

  SELECT Students.student_id, count(Students.first_name) as total_count,
  sum(Payments.amount) as total_payment
  FROM Students
  JOIN Payments
  ON Students.student_id = Payments.student_id 
  group by student_id;


-- 2. Write an SQL query to retrieve a list of courses along with the count of students enrolled in each 
-- course. Use a JOIN operation between the "Courses" table and the "Enrollments" table


SELECT  Courses.course_name, count(Enrollments.student_id) as Enrolled_student_count
FROM Courses
JOIN Enrollments
ON Courses.course_id = Enrollments.course_id
GROUP BY Courses.course_id;


-- 3. Write an SQL query to find the names of students who have not enrolled in any course. Use a 
-- LEFT JOIN between the "Students" table and the "Enrollments" table to identify students 
-- without enrollments.

SELECT Students.student_id, Students.first_name, Students.last_name, Students.phone_number,
Enrollments.enrollment_id, Enrollments.course_id
FROM Students
LEFT JOIN Enrollments
ON Students.student_id = Enrollments.student_id
WHERE enrollment_id IS NULL ;

-- 4. Write an SQL query to retrieve the first name, last name of students, and the names of the 
-- courses they are enrolled in. Use JOIN operations between the "Students" table and the 
-- "Enrollments" and "Courses" tables

SELECT  Students.student_id, Students.first_name, Students.last_name, 
Enrollments.enrollment_id,
Courses.course_name
FROM Students
JOIN Enrollments
ON Students.student_id = Enrollments.student_id
JOIN Courses
ON Enrollments.course_id = Courses.course_id ;

-- 5. Create a query to list the names of teachers and the courses they are assigned to. Join the 
-- "Teacher" table with the "Courses" table.

SELECT Teacher.teacher_id,  Teacher.first_name,  Teacher.last_name,
Courses.course_id, Courses.course_name 
FROM Teacher
JOIN Courses
ON Teacher.teacher_id = Courses.teacher_id;

-- 6. Retrieve a list of students and their enrollment dates for a specific course. You'll need to join the 
-- "Students" table with the "Enrollments" and "Courses" tables.

SELECT  Students.student_id, Students.first_name, Students.last_name, 
Enrollments.enrollment_date,
Courses.course_name
FROM Students
JOIN Enrollments
ON Students.student_id = Enrollments.student_id
JOIN Courses
ON Enrollments.course_id = Courses.course_id ;

-- 7. Find the names of students who have not made any payments. Use a LEFT JOIN between the 
-- "Students" table and the "Payments" table and filter for students with NULL payment records.

SELECT Students.student_id, Students.first_name, Students.last_name, Students.phone_number,
Payments.amount, Payments.payment_date
FROM Students
LEFT JOIN Payments
ON Students.student_id = Payments.student_id
WHERE payment_id IS NULL;


 -- 8. Write a query to identify courses that have no enrollments. You'll need to use a LEFT JOIN 
-- between the "Courses" table and the "Enrollments" table and filter for courses with NULL 
-- enrollment records

SELECT Courses.course_id, Courses.course_name, 
Enrollments.enrollment_id, Enrollments.enrollment_date
FROM Courses
LEFT JOIN Enrollments
ON Courses.course_id = Enrollments.course_id
WHERE enrollment_id IS NULL ;


-- 9. Identify students who are enrolled in more than one course. Use a self-join on the "Enrollments" 
--    table to find students with multiple enrollment records.


SELECT a.student_id as Stuid, count(b.enrollment_id) as Enrollid
FROM Enrollments a , Enrollments b
where a.student_id = b.enrollment_id
group by a.student_id; 


-- 10. Find teachers who are not assigned to any courses. Use a LEFT JOIN between the "Teacher" 
-- table and the "Courses" table and filter for teachers with NULL course assignments.

SELECT Teacher.teacher_id,  Teacher.first_name,  Teacher.last_name,
Courses.course_id, Courses.course_name 
FROM Teacher
LEFT JOIN Courses
ON Teacher.teacher_id = Courses.teacher_id
WHERE course_id IS NULL ;


use sisdb;
select * from Payments;
select * from Enrollments;



-- Task 4

-- 1. Write an SQL query to calculate the average number of students enrolled in each course. Use 
-- aggregate functions and subqueries to achieve this.
-- select course_id,count(course_id) as stuenrolled from Enrollments group by course_id;

	select avg (stuenrolled) from (select course_id,count(course_id) as stuenrolled from Enrollments group by course_id) as avgno ;


-- 2. Identify the student(s) who made the highest payment. Use a subquery to find the maximum 
-- payment amount and then retrieve the student(s) associated with that amount

	select student_id, amount from Payments where amount =all(select max(amount) from Payments );

-- (second highest payment)
-- select student_id, amount from Payments where amount = (select max(amount) from Payments where amount <(select max(amount) from Payments));


-- 3.Retrieve a list of courses with the highest number of enrollments. Use subqueries to find the 
-- course(s) with the maximum enrollment count.

	select max( course_id) as max_en_count from Enrollments where course_id in (select count(course_id) as stuenrolled from Enrollments group by course_id) ;


-- 4. Calculate the total payments made to courses taught by each teacher. Use subqueries to sum 
-- payments for each teacher's courses.

	select student_id, payfor_course_id,total_payments from 
	(select student_id,payfor_course_id, sum( amount) as total_payments from Payments group by payfor_course_id) as a;

 
-- 5. Identify students who are enrolled in all available courses. Use subqueries to compare a 
-- student's enrollments with the total number of courses.

	select student_id , course_id from Enrollments where course_id in ( select course_id from Courses ) ;

-- 6. Retrieve the names of teachers who have not been assigned to any courses. Use subqueries to 
-- find teachers with no course assignments.

	select teacher_id , first_name from Teacher where teacher_id not in ( select teacher_id from Courses  ) ;


-- 7. Calculate the average age of all students. Use subqueries to calculate the age of each student 
-- based on their date of birth.

	select avg(StudentAge)from (select student_id,first_name,date_of_birth,year(curdate())-year(date_of_birth) as StudentAge from students)as a ;

-- 8. Identify courses with no enrollments. Use subqueries to find courses without enrollment 
-- records.

	select course_id , course_name from Courses where course_id not in ( select course_id from Enrollments  ) ;


-- 9. Calculate the total payments made by each student for each course they are enrolled in. Use 
-- subqueries and aggregate functions to sum payments.

	select student_id, total_payment from(select student_id,sum(amount) as total_payment from Payments group by student_id)
	as b ;
      
-- 10. Identify students who have made more than one payment. Use subqueries and aggregate 
-- functions to count payments per student and filter for those with counts greater than one.
	 
	select student_id, stucount from 
	(select student_id, count(student_id) as stucount from Payments group by student_id ) as a having stucount>1 ;
    
-- 11. Write an SQL query to calculate the total payments made by each student. Join the "Students" 
-- table with the "Payments" table and use GROUP BY to calculate the sum of payments for each 
-- student.

	  SELECT Students.student_id,
	  sum(Payments.amount) as total_payment
	  FROM Students
	  JOIN Payments
	  ON Students.student_id = Payments.student_id 
	  group by student_id;

-- 12. Retrieve a list of course names along with the count of students enrolled in each course. Use 
-- JOIN operations between the "Courses" table and the "Enrollments" table and GROUP BY to 
-- count enrollments.

	SELECT  Courses.course_name, count(Enrollments.student_id) as Enrolled_student_count
	FROM Courses
	JOIN Enrollments
	ON Courses.course_id = Enrollments.course_id
	GROUP BY Courses.course_id;


-- 13. Calculate the average payment amount made by students. Use JOIN operations between the 
-- "Students" table and the "Payments" table and GROUP BY to calculate the average.

	SELECT avg(total_payment)from(
	SELECT Students.student_id, count(Students.first_name) as total_count,
    sum(Payments.amount) as total_payment
	FROM Students
	JOIN Payments
	ON Students.student_id = Payments.student_id 
	group by student_id 
    )as a;













