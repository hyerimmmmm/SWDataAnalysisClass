package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberVO;

public class UpdateController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberVO sessionMember = (MemberVO) session.getAttribute("member");

		String id = sessionMember.getId();System.out.println(id);
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		MemberVO member = new MemberVO(id, pw, tel, address);

		MemberDAO dao = new MemberDAO();
		int result = dao.update(member);

		if(result<0){
			// execute에서 페이지를 이동시키는게 아니라 이동하고 싶은 페이지의 주소를
			// String 형태로 return 하고 FrontController에서 페이지를 이동
			return "/main.jsp";
		} else {
			session.setAttribute("member", member);
			return "/update.jsp";
		}
	}

}
