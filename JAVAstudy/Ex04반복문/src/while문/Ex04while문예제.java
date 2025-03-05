package while문;

import java.util.Scanner;

public class Ex04while문예제 {
	public static void main(String[] args) {
		
		// 다이어트 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게: ");
		int currentWeight = sc.nextInt();
		
		System.out.print("목표 몸무게: ");
		int goalWeight = sc.nextInt();
		
		int ing = 0;
		int week = 1;
		
		while(currentWeight >= goalWeight) {
			System.out.print(week++ + "주차 감량 몸무게: ");
			ing = sc.nextInt();
			currentWeight-=ing;
		}
		System.out.println("현재 몸무게 " + currentWeight + "! 축하합니다!");
	}
}
