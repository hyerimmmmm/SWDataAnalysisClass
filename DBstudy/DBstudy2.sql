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




