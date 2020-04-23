USE syntaxhrm_mysql;

SELECT emp_marital_status
FROM hs_hr_employees
WHERE emp_marital_status IS NOT NULL;

SELECT COUNT(*)
FROM hs_hr_employees
WHERE emp_marital_status IS NOT NULL;


SELECT COUNT(*)
FROM hs_hr_employees
WHERE emp_marital_status IS  NULL;
