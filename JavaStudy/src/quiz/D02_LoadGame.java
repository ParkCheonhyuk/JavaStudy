package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class D02_LoadGame {
	
	/*
	 	아까 저장해둔 가위바위보 세이브파일로부터 전적 정보를 읽어들인 후 
	 	게임이 진행되도록 만들어보세요
	*/
	public static void main(String[] args) {
		try {
			File file = new File("가위바위보.txt");
			FileReader filereader = new FileReader(file);
			
			BufferedReader bufferreader = new BufferedReader(filereader);
			String line = "";
			int win = 0, lose = 0, drew = 0;

			while((line = bufferreader.readLine())!= null) {
				boolean found = false;
				 
				if(line.contains("총게임수")) {
					String[] str = line.split("");
					found = true;
					
				}
			}
			System.out.println(win + " " + lose + " " + drew);
			//E01_SaveGame.start(win, lose, drew);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
