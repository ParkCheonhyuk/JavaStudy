package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class D02_LoadGame {
	
	/*
	 	�Ʊ� �����ص� ���������� ���̺����Ϸκ��� ���� ������ �о���� �� 
	 	������ ����ǵ��� ��������
	*/
	public static void main(String[] args) {
		try {
			File file = new File("����������.txt");
			FileReader filereader = new FileReader(file);
			
			BufferedReader bufferreader = new BufferedReader(filereader);
			String line = "";
			int win = 0, lose = 0, drew = 0;

			while((line = bufferreader.readLine())!= null) {
				boolean found = false;
				 
				if(line.contains("�Ѱ��Ӽ�")) {
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
