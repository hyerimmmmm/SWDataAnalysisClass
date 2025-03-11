
public class Ex02최댓값만들기 {

	public static void main(String[] args) {

		int answer = 0;
		int[] numbers = {1, 2, 3, 4, 5};

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] * numbers[j] > answer) {
					answer = numbers[i] * numbers[j];
				}
			}
		}
		
		System.out.println(answer);

	}

}
