package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 브라우저에 출력하기 위해 인코딩 형식을 지정
		// 자바 내부에 출력할 때
		response.setCharacterEncoding("UTF-8");
		// 브라우저에 출력할 때
		response.setContentType("text/html; charset=UTF-8");
		
		// 받은 데이터를 웹페이지에 출력
		PrintWriter out = response.getWriter();
		
		String formId = request.getParameter("id");
	    System.out.println(formId);
	    out.print("<html>");
	    out.print("<head></head><body>");
	    out.print("<p>");	    
	    out.print(formId);	    
	    out.print("</p>");	    
	    out.print("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
