package for문;

public class Ex01for문기초 {

	public static void main(String[] args) {

		// 기초 for문
		// 1에서 5까지 출력하기
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " ");
		}

		// 96에서 73까지 출력하기
		for (int i = 96; i >= 73; i--) {
			System.out.print(i + " ");
		}

		System.out.println(" ");

		// 96부터 73까지 중 홀수만 출력
		for (int i = 96; i >= 73; i--) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
