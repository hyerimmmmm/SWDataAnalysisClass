package while문;

public class Ex06while연습 {

	public static void main(String[] args) {
		
		int a = 0; // 100번의 루프를 위한 변수
		int b = 0; // 1-100까지 더할 변수
		
		// 문제 1: 1부터 100까지의 합 구하기
		while (a < 100) {
			a++;
			b+=a;
		}
		
		System.out.println("1부터 100까지의 합은 " + b + "입니다.");
	}

}
