package 배열개념;

public class Ex01배열개념 {

	public static void main(String[] args) {
		
		// 배열 선언
		// case1
		// 1-1. 정수 3개를 담는 numList1 배열 생성
		int[] numList1 = new int[3];
		
		// 1-2. 데이터 할당하기
		numList1[0] = 3;
		numList1[1] = 5;
		numList1[2] = 7;
		
		// case2
		// 2-1. 배열을 만드는 동시에 데이터 할당
		int[] numList2 = {1, 2, 3, 4};
		
		// 배열 데이터 꺼내기
		//System.out.println(numList1[0]);
		
		// 배열 데이터 변경
		numList1[0] = 1;
		
		// for문과 배열 섞어서 사용해보기
		
		for (int i = 0; i < numList1.length; i++) {
			System.out.println(numList1[i]);
		}

	}

}
