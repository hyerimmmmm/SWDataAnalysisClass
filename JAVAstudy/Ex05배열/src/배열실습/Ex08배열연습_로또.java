package 배열실습;

import java.util.Arrays;
import java.util.Random;

public class Ex08배열연습_로또 {

	public static void main(String[] args) {
		
		// 로또 번호
		Random ran = new Random();
		int[] numbers = new int[6];
		System.out.println("===== 로또 번호 추첨 ====");
		System.out.print("이번 주 추첨 번호는 ");
		
		for (int i = 0; i < 6; i++) { // 큰 for 문: 자동 로또 번호 추첨
			int num = ran.nextInt(9) + 1; // 1-10까지 나오게 세팅
			
			for (int j = 0; j < 6; j++) {
				if (num == numbers[j]) {
					i = 0;
				}
			}
			
			numbers[i] = num;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		

	}

}
