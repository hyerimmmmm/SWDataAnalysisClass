package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

public class JoinController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// join에서 보내준 데이터를 뽑아야 함
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		MemberVO member = new MemberVO(id, pw, tel, address);

		// dao 객체 생성
		MemberDAO dao = new MemberDAO();

		// dao의 join 기능 실행
		int res = dao.join(member);

		// join이 돌려주는 결과값에 따라서 마무리 로직 실행
		// -> 가입 성공했으면 이클립스 콘솔에 "가입 성공" 띄우기
		if (res > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			// rd.forward(request, response);
			return "/join_success.jsp";
		} else {
			return "/main.jsp";
		}

	}

}
