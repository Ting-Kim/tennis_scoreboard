package tennis;

public class TieGame {
	TieGame(){
		Point.AGameScore = 0;
		Point.BGameScore = 0;
	}

	public static void tie() {
		System.out.println(Point.AGameScore);
		System.out.println(Point.BGameScore);
	}
}
