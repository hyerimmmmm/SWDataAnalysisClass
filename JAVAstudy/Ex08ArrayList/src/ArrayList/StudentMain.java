package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		
		// 1. Student 자료형을 보관 할 수 있는 sList라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();

		// 2. 데이터 추가
		sList.add(new Student("김혜림", 27));
		
		// 3. 데이터 출력
		// 해당 메소드가 본질적으로 어떤 자료형인지 마우스 올려서 확인하는 습관 가지기
		// -> sList.get(0) --> return type: Student ----> 객체
		System.out.println(sList.get(0).getName());
		
		// 4. 팀원 데이터 입력 후 출력
		sList.add(new Student("오희진", 24));
		sList.add(new Student("나규민", 27));
		sList.add(new Student("전정훈", 25));
		
		System.out.println("==== 팀원 정보 ====");
		for (Student s : sList) {
			System.out.println(s.getName() + "\t" + s.getAge());
		}
		
	}

}
