-- employees 테이블을 한글 버전으로 만들어보기
-- create ----------------------------------------------------------------------
-- 테이블 생성
create table 직원정보 (
    -- 어떤 데이터를 넣을 것인지 작성, 열 생성
    직원번호 number(3, 0) primary key, -- 중복되는 값 없이 고유한 값만 들어갈 수 있도록 제약
    이름 varchar(100),
    나이 number(3, 0),
    급여 number(10,0) not null, -- NUll 값이 들어갈 수 없도록 제약
    부서번호 number(3, 0)
);

-- drop ------------------------------------------------------------------------
drop table 직원정보;
drop table 부서정보;

-- 부서 테이블을 한글 버전으로 만들어보기 ------------------------------------------------
create table 부서정보 (
    부서번호 number(3, 0) primary key,
    부서이름 varchar2(100) not null,
    부서장번호 number(3,0),
    위치번호 number(3,0),
    -- 테이블 생성하면서 제약 조건 추가하기
    constraint 직원_부서_FK foreign key(부서장번호) references 직원정보(직원번호)
);

-- alter -----------------------------------------------------------------------
-- alter를 사용해 foreign key 넣기
-- 부서정보를 수정할 건데
-- 직원_부서_FK라는 이름을 가진 제약 조건을 추가할거야
-- 직원정보 테이블의 직원번호 열을 참고해서 부서장 번호에 FK를 걸거야
alter table 부서정보 add constraint 직원_부서_FK foreign key(부서장번호) references 직원정보(직원번호);

-- 부서정보 테이블에 있는 부서번호라는 열을 참조해서 직원정보 테이블에 있는 부서 번호에 FK를 걸어주세요.
alter table 직원정보 add constraint 부서_직원_FK foreign key(부서번호) references 부서정보(부서번호);

-- 테이블에 걸린 제약 조건 삭제 -------------------------------------------------------
alter table 부서정보 drop constraint 직원_부서_FK;
alter table 직원정보 drop constraint 부서_직원_FK;

-- check 실습 -------------------------------------------------------------------
alter table 직원정보 add constraint 직원_나이_CHECK check(나이 >= 20);


-- 실습 -------------------------------------------------------------------------
create table 네이버회원(
    ID varchar2(15),
    이름 varchar2(12) not null,
    비밀번호 varchar2(16),
    생년월일 date,
    성별 varchar2(3)
);

create table 네이버블로그 (
    블로그번호 number(3,0),
    블로그제목 varchar2(100) not null,
    블로그내용 varchar2(4000),
    ID varchar2(15)
);

alter table 네이버회원 add constraint 회원_ID_PK primary key(ID);
-- 방법1
alter table 네이버회원 add constraint 회원_성별_CK check(성별 = '여' or 성별 = '남');
-- 방법2
alter table 네이버회원 add constraint 회원_성별_CK check(성별) in ('여','남');
alter table 네이버블로그 add constraint 블로그_번호_PK primary key(블로그번호);
alter table 네이버블로그 add constraint 블로그_회원ID_FK foreign key(ID) references 네이버회원(ID);


-- 직원정보 테이블에 있는 정보(직원번호, 이름, 나이, 급여, 부서번호)
-- 데이터 삽입
insert into 직원정보
values (10, '승환', 20, 10000, 100);

insert into 직원정보
values (20, '미리', 20, 5000, 100);

insert into 직원정보
values (30, '주연', 20, 0, 100);

insert into 직원정보(직원번호, 이름, 급여)
values (40, '정훈', 0);

select *
from 직원정보;

-- 네이버 회원 테이블에 각자 정보를 추가해주세요.
insert into 네이버회원
values ('짜장냉면', '승환', '123', sysdate, '남');


-- 팀원 정보를 네이버회원 테이블에 추가해주세요.
insert into 네이버회원
values ('장기동', '희진', '123', '02/02/02', '여');

insert into 네이버회원
values ('규르주아', '규민', '123', '97/10/29', '남');

insert into 네이버회원
values ('불주먹', '정훈', '123', '99/04/22', '남');

insert into 네이버회원
values ('조기밍', '혜림', '123', '97/10/21', '여');

-- 네이버회원 테이블을 수정해주세요.
update 네이버회원
set 이름 = '엽떡불닭'
where id = '짜장냉면';

update 네이버회원
set 이름 = '불닭', 비밀번호 = 1234
where id = '짜장냉면';

-- 데이터를 삭제해보기
delete from 네이버회원;

delete from 네이버회원
where id = '짜장냉면';

-- TCL
-- commit 실습
commit;

insert into 네이버회원
values('규민', '짬뽕', '123', sysdate, '남');

-- DCL
create user dcltest
identified by 123;




