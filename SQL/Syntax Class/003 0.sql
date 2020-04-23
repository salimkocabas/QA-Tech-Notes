# use db_name yerine table_ismi.db_name kullanilabilir
SELECT * FROM syntaxhrm_mysql.hs_hr_employees;

SELECT emp_firstname, emp_lastname FROM syntaxhrm_mysql.hs_hr_employees;

USE syntaxhrm_mysql;
SELECT emp_firstname, emp_lastname FROM hs_hr_employees;

SELECT * FROM hs_hr_employees WHERE emp_number=3713;

-- order by : sort A to Z
SELECT * FROM hs_hr_employees ORDER BY emp_lastname;

# desc : reverse order (sort Z to A)
SELECT * FROM hs_hr_employees ORDER BY emp_lastname DESC;


SELECT emp_firstname FROM hs_hr_employees ORDER BY emp_firstname;  -- print only firs names sort oredered

SELECT DISTINCT(emp_firstname) FROM hs_hr_employees ORDER BY emp_firstname;  -- print only UNIQUE first names


#  print only UNIQUE first names sort A -> Z
SELECT DISTINCT(emp_firstname) FROM hs_hr_employees ORDER BY emp_firstname; 

#  print only UNIQUE first names sort Z -> A
SELECT DISTINCT(emp_firstname) FROM hs_hr_employees ORDER BY emp_firstname DESC ; 


# Sadece John isimli calisanlarin listelenmesi  ONLY one Condition
SELECT *  FROM hs_hr_employees WHERE emp_firstname='John';


# Sadece John isimli ve Smithon soy isimli calisanlarin listelenmesi
SELECT * FROM hs_hr_employees WHERE  emp_firstname='John' AND  emp_lastname='Smithon';

# Sadece John isimli ve Smithon soy isimli calisanlarin listelenmesi
SELECT * FROM hs_hr_employees WHERE  emp_firstname='John' OR   emp_firstname='Albert' 
ORDER BY emp_firstname, emp_lastname;

# NOT keyword  Albert haricindeki kisileri getir
SELECT * FROM hs_hr_employees WHERE  NOT emp_firstname='Albert' 
ORDER BY emp_firstname, emp_lastname;

SELECT * FROM hs_hr_employees;

# to test for null values we have IS NULL operator
SELECT * FROM hs_hr_employees WHERE NOT emp_birthday IS NULL;
SELECT * FROM hs_hr_employees WHERE emp_birthday IS NOT NULL;

-- show only emp id bigger than 4000
SELECT * FROM hs_hr_employees WHERE  employee_id > 4000 ORDER BY employee_id;

-- show only emp id bigger 4000-5000
SELECT * FROM hs_hr_employees WHERE  employee_id >=4000 and employee_id < 5000 ORDER BY employee_id;


--  only show some records WHERE table IN (record...)
SELECT emp_number,emp_firstname,emp_lastname
FROM hs_hr_employees
WHERE emp_number IN (37372,3388,3393,3394)
ORDER BY emp_number;

--  only show some records WHERE table IN (record...)
SELECT emp_number,emp_firstname,emp_lastname
FROM hs_hr_employees
WHERE emp_firstname IN ('Frank','Robert','John')
AND emp_lastname > 'B'
ORDER BY emp_lastname;


-- emp number 3000-400 arasinda olanlar
SELECT emp_number,emp_firstname,emp_lastname
FROM hs_hr_employees
WHERE emp_number between 3000 and 4000 
ORDER by emp_number;







