package 코테;

import java.util.Scanner;

public class Ex02코테개미군단 {

	public static void main(String[] args) {
		
		// 2. 개미 군단
		// 개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
		// 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
		// 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
		// 사냥감의 체력 hp가 변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		int aAnt = 5; // 장군개미
		int bAnt = 3; // 병정개미
		int cAnt = 1; // 일개미
		
		int aAntCount; // 장군개미 숫자
		int bAntCount; // 병정개미 숫자
		int cAntCount; // 일개미 숫자
		
		System.out.print("사냥감의 hp를 입력해주세요: ");
		int hp = sc.nextInt();
		
		aAntCount = hp / aAnt;
		bAntCount = (hp % aAnt) / bAnt;
		cAntCount = ((hp % aAnt) % bAnt) / cAnt;	
		
		System.out.println("장군개미의 수: " + aAntCount);
		System.out.println("병정개미의 수: " + bAntCount);
		System.out.println("일개미의 수: " + cAntCount);

	}

}
