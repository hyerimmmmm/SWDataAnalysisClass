package 추상클래스;

public class TempEmployee extends Employee {
	
	// 생성자
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}
	// 월급계산
	public int getMoneyPay() {
		return pay / 12;
	}
	
}
