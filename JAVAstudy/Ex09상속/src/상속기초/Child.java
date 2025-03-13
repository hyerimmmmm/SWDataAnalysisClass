package 상속기초;

public class Child extends Parent {
	
	// 새로운 클래스 -> 자식클래스, 서브클래스
	// 한식당 2호점
	// extends -> 연장하다, 확장하다: 클래스를 선언하는 구간에 적기
	
	// 1. 불닭 메뉴를 만든다.
	/**
	 * 불닭메뉴를 만드는 메소드임
	 * @author 김혜림(만든사람)
	 * @since 25.03.13(만든날짜)
	 * @return void
	 * @param 매개변수 없음
	 */
	public void makeBul() {
		System.out.println("맛있는 불닭을 만든다.");
	}
	
	// 2. 부모님 가게의 비빔밥 메뉴 변경
	// annotation(주석) -> 특정 기능을 가지고 있지는 않지만, 메소드 정보를 확인하기 위해
	// 마우스를 올렸을 때 알 수 있도록 정보 전달을 하는 역
	@Override
	public void makeBibim() {
		System.out.println("아주아주 맛있는 비빔밥을 만든다");
	}
	
}
