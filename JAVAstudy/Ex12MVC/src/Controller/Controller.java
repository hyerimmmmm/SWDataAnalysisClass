package Controller;

import Model.MemberDAO;
import Model.MemberDTO;

public class Controller {
	
	// Controller
	
	// dao: db 연결과 쿼리문 실행 메소드
	MemberDAO dao = new MemberDAO();
	
	int result = 0;
	
	// view에게 전달받음 데이터를 Model에 전달하면서 기능을 수행하게끔 명령
	public int Con_join(String id, String password, String name, int age) {
		// 전달해야 하는 데이터를 하나의 묶음으로 만들어서 전달(객체 생성)
		MemberDTO dto = new MemberDTO(id, password, name, age);
		result = dao.join(dto);
		
		return result;
		
	}
	
}
