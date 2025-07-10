package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	// 클라이언트가 POST 방식으로 요청했을 때 실행될 메소
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 방식은 패킷의 body 영역에 데이터를 담아서 전송해주는 형식
		// -> 가져온 데이터를 다시 인코딩 해줘야 함
		// -> URL이 기본적으로 UTF-8이기 때문에 GET은 인코딩 해주지 않아도 됨
		request.setCharacterEncoding("UTF-8");
		
		// 브라우저에 출력할 데이터의 인코딩 작업
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("id");
		
		PrintWriter out = response.getWriter();
		
		out.print(id + "님 환영합니다!");
	}

}
