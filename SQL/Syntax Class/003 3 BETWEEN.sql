use syntaxhrm_mysql;

SELECT 
    employee_id, emp_firstname, emp_lastname
FROM
    hs_hr_employees
WHERE 
    employee_id BETWEEN  3000 AND 3200   ;