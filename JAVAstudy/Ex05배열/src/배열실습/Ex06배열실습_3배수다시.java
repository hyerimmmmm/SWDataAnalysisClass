package 배열실습;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06배열실습_3배수다시 {

	public static void main(String[] args) {
		
		// 3배수 출력
		int[] arrays = new int[10];
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 정수입니다: ");
			int num = sc.nextInt();
			
			if (num % 3 == 0) {
				arrays[count] = num;
				count++;
			}
		}
		
		System.out.print("3의 배수: ");
		
		for (int i = 0; i < count; i++) {
			System.out.print(arrays[i] + " ");
		}

	}

}
