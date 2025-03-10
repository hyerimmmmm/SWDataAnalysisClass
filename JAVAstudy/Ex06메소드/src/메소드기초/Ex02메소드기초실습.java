package 메소드기초;

public class Ex02메소드기초실습 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		System.err.println(cal(num1, num2, op));
		

	}
	
	public static int cal(int a, int b, char c) {
		int result = 0;
		
		if (c == '-') {
			result = a - b; 
		} else if (c == '+') {
			result = a + b;
		} else if (c == '*') {
			result = a * b;
		} else if (c == '/') {
			result = a / b;
		} else if (c == '%') {
			result = a % b;
		} else {
			System.out.println("연산자만 입력해주세요.");
		}
		
		return result;
	}

}
