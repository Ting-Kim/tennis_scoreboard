package tennis_scoreboard;

import tennis.project1.IGame;
import tennis.project1.Point;
import tennis.project1.Set;

//타이브레이크 적용한 게임
public class TieGame implements IGame {
	

	
	public int setPlay() {
		
		
		Set.AgameScore = 0;
		Set.BgameScore = 0;	//	필요한지 Check 必
		
		do {
			pointWinner(Point.gameWinner);		//	Point.gameWinner - > game 획득자 반환.
			if (Set.AgameScore == 5 && Set.BgameScore == 5) {	//	5:5 듀스 => 7:5 혹은 6:6 TieBreak 
				pointWinner(Point.gameWinner);		
				pointWinner(Point.gameWinner);
				if(Set.AgameScore == 7 || Set.BgameScore == 7) break;		//	5:5 듀스 => 7:5 결과 시 break.
				else pointWinner(Point.gameWinner);								//	5:5 듀스 => 6:6 결과 시 한번 더 시행. ( 그 후 자동으로 while문 비충족으로 빠져나옴 )
			}																			
		} while (Set.AgameScore == 6 || Set.BgameScore == 6);		//	먼저 게임 점수 6점 달성 시 Set 점수 획득. 
		
		if (Set.AgameScore > Set.BgameScore ) 	return 1;	//	return값은 setWinner?
		else return 2;						//	Set class에서 TieGame 객체 새로 생성하면서 Game
	}	//setPlay()

	
//	do {
//		pointWinner(Point.gameWinner);		//	Point.gameWinner - > game 획득자 반환.
//		
//		
//	} while (Set.AgameScore == 7 || Set.BgameScore == 7);
	
	
	
	
	
	
//		///
//		int cntDuece = 0;
//		int cntTie = 0;
//		
//		while(true) {
//			int gameWin = Point.gamePlay();
//			pointWinner(gameWin);
//			
//			//
//			
//			// 듀스도 타이도 아닐때...
//			if(!isDeuce(A,B,cntDuece) && Set.AgameScore==6 || B.getGameScore()==6) return A.getGameScore()==6 ? 1 : 2;
//			
//			// 듀스일때...
//			if(isDeuce(A,B,cntDuece)) cntDuece++;
//			if(cntDuece==3) return A.getGameScore()==7 ? 1 : 2;
//
//			// 타이일때...
//			if(cntTie==1) return A.getGameScore()==7 ? 1: 2;
//			if(isTie(A,B)) cntTie++; 
//				
//			
//		}

	@Override
	public void pointWinner(int p) {		//	p = 1 일 때, A 게임 점수 획득		/	2일 때 B 게임 점수 획득
		if (p == 1) Set.AgameScore ++; 
		else Set.BgameScore++;
		
	}


	@Override
	public void dispScoreBoard() {
		
	}


	
	
//	private static boolean isTie(Player A, Player B) {
//		return A.getGameScore()==6 && B.getGameScore()==6;
//	}
//
//	private static boolean isDeuce(Player A, Player B, int cntDuece) {
//		return (A.getGameScore() >= 5 && B.getGameScore() >= 5) && Math.abs(A.getGameScore()-B.getGameScore())==cntDuece;
//	}
//	
	
}	//class
