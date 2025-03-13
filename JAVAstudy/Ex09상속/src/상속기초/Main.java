package 상속기초;

public class Main {

	public static void main(String[] args) {
		
		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();

		// 2. Child 자료형 c 객체 생성
		Child c = new Child();
		
		p.makeBibim();
		c.makeBibim();
		c.makeBul();
		
		// 객체의 casting
		Parent p2 = new Child();
		
		p2.makeBibim(); // 오버라이딩 한 경우 자식이 가지고 있는 메소드 호출
		// p2.makeBul(); // 접근 불가, 상위클래스의 변수, 메소드에만 접근 가능
		
		// 다운캐스팅
		Child c2 = (Child)p2;
		c2.makeBul(); // 다시 자식 클래스가 되었기 때문에, 자식 클래스가 가지고 있는 메소드 사용가

	}

}
