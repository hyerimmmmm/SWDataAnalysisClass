package 메소드기초;

public class Ex07메소드실습_배열매개변수 {

	public static void main(String[] args) {
		
		// 배열을 매개변수로 내보내기
		int[] array = {1, 2, 3};
		
		arrPrint(array);

	}
	
	public static void arrPrint(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
