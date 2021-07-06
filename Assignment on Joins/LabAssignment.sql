use LabAssignment;

select * from employees;

update employees set JOB_ID='IT PROG' where First_Name='William' and Last_Name='Smith';

update employees set SALARY=10000 ,COMMISSION_PCT=0.20 where EMPLOYEE_ID=171;

SET SQL_SAFE_UPDATES=0;

update employees set SALARY=(SALARY+SALARY*0.15);

update employees set COMMISSION_PCT=0.9 where COMMISSION_PCT=0.0;

delete from employees where DEPARTMENT_ID=40;

delete from employees where HIRE_DATE='1982-01-23';

delete from employees where DEPARTMENT_ID=10;

select count(EMPLOYEE_ID) from employees where EMPLOYEE_ID=100;

select concat(FIRST_NAME,' ',LAST_NAME) as "Full Name" from employees;

select * from employees where not mod(EMPLOYEE_ID,2);

# sub queries
select First_name, Last_name, salary from employees
where salary >
(select max(salary) from employees where last_name='Bull');

select * from departments;
select * from Locations;
select * from employees;

select FIRST_NAME, LAST_NAME from employees where DEPARTMENT_ID=
(select DEPARTMENT_ID from departments where DEPARTMENT_NAME='IT');

select First_name, Last_name from employees where MANAGER_ID!=0 and MANAGER_ID in
(select MANAGER_ID from departments where LOCATION_ID in
(select LOCATION_ID from locations where COUNTRY_ID='US'));

select First_name, Last_name from employees where employee_id in( select MANAGER_ID from employees);

select First_name, Last_name,salary from employees where salary> (select avg(salary) from employees);

select First_name, Last_name,salary from employees where salary=any
(select min_salary from jobs group by job_id);

select first_name, last_name,job_id, salary from employees where salary in
(select min_salary from jobs where employees.job_id = jobs.job_id);

select first_name, last_name,job_id, salary from employees where department_id in
(select department_id from departments where department_name='IT' and salary>
(select avg(salary) from employees));

select first_name, last_name, salary from employees where department_id in 
(select department_id from departments where 
department_name like 'IT') and salary >
(select avg(salary) from employees) ;

select first_name, last_name, salary from employees 
where salary >
(select  salary from employees where last_name='Bell');

############################################################ Joins ##################################
select * from locations;
select * from departments;
select * from countries;
select * from employees;
select * from jobs;
select * from job_history;

#1 on joins

select locations.location_id,street_address,city,state_province, country_name 
from departments,locations,countries
where countries.country_id=locations.country_id and locations.location_id=departments.location_id;

#2

select first_name,last_name,employees.department_id,department_name
from employees, departments
where departments.DEPARTMENT_ID=employees.DEPARTMENT_ID;

#3

select first_name, last_name,job_title, departments.department_id, department_name,city
from employees,departments,locations,jobs
where jobs.job_id=employees.job_id and departments.department_id=employees.department_id
and departments.location_id=locations.location_id and city='Toronto';

#4
select  MGR.LAST_NAME,MGR.employee_id ,EMP.EMPLOYEE_ID as Manager_id,EMP.last_name
from employees as EMP,employees as MGR 
where MGR.Manager_id=EMP.Employee_id;

#5
select * from employees;
select h.first_name, h.last_name, h.HIRE_DATE from employees a, employees h
where h.HIRE_DATE>a.HIRE_DATE and a.last_name='jones';  

#6
select department_name, count(employees.department_id) 
from employees,departments
where departments.DEPARTMENT_ID=employees.DEPARTMENT_ID
group by department_name;

#7
#Write a query to find the employee ID, job title,
#number of days between ending date and starting date for all jobs in department 90.
select * from employees;
select * from job_history;
select * from jobs;

select employees.employee_id,job_title, (end_date-start_date)
from employees, jobs,job_history
where employees.DEPARTMENT_ID=job_history.DEPARTMENT_ID 
and jobs.JOB_ID=job_history.JOB_ID
and employees.DEPARTMENT_ID=90;

select * from departments;
select * from employees;
select * from locations;
select * from job_history;
# 8
# Write a query to display the department ID and name and first name of manager. 
select departments.department_id,department_name,first_name
from employees,departments
where departments.DEPARTMENT_ID=employees.DEPARTMENT_ID
and departments.MANAGER_ID=employees.EMPLOYEE_ID 
;

#9
#Write a query to display the department name, manager name, and city.
select department_name,First_name,last_name,city
from employees,locations,departments
where departments.location_id=locations.location_id
and departments.MANAGER_ID=employees.EMPLOYEE_ID ;

#10
# Write a query to display the job title and average salary of employees.
select job_title, avg(salary) from employees,jobs
where jobs.job_id=employees.job_id
group by job_title;

#11
#Write a query to display job title, employee name, and the difference between 
#salary of the employee and minimum salary for the job

select job_title,first_name,(salary-MIN_SALARY)
from employees,jobs
where jobs.job_id=employees.job_id
group by job_title;

#12
#Write a query to display the job history that were done by any employee
#who is currently drawing more than 10000 of salary.

select first_name, employees.job_id, job_history.*
from employees, job_history
where employees.employee_id = job_history.employee_id;

select job_history.* from employees, job_history
where job_history.EMPLOYEE_ID=employees.EMPLOYEE_ID and salary >10000;

#13
#Write a query to display department name, name (first_name, last_name), hire date,
#salary of the manager for all managers
#whose experience is more than 15 years.

select DEPARTMENT_NAME,first_name, last_name,HIRE_DATE,salary from departments,employees
where departments.DEPARTMENT_ID=employees.DEPARTMENT_ID
and employees.EMPLOYEE_ID=departments.MANAGER_ID
and (sysdate()-HIRE_DATE)>(15*365);

