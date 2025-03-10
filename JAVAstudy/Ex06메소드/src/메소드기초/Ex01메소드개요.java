package 메소드기초;

public class Ex01메소드개요 {
	public static void main(String[] args) {
		
		// 2. 사용은 main 메소드 안에서
		introduce();
		introduce();
		introduce();
		
	}
	
	//1. main 메소드 바깥에 생성
	public static void introduce() {
		System.out.println("이름: 미리");
		System.out.println("나이: 20");
		System.out.println("취미: 눕기");
	}

}
