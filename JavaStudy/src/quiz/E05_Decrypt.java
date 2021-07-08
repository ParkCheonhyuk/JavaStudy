package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E05_Decrypt {
	/*
	 	����ڷκ��� ���ϸ�� ���谪�� �Է¹����� 
	 	�ش� ������ ���谪���� ��ȣȭ �� ������� �����ϴ� ���α׷��� ����� ������
	 	
	 	test. ��ȣȭ�Ǿ��ִ� frankenstein_encrypted.txt�� ��ȣȭ �غ�����
	*/
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ��� �Է��ϼ���>>");
		String file_name = sc.nextLine();
		System.out.print("Ű���� �Է��ϼ���>>");
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
		System.out.println("��ȣȭ�� �������ϴ�");
	}
}
