package 코테;

import java.util.Scanner;

public class Ex09코테팩토리얼 {

	public static void main(String[] args) {
		
		// 9. 팩토리얼
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 수: ");
		int num = sc.nextInt();
		int num2 = 1; // 이전 
		
		for (int i = 2; i <= num; i++) {
			System.out.println("테스트i: " + i);
			num2 *= i;
			System.out.println("테스트num2: " + num2);
			System.out.println("===================");
		}
		
		System.out.println(num2);

	}

}
