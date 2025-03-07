package 배열실습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03배열실습_3배수출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		// 3의 배수 출력
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 입력: ");
			int num = sc.nextInt();
			
			if (num % 3 == 0) {
				array.add(num);
			}
		}
		
		System.out.print("3의 배수:");
		for (int i = 0; i <= array.size() - 1; i++) {
			System.out.print(array.get(i) + " ");
		}
		

	}

}
