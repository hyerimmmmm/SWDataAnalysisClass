package 학생정보관리프로그램;

public class Student {

	// Field: 이름, 학번, 나이, 자바 점수, 웹 점수, 안드로이드 점수
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;

	// Method
	// getter 메소드
	public String getName() {
		return name;
	}

	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	// 생성자(constructor)
	public Student(String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}

	// 기본 생성자
	public Student() {
		
	}

}
