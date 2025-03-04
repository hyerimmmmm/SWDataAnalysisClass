package 단순if문;

import java.util.Scanner;

public class Ex02단순if예제 {

	public static void main(String[] args) {
		
		// int 타입의 변수 num을 선언하고 키보드로 값을 받으세요.
		// 만약 num이 3의 배수이자 5의 배수라면 “3과 5의 배수입니다” 라고 출력하는 프로그램을 만들어 보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");
		}

	}

}
