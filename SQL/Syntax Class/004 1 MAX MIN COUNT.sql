-- min, max, avg, sum

USE syntaxhrm_mysql;

#COUNT
SELECT 
    COUNT(emp_number)
FROM
    hs_hr_employees;
    
    
SELECT 
    COUNT(*)
FROM
   ohrm_job_title;
   
#MIN   
SELECT 
    MIN(emp_number)
FROM
    hs_hr_employees;

#MAX
SELECT 
    MAX(emp_number)
FROM
    hs_hr_employees;
 
  
   
    
    