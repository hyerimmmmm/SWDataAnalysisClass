package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TableServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		out.print("<table border=\"1px solid black\"><tr>");
		for(int i = 1; i <= num; i++) {
			out.print("<td>");
			out.print(i);
			out.print("</td>");
		}
		out.print("</tr></table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
