package 객체배열;

public class Main {

	public static void main(String[] args) {
		
		// 1. 객체 배열 생성
		Pokemon[] bag = new Pokemon[3];
		
		// 객체 배열의 0번 인덱스 접근
		System.out.println(bag[0]);
		
		// 2. 객체 배열의 0번 인덱스에 포켓몬 넣기
		// 피카츄, 전기, 백만볼트, 100, 10
		bag[0] = new Pokemon("피카츄", "전기", "백만볼트", 100, 10);
		System.out.println(bag[0]);
		System.out.println(bag[0].getName());
		// 3. 인덱스 1, 2번에도 데이터 입력
		bag[1] = new Pokemon("잠만보", "노멀", "누르기", 200, 5);
		bag[2] = new Pokemon("망나뇽", "드래곤", "공중날기", 150, 15);
		
		// 4. 포켓몬의 이름, 타입, hp 출력
		System.out.println("==== 포켓몬 정보 출력 ====");
		System.out.println("이름\t" + "타입\t" + "hp");
		
		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName() + "\t" + bag[i].getType() + "\t" + bag[i].getHp());
		}
		
		for (Pokemon p : bag) {
			System.out.println(p.getName() + "\t" + p.getType() + "\t" + p.getHp());
		}
		
	}

}
