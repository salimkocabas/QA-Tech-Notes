use syntaxhrm_mysql;

SELECT 
    employee_id, emp_firstname, emp_lastname
FROM
    hs_hr_employees
WHERE 
    emp_firstname LIKE ('A%') AND emp_lastname LIKE ('S%')
    ;
    