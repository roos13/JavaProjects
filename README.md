# JavaProjects
Student Projects
###
Lab2 
In this lab you will write a program to emulate the game of tic-tac-toe between two
people at the same console. That is to say that in this lab your program will emulate
pencil and paper (a tic-tac-toe "board").

###

Lab3
A company pays its employees on a weekly basis. The company has three types of employees:

Salaried employees, who are paid a fixed weekly salary regardless of the number of hours worked;
Hourly employees, who are paid by the hour and receive overtime pay;
Commissioned employees whose pays are 20% of the week's sales
Create a console-based Java application that: 
Calculates weekly pay for an employee. The application should display text that requests the user input the name of the employee, type of employee, and the monthly salary, or hourly rate, if it’s an hourly employee, and hours worked for the week.
For hourly employees, the rate will be doubled if it’s beyond 40 hours/week.
The application should then print out the name of the employee and the weekly pay amount. In the printout, display the dollar symbol ($) to the left of the weekly pay amount and format the weekly pay amount to display currency.
Implements a feature that allows the company to reward selected salaried employees by adding 10% to their salaries. Your program should display an asterisk (*) to the upper right of the weekly pay amount, and a note stating bonus added below the table, as shown below:
Name Class Hours Sales Rate Weekly Pay Amount
===========================================================
James Hogan Salaried $3,300.00*
Jennifer Waltz Hourly 45 $10.95 $547.50
Moly Smith Hourly 32 $15.00 $480.00
Joan Han Salaried $2,600.00
Marry Butler Commissioned $10,000.00 $2,000.00
===========================================================
TOTAL $8,927.50
*A 10% bonus is awarded

###

Lab4

Book maintanance application
Description of the Problem
Write a GUI program that lets user maintain records in a file or database that contains the
data for Book objects. 

###

Cache

Design and implement an object Cache class that uses the LRU (Least Recently
Used) Scheme. The cache has a fixed size and stores references to the most
recently used objects. The cache should be able to store any comparable object
that has a key value. We will also write a CacheTest class to test our cache
implementation for two different types of distributions.
How Does a Cache Work?
Whenever an application requires a data item, it attempts to get it from the cache.
If the object is found in the cache, it’s called cache hit. If the object isn’t found in
the cache, it’s called cache miss.
In case of a cache hit, the cache returns a reference to the object and object gets
moved to the first position in the cache (the most recently used object). On the
other hand, if it is a cache miss, the application typically needs to read the object
from the disk (or some other external source like a database) and then puts the
object in to the first position of the cache. Note that if the cache is full, the last
entry (the least recently used one) in the cache will be removed before a new
object can be added. Depending upon the application, the removed entry may or
may not need to be stored on the disk (or some other external location, like a
database). For the purpose of this exercise, we will assume that the removed
object doesn’t need to be written to the disk (or some other external location)
