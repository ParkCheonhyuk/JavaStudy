package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E01_SaveGame {
	
	/*
	 	������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ������ ���Ͽ� �����غ�����
	*/
	public static void main(String[] args) {
		start(0, 0, 0);
	}
	
	public static void start(int w, int l, int d) {
		Scanner sc = new Scanner(System.in);
		
		try {
			FileOutputStream out = new FileOutputStream("����������.txt", false);
			String[] rsp = {"����","����","��"};
			int count = 1;
			int win = w;
			int lose = l;
			int drew = d;
			
			System.out.println("====���� ���� �� ����====");
			int game_start; 
			out.write("���������������������������� ���� �� ����������������������������\n".getBytes());
			while(true) {
				
				System.out.println("1.���� 2.���� 3.��");
				int player = sc.nextInt();
				
				if(player<0||player>4)continue;
				
				int com = (int)(Math.random()*3+1);
				if(com==1) {
					if(player == 1) {
						System.out.println("�����ϴ�");
						
						drew++;
					}else if(player == 2) {
						System.out.println("�÷��̾ �̰���ϴ�");
						win++;
					}else if(player == 3) {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�");
						lose++;
					}
				}else if(com==2) {
					if(player == 1) {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�");
						lose++;
					}else if(player == 2) {
						System.out.println("�����ϴ�");
						drew++;
					}else if(player == 3) {
						System.out.println("�÷��̾ �̰���ϴ�");
						win++;
					}
				}else if(com==3) {
					if(player == 1) {
						System.out.println("�÷��̾ �̰���ϴ�");
						win++;
					}else if(player == 2) {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�");
						lose++;
					}else if(player == 3) {
						System.out.println("�����ϴ�");
						drew++;
					}
				}
				while(true) {
					System.out.print("������ ��� �Ͻðڽ��ϱ�? \n1.����ϱ� 2.������ >>");
					game_start = sc.nextInt();
					if(game_start==1||game_start==2)break;
				}
				out.write((count+"��° ��� : �÷��̾�:"+rsp[player-1]+"  ��ǻ��:"+rsp[com-1]+"\n").getBytes());
				if(game_start==2)break;
				count ++;
			}
			out.write("\n����������������������������������������������������������������������������\n".getBytes());
			out.write("�¸�/�й�/���/�Ѱ��Ӽ�\n".getBytes());
			out.write((win+"/"+lose+"/"+drew+"/"+count).getBytes());
			out.write("\n����������������������������������������������������������������������������\n".getBytes());
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
