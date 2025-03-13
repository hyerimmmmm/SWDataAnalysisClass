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
		
		p2.makeBibim();

	}

}
