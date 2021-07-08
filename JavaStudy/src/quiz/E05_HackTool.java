package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E05_HackTool {
	/*
	 	�츮�� ����� ��ȣ ����� Ű ���� 25�� �ۿ� ���� ������ ��ȣȭ ����Դϴ�
	 	
	 	��ǥ ������ �� �պκ� 10���� 1 ~ 25�� Ű�� ��� ��ȣȭ �غ�����
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
