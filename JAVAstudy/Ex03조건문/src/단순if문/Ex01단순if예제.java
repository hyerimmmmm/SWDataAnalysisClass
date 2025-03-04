package 단순if문;

import java.util.Scanner;

public class Ex01단순if예제 {

	public static void main(String[] args) {
		
		// 단순 if 문
		// 성인판결
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("성인입니다.");
		}

	}

}
