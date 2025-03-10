package 이차원배열실습;

import java.util.Arrays;

public class Ex02이차원배열예제 {

	public static void main(String[] args) {
		
		// 1. 2차원 배열 array 만들기
		int[][] array = new int[3][3];
		int data = 1;
		
		//2. array의 값을 이중 for 문을 이용해서 할당
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = data++;
				System.out.print(array[i][j] + "\t"); // \t:tab 단위로 띄어쓰
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(array));


	}

}
