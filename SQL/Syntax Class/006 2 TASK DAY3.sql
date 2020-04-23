USE syntaxhrm_mysql;

-- LASTNAME UPPER firstname lower
SELECT UPPER(emp_lastname),LOWER(emp_firstname) 
FROM  hs_hr_employees;


-- JOB TITLE IS NULL
SELECT COUNT(*)
FROM  hs_hr_employees
WHERE job_title_code IS NULL;


-- NUMBER OF MARRIED EMPLOYEE
SELECT COUNT(*)
FROM  hs_hr_employees
WHERE  emp_marital_status='Married';

-- YOUNGES EMPLOYEE 
SELECT emp_lastname,emp_lastname,MAX(emp_birthday)
FROM  hs_hr_employees;


-- SHOW JOB TITLES
SELECT *
FROM ohrm_job_title;

-- SHOW ONLY JOB TITLE CODE=10 (ITS EQUAL DEVELOPER)
SELECT emp_firstname,emp_lastname,job_title_code
FROM  hs_hr_employees 
WHERE job_title_code =10;


SELECT emp_firstname,emp_lastname,job_title_code
FROM  hs_hr_employees 
WHERE job_title_code in (1,4,13,10)
GROUP BY job_title_code;











