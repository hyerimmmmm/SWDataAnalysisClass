package 메소드기초;

import java.util.Scanner;

public class Ex03메소드실습_절댓값 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인: " + result);

	}
	
	public static int getAbsoluteValue(int a, int b) {
		int result = 0;
		
		if (a - b < 0) {
			result = (a - b) * -1;
		} else {
			result = a - b;
		}
		
		return result;
	}

}
