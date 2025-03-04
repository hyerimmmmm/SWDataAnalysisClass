package ifelse문;

import java.util.Scanner;

public class Ex02에버랜드입장료프로그램 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("인원수를 입력하세요: ");
		int count = sc.nextInt();
		
		int price = 5000;
		
		if(age < 20) {
			System.out.println("총 " + (count * (price / 100 * 50)) + "원 입니다.");
		} else {
			System.out.println("총 " + (count * price) + "원 입니다.");
		}
		
	}
}
