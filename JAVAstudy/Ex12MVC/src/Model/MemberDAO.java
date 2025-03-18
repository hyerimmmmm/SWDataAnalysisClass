package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// DAO
	// -> Database Access Object: 데이터베이스에 접근하기 위한 객체
	
	// 여러 메소드에서 재사용하기 위해 전역 변수로 선
	Connection conn = null; // DB연결
	PreparedStatement psmt = null; // sql구문 세팅/실행
	ResultSet rs = null; // return 되는 테이블 형태 결과를 저장
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
			if (rs != null) {
				rs.close();
			}
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
	
	public ArrayList<MemberDTO> list() {
		ArrayList<MemberDTO> resultList = new ArrayList<>();
		
		getConn();
		
		// 샘플 쿼리 준비 -> 샘플 쿼리 장착 -> (?채우기) -> 실행메소드
		String sql = "select ID, NAME, AGE from DATADESIGNMEMBE";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			// ResultSet 형태의 결과물을
			// ArrayList<MemberDTO> 타입 데이터로 변환
			while(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				resultList.add(new MemberDTO(id, name, age));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return resultList;
	}
	
}
