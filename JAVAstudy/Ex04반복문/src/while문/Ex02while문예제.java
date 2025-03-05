package while문;

import java.util.Scanner;

public class Ex02while문예제 {
	public static void main(String[] args) {
		
		// 키보드로부터 입력받은 수를 누적시키는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		int output = 0;
		int num = 0;
		
		while(output != -1) {
			System.out.print("정수입력: ");
			output = sc.nextInt();
			System.out.println("누적결과: " + (num+=output));	
		}
		System.out.println("종료되었습니다");
		
	}
}
