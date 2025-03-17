package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;

		Scanner sc = new Scanner(System.in);
		// 사용자 입출력 구간
		System.out.print("아이디를 입력해주세요. >> ");
		String id = sc.next();

		System.out.print("비밀번호를 입력해주세요. >> ");
		String password = sc.next();

		System.out.print("이름을 입력해주세요. >> ");
		String name = sc.next();

		System.out.print("나이를 입력해주세요. >> ");
		int age = sc.nextInt();

		System.out.print("점수를 입력해주세요. >> ");
		int score = sc.nextInt();

		try {
			// 1. 드라이버 로딩
			// try 구문
			// -> 예외가 발생할 수도 있지만 우선 시도해보는 구간
			// --> 프로젝트 수행시 반드시 jar 파일 넣어주기
			// jar 파일이란: 클래스 파일들을 여러개 모아놓은 압축파일
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결(일종의 로그인)
			// 준비물 3가지
			// 1) 연결 경로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// -> JDBC 드라이버가 thin 타입
			// --> @localhost = ip주소(127.0.0.1)
			// ---> 1521 = port 번호
			// ----> xe = DB 기본이름
			// 2) 계정 이름
			String user = "hr";
			// 3) 계정 비밀번호
			String pw = "12345";

			conn = DriverManager.getConnection(url, user, pw);
			// Connection 이란?
			// : 데이터베이스에 접속하기 위한 모든 메소드를 가진 인터페이스
			// --> 데이터베이스와 하는 모든 통신은 Connection을 통해서만 이루어짐
			// Connection = MetaData = 거대한 데이터를 가지고 있다
			// --> 사용가능한 테이블 목록, 컬럼들에 대한 정보 등
			// 연결된 데이터베이스에 정보들을 전부 가지고 있음

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 3. Query문(SQL구문) 전송
			// 3-1) Query문 작성
			// ?인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// : 지정한 데이터 공간만큼 비워놓고 실행전까지 대기
			String sql = "insert into DATADESIGNMEMBE values (?, ?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			// ?인자 채우는 작업
			// = 데이터 바인딩 작업
			psmt.setString(1, id);
			psmt.setString(2, password);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);

			// 4. SQL문 실행
			// executeUpdate: insert, update, delete 에만 사용
			int row = psmt.executeUpdate(); // 추가된 행의 개수, 업데이트된 행의 개수, 삭제된 행의 개수를 반환

			// 5. 결과를 이용한 작업 처리
			if (row > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}

		} catch (Exception e) {
			// } catch (ClassNotFoundException | SQLException e) {
			// 모든 예외 클래스는 Exception을 상속 받기 때문에
			// Excpetion e = new ClassNotFoundException();
			// 으로 처리한 업캐스팅
			// catch 구문
			// -> 예외가 발생했을 때 어떤 로직을 수행할 지 작성하는 구간
			e.printStackTrace(); // 예외 상황이 왜 발생했고 어디서 문제가 나고 있는지 출력해주는 구문(개발할 때만 사용하기, 배포할 때는 삭제)
		} finally {
			// 위에서 예외상황이 발생하더라도 반드시 한 번은 들어오는 구간
			// 6. DB 연결 종료(자원 반납)
			// 사용한 순서의 역순으로 반납
			try {
				if (psmt != null) {
					psmt.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
