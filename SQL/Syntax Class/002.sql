USE syntaxhrm_mysql;

SELECT * FROM hs_hr_employees WHERE emp_firstname= "Donald";
SELECT * FROM hs_hr_employees WHERE emp_number=8357;

SELECT emp_number,employee_id,emp_firstname,emp_middle_name,emp_lastname,emp_marital_status
FROM hs_hr_employees
WHERE emp_number=8344;

SELECT * FROM hs_hr_employees
WHERE emp_firstname='esra';

SELECT * FROM hs_hr_employees
WHERE emp_birthday>'2000-01-01';

