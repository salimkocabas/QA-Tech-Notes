-- List all employees who are Cloud Architects?
-- How to retrieve information of  the employee who earns the lowest  salary?
-- List all employees who are Self Employed?
-- Display emergency contact name and phone number of Adam Adams
-- How can you display the third highest salary

SELECT employee_id,emp_firstname,emp_lastname,job_title_code
FROM hs_hr_employees
WHERE job_title_code=(SELECT ID FROM ohrm_job_title WHERE job_title='Cloud Architect');

SELECT * FROM ohrm_job_title;

SELECT *
FROM hs_hr_employees;

