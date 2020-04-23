use syntaxhrm_mysql;
select * from ohrm_skill;

select emp_firstname,emp_lastname,job_title_code  from hs_hr_employees where job_title_code is not null;


select *  from ohrm_job_title;

select id, name, country_code from ohrm_location;

select * from ohrm_nationality;

select  emp_firstname,emp_middle_name,emp_lastname from hs_hr_employees where emp_firstname="Albert";