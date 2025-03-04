package 삼항연산자;

import java.util.Scanner;

public class Ex02홀짝구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		System.out.print("입력받은 정수는?: ");
		System.out.println(num % 2 == 0 ? "짝수입니다" : "홀수입니다");

	}

}
