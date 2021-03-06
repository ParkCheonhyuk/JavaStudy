package omok;

import java.util.Scanner;

public class Omok implements OmokGame{
	final int MAX_X = 19;
	final int MAX_Y = 19;
	int[][] plate = new int[MAX_X][MAX_Y];
	
	public void playGame() {
		int State = 0;
		int turn = 0; 		
		int x = 0; 		
		int y = 0; 	
		
		Scanner sc = new Scanner(System.in);
		while(State == 0) {
			viewPlate();		
			if(turn == 1)  System.out.println("寥給 離滔 殮棲棻");
			else System.out.println("�瘚� 離滔 殮棲棻");
			System.out.print("X 謝ル蒂 殮溘ж撮蹂>>");
			x = sc.nextInt();
			System.out.print("Y 謝ル蒂 殮溘ж撮蹂>>");
			y = sc.nextInt();
			if(x>MAX_X || y>MAX_Y) {
				System.out.println("斜夠縑朝 螃跡憲擊 萃 熱 橈蝗棲棻");
				continue;
			}
			
			turn = (turn == 1) ? 2 : 1;
			
			State = action(x, y, turn);
		}
	}
	
	@Override
	public void viewPlate() {		
		
		int groundY = 0;				
		int groundX = 0;		
		System.out.println("  忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		for(int[] i : plate) {
			groundY++;
			System.out.print(groundY < 10 ? ""+groundY + " 弛" : groundY+"弛");
			for(int j : i) {
				
				if(j == 1) {
					System.out.print(" ≒");	
				} else if(j == 2) {
					System.out.print(" ∞"); 
				} else {
					System.out.print(" 肌"); 
				}
			}
			System.out.println(" 弛");
		}
		System.out.println("  戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
		
		System.out.print("  ");
		
		for(int[] i : plate) {
			groundX++;
			System.out.print(" " + groundX);
		}
		
		System.out.print("\n");
	}
	
	@Override
	
	public int action(int x, int y, int turn) {
		
		Scanner sc = new Scanner(System.in);
		
		int checkX = --x;
		int checkY = --y;
		
		String name = new String();
		name = (turn == 1) ? "��" : "寥"; 
		
		while(true) {
			if( plate[checkY][checkX] != 0 ) {
				System.out.println("≦檜嘐 螃跡憲檜 氈蝗棲棻.");
				System.out.println("棻艇 謝ル蒂 殮溘ж撮蹂.");
				System.out.print("X 謝ル蒂 殮溘ж撮蹂>>");
				checkX = sc.nextInt()-1;
				System.out.print("Y 謝ル蒂 殮溘ж撮蹂>>");
				checkY = sc.nextInt()-1;
			} else {
				plate[checkY][checkX] = turn;
				break;
			}
		}
		
		if(check_horizontal(checkX, checkY, turn, name) == 0)return 0;
		if (check_vertical(checkX, checkY, turn, name) == 0)return 0;
		if (check_diagonal(checkX, checkY, turn, name) == 0)return 0;
		if (check_skewdiagonal(checkX, checkY, turn, name) == 0)return 0;
		return 1;
	}
	
	public int check_horizontal(int checkX, int checkY, int turn, String name) {
		int count = 0;
		while(plate[checkY][checkX] == turn && checkX > 0) {
			checkX--;
		}
		while(plate[checkY][++checkX] == turn && checkX <= MAX_X) {
			System.out.println(count);
			count++;
		}
		if(count == 4) {
			System.out.println(name + "蝓葬");
			return 1;
		}
		return 0;
	}
	
	public int check_vertical(int checkX, int checkY, int turn, String name) {
		int count = 0;
		while(plate[checkY][checkX] == turn && checkY > 0) {
			checkY--;
		}
		while(plate[++checkY][checkX] == turn && checkY <= MAX_Y) {
			count++;
		}
		if(count == 4) {
			System.out.println(name + "蝓葬");
			return 1;
		}
		return 0;
	}
	
	private int check_diagonal(int checkX, int checkY, int turn, String name) {
		int count = 0;
		while(plate[checkY][checkX] == turn && checkY > 0 && checkX > 0) {
			checkY--;
			checkX--;
		}
		while(plate[++checkY][++checkX] == turn && checkY <= MAX_Y && checkX <= MAX_X) {
			count++;
		}
		if(count == 4) {
			System.out.println(name + "蝓葬");
			return 1;
		}
		return 0;
	}
	
	private int check_skewdiagonal(int checkX, int checkY, int turn, String name) {
		int count = 0;
		while(plate[checkY][checkX] == turn && checkY > 0 && checkX > 0) {
			checkY++;
			checkX--;
		}
		while(plate[--checkY < 0 ? 0 : checkY][++checkX] == turn && checkY <= MAX_Y && checkX <= MAX_X) {
			count++;
		}
		if(count == 4) {
			System.out.println(name + "蝓葬");
			return 1;
		}
		return 0;
	}
}
