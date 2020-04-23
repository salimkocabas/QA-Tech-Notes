USE syntaxhrm_mysql;

-- JOIN : retrives data from 2 or more tables
-- Tables need to be connect using PK & FK

-- we want to display ingo of employess first name, last name and nationality
-- 1. see if tables are related
-- 2.find PK & FK
-- 3. identifies which columns are coming from wich table

-- TYPE of joins:
-- INNER JOIN
-- OUTER JOIN a. left joing b.right join c. full join

-- SELF JOIN
-- INNER JOIN : retrives mathing data from 2 or more tables. Inner join can be called as natural join or equijoin

select *
from ohrm_nationality;

-- INNET JOIN
select emp_firstname,emp_lastname, name
from hs_hr_employees join ohrm_nationality
on hs_hr_employees.nation_code=ohrm_nationality.id;

select count(*)
from hs_hr_employees;


select emp_number,emp_firstname,emp_lastname, job_title
from hs_hr_employees  inner join ohrm_job_title
on hs_hr_employees.job_title_code=ohrm_job_title.id;

-- we put name(alias)  for table / emp=hs_hr_employees  /tit=ohrm_job_title 
select emp_number,emp_firstname,emp_lastname, job_title
from hs_hr_employees emp inner join ohrm_job_title tit
on emp.job_title_code=tit.id;

-- TASK
-- Display employees number, first name and lastname and their employment status name. Sort results based on the lastname.
-- Display employees number, first name and lastname and job title only for Developers and Application Developers.
-- Display employees number, first name and nationality and job title only for employees whose nationality starts with A.

select emp_number,emp_firstname,emp_lastname, emp_status
from hs_hr_employees emp inner join ohrm_employment_status est
on emp.job_title_code=est.id;

select emp_number,emp_firstname,emp_lastname, job_title
from hs_hr_employees emp inner join ohrm_job_title tit
on emp.job_title_code=tit.id
having job_title='Developer' or job_title='Application Developer' ;

select emp_number,emp_firstname,emp_lastname, nation_code,name
from hs_hr_employees emp inner join ohrm_nationality nat
on emp.nation_code=nat.id
where name like 'A%';

select *
from ohrm_nationality;

















