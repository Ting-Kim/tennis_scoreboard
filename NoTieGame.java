package tennis_scoreboard;

// 타이브레이크 적용하지않은 게임
public class NoTieGame implements IGame {

	int i = 7;
	
	public int setPlay() {
		
		outer:
			do {
				pointWinner(Point.gameWinner);		//	Point.gameWinner - > game 획득자 반환.
				if(Set.AgameScore == 5 && Set.BgameScore == 5) {
					while(true) {
						pointWinner(Point.gameWinner);		
						pointWinner(Point.gameWinner);
						if(Set.AgameScore == i || Set.BgameScore == i) break outer;	//	7:5	8:6	9:7 ...일 때 빠져나옴
						else i++;
					}
				}
			}while(Set.AgameScore == 6 || Set.BgameScore == 6);

		if (Set.AgameScore > Set.BgameScore ) 	return 1;	//	return값은 setWinner?
		else return 2;						//	Set class에서 TieGame 객체 새로 생성하면서 Game
		
	}	//setPlay()

		
		
		
		
	@Override
	public void pointWinner(int p) {
		if (p == 1) Set.AgameScore ++; 
		else Set.BgameScore++;
	}

	@Override
	public void dispScoreBoard() {

	}

}	//class
