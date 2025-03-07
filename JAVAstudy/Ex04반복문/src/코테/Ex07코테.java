package 코테;

public class Ex07코테 {

	public static void main(String[] args) {
		
		// 7. 결과 출력
		int mul = 0;
		int sum = 0;
		int num = 77;
		for (int i = 1; i <= 77; i++) {
			mul = i * num;
			num--;
			sum += mul;
		}
		
		System.out.println("결과: " + sum);
	}

}
