package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	// 실행 메소드
	public String execute(HttpServletRequest request, HttpServletResponse response);
}
