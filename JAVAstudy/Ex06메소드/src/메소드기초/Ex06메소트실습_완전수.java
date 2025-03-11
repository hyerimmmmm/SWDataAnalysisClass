package 메소드기초;

import java.util.Arrays;

public class Ex06메소트실습_완전수 {

	public static void main(String[] args) {

		int start = 2;
		int end = 1000;

		System.out.print(start + " - " + end + "까지의 완전수: ");
		numbers(start, end);

	}

	public static void numbers(int a, int b) {
		int sum = 0;
		// a ~ b가 완전수인지 판단하는 for 문
		for (int i = a; i <= b; i++) {
			// -> 근거: 1 ~ b를 다 a로 나눠보고 나눠떨어지는 수의 합이 a와 같아야 함
			for (int j = 1; j < i; j++) {
				// i의 약수 찾기 -> 찾은 다음 합산
				if (i % j == 0) {
					sum += j;
				}
			}
			// 완전수라면 출력
			if (i == sum) {
				System.out.print(i + " ");
			}
			sum = 0;
		}
	}

}
