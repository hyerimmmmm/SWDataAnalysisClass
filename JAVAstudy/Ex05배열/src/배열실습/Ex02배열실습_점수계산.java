package 배열실습;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02배열실습_점수계산 {
	public static void main(String[] args) {
		
		// 점수계산 part1
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("입력된 점수: " + Arrays.toString(array));
		
	}
}
