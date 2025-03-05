package doWhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex02doWhile예제 {

	public static void main(String[] args) {

		// 랜덤 수 만드는 방법
		// 1. 도구 꺼내기
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		// 2. 도구를 이용해서 랜덤수 생성
		// 소괄호 안에 추출하고 싶은 숫자의 갯수를 적기

		System.out.println("========= Plus Game =========");
		do {
			// 1. 랜덤수 2개 생성
			int a = ran.nextInt(9) + 1;
			int b = ran.nextInt(9) + 1;

			// 2. 사용자에게 질문
			System.out.print(a + " + " + b + " = ");
			int answer = sc.nextInt();

			// 3. 정답 판단
			if (answer == a + b) {
				System.out.println("정답!");
			} else { // 틀린경우
				do { // 무한반복문 입장
					System.out.print("오답! 계속하시겠습니다? >> ");
					String go = sc.next();

					if (go.equals("N")) {
						break; // 계속할지를 그만 물어보는 역할
					} else if(go.equals("Y")) {
						
					}
				} while (true); // 무한 반복문 종료
				break; // 문제 풀이를 멈춰주는 역할
			}

		} while (true);

	}

}
