package 조건문연습;

import java.util.Scanner;

public class Ex01문제1 {

	public static void main(String[] args) {
		
		// 사용자로부터 나이를 입력받고, 19세 이상이면 "성인입니다."를 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age >= 19) {
			System.out.println("성인입니다");
		}

	}

}
