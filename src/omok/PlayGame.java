package omok;

import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args) {
					

		Scanner sc = new Scanner(System.in);
		String set;
				
		while(true) {
			Omok o = new Omok(); 
			o.playGame();
			o.viewPlate();
			System.out.println("������������������������������������������������������������������������");
			System.out.print(" ������ �ٽ� �����Ͻðڽ��ϱ�? (Y/N) >>");
			set = sc.next();
			System.out.println("������������������������������������������������������������������������");
			if(set.equals("N")||set.equals("n")){
				System.out.println("������ �������ϴ�.");
				break;
			}
		}
	}
}
