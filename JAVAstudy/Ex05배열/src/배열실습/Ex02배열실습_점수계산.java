package 배열실습;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02배열실습_점수계산 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 점수계산 part1
		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
////		
////		System.out.println("입력된 점수: " + Arrays.toString(array));
//
//		// 위의 코드를 for 문 사용해서
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}

		// 점수계산 part2
		// 최고/최저/총합/평균 계산 후 출력
		int max = 0;
		int min = array[0];
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < array.length; i++) {
			int num = array[i];

			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
			sum += num;
			avg = sum / array.length;
		}

		System.out.println("입력된 점수: " + Arrays.toString(array));
		System.out.println("최고 점수: " + max);
		System.out.println("최저 점수: " + min);
		System.out.println("총합 점수: " + sum);
		System.out.println("평균 점수: " + avg);

		// 배열 값 거꾸로출력
		int[] answer = new int[array.length];
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			
			answer[i] = array[j];
			System.out.println("i = " + i);
			System.out.println("j = " + j);
			j++;
		}
		System.out.println(Arrays.toString(answer));

	}
}
