package doWhile문;

import java.util.Scanner;

public class Ex01doWhile기초 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int goal = sc.nextInt(); //목표
		int now = sc.nextInt(); //현재
		
		do {
			int kg = sc.nextInt(); // 이번주 감량 몸무게
			now -= kg;
			
			System.out.println("");
		} while(goal <= now);
		
		System.out.println("종료");
		
		// 무한 반복문: while의 조건을 무조건 참이 되도록 하는 것
		// while의 조건을 무조 true로 설정
		// 멈추고 싶으면 내부에 조건을 걸어서 조건에 해당 될 때 break를 사용
		int a = 0;
		while(true) {
			a++;
			if(a == 10) {
				break;
			}
		}
		
	}

}
