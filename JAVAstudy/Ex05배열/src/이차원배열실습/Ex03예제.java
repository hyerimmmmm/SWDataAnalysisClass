package 이차원배열실습;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03예제 {

	public static void main(String[] args) {
		
		// 정수 N을 입력받아 N * N 배열에 숫자를 저장하고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요. >> ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int data = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[j][i] = data++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
		

	}

}
