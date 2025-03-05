package while문;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		if (0 <= H && H <= 23 && 0 <= M && M <= 59) {
			if ((M - 45) < 0 && H != 0) {
				System.out.println((H - 1) + " " + ((M - 45) + 60));
			} else if ((M - 45) < 0 && H == 0) {
				System.out.println(23 + " " + ((M - 45) + 60));
			} else if (H == 0) {
				System.out.println(23 + " " + (M - 45));
			} else if (M == 0) {
				System.out.println(H - 1 + " " + ((M - 45) + 60));
			} else {
				System.out.println(H + " " + (M - 45));
			}
		}
	}
}
