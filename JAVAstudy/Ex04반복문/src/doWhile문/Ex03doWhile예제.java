package doWhile문;

import java.util.Scanner;

public class Ex03doWhile예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 1;

		do {
			String id = "test";
			String pw = "test1234";

			System.out.print("아이디를 입력하세요: ");
			String userId = sc.next();
			System.out.print("비밀번호를 입력하세요: ");
			String userPw = sc.next();

			if (id.equals(userId) && pw.equals(userPw)) {
				System.out.println("로그인 성공!");
				break;
			} else {
				if (count != 3) {
					System.out.println("로그인 실패!");
					count++;
				} else if (count == 3) {
					System.out.println("3회 이상 실패했습니다.");
					break;
				}
			}
		} while (true);

	}

}
