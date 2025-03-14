package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05SelectAll {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		System.out.println("========= 회원 정보 =========");
		System.out.println("ID\t이름\t나이\t점수");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "12345";

			conn = DriverManager.getConnection(url, user, pw);

			String sql = "select * from DATADESIGNMEMBE";

			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ID") + "\t" + rs.getString("NAME") + "\t" + rs.getInt("age") + "\t" + rs.getInt("score"));
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
