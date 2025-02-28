-- 회원 테이블
CREATE TABLE members (
    member_id INT PRIMARY KEY,
    name VARCHAR(100),
    birth_date DATE,
    join_date DATE
);

-- 도서 테이블
CREATE TABLE books (
    book_id INT PRIMARY KEY,
    title VARCHAR(200),
    author VARCHAR(100),
    genre VARCHAR(50),
    published_year INT
);

-- 대출 기록 테이블
CREATE TABLE borrow_records (
    record_id INT PRIMARY KEY,
    member_id INT,
    book_id INT,
    borrow_date DATE,
    return_date DATE,
    FOREIGN KEY (member_id) REFERENCES members(member_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);

drop table members;

-- 샘플 데이터 삽입
-- 회원 테이블 데이터 삽입 (각 행 개별 실행)
INSERT INTO members (member_id, name, birth_date, join_date) 
VALUES (1, 'Alice', TO_DATE('1995-06-12', 'YYYY-MM-DD'), TO_DATE('2023-01-15', 'YYYY-MM-DD'));

INSERT INTO members (member_id, name, birth_date, join_date) 
VALUES (2, 'Bob', TO_DATE('1988-09-25', 'YYYY-MM-DD'), TO_DATE('2022-11-10', 'YYYY-MM-DD'));

INSERT INTO members (member_id, name, birth_date, join_date) 
VALUES (3, 'Charlie', TO_DATE('2000-03-05', 'YYYY-MM-DD'), TO_DATE('2023-05-20', 'YYYY-MM-DD'));

-- 도서 테이블 데이터 삽입
INSERT INTO books (book_id, title, author, genre, published_year) 
VALUES (101, 'To Kill a Mockingbird', 'Harper Lee', 'Fiction', 1960);

INSERT INTO books (book_id, title, author, genre, published_year) 
VALUES (102, '1984', 'George Orwell', 'Dystopian', 1949);

INSERT INTO books (book_id, title, author, genre, published_year) 
VALUES (103, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Classic', 1925);

INSERT INTO books (book_id, title, author, genre, published_year) 
VALUES (104, 'The Catcher in the Rye', 'J.D. Salinger', 'Classic', 1951);

INSERT INTO books (book_id, title, author, genre, published_year) 
VALUES (105, 'Moby-Dick', 'Herman Melville', 'Adventure', 1851);

-- 대출 기록 테이블 데이터 삽입
INSERT INTO borrow_records (record_id, member_id, book_id, borrow_date, return_date) 
VALUES (1, 1, 101, TO_DATE('2024-02-10', 'YYYY-MM-DD'), TO_DATE('2024-02-20', 'YYYY-MM-DD'));

INSERT INTO borrow_records (record_id, member_id, book_id, borrow_date, return_date) 
VALUES (2, 2, 102, TO_DATE('2024-02-15', 'YYYY-MM-DD'), NULL);

INSERT INTO borrow_records (record_id, member_id, book_id, borrow_date, return_date) 
VALUES (3, 3, 103, TO_DATE('2024-02-18', 'YYYY-MM-DD'), TO_DATE('2024-02-25', 'YYYY-MM-DD'));

INSERT INTO borrow_records (record_id, member_id, book_id, borrow_date, return_date) 
VALUES (4, 1, 104, TO_DATE('2024-02-22', 'YYYY-MM-DD'), NULL);




-- 문제1. 직원과 부서 정보 조회
-- 모든 직원의 **이름(name), 급여(salary), 부서명(department_name)**을 조회하는 SQL문을 작성하시오.
select e.first_name, e.salary, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

-- 문제 2. 부서별 평균 급여 조회
-- 각 부서(department_name)의 **평균 급여(average_salary)**를 계산하여 출력하는 SQL문을 작성하시오.
select round(avg(salary), 0)
from employees e
group by department_id;

-- 문제 3. 최고 급여 직원 조회 (서브쿼리 활용)
-- 급여가 가장 높은 직원의 **이름(name), 급여(salary), 부서명(department_name)**을 조회하는 SQL문을 작성하시오.
-- 1. 급여가 가장 높은 직원의 급여 찾기
select max(salary)
from employees;
-- 2. 급여가 가장 높은 직원의 직원ID 찾기
select employee_id
from employees
where salary = (select max(salary)
                from employees);
-- 3. 최종
select e.first_name, e.salary, d.department_id
from employees e, departments d
where e.department_id = d.department_id and e.employee_id = (select employee_id
                                                                from employees
                                                                where salary = (select max(salary)
                                                                                from employees));
                                                                                
                                                                                
---------------------------------------------------------------------------------------------------
-- 문제 1: 대출 내역 조회
-- 현재까지 **대출된 모든 도서의 제목(title), 회원 이름(name), 대출일(borrow_date)**을 조회하는 SQL문을 작성하시오.
select book.title, m.name, b.borrow_date
from books book, members m, borrow_records b
where book.book_id = b.book_id and m.member_id = b.member_id;

-- 문제 2: 특정 회원이 대출한 도서 조회
-- 회원 이름이 **"Alice"**인 사람이 빌린 책의 **제목(title), 대출일(borrow_date), 반납 여부(returned: 'Yes' 또는 'No')**를 조회하는 SQL문을 작성하시오.
-- 1. 이름이 앨리스인 회원의 회원ID 찾기
select m.member_id
from members m
where m.name = 'Alice';
-- 2. 최종
select book.title, b.borrow_date, b.returned;


-- 문제 3: 가장 많이 대출된 책 조회
-- 가장 많이 대출된 책의 **제목(title), 저자(author), 대출 횟수(borrow_count)**를 조회하는 SQL문을 작성하시오.
-- 1. 가장 많이 대출된 책 찾기
select count(borrow_date)
from borrow_records;

select book.title, book.author, count(b.borrow_date) as "borrow_count"
from books book, borrow_records b
where book.book_id = b.book_id and count(b.borrow_date) = (select count(borrow_date)
                                                            from borrow_records);


-- 문제 4: 반납되지 않은 도서 조회
-- 아직 반납되지 않은 책들의 **제목(title), 대출한 회원의 이름(name), 대출일(borrow_date)**을 조회하는 SQL문을 작성하시오.


-- 문제 5: 연도별 출판된 책 개수 조회
-- 각 연도별 출판된 책의 **출판 연도(published_year), 책 개수(book_count)**를 출력하는 SQL문을 작성하시오.

-- 보류 --------------------------------------------
-- 1. 각  부서 평균 월급 찾기
select salary
from emp
where 2800 < (select avg(salary)
                from emp
                group by dept
                order by dept asc);
                
                
                
select round(avg(salary), 0)
from EMployees
group by department_id
order by department_id asc;



select department_id, sum(salary) 합계, round(avg(salary), 0) 평균, count(*) 인원수
from employees
group by department_id
having avg(salary) > 2800
order by department_id asc;


select department_id, sum(salary) 합계, round(avg(salary), 0) 평균, count(*) 인원수
from employees
where salary > 2800
group by department_id
order by department_id asc;


select job_id, avg(salary) as 평균연봉
from employees
group by job_id
having avg(salary) > 13000;




select department_id, sum(salary) 합계, avg(salary) 평균, count(*) 인원수
from employees
where 2800 > (select round(avg(salary), 0)
                from EMployees
                group by department_id
                order by department_id asc);

------------------------------------------------------------



-- 부서별 최ㅗ 연봉 u찾기
select e.first_name, salary, d.department_name
from employees e, departments d
where e.department_id = d.department_id
group by department_id;

create view 직원_부서 as
select e.first_name, e.salary, d.department_name, d.department_id
from employees e, departments d
where e.department_id = d.department_id;

select first_name, salary, department_name
from 직원_부서
where (department_id, salary) in (select department_id, max(salary)
                                    from 직원_부서
                                    group by department_id);





drop view 직원_부서;


select employee_id, email, salary, department_name, location_id
from employees e, departments d
where e.department_id = d.department_id and salary > 14000;


create table tb_student(
    student_id number not null,
    student_name varchar2(50) not null,
    age number,
    major_id varchar2(8)
);

create table tb_major(
    major_id varchar2(50) not null,
    major_name varchar2(100) not null,
    inst_dy varchar2(8) not null
);

alter table tb_student add constraint PK_STUDENT primary key(student_id);
alter table tb_major add constraint PK_MAJOR primary key(major_id);

insert into tb_major values('M0001', '정보공학과', '19960201');
insert into tb_major values('M0002', '경영학과', '20000302');


insert into tb_student values(1000, '김철수', 20, 'M0001');
insert into tb_student values(2000, '홍길동', 21, 'M0002');


update tb_major
set major_name = '인공지능융합과'
where major_name = '정보공학과';

delete from tb_student
where student_id = 1000;

-----------------------------------------
SELECT DEPartment_id, SUM(SALARY) 합계, AVG(SALARY) 평균, COUNT(*) 인원수
FROM EMPloyees
WHERE SALARY > 7000
GROUP BY DEPartment_id
ORDER BY DEPartment_id ASC;

select round(avg(salary), 0)
from EMployees
group by department_id
order by department_id asc;


SELECT DEPartment_id, SUM(SALARY) 합계, AVG(SALARY) 평균, COUNT(*) 인원수
FROM EMPloyees
GROUP BY DEPartment_id
having avg(salary) > 7000
ORDER BY DEPartment_id ASC;





select dept, sum(salary) 합계, round(avg(salary), 0) 평균, count(*) 인원수
from emp
group by dept
having avg(salary) > 2800
order by dept asc;














