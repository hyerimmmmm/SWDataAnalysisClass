package while문;

import java.util.Scanner;

public class Ex01while문기초 {

	public static void main(String[] args) {
		
		// 사용자가 입력한 값이 10 미만라면 계속 입력받기
		// -> 사용자가 10 이상을 입력하면 종료
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while(input < 10) {
			input = sc.nextInt();
		}

	}

}
