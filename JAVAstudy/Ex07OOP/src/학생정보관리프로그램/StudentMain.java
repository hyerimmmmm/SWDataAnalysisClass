package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		
		// Studentnt 객체 생성
		Student stu1 = new Student(); // new Student()는 객체를 생성하는 순간에 실행되는 메소드
		
		stu1.setName("이도연");
		stu1.setNumber("20241111");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);
		
		// 이름, 자바 점수 출력
		System.out.println("이름은 " + stu1.getName() + "이고, 자바 점수는 " + stu1.getScoreJava() + "입니다.");
		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());
		
		// 객체 생성과 동시에 데이터 집어 넣기
		Student stu2 = new Student("신재영", "20252222", 19);
		System.out.println(stu2.getName());

	}

}
