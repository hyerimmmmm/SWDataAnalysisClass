DROP TABLE 데이터디자인 ;
DROP TABLE 교육생정보 ; 
DROP TABLE 성적표 ; 

CREATE TABLE 교육생정보 (
학생ID VARCHAR2(9) PRIMARY KEY , 
학생이름 VARCHAR2(50) NOT NULL , 
팀 VARCHAR2(5) 
); 

CREATE TABLE 성적표 ( 
    학생ID VARCHAR2(9) , 
    과목   VARCHAR2(30) , 
    성적   NUMBER  , 
    CONSTRAINT PK_성적표 PRIMARY KEY(학생ID , 과목) , 
    CONSTRAINT FK_성적표 FOREIGN KEY(학생ID) REFERENCES 교육생정보(학생ID) 
)  ; 

INSERT INTO 교육생정보 VALUES ('SMHRD1' , '조준용' , 'A') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD2' , '박병관' , 'A') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD3' , '이명훈' , 'B') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD4' , '손동연' , 'B') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD5' , '000' , 'C') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD6' , '000' , 'C') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD7' , '000' , 'C') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD8' , '000' , 'C') ; 
INSERT INTO 교육생정보 VALUES ('SMHRD9' , '000' , 'C') ; 

INSERT INTO 성적표 VALUES('SMHRD1'  ,'JAVA' , 90); 
INSERT INTO 성적표 VALUES('SMHRD1'  ,'DATABASE' , 85); 
INSERT INTO 성적표 VALUES('SMHRD1'  ,'PYTHON' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'PYTHON' , 20); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'PYTHON' , 20); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'JAVA' , 85); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'DATABASE' , 40); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'PYTHON' , 60); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'PYTHON' , 100); 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'JAVA' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'DATABASE' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'PYTHON' , NULL ) ; 

COMMIT; 



-- 주석 달기

/*
여러줄 주석 달기
*/

-- employees 테이블 불러오기
select * from employees;

-- employees 테이블의 salary 열 불러오기
select salary from employees;

-- employees 테이블의 first_name 열 불러오기
select  first_name from employees;

-- employees 테이블의 last_name 열 불러오기
select last_name from employees;

-- 부서 정보 전부 출력하기
select * from departments;

-- 직원 테이블의 직원ID, 이름, 입사일 출력하기
select employee_id, first_name, hire_date
from employees;

-- 부서 테이블에서 부서ID, 부서명, 근무지ID 출력하기
select department_id, department_name, location_id
from departments;

-- 행 갯수 변환
-- select count(*) from 테이블 이름;


-- 직원 수 나타내기
select count(*) from employees;
-- 부서 수 나타내기
select count(*) from departments;

-- distinct를 사용해 중복제거
-- select distinct 행 이름
-- from 테이블 이름;

-- 부서 ID 중복 제거
select distinct department_id
from employees;
-- 부서 ID 중복 제거 전
select department_id
from employees;
-- 직원 테이블에서 입사일 중복 제거 후 출력
select distinct hire_date
from employees;

-- 사칙 연산을 사용해 전체 직원의 연봉 출력
-- salay 데이터에 별명 붙이기
-- 방법1
select salary * 12 연봉
from employees;
-- 방법2
select salary * 12 "2024 연봉" -- 띄어쓰기가 있을 때는 ""로 감싸주기
from employees;
-- 방법3
select salary * 12 as 연봉
from employees;
-- 방법4
select salary * 12 as "2024 연봉" -- 띄어쓰기가 있을 때는 ""로 감싸주기
from employees;

-- null: 데이터가 없는, 비어있는 상태
-- null에 연산을 추가해주면 결과값은 null
insert into employees (employee_id, last_name, email, hire_date, job_id)
values (207, '임', 'lim0606', sysdate, 'IT_PROG');

-- 확인
select * from employees; -- 채우지 않은 값들은 null상태로 출력

-- WHERE절
-- IT PROG 직무를 가진 사원의 모든 정보를 출력
select *
from employees
where job_id = 'IT_PROG';

-- 직원 ID가 205인 사람의 성과 이름 출력
select first_name, last_name
from employees
where employee_id = 205;

-- 부서 ID가 50인 직원의 직원 ID와 부서 ID를 출력
select employee_id, department_id
from employees
where department_id = 50;

-- 직원 테이블에서 월급여가 5000 이하인 직원 first_name과 salary 출력
select first_name, salary
from employees
where salary <= 5000;

--직원 테이블에서 직원 아이디, 급여, 연봉 출력하기
-- 단 연봉은 AnnSal로 출력
select job_id, salary, salary *12 AnnSal
from employees;

-- 직원 테이블에서 연봉이 50000이하인 직원의 first_name과 연봉 출력
-- (연봉은 AnnSal 키워드로 출력)
select first_name, salary *12 as "AnnSal"
from employees
where salary * 12 <= 50000;

-- IT_PROG 이라는 직무를 하고 있지 않은 사원의 직원ID와 이름을 출력 해주세요.
select employee_ID, first_name
from employees
where jod_id != 'IT_PROG';

-- 부서ID가 90이고, 급여가 5000이상인 직원의 ID와 이름을 출력하기
select employee_id
from employees
where department_id = 90 and salary <= 5000; -- 논리 연산자 and 사용, 둘 다 만족해야 함

-- 부서ID가 90이거나, 급여가 5000이상인 직원의 ID와 이름을 출력하기
select employee_id
from employees
where department_id = 90 or salary <= 5000; -- 논리 연산자 or 사용, 하나만 만족하면 됨

-- jod_id가 ‘IT_PROG’와 “FI_ACCOUNT’가 아닌 직원의 이름과 jod_id를 출력 해주세요.
select first_name, job_id
from employees
where job_id != 'IT_PROG' and job_id != 'FI_ACCOUNT';

-- 부서 id가 100이거나 입사일이 16년02월02일 이후에 입사한 직원의 이름, 입사일을 출력 해주세요.
-- 날짜 비교
select * from employees
where hire_date >= '24/01/01'; -- 비교하려는 데이터의 날짜 형식에 맞춰 문자열로 바꿔서 비교

-- 실습
select first_name, hire_date
from employees
where department_id = 100 or hire_date >= '16/02/02';

-- 급여가 10000미만이 아닌 직원의 이름과 급여를 출력 해주세요.
select first_name, salary
from employees
where salary >= 10000;

-- 부서 id가 100이거나 50인 직원 중에서 연봉이 100000 이상인 직원의 ID, 이름, 연봉을 출력 해주세요.
-- 논리 연산자의 우선순위: and > or
select employee_id, first_name, salary * 12, department_id
from employees
where (department_id = 100 or department_id = 50) and salary * 12 >= 100000;

--------------------------------
-- 0224

-- 열정 페이를 받는 직원의 사번을 출력시켜 주세요.
-- null 값 비교 연산
-- is null(null 인 경우) 과 is not null(null 이 아닌 경우)
select employee_id
from employees
where salary is null;

-- 핸드폰 번호가 null인 직원의 사번과 부서 번호를 출력해주세요.
select employee_id, department_id
from employees
where phone_number is null;

-- 커미션 비율(commission_pct)가 null이 아닌 직원의 이름과 커미션 비율을 출력해주세요.
select first_name, commission_pct
from employees
where commission_pct is not null;

-- 부서 ID가 30, 50, 90인 직원의 모든 정보를 출력해주세요.
select *
from employees
where department_id = 30 or department_id = 50 or department_id = 90;
-- 연산자 in을 사용해서 출력하기
select *
from employees
where department_id in (30, 50, 90);

-- 부서 ID가 30, 50, 90가 아닌 직원의 모든 정보를 출력해주세요.
select *
from employees
where department_id != 30 and department_id != 50 and department_id != 90;
-- 연산자 not in을 사용해서 출력하기
select *
from employees
where department_id not in (30, 50, 90);

-- job_id가 ‘AD_VP’이거나 ‘ST_MAN’인 사람의 이름과 job_id를 출력해주세요.
select first_name, job_id
from employees
where job_id in ('AD_VP', 'ST_MAN');

-- 매니저 ID가 145, 146, 147, 148, 149가 아닌 직원의 이름과 매니저 ID를 출력해주세요.
select first_name, manager_id
from employees
where manager_id not in (145, 146, 147, 148, 149);

-- 급여가 1만원 대인 직원들의 이름과 급여를 출력해주세요.
select first_name, salary
from employees
where salary between 10000 and 19999;

-- 2005년에 입사한 직원의 이름과 입사일을 출력해주세요.
select first_name, hire_date
from employees
where hire_date between '05/01/01' and '05/12/31';

-- 대문자 A로 이름이 시작하는 직원의 사번과 이름을 출력해주세요.
select employee_id, first_name
from employees
where first_name like 'A%';

-- 이름의 두번째 글자가 e인 직원의 사번과 이름을 출력해주세요.
select employee_id, first_name
from employees
where first_name like '_e%';

-- 이름이 대문자 S로 시작하고 소문자 n으로 끝나는 직원의 사번과 이름을 출력해주세요.
select employee_id, first_name
from employees
where first_name like 'S%n';

-- 1월에 입사한 직원의 이름과 입사일을 출력해주세요.
select first_name, hire_date
from employees
where hire_date like '%/01/%';

-- 예제
select department_id, count(employee_id) 인원수
from employees
group by department_id;

-- 각 부서별 최대 급여를 출력해주세요.
select department_id, max(salary) as 최대급여
from employees
group by department_id;

-- 각 부서별 최소 급여를 출력해주세요.
select department_id, min(salary) as 최소급여
from employees
group by department_id;

-- 각 부서별 평균 급여를 출력해주세요.
select department_id, round(avg(salary), 0) as 평균급여
from employees
group by department_id;

-- 성적표 테이블에서 학생별로 평균점수 출력하기
-- 단, 소수점 1자리까지만 출력
select 학생ID, round(avg(성적), 1) as 평균성적
from 성적표
group by 학생ID;

-- 과목별 최고 성적과 최저 성적을 출력해주세요.
select max(성적) 최고성적, min(성적) 최저성적, 과목
from 성적표
group by 과목;

-- 교육생 정보 테이블에서 각팀에 몇 명이 있는지 출력해주세요.
select count(학생ID) 인원, 팀
from 교육생정보
group by 팀;

-- 성적표 테이블에서 학생별 Python을 제외한 나머지 과목의 성적의 평균을 출력해주세요.
select avg(성적) 평균성적, 학생ID
from 성적표
where 과목 != 'PYTHON'
group by 학생ID;

-- 평균 성적이 75점 이하인 학생 ID, 평균 성적을 출력해주세요.
select 학생ID, round(avg(성적), 1) 평균성적
from 성적표
group by 학생ID
having avg(성적) <= 75;

-- 교육생정보 테이블에서 소속된 팀의 인원수가 3명 이상인 팀과 인원수를 출력해주세요.
select 팀, count(학생ID)
from 교육생정보
group by 팀
having count(학생ID) >= 3;

-- 성적표 테이블에서 학생별 평균성적을 출력하되 null이 아닌 값만 출력해주세요.
select round(avg(성적), 1) 평균성적, 학생ID
from 성적표
group by 학생ID
having avg(성적) is not null
order by 평균성적 desc;

-- 직원ID와 급여를 출력시키되 급여를 기준으로 오름차순 정렬해서 출력시켜주세요.
select employee_id, salary
from employees
order by salary;

-- 부서별 평균 급여를 출력시키되 내림차순으로 정렬해서 출력시켜주세요.
select department_id, round(avg(salary), 1) 평균급여
from employees
group by department_id
order by 평균급여 desc;

-- 전 직원의 직원ID, 급여, 부서명을 출력해주세요.
-- cross join
select e.employee_id, e.salary, d.department_name
from employees e, departments d -- 테이블에 별칭 지어주기
where e.department_id = d.department_id;

-- 마케팅 부서에서 몇 명이 근무하는지 출력해주세요.
select count(employee_id)
from employees
where department_id = 20;


-- 



