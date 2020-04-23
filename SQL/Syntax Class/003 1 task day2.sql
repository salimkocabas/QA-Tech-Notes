USE syntaxhrm_mysql;

SELECT *  
FROM hs_hr_employees 
WHERE job_title_code IS  NULL;

-- ev telefonu bos olanlar
SELECT employee_id,emp_lastname,emp_lastname,emp_hm_telephone
FROM hs_hr_employees
WHERE emp_hm_telephone IS  NULL
ORDER BY emp_firstname;





