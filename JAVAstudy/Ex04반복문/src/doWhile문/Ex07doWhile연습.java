package doWhile문;

import java.util.Scanner;

public class Ex07doWhile연습 {

	public static void main(String[] args) {
		
		// 문제 5: 팩토리얼 계산기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int answer = 1;
		int i = 1;
		
		while (num >= i) {
			answer = i * answer;
			i++;
		}
		
		System.out.println(num + "! = " + answer);
	}

}
