package com.smhrd.web.entity;

import java.util.ArrayList;

public class Temp {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		
		// for-each가 동작하는 원리: Iterator 객체가 돌아
		// 1. Iterator가 list의 크기를 고정(5)
		// 2. list.remove()
		//    --> list 안에 있는 데이터를 삭제하고, 크기를 줄이는 객체(A)가 동작
		// 3. A - Iterator 충돌 --> ConcurrentException
		//    --> Java는 멀티스레드 기반의 언어이기 때문
		//    --> 한번에 여러개 일을 할 수 있는 언어이기 때문
		// 해결 방법
		// --> 순수 for문 사용
		// --> 아예 다른 자료형 사용
		// --> 신규 자료구조 중 Concurrent~~~ 자료구조 사용
		
		for(String s : list) {
			System.out.println(s);
			list.remove(0);
		}
		
	}

}
