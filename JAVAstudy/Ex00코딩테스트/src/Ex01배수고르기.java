import java.util.Arrays;

public class Ex01배수고르기 {

	public static void main(String[] args) {

		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int num = numlist.length;
		int count = 0;
		int n = 3;
		
		// num 구하는 for 문
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				count++;
			} else {
				num--;
			}
		}
		
		int[] answer = new int[num];
		
		count = 0;
		// 값 넣는 for 문
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer[count] = numlist[i];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(answer));

	}

}
