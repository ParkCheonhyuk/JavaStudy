package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E05_Decrypt {
	/*
	 	사용자로부터 파일명과 열쇠값을 입력받으면 
	 	해당 파일을 열쇠값으로 복호화 한 결과물을 생성하는 프로그램을 만들어 보세요
	 	
	 	test. 암호화되어있는 frankenstein_encrypted.txt를 복호화 해보세요
	*/
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명을 입력하세요>>");
		String file_name = sc.nextLine();
		System.out.print("키값을 입력하세요>>");
		int key = sc.nextInt();
		
		
		try {
			
			BufferedReader in = new BufferedReader(
					new FileReader(file_name+"_encrypted.txt"));
			BufferedWriter out = new BufferedWriter(
					new FileWriter(file_name+"_decrypted.txt"));
			
			int len = -1;
			char ch;
			len = in.read();
			
			for(;len!= -1;) {	
				ch = (char)len;
				System.out.println(ch); 
				if((ch>='A'&&ch<='B')||(ch>='a'&&ch<='b')) {
					out.write(ch+24);
				} else if((ch>='B'&&ch<='Z')||(ch>='b'&&ch<='z')){
					out.write(ch-key);
				} else {
					out.write(ch);
				}
				len = in.read();
			}
			
			in.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복호화가 끝났습니다");
	}
}
