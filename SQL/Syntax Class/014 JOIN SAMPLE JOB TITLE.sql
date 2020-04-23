use syntaxhrm_mysql;


-- print person + job title code
select employee_id,emp_firstname,emp_lastname,job_title_code
from hs_hr_employees;

select emp.employee_id,emp.emp_firstname,emp.emp_lastname,emp.job_title_code
from hs_hr_employees emp;

select id,job_title from ohrm_job_title;

select count(*) from hs_hr_employees;
select * from hs_hr_employees;

-- print person + job title name
select emp.employee_id,emp.emp_firstname,emp.emp_lastname,emp.job_title_code,jtit.job_title
from hs_hr_employees emp join ohrm_job_title jtit
on jtit.id=emp.job_title_code;

