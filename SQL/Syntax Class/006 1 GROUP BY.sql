USE syntaxhrm_mysql;

SELECT emp_firstname,emp_lastname,job_title_code
FROM hs_hr_employees
WHERE job_title_code IS NOT NULL;

SELECT *
FROM ohrm_job_title;

SELECT COUNT(*),job_title_code
FROM hs_hr_employees
GROUP BY job_title_code;

SELECT COUNT(*),emp_marital_status
FROM hs_hr_employees
GROUP BY emp_marital_status;

SELECT  emp_marital_status, COUNT(*)
FROM hs_hr_employees
WHERE emp_marital_status IS NOT NULL
GROUP BY emp_marital_status ;


SELECT  emp_gender, COUNT(*)
FROM hs_hr_employees
GROUP BY emp_gender ;


-- 10,4,13 job title kodlarinda calisanlarin sayirlari
SELECT job_title_code,COUNT(*)
FROM hs_hr_employees
WHERE job_title_code IN (10,4,13)
GROUP BY job_title_code ;

-




