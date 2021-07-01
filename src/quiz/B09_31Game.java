package quiz;

import java.util.Scanner;

public class B09_31Game {
	/*
	 31 게임을 만들어보세요
	 	1. 컴퓨터와 사람이 번갈아 가면서 숫자를 선택해야 한다.
	 	(1,2,3 밖에 선택할 수 없음)
	 	
	 	2. 컴퓨터는 랜덤으로 숫자를 선택한다.
	 
	 	3. 선공은 랜덤으로 결정한다.
	 
	 	4. 마지막에 31 이상의 숫자를 부르는 플레이어가 패배한다.
	 */
	public static void main(String[] args) {
		int sum = 0;
		int player,computer;
		boolean comWin = true;
		boolean playerWin = true;
		int turn = (int)(Math.random()*2);
		System.out.println("======게임스타트======");
		if(turn==1) {
			System.out.println("선공입니다.");
		}else {
			System.out.println("후공입니다.");
		}
		
		while(true) {
			if(turn == 1) {
				Scanner sc = new Scanner(System.in);
				System.out.print("플레이어:");
				player= sc.nextInt();
			
				if(player>3) {
					System.out.print("다시 입력하세요: ");
					player = sc.nextInt();
		}
			sum+=player;
			if(sum>=31) {
				playerWin =false;
				break;
			}
				turn = 0;
			}else {	
				computer = (((int)(Math.random()*3+1)));
				System.out.println("컴퓨터: "+computer);
			sum+=computer;
			if(sum>=31) { 
				comWin =false;
				break;
			}
				turn = 1;
			}
		
			System.out.println("누적:"+sum+"\n====================");
		}
			System.out.println("누적:"+sum);
		if(comWin) {
			System.out.println("컴퓨터가 이겼습니다");
		}else {
			System.out.println("플레이어가 이겼습니다");
		}
	}
	
}
