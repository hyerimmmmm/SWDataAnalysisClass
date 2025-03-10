package 이차원배열실습;

public class Ex04예제 {

	public static void main(String[] args) {
		
		// 배열 90도 회전하여 출력
		int[][] array = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};
		
		System.out.println("원본: ");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("회전: ");
		
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println("");
		}

	}

}
