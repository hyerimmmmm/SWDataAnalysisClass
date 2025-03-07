package 코테;

import java.util.Random;
import java.util.Scanner;

public class Ex06코테로또 {

	public static void main(String[] args) {
		
		// 6. 로또
		// 랜덤수 추출을 활용해서, 로또 번호 6개 뽑기!
		// 숫자범위는 45까지
		
		Random ran = new Random();
		for (int i = 0; i < 6; i++ ) {
			int num = ran.nextInt(45);
			System.out.print(num + " ");
		}
	}

}
