package for문;

import java.util.Scanner;

public class Ex02for문예제 {

	public static void main(String[] args) {
		
		// 구구단 2단 출력
//		for (int i = 1; i < 10; i++) {
//			System.out.println("2 * " + i + " = " + (2 * i));
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요 >> ");
		int num = sc.nextInt();
		System.out.print("어느 수까지 출력할 입력해주세요 >> ");
		int count = sc.nextInt(); 
		
		for (int i = 1; i <= count; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
