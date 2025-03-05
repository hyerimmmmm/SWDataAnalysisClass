package doWhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex06doWhile연습 {

	public static void main(String[] args) {
		
		// 문제 4: 숫자 맞추기 게임
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int sysNum = ran.nextInt(100) + 1;
		int userNum;
		
		do {
			System.out.print("숫자를 맞춰보세요(1-100): ");
			userNum = sc.nextInt();
			
			if (userNum < sysNum) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (userNum > sysNum) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (userNum == sysNum) {
				System.out.println("정답입니다!");
				break;
			}
			
		} while(true);

	}

}
