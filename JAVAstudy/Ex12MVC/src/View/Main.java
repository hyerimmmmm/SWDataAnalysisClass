package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Model.MemberDTO;

public class Main {

	public static void main(String[] args) {

		// View
		// : 사용자한테 보여주는 내용
		Scanner sc = new Scanner(System.in);
		// 컨트롤러 객체
		Controller control = new Controller();

		while (true) {
			System.out.println("메뉴 선택\t[1]회원가입\t[2]전체회원조회\t[3]회원정보수정\t[4]회원탈퇴\t[5]종료");
			System.out.print(">> ");
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
			} else if (input == 2) {
				System.out.println("=============== 전체회원조회 ===============");
				System.out.println("id\t이름\t나이\t");

				ArrayList<MemberDTO> result = control.Con_list();
				for (int i = 0; i < result.size(); i++) {
					// result = MemberDTO 객체 하나하나를 데이터로 가지고 있는 ArrayList 배열
					// get(i) = result에서 i번째에 있는 MemberDTO 형태의 객체를 가져와라
					// getId = MemberDTO 객체 안에 있는 데이터들을 private로 막았기 때문에 getter 메소드로 가져오
					System.out.print(result.get(i).getId() + "\t");
					System.out.print(result.get(i).getName() + "\t");
					System.out.println(result.get(i).getAge());
				}
			} else if (input == 3) {
				System.out.println("=============== 회원정보수정 ===============");
				System.out.print("ID를 입력해주세요. >> ");
				String id = sc.next();
				System.out.print("Password를 입력해주세요. >> ");
				String password = sc.next();
				System.out.print("변경할 이름을 입력해주세요. >> ");
				String name = sc.next();

				int result = control.Con_update(id, password, name);

				if (result > 0) {
					System.out.println("정보 수정 성공");
				} else {
					System.out.println("정보 수정 실패");
				}
			} else if (input == 4) {
				System.out.println("=============== 회원탈퇴 ===============");
				System.out.print("ID를 입력해주세요. >> ");
				String id = sc.next();
				System.out.print("Password를 입력해주세요. >> ");
				String password = sc.next();

				int result = control.Con_delete(id, password);

				if (result > 0) {
					System.out.println("회원 탈퇴 성공");
				} else {
					System.out.println("회원 탈퇴 실패");
				}
			}
			if (input == 5) {
				break;
			}
		}

		System.out.println("회원관리 프로그램이 종료되었습니다.");

	}

}
