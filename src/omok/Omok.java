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
			if(turn == 1)  System.out.println("¹éµ¹ Â÷·Ê ÀÔ´Ï´Ù");
			else System.out.println("Èæµ¹ Â÷·Ê ÀÔ´Ï´Ù");
			System.out.print("X ÁÂÇ¥¸¦ ÀÔ·ÂÇÏ¼¼¿ä>>");
			x = sc.nextInt();
			System.out.print("Y ÁÂÇ¥¸¦ ÀÔ·ÂÇÏ¼¼¿ä>>");
			y = sc.nextInt();
			if(x>MAX_X || y>MAX_Y) {
				System.out.println("±×°÷¿¡´Â ¿À¸ñ¾ËÀ» µÑ ¼ö ¾ø½À´Ï´Ù");
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
		System.out.println("  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
		for(int[] i : plate) {
			groundY++;
			System.out.print(groundY < 10 ? ""+groundY + " ¦¢" : groundY+"¦¢");
			for(int j : i) {
				
				if(j == 1) {
					System.out.print(" ¡Ü");	
				} else if(j == 2) {
					System.out.print(" ¡Û"); 
				} else {
					System.out.print(" ¦Ù"); 
				}
			}
			System.out.println(" ¦¢");
		}
		System.out.println("  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		
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
		name = (turn == 1) ? "Èæ" : "¹é"; 
		
		while(true) {
			if( plate[checkY][checkX] != 0 ) {
				System.out.println("¡ØÀÌ¹Ì ¿À¸ñ¾ËÀÌ ÀÖ½À´Ï´Ù.");
				System.out.println("´Ù¸¥ ÁÂÇ¥¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
				System.out.print("X ÁÂÇ¥¸¦ ÀÔ·ÂÇÏ¼¼¿ä>>");
				checkX = sc.nextInt()-1;
				System.out.print("Y ÁÂÇ¥¸¦ ÀÔ·ÂÇÏ¼¼¿ä>>");
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
			System.out.println(name + "½Â¸®");
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
			System.out.println(name + "½Â¸®");
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
			System.out.println(name + "½Â¸®");
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
			System.out.println(name + "½Â¸®");
			return 1;
		}
		return 0;
	}
}
