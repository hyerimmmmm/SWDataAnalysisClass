package 조건문연습;

import java.util.Scanner;

public class Ex04문제4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31일");
			break;
		case 4, 6, 9, 11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		default:
			System.out.println("1-12 사이의 숫자를 입력해 주세요.");
			break;
		}

	}
}
