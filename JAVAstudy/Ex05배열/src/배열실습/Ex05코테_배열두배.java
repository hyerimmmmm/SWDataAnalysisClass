package 배열실습;

import java.util.Arrays;

public class Ex05코테_배열두배 {

	public static void main(String[] args) {
		
		// 배열 두배
		// 배열 array의 각 인덱스의 값을 두배씩 가진 배열을 만들어서 출력해주세요
		// array는 {2,4,6,8,10} -- result라는 이름의 배열은 {4,8,12,16,20}이 담겨야 함
		
		int[] array = {2, 4, 6, 8, 10};
		int[] result = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i] * 2;
		}
		System.out.println(Arrays.toString(result));

	}

}
