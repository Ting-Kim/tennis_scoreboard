package tennis;

public class Run {
	public static void main(String[] args) {
		String winner = "";	//	승자 변수 선언
		
		//	게임 세팅 ( 조건 선택 )
		Setting.setGameOption();
		
		//	게임 진행
		switch (Setting.setNum) {
		case 3:
			do {
				Point.play();	//	Game 점수 획득을 위한 게임 진행
			} while (Point.ASetCnt < 3 || Point.BSetCnt < 3);	//	3Set 선승 시 종료.
			if (Point.ASetCnt > Point.BSetCnt) winner = "A";
			else winner = "B";
			break;
			
		case 5:
			do {
				Point.play();
			} while (Point.ASetCnt < 5 || Point.BSetCnt < 5);	//	위와 동일
			if (Point.ASetCnt > Point.BSetCnt) winner = "A";
			else winner = "B";
			break;
		}
		
		
	}	//main
}	//class
