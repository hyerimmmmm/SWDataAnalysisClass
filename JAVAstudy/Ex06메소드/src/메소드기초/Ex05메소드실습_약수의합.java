package 메소드기초;

public class Ex05메소드실습_약수의합 {
	public static void main(String[] args) {
		
		// 약수의 합 구하기
		int num = 10;
		int result = getSumOfDivisors(num);
		
		System.out.println(" ");
		System.out.println(num + "약수의 합: " + result);
		
	}
	
	public static int getSumOfDivisors(int a) {
		int result = 0;
		
		for (int i = a; i > 0; i--) {
			if (a % i == 0) {
				result += (a / i);
				System.out.print(a / i + " ");
			}
		}
		
		
		return result;
	}
}
