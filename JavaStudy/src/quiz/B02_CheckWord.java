package quiz;

import java.util.Scanner;

public class B02_CheckWord {
	/*
	 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	 	ù ��° ���ڰ� �����̸鼭 ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ����ϰ�
	 	��ġ���� ������ "NOT OK"�� ����غ�����
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է����ּ���:");
		String word = sc.nextLine();
		if(((word.charAt(0)>='A' && word.charAt(0)<='Z') || (word.charAt(0)>='a' && word.charAt(0)<='z')) && word.charAt(0)==word.charAt(word.length()-1)) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
		
	}
	
}
