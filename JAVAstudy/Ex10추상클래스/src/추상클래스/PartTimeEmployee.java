package 추상클래스;

public class PartTimeEmployee {
	
	private String empno;
	private String name;
	private int pay;
	private int workDay;
	
	// 생성
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	// 월급계산
	public int getMoneyPay() {
		return pay * workDay;
	}
	// 출력
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
	
	
}
