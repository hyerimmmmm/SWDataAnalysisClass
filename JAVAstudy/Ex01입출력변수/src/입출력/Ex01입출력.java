package 입출력;

// 도구를 꺼내올 때는 반드시 어디에서 꺼내올지 'import' 구문을 작성해야 
import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {
		// 입력/출력 해보기
		
		// 1. 출력문
		// System.out.println(); -> 출력 후 개행
		// System.out.print();
		
		System.out.println("신재영");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
		// 2-2) 입력받기
		sc.next(); // 입력값을 문자열 데이터로 인식
		sc.nextInt(); // 입력값을 정수형 데이터로 인식

	}

}
