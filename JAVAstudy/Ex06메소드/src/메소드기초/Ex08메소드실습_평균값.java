package 메소드기초;

public class Ex08메소드실습_평균값 {

	public static void main(String[] args) {
		
		int[] array = {15, 10, 2, 8, 23};
		
		System.out.print("평균값은: ");
		average(array);
	}
	
	public static void average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		sum /= a.length;
		System.out.println(sum);
	}

}
