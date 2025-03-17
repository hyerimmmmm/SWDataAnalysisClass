package Model;

public class MemberDTO {
	
	// DTO
	// -> Database Transfer Object: 데이터베이스로 정보를 전달하기 위해 구조를 짜놓는 클래스
	
	private String id;
	private String password;
	private String name;
	private int age;
	
	public MemberDTO(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// getter 메소드
	// -> private 데이터들을 다른 클래스에서 조회가능하도록 getter 메소드 생성
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
}
