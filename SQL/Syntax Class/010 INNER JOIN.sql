use syntaxhrm_mysql;

select *
from hs_hr_employees;

select *
from hs_hr_employees
where emp_number=5689;

-- inner join
-- display emp fname, lastname and employment status
select * from ohrm_employment_status;

select emp_firstname,emp_lastname,emp_status from hs_hr_employees;

select count(*)  from hs_hr_employees;

-- shows how many numbers of person have employment status
select count(*)  from hs_hr_employees where emp_status is not null;

-- shows how many  person have employment status
select  emp_firstname, emp_lastname, name
from hs_hr_employees  emp join ohrm_employment_status st
on emp.emp_status=st.id;

-- shows how many person work in smart office
select * from ohrm_location;

select loc.emp_number, emp_firstname, emp_lastname, name
from  hs_hr_employees emp join  hs_hr_emp_locations loc
on emp.emp_number=loc.emp_number
join ohrm_location oloc
on loc.location_id=oloc.id
where name='Smart Office';




