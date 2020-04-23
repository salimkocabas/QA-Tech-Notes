USE syntaxhrm_mysql;

SELECT *
FROM ohrm_job_title;

SELECT COUNT(*), job_title_code
FROM hs_hr_employees
GROUP BY job_title_code
HAVING COUNT(*)>3;

-- 10 KISIDEN FAZLA AYNI JOB TITLE DA OLANLAR
SELECT COUNT(*),job_title_code
FROM hs_hr_employees
WHERE job_title_code IS NOT NULL
GROUP BY job_title_code
HAVING COUNT(*)>10
;

# MESLEK GRUPLARINA GORE EN KUCUK YASTA OLANLAR
SELECT  job_title_code,MAX(emp_birthday)
FROM hs_hr_employees
GROUP BY job_title_code
;

# MESLEK GRUPLARINA GORE EN KUCUK YASTA OLANLAR VE 1999 YILINDAN KUCUK OLANLAR
SELECT  job_title_code,MAX(emp_birthday)
FROM hs_hr_employees
GROUP BY job_title_code
HAVING MAX(emp_birthday)>'1999-01-01'  # 1999 YILINDAN SONRA DOGANLAR
;



