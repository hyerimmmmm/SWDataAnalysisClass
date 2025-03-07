package 배열실습;

import java.util.Arrays;

public class Ex01배열실습_가장큰수 {

	public static void main(String[] args) {
		
		// 1. 정수 데이터 5개를 저장할 수 있는 배열 생성
		int[] array = {6, 3, 8, 4, 2};
		
		int bigNum = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > bigNum) {
				bigNum = array[i];
			}
		}
		System.out.println("array에 들어있는 값 " + Arrays.toString(array));
		System.out.println("가장 큰 값은 " + bigNum + "입니다.");

	}

}
