package 조건문연습;

import java.util.Scanner;

public class Ex02문제2 {

	public static void main(String[] args) {
		
		// 사용자로부터 정수를 입력받고, 양수이면 "양수입니다."를, 음수이면 "음수입니다."를 출력하는 프로그램을 작성하세요.
		// (단, 0이면 "0입니다."를 출력하세요.)
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("양수입니다");
		} else {
			System.out.println("음수입니다");
		}

	}

}
