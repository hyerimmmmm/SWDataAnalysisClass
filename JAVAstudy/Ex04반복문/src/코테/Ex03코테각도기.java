package 코테;

import java.util.Scanner;

public class Ex03코테각도기 {

	public static void main(String[] args) {

		// 3. 각도기
		// 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 
		// 각도 angle이 변수로 주어질 때 각도를 계산해서 "예각","직각","둔각,"평각"을 출력해주세요
		// => 63 -- 예각

		Scanner sc = new Scanner(System.in);
		int angle = sc.nextInt();

		if (angle < 90 && angle != 90 && angle != 180) {
			System.out.println("예각");
		} else if (angle == 90) {
			System.out.println("직각");
		} else if (angle < 180 && angle != 90 && angle != 180) {
			System.out.println("둔각");
		} else if (angle == 180) {
			System.out.println("평각");
		}
	}
}
