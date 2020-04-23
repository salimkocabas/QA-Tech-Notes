use syntaxhrm_mysql;
select * from hs_hr_employees;
select * from ohrm_nationality;


-- retrive emp first name and last name and nationality
-- display record even if no emplloyees to any nationality

select emp_number,emp_firstname,emp_lastname,name
from ohrm_nationality nat left  join   hs_hr_employees emp 
on emp.nation_code=nat.id
order by name;

-- display employees who were born same date
select e1.employee_id,e1.emp_firstname, e1.emp_lastname, e1.emp_birthday,
		e2.employee_id,e2.emp_firstname, e2.emp_lastname
from hs_hr_employees e1 join hs_hr_employees e2
on e1.emp_birthday=e2.emp_birthday
where e1.emp_firstname!=e2.emp_firstname;

select e1.emp_firstname, e1.emp_lastname, e1.joined_date,
		e2.emp_firstname, e2.emp_lastname
from hs_hr_employees e1 join hs_hr_employees e2
on e1.joined_date=e2.joined_date
where e1.emp_firstname!=e2.emp_firstname;


-- retrieve we want to see employees and their supervisors  : *** TEKRAR BAK ***
select * from hs_hr_employees;
select emp.employee_id, emp.emp_firstname, emp.emp_lastname, emp.erep_sup_emp_number, sup.employee_id,sup.emp_firstname, sup.emp_lastname
from hs_hr_employees emp join hs_hr_employees sup
on emp.erep_sup_emp_number=sup.emp_number
order by emp.erep_sup_emp_number;





