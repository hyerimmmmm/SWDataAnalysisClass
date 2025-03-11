package 클래스객체기초;

public class BankMain {

	public static void main(String[] args) {
		
		Bank mrBank = new Bank(); // 객체 생성
		
		// mrBank.money = 1000; // 오류
		
		mrBank.inMoney(100); // 입금
		mrBank.outMoney(300); // 출금
		
		System.out.println("잔액은 " + mrBank.showMoney());
		// System.out.println(mrBank.money);
		

	}

}
