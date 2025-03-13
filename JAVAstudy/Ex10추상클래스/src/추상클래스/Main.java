package 추상클래스;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee r = new RegularEmployee("SMHRD001", "홍길동", 4000, 100);
		System.out.println(r.print());
		
		TempEmployee t = new TempEmployee("SMHRD002", "박철수", 3000);
		System.out.println(t.print());
		
		PartTimeEmployee p = new PartTimeEmployee("SMHRD003", "임성훈", 10, 100);
		System.out.println(p.print());

	}

}
