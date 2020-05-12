package tennis;

import java.util.Scanner;

// 게임 옵션 설정 클래스
public class Setting {

	int gender;			// 플레이어 성별
	int setNum;			// 세트횟수
	int gameType;		// 단식/복식
	char tieBreak;		// 타이브레이크 유무

	public  void setGameOption() {
		// 게임 설정
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("[ 1.남자   2.여자   3.혼합 ]\n선택 ? ");
			gender = scanner.nextInt();

			if(gender==1) {
				setNum = 5;
				break;
			} else if(gender==2 || gender==3){
				setNum = 3;
				break;
			} else {
				continue;
			}
		}

		do {
			System.out.print("[ 1.단식   2.복식 ]\n선택 ? ");
			gameType = scanner.nextInt();
		} while (gameType!=1 && gameType!=2);

		do {
			System.out.print("타이브레이크 적용 [ y/n ]  ?");
			tieBreak = scanner.next().charAt(0);
		} while (tieBreak!='y' && tieBreak!='n');

		scanner.close();
		System.out.println("설정완료");
	}
}
