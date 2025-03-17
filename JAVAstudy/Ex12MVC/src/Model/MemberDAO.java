package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

	// DAO
	// -> Database Access Object: 데이터베이스에 접근하기 위한 객체
	Connection conn = null;
	PreparedStatement psmt = null;
	int result = 0; // 결과를 저장하는 변수
	
	// DB에 접속하기 위한 메소드
	public void getConn() {
		try {
			// getConn
			// -> 드라이버 로딩, url/user/pw로 db 접속
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// db 연결에 필요한 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "12345";
			
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 객체를 반납할 수 있는 메소드
	public void close() {
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원가입 쿼리 메소드
	public int join(MemberDTO dto) {
		// DB 접근
		getConn();
		
		// DB 쿼리문 실행
		String sql = "insert into DATADESIGNMEMBE values(?, ?, ?, ?, 0)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPassword());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			result = psmt.executeUpdate(); // 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // 반납
		}
		
		return result;
	}
	
}
