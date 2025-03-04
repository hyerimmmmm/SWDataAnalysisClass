package ifelse문;

import java.util.Scanner;

public class Ex01ifElse예제 {
	public static void main(String[] args) {

		// 사용자가 입력한 점수(grage)가 60이상이라면 “합격입니다”를 아니라면 “불합격입니다”를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요: ");
		int grage = sc.nextInt();

		if (grage >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}
}
