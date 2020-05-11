package tennis;

public class Point {
	static int ASetCnt = 0;
	static int BSetCnt = 0;
	static int AGameScore = 0;
	static int BGameScore = 0;
	
	static void play(){
		
		switch (Setting.tieBreak) {
		case 'y':
		do {
			Set.point();
			if (AGameScore == 6 && BGameScore == 6) {	//	6:6 동점 상황에 tiebreak 발생
				TieGame.tie();
			}
		} while (Math.abs(AGameScore-BGameScore) < 2 || AGameScore < 6 || BGameScore < 6);	
		//	2점차 && 두 팀 모두 6점 이상인 경우 종료.
		
		if (Point.AGameScore > Point.BGameScore) ASetCnt++;
		else BSetCnt++;
			
			break;
			
			
			
		case 'n':
			break;
		}
		
	}
}

