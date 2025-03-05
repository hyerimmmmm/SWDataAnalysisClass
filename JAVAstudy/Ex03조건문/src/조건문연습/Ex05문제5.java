package 조건문연습;

import java.util.Scanner;

public class Ex05문제5 {

	public static void main(String[] args) {
		
		// 사용자로부터 나이를 입력받고, 13세 이상 19세 이하이면 **"청소년입니다."**를 출력하는 프로그램을 작성하세요.
		// (그 외의 경우 "청소년이 아닙니다." 출력)
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age >= 13 && age <= 19) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("청소년이 아닙니다.");
		}

	}

}
