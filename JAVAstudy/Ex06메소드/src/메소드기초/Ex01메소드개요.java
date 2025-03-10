package 메소드기초;

public class Ex01메소드개요 {
	public static void main(String[] args) {
		
		// 사용은 main 메소드 안에서
		// 매개변수가 없는 메소드 사
		introduce();
		
		// 매개변수가 있는 메소드 사용
		// 정의해준 메소드와 똑같이 매개변수의 개수와 순서, 자료형을 맞춰야 함
		cook(3, "신라면");
		cook(4, "짜파게티");
		
		// 반환값이 있는 메소드 사용
		age();
		int result = age();
		System.out.println(age());
		
		// 매개변수와 반환값이 있는 메소드 사용
		System.out.println("1 더하기 4는 " + sum(1, 4));
		System.out.println("10 더하기 3은 " + sum(10, 3));
		
	}
	
	// main 메소드 바깥에 생성(매개변수 X, 반환값 X)
	// void: 반환값이 없을 때 적어주는 것
	public static void introduce() {
		System.out.println("이름: 미리");
		System.out.println("나이: 20");
		System.out.println("취미: 눕기");
	}
	
	// 메소드 생성(매개변수 O, 반환값 X)
	// 매개변수는 소괄호 안쪽에 작성
	// 여러 매개변수를 넣을 수 있음(타입이 달라도 됨)
	// 매개변수의 이름은 메소드 안에서 부를 별명
	public static void cook(int a, String b) {
		System.out.println(b + "을(를) " + a + "개 끓입니다.");
	}
	
	// 메소드 생성(매개변수 X, 반환값 O)
	public static int age() {
		System.out.println("age 메소드 실행");
		return 27;
	}
	
	// 메소드 생성(매개변수 O, 반환값 O)
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		
		return num1 + num2;
	}

}
