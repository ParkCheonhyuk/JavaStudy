package quiz;

import java.util.Scanner;

public class B09_31Game {
	/*
	 31 ������ ��������
	 	1. ��ǻ�Ϳ� ����� ������ ���鼭 ���ڸ� �����ؾ� �Ѵ�.
	 	(1,2,3 �ۿ� ������ �� ����)
	 	
	 	2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
	 
	 	3. ������ �������� �����Ѵ�.
	 
	 	4. �������� 31 �̻��� ���ڸ� �θ��� �÷��̾ �й��Ѵ�.
	 */
	public static void main(String[] args) {
		int sum = 0;
		int player,computer;
		boolean comWin = true;
		boolean playerWin = true;
		int turn = (int)(Math.random()*2);
		System.out.println("======���ӽ�ŸƮ======");
		if(turn==1) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�İ��Դϴ�.");
		}
		
		while(true) {
			if(turn == 1) {
				Scanner sc = new Scanner(System.in);
				System.out.print("�÷��̾�:");
				player= sc.nextInt();
			
				if(player>3) {
					System.out.print("�ٽ� �Է��ϼ���: ");
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
				System.out.println("��ǻ��: "+computer);
			sum+=computer;
			if(sum>=31) { 
				comWin =false;
				break;
			}
				turn = 1;
			}
		
			System.out.println("����:"+sum+"\n====================");
		}
			System.out.println("����:"+sum);
		if(comWin) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}else {
			System.out.println("�÷��̾ �̰���ϴ�");
		}
	}
	
}
