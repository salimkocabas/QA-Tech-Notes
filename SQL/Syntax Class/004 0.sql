USE syntaxhrm_mysql;

SELECT *
FROM  ohrm_nationality;


# LIKE 'A%' a ile baslayanlar
SELECT  *
FROM    ohrm_nationality
WHERE   name LIKE 'A%'
ORDER 	BY name ;


# LIKE '_<value>%'
SELECT  *
FROM    ohrm_nationality
WHERE   name LIKE '_l%'   # second charecter is = 'l'  Albanian, Algerian, Slovenian...
ORDER 	BY name ;


SELECT  	emp_firstname,emp_lastname
FROM		hs_hr_employees
WHERE 		emp_lastname  LIKE 'Z%'
ORDER BY	emp_firstname,emp_lastname;


SELECT  	emp_firstname,emp_lastname,emp_birthday 
FROM		hs_hr_employees
WHERE 		emp_birthday  LIKE '2000%' ;



SELECT  	emp_firstname,emp_lastname,emp_birthday
FROM		hs_hr_employees
WHERE 		emp_birthday  LIKE '____-02-%';   # DOB = only Month 02 (feb)








