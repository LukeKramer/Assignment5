# Assignment5
This is the repository for my 5th TP Assignment
##Introduction
The Domain that my assignment is based on is the loan domain. So i decied to create a domain that allowes users to take out small loans based on their salaries.The system will then use the user salary and the amount of money they would like to loan to determine if the user would recieve the the amount they would like or not. 

##UML Domain Model

Domain model of the small loan system I want to develop.

![Domain Model](/UML1.png)

##Description of the Small Loan Domain Model

A Person would register to use the application. The registartion process would insure that the person gets added as a user.
The user would then be able to apply for a loan. When appling for a loan two elements are needed number1 the users income
(salary) and number2 the a desired amount of money that a user would want to loan out.Once these two elements are recieved 
the first thing that happens is the user income is used to Determine the  Type of user and then type is sent to help calculate the loan risk.The users requseted loan amount is also then sent to help calculate the loan risk. The calculate loan recieve information from the loan entity which holds the max and minimum amount of money avaible for all the types of users.At this point the Calculation of loans holds 4 elements number1 the userType number2 the users requested amount number 3 maximum loan amount number 4 minmium loan amount.These element are used to produce a risk report. That Report is used to determine a result that holds the approval or disapproval of the loan.That result is then sent back to the Person who requested the loan. At that point the transaction has ended. 

##Key Points

The system will have 3 types of users namely Premium,General and a low income type. The system uses a users income to determine which type bracket they fall into, this inturn affects the amount that specific user will be allowed to loan from the system and the interest that is added to the monthly installments. 



