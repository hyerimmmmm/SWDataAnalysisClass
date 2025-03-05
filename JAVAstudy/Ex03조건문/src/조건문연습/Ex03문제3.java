package 조건문연습;

import java.util.Scanner;

public class Ex03문제3 {

	public static void main(String[] args) {
		
		// 사용자로부터 시험 점수(0~100)를 입력받고, 아래 기준에 따라 학점을 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else if (score < 60 ) {
			System.out.println("F");
		}
		
	}

}
