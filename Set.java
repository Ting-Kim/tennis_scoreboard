package tennis;

import java.util.Random;

import tennis.project1.IGame;
import tennis.project1.NoTieGame;
import tennis.project1.Setting;
import tennis.project1.TieGame;

public class Set implements IGame{

	// 필드
	static int AsetScore = 0;
	static int BsetScore = 0;
	static int AgameScore = 0;
	static int BgameScore = 0;
	static int ApointScore;
	static int BpointScore;
	
	// 세팅 메서드
	public void gameStart() {
		System.out.println("엔터를 누르면 게임 시작");

		// 
		Setting s = new Setting();
		s.setGameOption();

		// 플레이어명 랜덤으로 반환
		if(s.gameType==1) {
			System.out.printf("A : %s\n", getName());
			System.out.printf("B : %s\n", getName());
		} else {
			System.out.printf("A : %s, %s\n", getName(), getName());
			System.out.printf("B : %s, %s\n", getName(), getName());
		}
		
		setGame(s);

	}

	// 세트 게임 진행
	public void setGame(Setting s) {
		String winner = "";
		do {
			int setWin = s.tieBreak == 'y' ? TieGame.setPlay() : NoTieGame.setPlay();
			pointWinner(setWin);
			//
		} while (AsetScore > s.setNum/2 && BsetScore > s.setNum/2);
		winner = AsetScore > s.setNum/2 ? "A" : "B";
		
		System.out.printf("WINNER - %s\n", winner);
		System.out.println("= END =");
	}

	private static String getName() {
		Random random = new Random();
		char [] names = new char[3];
		for (int i = 0; i < names.length; i++) {
			names[i] = (char)(random.nextInt(90-65+1) + 65);
		}
		return new String(names);
	}

	@Override
	public void pointWinner(int p) {
		if(p==1) AsetScore++;
		else  BsetScore++;
	}

	@Override
	public void dispScoreBoard() {
		
	}

}