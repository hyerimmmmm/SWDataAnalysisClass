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

public class LoginController implements Controller {

		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberVO member = new MemberVO(id, pw);
			
			MemberDAO dao = new MemberDAO();
			
			MemberVO res = dao.login(member);
			
			if (res == null) {
				// 로그인 실패 -> login.html이동
				return "/main.jsp";
			} else {
				// 로그인 성공 시
				// 사용자의 정보를 담은 세션 생성
				HttpSession session = request.getSession();
				session.setAttribute("member", res);
				return "/main.jsp";
			}
		}

}
