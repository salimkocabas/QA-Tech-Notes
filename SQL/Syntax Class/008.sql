
select *
from hs_hr_emp_basicsalary;

use syntaxhrm_mysql;

-- average that we pay period
select avg(ebsal_basic_salary),payperiod_code
from hs_hr_emp_basicsalary
group by payperiod_code;

-- only avg salaries that are mote than 5000
select payperiod_code, round(avg(ebsal_basic_salary))
from hs_hr_emp_basicsalary
group by payperiod_code
having avg(ebsal_basic_salary)>5000;

select * from hs_hr_employees;

select * from ohrm_job_title;

-- show 'IT Analyst' job tile code
select id
from ohrm_job_title
where job_title='IT Analyst';

-- lets find all employess with job title code 4
select employee_id,emp_firstname,emp_lastname,job_title_code
from hs_hr_employees
where job_title_code=4
order by employee_id;

-- SUB QUERY
select employee_id,emp_firstname,emp_lastname,job_title_code
from hs_hr_employees
where job_title_code= (select id from ohrm_job_title where job_title='IT Analyst');

-- we want to display emp number, first and last name of all employees who are 'Angolan'
select  * from ohrm_nationality;
select * from hs_hr_employees;

select employee_id,emp_firstname,emp_lastname,nation_code
from hs_hr_employees
where nation_code= (select id from ohrm_nationality  where name='Angolan');

-- how to find second largest salary
select *
from hs_hr_emp_basicsalary
order by ebsal_basic_salary desc;

SELECT 
    MAX(ebsal_basic_salary) AS '2nd Largest Salary'
FROM
    hs_hr_emp_basicsalary
WHERE
    ebsal_basic_salary < (SELECT 
            MAX(ebsal_basic_salary)
        FROM
            hs_hr_emp_basicsalary
        WHERE
            ebsal_basic_salary);


