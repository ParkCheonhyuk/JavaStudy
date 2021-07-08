package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E01_SaveGame {
	
	/*
	 	간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 전적을 파일에 저장해보세요
	*/
	public static void main(String[] args) {
		start(0, 0, 0);
	}
	
	public static void start(int w, int l, int d) {
		Scanner sc = new Scanner(System.in);
		
		try {
			FileOutputStream out = new FileOutputStream("가위바위보.txt", false);
			String[] rsp = {"가위","바위","보"};
			int count = 1;
			int win = w;
			int lose = l;
			int drew = d;
			
			System.out.println("====가위 바위 보 게임====");
			int game_start; 
			out.write("────────────가위 바위 보 전적────────────\n".getBytes());
			while(true) {
				
				System.out.println("1.가위 2.바위 3.보");
				int player = sc.nextInt();
				
				if(player<0||player>4)continue;
				
				int com = (int)(Math.random()*3+1);
				if(com==1) {
					if(player == 1) {
						System.out.println("비겼습니다");
						
						drew++;
					}else if(player == 2) {
						System.out.println("플레이어가 이겼습니다");
						win++;
					}else if(player == 3) {
						System.out.println("컴퓨터가 이겼습니다");
						lose++;
					}
				}else if(com==2) {
					if(player == 1) {
						System.out.println("컴퓨터가 이겼습니다");
						lose++;
					}else if(player == 2) {
						System.out.println("비겼습니다");
						drew++;
					}else if(player == 3) {
						System.out.println("플레이어가 이겼습니다");
						win++;
					}
				}else if(com==3) {
					if(player == 1) {
						System.out.println("플레이어가 이겼습니다");
						win++;
					}else if(player == 2) {
						System.out.println("컴퓨터가 이겼습니다");
						lose++;
					}else if(player == 3) {
						System.out.println("비겼습니다");
						drew++;
					}
				}
				while(true) {
					System.out.print("게임을 계속 하시겠습니까? \n1.계속하기 2.끝내기 >>");
					game_start = sc.nextInt();
					if(game_start==1||game_start==2)break;
				}
				out.write((count+"번째 대결 : 플레이어:"+rsp[player-1]+"  컴퓨터:"+rsp[com-1]+"\n").getBytes());
				if(game_start==2)break;
				count ++;
			}
			out.write("\n──────────────────────────────────────\n".getBytes());
			out.write("승리/패배/비김/총게임수\n".getBytes());
			out.write((win+"/"+lose+"/"+drew+"/"+count).getBytes());
			out.write("\n──────────────────────────────────────\n".getBytes());
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
