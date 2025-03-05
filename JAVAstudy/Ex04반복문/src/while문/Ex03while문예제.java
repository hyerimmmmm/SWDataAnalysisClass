package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int e = 0;
		int o = 0;

		while (num != -1) {
			if (num % 2 == 0) {
				++e;
				System.out.println("짝수 개수: " + e);
				System.out.println("홀수 개수: " + o);
				System.out.print("정수입력: ");
				num = sc.nextInt();
			} else if (num % 2 != 0) {
				++o;
				System.out.println("짝수 개수: " + e);
				System.out.println("홀수 개수: " + o);
				System.out.print("정수입력: ");
				num = sc.nextInt();
			}
		}
		System.out.println("종료되었습니다.");

	}

}
