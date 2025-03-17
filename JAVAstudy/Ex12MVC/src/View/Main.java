package View;

import java.util.Scanner;

import Controller.Controller;

public class Main {

	public static void main(String[] args) {
		
		// View
		// : 사용자한테 보여주는 내용
		Scanner sc = new Scanner(System.in);
		// 컨트롤러 객체
		Controller control = new Controller();
		
		System.out.print("메뉴 선택 [1]회원가입 ");
		int input = sc.nextInt();
		
		if (input == 1) {
			System.out.println("===== 회원가입 =====");
			
			System.out.print("ID를 입력해주세요. >> ");
			String id = sc.next();
			System.out.print("Password를 입력해주세요. >> ");
			String password = sc.next();
			System.out.print("이름을 입력해주세요. >> ");
			String name = sc.next();
			System.out.print("나이를 입력해주세요. >> ");
			int age = sc.nextInt();
			
			// controller에 필요한 정보를 담아서
			// model이 로직을 수행하게끔 하기
			// controller의 con_join은 view에서 입력받은 정보를 받아서 model에 전달
			int result = control.Con_join(id, password, name, age);
			
			// return 된 result의 값으로 성공 여부를 확인
			if (result > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
		}

	}

}
