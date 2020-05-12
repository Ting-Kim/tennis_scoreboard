package tennis_scoreboard;

public class MeetingContents {

	public static void main(String[] args) {
		
		//	Point 이겨서 빠져나온다=> 
		//	승리자 조건			
//		i ) 듀스 발생 X
//		
//
//		ii ) 듀스 발생
//		while(Math.abs(A - B) != 2) {}
		
		/*
		 *  < 순서도 >
		 * 1. setting 
		 * 		- 남자1/여자2/혼합3
		 * 			5세트/ 3세트
		 * 		- 단식1/복식2
		 * 		- player 이니셜 랜덤
		 * 		- 타이브레이크 여부 y/n
		 * 
		 *  2. game 
		 *  	- 엔터 진행 , 포인트 랜덤부여 ... 3:3 포인트 듀스 -> 2점먼저 따야 승리 
		 *  		듀스일 때 먼저 한번 이기면 어드벤티지 적용, 어드벤티지 적용된 상태에서 한 번 더 이겨야 승! 무한루프 가능..
		 *  		40:40(듀스) -> 40A:40 -> 40A:40A == 40:40 -> 40A:40 ->...
		 *  	-> 1게임 끗.... 5:5 게임듀스 -> 2게임을 먼저 따야 승리
		 *  					6:6 - 타이브레이크 O -> 1게임만 먼저 따면 1세트 승리
		 *  						 - 타이브레이크 X -> 2게임 먼저 따야 승리... ..
		 * 		-> 1세트 끝... 5/3세트 진행 : 먼저 3/2세트 선점하면 바로 종료
		 * 
		 * 	< 클래스 >
		 * main()
		 * 		- getName()
		 * 
		 * 	Setting : 게임 설정 
		 * 		 초기화 생성자(int gender, int gameType, char tieBreak){}
		 * 		필드 - [static final] gender, gameType(단/복식), tieBreak(y/n), 
		 * 		메서드 - 
		 * 
		 * Player (A/B)
		 * 		필드 - pointScore, gameScore, setCnt==3 종료 
		 * 		메서드 - setter
		 * 
		 * Point implements IGame
		 * 		생성자(Player A, Player B)
		 * 		필드 - randomPoint = Math.random()*2+1;			-> pointWinner(randomPoint);
		 * 		메서드 - pointWinner(int p);			-- p=1 A.setPointScore(A.pointScore++)
		 * 				- dispScoreBoard();
		 * 
		 * 
		 * Game implements IGame
		 * 		생성자(Player A, Player B)
		 * 						0	1	2	3	4
		 * 		필드 - point(0/15/30/40/40A),  
		 * 		메서드 - getter/setter
		 * 				- pointWinner(int p);		-- 
		 * 				- dispScoreBoard();
		 * 
		 * 인터페이스 IGame
		 * 		- pointWinner(int p);
		 * 		- dispScoreBoard();
		 * 
		 * 
		 */
	}

}
