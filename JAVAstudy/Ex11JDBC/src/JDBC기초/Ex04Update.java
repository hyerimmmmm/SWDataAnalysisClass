package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Update {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력: ");
		String id = sc.next();

		System.out.print("PW 입력: ");
		String password = sc.next();
		
		System.out.print("점수 입력: ");
		int score = sc.nextInt();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "12345";

			conn = DriverManager.getConnection(url, user, pw);

			String sql = "update DATADESIGNMEMBE set score = ? where ID = ? and PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, score);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("점수 변경에 성공했습니다");
			} else {
				System.out.println("점수 변경에 실패했습니다");
				System.out.println("아이디나 비밀번호를 다시 확인해주세요");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
