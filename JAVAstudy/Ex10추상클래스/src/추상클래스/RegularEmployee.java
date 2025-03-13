package 추상클래스;

public class RegularEmployee extends Employee {
	
	private int bonus;
	
	// 생성자
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay); // 부모클래스의 생성자에게 접근
		this.bonus = bonus;
	}
	// 월급계산
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}
	
}
