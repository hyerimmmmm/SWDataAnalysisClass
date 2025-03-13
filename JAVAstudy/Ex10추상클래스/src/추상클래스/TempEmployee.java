package 추상클래스;

public class TempEmployee {
	
	private String empno;
	private String name;
	private int pay;
	
	// 생성자
	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	// 월급계산
	public int getMoneyPay() {
		return pay / 12;
	}
	// 출력
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
	
}
