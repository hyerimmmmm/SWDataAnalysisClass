package doWhile문;

import java.util.Scanner;

public class Ex05doWhile연습 {

	public static void main(String[] args) {
		
		// 문제 3: 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 구구단의 단을 입력하세요: ");
		int num = sc.nextInt();
		int i = 1;

		do {
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
		} while(i < 10);

	}

}
