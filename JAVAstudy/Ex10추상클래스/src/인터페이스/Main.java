package 인터페이스;

public class Main {

	public static void main(String[] args) {
		
		// 3. 인터페이스 객체 생성
		// 익명의 내부 자료 형태로는 객체 생성이 가능(안드로이드 개발 시 많이 사용하는 형태)
		// 일반적인 형태의 객체 생성은 불가
		Temp t = new Temp() {
			
			@Override
			public void temp() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
