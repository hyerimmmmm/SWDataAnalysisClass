package 단항이항연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		
		// 1. 두 개의 정수를 입력받아 두 수의 더하기 곱하기 빼기 곱하기 나누기 결과값 출력하기
		// 단, 나누기 결과값은 아래와 같이 실수로 표현하자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("더한 결과 값: " + (num1 + num2));
		System.out.println("뺀 결과 값: " + (num1 - num2));
		System.out.println("곱한 결과 값: " + (num1 * num2));
		System.out.println("나눈 결과 값: " + ((double)num1 / (double)num2));
	}

}
