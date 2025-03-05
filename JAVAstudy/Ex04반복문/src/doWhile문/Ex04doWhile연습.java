package doWhile문;

import java.util.Scanner;

public class Ex04doWhile연습 {

	public static void main(String[] args) {

		// 문제 2: 비밀번호 확인 프로그램
		Scanner sc = new Scanner(System.in);

		String pw = "java123";

		do {
			System.out.print("비밀번호를 입력해주세요: ");
			String userPw = sc.next();

			if (pw.equals(userPw)) {
				System.out.println("비밀번호가 확인되었습니다.");
				break;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} while (true);

	}

}
