package 메소드기초;

public class Ex06_01메소드실습_완전수_다시 {

	public static void main(String[] args) {
		
		int startValue = 2;
		int endValue = 1000;
		
		System.out.print(startValue + " - " + endValue + "까지의 완전수: ");
		getPerfectNumber(startValue, endValue);

	}
	
	public static void getPerfectNumber(int a, int b) {
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
			sum = 0;
		}
		
	}

}
