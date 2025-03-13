package 추상클래스;

public class RegularEmployee {
	
	private String empno; // 사번
	private String name;
	private int pay;
	private int bonus;
	
	// 생성자
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	// 월급계산
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}
	// 출력
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
}
