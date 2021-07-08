package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E05_HackTool {
	/*
	 	우리가 사용한 암호 방식은 키 값이 25개 밖에 없는 허접한 암호화 방식입니다
	 	
	 	목표 파일의 맨 앞부분 10줄을 1 ~ 25의 키로 모두 복호화 해보세요
	*/
	
	public static void main(String[] args) {
		decryption("frankenstein_encrypted.txt");
	}
	
	public static void decryption(String path) {
		File file = new File(path);
		try{
			
			for(int key = 1; key <= 25; key++) {
				
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
				System.out.println("------------------[key:"+key+"]------------------");
				String line;
				for(int j = 0; j < 10; j++) {
					line = in.readLine();
					for(char ch : line.toCharArray()) {
						if(Character.isUpperCase(ch)) {
							ch = (char)((ch- 'A' + key) % 26 +'A');
						}else if(Character.isLowerCase(ch)) {
							ch = (char)((ch- 'a' + key) % 26 +'a');
						}
						System.out.print(ch);
					}
					System.out.println();
				}
				in.close();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
