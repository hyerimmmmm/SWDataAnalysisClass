DROP TABLE 게시판;

CREATE TABLE 게시판 ( 
게시판번호 NUMBER(9) PRIMARY KEY , 
작성자       VARCHAR2(50) NOT NULL , 
게시물내용 VARCHAR2(4000) NOT NULL  , 
작성일시 DATE   NOT NULL 
) ;


-- 게시판 데이터 입력 >> 10만건 데이터 한번에 넣기
INSERT INTO 게시판
SELECT LEVEL                                -- 게시판번호
        , 'ID' || MOD(LEVEL , 10000)     -- 작성자 
        , 'ID' || 
           MOD(LEVEL , 10000) || 
           '님이 작성한 게시물입니다. 게시판 번호가 ' 
           || LEVEL 
           || '입니다'                       -- 게시물내용 
      , TO_DATE('20000101') + LEVEL         --2000년 1월1일부터 하루씩 게시물이 입력되는 것
  FROM DUAL
CONNECT BY LEVEL <=100000;                 --10만건의 데이터 입력 

COMMIT;



-- 뷰 view
-- 부서별 최고급여를 받는 직원들의 정보를 출력해주세요
create view 최고급여직원정보 as
select *
from employees
where (salary, department_id) in (select max(salary), department_id
                    from employees
                    group by department_id);
                    
-- 최고 급여를 받는 직원의 번호를 구해주세요.
select phone_number
from 최고급여직원정보;

-- 최고 급여를 받는 직원의 직무를 구해주세요.
select job_id
from 최고급여직원정보;

-- 최고 급여를 받는 직원의 커미션비율을 구해주세요.
select commission_pct
from 최고급여직원정보;

-- 최고 급여를 받는 직원의 직원ID, 이름, 급여, 부서명를 출력해주세요.
-- 단, employees 테이블과 departments 테이블을 이용해서 view를 만든 뒤 view에서 출력해주세요.
create view 직원부서통합 as
select e.employee_id, e.first_name, e.salary, d.department_name, d.department_id, d.location_id
from employees e, departments d
where e.department_id = d.department_id;

select max(salary)
from 직원부서통합;

-- 전 직원의 직원ID, 이름, 급여, 부서명, 도시를 출력해주세요.
select employee_id, first_name, department_name, city
from 직원부서통합 e, locations l
where e.location_id = l.location_id;

drop view 직원부서통합;

-- rownum
select first_name, salary
from employees
where rownum <= 5;


-- top-n
create view 급여순서 as
select first_name, salary
from employees
where salary is not null
order by salary desc;

select *
from 급여순서
where rownum <= 5;

-- 인라인 뷰 만들기
select *
from (select first_name, salary
        from employees
        where salary is not null
        order by salary desc)
where rownum <= 5;

-- 직원 중 연봉이 가장 낮은 하위 3명의 이름과 급여를 출력해주세요.
-- 단, null은 제외
select first_name, salary
from (select first_name, salary
        from employees
        where salary is not null
        order by salary)
where rownum <= 3;

-- 직원 중 가장 최근에 입사한 직원의 이름과 입사일을 출력해주세요.
select first_name, hire_date
from (select first_name, hire_date
        from employees
        order by hire_date desc)
where rownum = 1;


-- 게시판 페이징
-- 게시판 번호를 기준으로 20개의 게시물의 모든 데이터를 출력해주세요
create view 게시판정렬 as
select *
from 게시판
order by 게시판번호;
        
select *
from 게시판정렬
where rownum <= 20;

-- 게시판 번호를 기준으로 21번째 게시물부터 40번째의 게시글 모든 데이터를 출력해주세요
-- 방법1
select *
from  게시판정렬
where rownum <= 40 and 게시판번호 between 21 and 40;

-- 방법2: rownum을 컬럼으로 출력해 사용
create view new게시판 as
select rownum rn, 게시판.* 
from (select *
        from 게시판
        order by 게시판번호) 게시판
where rownum <= 40;

select *
from new게시판
where rn >= 21;


create view 게시판번호 as
select *
from (select *
        from 게시판
        order by 게시판번호)
where 게시판번호 between 1 and 40;

select *
from 게시판번호;


-- 시퀀스
create sequence 학생_시퀀스 -- 시퀀스 이름
increment by 1 -- 증가값
start with 1 -- 시작값
maxvalue 100; -- 최대값


create table 학생정보(
    학생번호 number(3,0),
    name varchar2(100),
    age number(3,0),
    grade varchar2(10)
);

insert into 학생정보
values(학생_시퀀스.nextval, '승환', 20, 'A');

insert into 학생정보
values(학생_시퀀스.nextval, '재영', 20, 'A');

select *
from 학생정보;








