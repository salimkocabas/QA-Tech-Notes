-- SHOW ALL ROWS IN HR.EMPLOYEES TABLES
SELECT *
FROM HR.EMPLOYEES;

-- SHOW HOW MANY RECORDS IN THE TABLE
SELECT
    COUNT(*) "Records in HR.EMPLOYEES table"
FROM HR.EMPLOYEES;


-- Verify how many employees don’t get the commission? 
SELECT COUNT(*)
FROM HR.EMPLOYEES
WHERE COMMISSION_PCT IS  NULL;


-- Display the department id, number of people in each department, average salary, and max salary.
SELECT 
    DEPARTMENT_ID,
    COUNT(DEPARTMENT_ID) "Number of Employee",
    MAX(SALARY) "Max Salary",
    ROUND(AVG(SALARY)) "Averega Salary",
    MIN(SALARY) "Min Salary"
FROM HR.EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID;


--Show how many  people working in that job id
SELECT 
    JOB_ID,
    COUNT(JOB_ID) "Number of Employee"
FROM HR.EMPLOYEES
GROUP BY JOB_ID
ORDER BY COUNT(JOB_ID) DESC;


--How can we find how many IT Programmers work in the company?
SELECT 
    JOB_ID,
    COUNT(JOB_ID) "Number of Employee"
FROM HR.EMPLOYEES
WHERE JOB_ID='IT_PROG'
GROUP BY JOB_ID;


-- shows that  which personal first name starts with 'A'
SELECT 
    FIRST_NAME ,
    COUNT(FIRST_NAME)
FROM HR.EMPLOYEES
WHERE FIRST_NAME LIKE 'A%'
GROUP BY FIRST_NAME;


-- How many employees first name starts with A? 
SELECT 
    SUM(COUNT(FIRST_NAME)) "How many employees first name starts with 'A'"
FROM HR.EMPLOYEES
WHERE FIRST_NAME LIKE 'A%'
GROUP BY FIRST_NAME;


-- Can you find the average salary in each department? Please sort results by the salary.
SELECT 
    DEPARTMENT_ID,
    ROUND(AVG(SALARY)) "Averega Salary"
FROM HR.EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY AVG(SALARY);


-- Display how many Sales Representative, Accountant and Stock managers are hired by the company?

SELECT 
    JOB_ID,
    COUNT(JOB_ID),
    ROUND(AVG(SALARY)) "Averega Salary"
FROM HR.EMPLOYEES
WHERE JOB_ID IN ('SA_REP','AC_ACCOUNT','ST_MAN')
GROUP BY JOB_ID
ORDER BY JOB_ID;



-- How can you find out AVG salary for employees per departments where average salary is more than 6500
SELECT 
    DEPARTMENT_ID,
    COUNT(DEPARTMENT_ID),
    ROUND(AVG(SALARY)) "Averega Salary"
FROM HR.EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING AVG(SALARY)>6000
ORDER BY AVG(SALARY);


-- How can see number of employees that work in department who’s total number is more than 5 people.
SELECT
    DEPARTMENT_ID,
    COUNT(DEPARTMENT_ID)
FROM HR.EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING COUNT(DEPARTMENT_ID)>5
ORDER BY COUNT(DEPARTMENT_ID) DESC;

-- How can I see max salary for all job ids where max salary will be more that 4000. 
-- Please display the max highest salaries per job id on top.
SELECT 
    JOB_ID,
    MAX(SALARY)
FROM HR.EMPLOYEES
HAVING MAX(SALARY)>4000
GROUP BY JOB_ID
ORDER BY MAX(SALARY) DESC;

-- How can I find out the average salary of people working for department 80 through 120, 
-- but I want to see only those departments where average salary is between 8000 to 10000?
SELECT
    DEPARTMENT_ID,
    ROUND(AVG(SALARY))
FROM HR.EMPLOYEES
WHERE DEPARTMENT_ID BETWEEN 80 AND 120
GROUP BY DEPARTMENT_ID
HAVING AVG(SALARY) BETWEEN 8000 AND 10000
ORDER BY DEPARTMENT_ID;




