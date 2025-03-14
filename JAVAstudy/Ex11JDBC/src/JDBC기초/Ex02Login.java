package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Login {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		// 1. 사용자로부터 아이디와 비밀번호를 입력받기
		System.out.print("ID 입력: ");
		String id = sc.next();

		System.out.print("비밀번호 입력: ");
		String password = sc.next();

		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB 연결 통로(url, user, password)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "12345";

			//
			conn = DriverManager.getConnection(url, user, pw);

			if (conn != null) {
				System.out.println("연결성공");
			}

			// sql문 준비
			// 로그인 >> 테이블에 데이터가 존재하는지 확인 >> select 사용
			// 아이디, 비밀번호가 일치하는 데이터의 모든 컬럼 가져오기
			String sql = "select * from DATADESIGNMEMBE where ID = ? and PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			// spl문 실행
			// ResultSet이란?
			// : 조회된 데이터 결과를 이블과 같은 형태로 표현해주는 집합 자료구조
			// : cursor를 가지고 있는데, 첨음에는 컬럼명을 가리키고 있음
			// : cursor가 가리키고 있는 데이터만 가져올 수 있음
			rs = psmt.executeQuery();

			// rs.next(); : 커서를 한 행 밑으로 내리는 작업, boolean 타입 반환
			if (rs.next() == true) { // true를 반환한다는 것은 로그인에 성공했다는 뜻
				// DB에 있는 데이터 변수에 담아서 출력
				String userName = rs.getString("name");
				System.out.println(userName + "님 환영합니다");
			} else {
				System.out.println("로그인이 실패했습니다");
				System.out.println("아이디나 비밀번호를 다시 확인해주세요");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}
		}

	}

}
