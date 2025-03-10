package 이차원배열실습;

public class Ex05예제 {

	public static void main(String[] args) {
		
		// 
		int[][] array = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i % 2 == 0) { // i 0일때
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
			} else if (i % 2 != 0) { // 홀수 일 때
				for (int j = array[i].length - 1; j >= 0; j--) {
					System.out.print(array[i][j] + "\t");
				}
			}
			System.out.println("");
		}
		

	}

}
