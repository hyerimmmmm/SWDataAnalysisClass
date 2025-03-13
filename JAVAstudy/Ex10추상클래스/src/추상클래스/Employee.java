package 추상클래스;

public abstract class Employee {

	protected String empno;
	protected String name;
	protected int pay;
	
	// 생성
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	// 월급계산
	public abstract int getMoneyPay();

	// 출력
	public String print() {
		return empno + " : " + name + " : " + pay;
	}

}
