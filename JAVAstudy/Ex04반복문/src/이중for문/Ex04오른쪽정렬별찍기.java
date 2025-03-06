package 이중for문;

import java.util.Scanner;

public class Ex04오른쪽정렬별찍기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for (int i = num - 1; i >= 0; i--) {
			
			// 공백 for 문
			int j = num - 1;
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// 별 for 문
			int n = j;
			for (int h = num - 1; h >= n; h--) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
