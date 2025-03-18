package Model;

public class MemberDTO {
	
	// DTO
	// -> Database Transfer Object: 데이터베이스로 정보를 전달하기 위해 구조를 짜놓는 클래스
	
	private String id;
	private String password;
	private String name;
	private int age;
	
	// 회원가입을 위한 생성자 메소드
	public MemberDTO(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// 회원 정보 조회를 위한 생성자 메소드
	public MemberDTO(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// 값을 담는 생성자가 존재한다면,
	// 아무것도 담지 않는 기본 생성자 메소드를 만들어야 
	public MemberDTO() {
		
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
	
	
	// setter 메소드
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
