package 코테;

import java.util.Scanner;

public class Ex05코테편지 {

	public static void main(String[] args) {
		
		// 5. 편지
		// 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
		// 편지를 가로로만 적을 때, 축하 문구 message(String)를 적기 위해 필요한 편지지의 최소 가로길이를 출력하세요
		// => message가 "할머니사랑해요" -- 14 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("편지를 입력해주세요: ");
		String message = sc.next();
		
		int messageNum = message.length();
		
		int width = messageNum * 2;
		System.out.println(messageNum * 2);

	}

}
