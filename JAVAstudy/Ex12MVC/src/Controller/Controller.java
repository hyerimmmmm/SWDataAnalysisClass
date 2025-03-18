package Controller;

import java.util.ArrayList;

import Model.MemberDAO;
import Model.MemberDTO;

public class Controller {
	
	// Controller
	
	// dao: db 연결과 쿼리문 실행 메소드
	MemberDAO dao = new MemberDAO();
	
	int result = 0; // join의 return 데이터
	ArrayList<MemberDTO> resultList = new ArrayList<>(); // list()의 return 데이터
	
	// view에게 전달받음 데이터를 Model에 전달하면서 기능을 수행하게끔 명령
	public int Con_join(String id, String password, String name, int age) {
		// 전달해야 하는 데이터를 하나의 묶음으로 만들어서 전달(객체 생성)
		MemberDTO dto = new MemberDTO(id, password, name, age);
		result = dao.join(dto);
		
		return result;
		
	}
	
	public ArrayList<MemberDTO> Con_list() {
		resultList = dao.list();
		
		return resultList;
	}
	
	public int Con_update(String id, String password, String name) {
		// Con_join 처럼 생성자 메소드로 데이터를 담아도 되지만
		// setter 메소드를 사용해서 정보를 채워보기
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPassword(password);
		dto.setName(name);
		
		result = dao.update(dto);
		
		return result;
	}
	
}
