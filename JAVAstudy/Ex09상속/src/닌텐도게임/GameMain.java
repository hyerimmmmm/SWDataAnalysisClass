package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {

		// 마리오 게임칩 꺼내오기
		Mario m = new Mario();

		// 게임 칩 넣기
		on(m);

		// 젤 게임칩 꺼내오기
		Zelda z = new Zelda();

		// 게임 칩 넣기
		on(z);

		// 포켓몬고 게임칩 꺼내오기
		PokemonGo p = new PokemonGo();

		// 게임 칩 넣기
		on(p);

	}

	private static void on(GameChip g) {
		g.gameStart();
	}
// 메소드 오버로딩으로 풀어내는 방	
//	private static void on(Zelda z) {
//		z.gameStart();
//	}
//	
//	private static void on(PokemonGo p) {
//		p.gameStart();
//	}

}
