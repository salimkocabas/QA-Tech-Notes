use syntaxhrm_mysql;
select * from hs_hr_employees;
select * from ohrm_nationality;


select emp_firstname from hs_hr_employees
union all
select emp_lastname from hs_hr_employees;