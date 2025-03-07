package 코테;

import java.util.Scanner;

public class Ex08코테 {
	public static void main(String[] args) {
		
		// 7. 거스름
		Scanner sc = new Scanner(System.in);
		System.out.print("거스름 입력: ");
		int money = sc.nextInt();
		
		int aOne; // 10000원 개수
		int bOne; // 5000원 개수
		int cOne; // 1000원 개수
		int dOne; // 500원 개수
		int eOne; // 100원 개수
		
		aOne = money / 10000;
		bOne = (money % 10000) / 5000;
		cOne = ((money % 10000) % 5000) / 1000;
		dOne = (((money % 10000) % 5000) % 1000) / 500;
		eOne = ((((money % 10000) % 5000) % 1000) % 500) / 100;
		
		System.out.println("10000원: " + aOne);
		System.out.println("5000원: " + bOne);
		System.out.println("1000원: " + cOne);
		System.out.println("500원: " + dOne);
		System.out.println("100원: " + eOne);
		
	}
}
