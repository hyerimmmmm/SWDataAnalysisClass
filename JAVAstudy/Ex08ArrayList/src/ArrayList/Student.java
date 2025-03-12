package ArrayList;

public class Student {
	
	// 1. 필드(== 속성, 데이터)
	// 이름, 나이
	private String name;
	private int age;

	// 2. 메소드(기능, 행위, 로직)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 3. 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
