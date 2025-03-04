package switch문;

import java.util.Scanner;

public class Ex01switch예제 {

	public static void main(String[] args) {

		// 월 별 계절
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month = sc.nextInt();

		if (month <= 12 || month >= 1) {
			switch (month) {
			case 3, 4, 5:
				System.out.println(month + "는 봄입니다.");
				break;
			case 6, 7, 8:
				System.out.println(month + "는 여름입니다.");
				break;
			case 9, 10, 11:
				System.out.println(month + "는 가을입니다.");
				break;
			case 12, 1, 2:
				System.out.println(month + "는 겨울입니다.");
				break;
			default:
				System.out.println("1-12 사이의 숫자를 입력해주세요.");
			}
		} else {
			System.out.println("1-12 사이의 숫자를 입력해주세요.");
		}

	}

}
