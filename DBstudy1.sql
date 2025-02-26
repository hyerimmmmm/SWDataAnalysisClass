-- employees 테이블을 한글 버전으로 만들어보기
-- 테이블 생성
create table 직원정보 (
    -- 어떤 데이터를 넣을 것인지 작성, 열 생성
    직원번호 number(3, 0),
    이름 varchar(100),
    나이 number(3, 0),
    급여 number(10,0),
    부서번호 number(3, 0)
);