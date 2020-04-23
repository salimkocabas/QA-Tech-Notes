-- how do return matching and non matching data
-- we want to display info about employee and their job titles
-- even if there no employees assing for the title

use syntaxhrm_mysql;
select * from hs_hr_employees;
select * from ohrm_job_title;

-- INNER <job title olan kisiler>
select emp_number,emp_lastname,job_title
from hs_hr_employees e  join ohrm_job_title t
on e.job_title_code=t.id
order by emp_number;

-- LEFT <emp num ve emp last name olanlar, job title varsa yaz yoksa null>
select emp_number,emp_lastname,job_title
from hs_hr_employees e left join ohrm_job_title t
on e.job_title_code=t.id
order by emp_number;

-- RIGHT <emp num, emp last name hepsini yaz null+dolu ve job_title dolu olanlar>
select emp_number,emp_lastname,job_title
from hs_hr_employees e right join ohrm_job_title t
on e.job_title_code=t.id
order by emp_number;

