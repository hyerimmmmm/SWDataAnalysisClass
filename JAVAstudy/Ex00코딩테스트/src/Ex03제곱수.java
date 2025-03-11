
public class Ex03제곱수 {

	public static void main(String[] args) {
		
		solution(36);
		// solution(976);

	}
	
	public static int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n / i == i) {
                System.out.println("i = " + i);
                System.out.println("n / i = " + n / i);
                System.out.println("answer = " + i);
                answer = 1;
            } else {
            	System.out.println("i = " + i);
                System.out.println("n / i = " + n / i);
                answer = 2;
            }
        }
        
        return answer;
    }

}
