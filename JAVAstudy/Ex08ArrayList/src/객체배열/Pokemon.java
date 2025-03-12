package 객체배열;

public class Pokemon {
	
	// MARK: - 필드
	private String name;
	private String type;
	private String skil;
	private int hp;
	private int atk;
	
	public Pokemon(String name, String type, String skil, int hp, int atk) {
		this.name = name;
		this.type = type;
		this.skil = skil;
		this.hp = hp;
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getSkil() {
		return skil;
	}
	
	

	
}
