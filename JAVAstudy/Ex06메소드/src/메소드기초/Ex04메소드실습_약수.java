package 메소드기초;

public class Ex04메소드실습_약수 {

	public static void main(String[] args) {
		
		// 약수 메소드
		int num1 = 10;
		int num2 = 3;
		
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);

	}
	
	public static boolean isDivisor(int a, int b) {
		boolean result = true;
		
		if (a % b == 0) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	

}
