package 코테;

import java.util.Scanner;

public class Ex01코테세균증식 {

	public static void main(String[] args) {

		// 1. 입문 - 세균 증식
		// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
		// 처음 세균의 마리수 n과 경과한 시간 t가 변수로 주어질 때 t시간 후 세균의 수를 출력하세요
		// (n이 2, t가 10이라면, 결과는 2048)

		Scanner sc = new Scanner(System.in);
		System.out.print("세균 수: ");
		int n = sc.nextInt(); // 세균
		System.out.print("시간: ");
		int t = sc.nextInt(); // 시간
		int mul = n; // 1시간 세균

		for (int i = t; i > 0; i--) {
			mul *= 2;
		}
		System.out.println("총 세균: " + mul);

	}

}
