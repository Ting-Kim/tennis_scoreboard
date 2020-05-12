package tennis_scoreboard;

import tennis.project1.IGame;
import tennis.project1.Set;

//랜덤으로 포인트 득점
public class Point implements IGame{
	static int gameWinner = 0;

	public static int pointPlay() {

		
		return 0;
		
		
		//
	}

	@Override
	public void pointWinner(int p) {
		if (p == 1) Set.ApointScore ++; 
		else Set.BpointScore++;
	}

	@Override
	public void dispScoreBoard() {
		// TODO Auto-generated method stub
		
	}
}
