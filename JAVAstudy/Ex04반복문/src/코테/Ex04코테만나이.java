package 코테;

import java.util.Scanner;

public class Ex04코테만나이 {

	public static void main(String[] args) {
		
		// 4. 만나이 구하기
		// 사용자가 년, 월, 일에 해당하는 숫자를 입력하면
		// 2000년 3월 5일생의 만 나이를 출력하기
		// => 2000, 3, 5  --- 만 25세
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int age = year - 2000;
		
		// 월 초과 알아보기
		if (month < 3) {
			if (day < 5) {
				age = year - 1;
			}
		}
		System.out.println(age);
	}

}
