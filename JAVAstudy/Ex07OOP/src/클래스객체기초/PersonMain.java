package 클래스객체기초;

public class PersonMain {

	public static void main(String[] args) {
		
		// 설계도를 기반으로 객체 만들기
		Person miri = new Person();
		
		// 객체에 데이터 할당하기(= 속성값 할당)
		miri.age = 20;
		miri.name = "미리";
		
		// 객체가 가진 데이터 출력해보기
		System.out.println(miri.age);
		System.out.println(miri.name);
		
		// 객체가 가진 기능 실행해보기
		miri.sleep();
		miri.introduce();
		miri.eat("치킨");
		miri.eat("콜라");
		
		// person 설계도를 기반으로 새로운 사람 만들어보기
		Person minsu = new Person();
		minsu.age = 20;
		minsu.name = "민수";
		
		System.out.println("이름은 " + minsu.name + ", 나이는 " + minsu.age);
		minsu.sleep();
		minsu.introduce();
		minsu.eat("치킨");

	}

}
