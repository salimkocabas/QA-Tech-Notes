use syntaxhrm_mysql;

SELECT * FROM hs_hr_employees WHERE  emp_firstname = 'John';

# UPPER
SELECT UPPER(emp_firstname)
FROM hs_hr_employees
WHERE
    emp_firstname = 'John';
    
    
# LOWER
SELECT 
    UPPER(emp_firstname), LOWER(emp_firstname)
FROM
    hs_hr_employees
WHERE
    emp_firstname LIKE ('A%');




