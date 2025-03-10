package 이차원배열실습;

public class Ex01기초예제 {
	public static void main(String[] args) {
		
	      // 이차원 배열 생성
	      int[][] array2 = {
	            {1,2,3,4}, // 0행 
	            {5,6,7,8}, // 1행
	            {9,10,11,12} // 2행
	      };
	      
	      // 프린트문 4개 써서 1,2,3,4 출력
	      System.out.println(array2[0][0]);
	      System.out.println(array2[0][1]);
	      System.out.println(array2[0][2]);
	      System.out.println(array2[0][3]);
	      
	      // 위의 출력문을 for 문으로 출력
	      for (int i = 0; i < array2[0].length; i++) {
	    	  System.out.print(array2[0][i] + " ");
	      }
	      
	      System.out.println(" ");
	      
	      // for 문으로 5, 6, 7, 8 출력
	      for (int i = 0; i < array2[1].length; i++) {
	    	  System.out.print(array2[1][i] + " ");
	      }
	      
	      System.out.println(" ");
		
	      // for 문으로 9, 10, 11, 12 출력
	      for (int i = 0; i < array2[2].length; i++) {
	    	  System.out.print(array2[2][i] + " ");
	      }
	      
	      System.out.println(" ");
	      
	      // 합치기
	      for (int i = 0; i < array2.length; i++ ) {
	    	  for (int j = 0; j < array2[i].length; j++) {
	    		  System.out.print(array2[i][j] + " ");
	    	  }
	    	  System.out.println(" ");
	      }

	}
}
