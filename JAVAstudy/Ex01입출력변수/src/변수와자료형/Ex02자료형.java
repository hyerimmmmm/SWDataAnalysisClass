package 변수와자료형;

public class Ex02자료형 {
	
	public static void main(String[] args) {
		
		// 기본 자료형
		// 1-1. 논리 자료형: boolean
		// 참(true), 거짓(false)을 저장하는 자료형
		boolean b = true;
		
		// 1-2. 문자 자료형: char
		char c = 'a';
		
		// 1-3. 정수 자료형: byte(1byte), short(2byte), int(4byte), long(8byte)
		
		
		// 1-4. 실수 자료형: float(4byte), double(8byte)
		
		// 예제: 3.14라는 데이터를 담는 double 타입의 변수 num1 선언
		double num1 = 3.14;
		
		// 예제: 12.25라는 데이터를 담는 float 타입의 변수 num2 선언
		float num2 = (float) 12.25;
		
		// 2. 참조 자료형
		// 2-1. 문자열 자료형
		String name = "주미리";
		
		// 3. 형변환
		// 3-1. 강제 형변환(명시적 형변환)
		byte test1 = (byte) 12345;
		System.out.println(test1);
		
		// 3-2. 자동 형변환(묵시적 형변환)
		long test2 = 100;
		long test3 = test1;
		
		
	}
	
}
