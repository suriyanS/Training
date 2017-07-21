1.List All employees :

Query: 
        select name,team,email,doj,salary from employee ;

2.List of employees in team/project :

Query:
select name,team,email,doj,salary from employee where team="DBL";

3.List of employees joined in specific month  :

Query:
select name,team,email,doj,salary from employee where MONTHNAME(doj) ="July" ;

4.Top 5 employees get highest salary  :

Query:
select name,team,email,doj,salary from employee order by salary desc limit 5;

5.Range wise Salary List:

Query:
select name,team,email,doj,salary from employee where salary between 40000 and 70000;