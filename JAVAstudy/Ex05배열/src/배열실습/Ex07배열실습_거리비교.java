package 배열실습;

import java.util.Arrays;

public class Ex07배열실습_거리비교 {

	public static void main(String[] args) {

		// 거리 비교
		// 숫자가 담긴 1차원 배열에서 두 개의 숫자를 뽑아 서로의 거리를 비교한 후
		// 거리가 가장 작은 숫자의 위치를 출력

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];

		int a = 0; // 인덱스 1 담기
		int b = 0; // 인덱스 2 담기
		int c = 0; // 두 인덱스 사이 거리
		int d = Integer.MAX_VALUE; // 두 인덱스 사이 최소 거리

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (point[i] - point[j] > 0) { // 음수 거르기
					System.out.println(i + "회차 i = " + point[i]);
					System.out.println(j + "회차 j = " + point[j]);
					System.out.println(j + "회차 a = " + a);
					System.out.println(j + "회차 b = " + b);
					System.out.println(j + "회차 c = " + c);
					System.out.println(point[i] - point[j]);
					
					c = point[i] - point[j]; // 현재 두 데이터 사이의 거리 저장
					if (d > c) { // 현재 거리와 이전 최소 거리 비교
						d = c; // 새로운 최소 거리 저장
						
						a = i; // 새로운 최소 거리의 인덱스 저장
						b = j;
						
					}
				}
			}
		}

		result[0] = a; // 최종 최소 거리 인덱스 저장
		result[1] = b;

		System.out.println("result = " + Arrays.toString(result));

	}
}
