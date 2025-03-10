package 배열개념;

import java.util.Arrays;

public class Ex02이중배열 {

	public static void main(String[] args) {
		
		// 이중배열
		// 1. 2차원 배열 생성
		int[][] array = new int[3][4];
		
		// 2. 2차원 배열에 값 할당
		array[0][0] = 1;
		
		// 1. 2차원 배열 생성 + 값 할당
		int[][] array2 = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		// 출력해보기
		System.out.println(array2[1][2]);
		System.out.println(array2[1]);
		
		System.out.println(Arrays.deepToString(array2));
		
		System.out.println(array2[0][3]);
		System.out.println(array2[1][3]);
		System.out.println(array2[2][3]);
		
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[0][2]);
		System.out.println(array2[0][3]);

	}

}
