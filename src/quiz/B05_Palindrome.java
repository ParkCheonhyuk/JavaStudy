package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	/*
	 	����ڷκ��� �ܾ �ϳ� �Է¹ް� �ش� �ܾ 
	 	ȸ���̶�� "PALINDROME"�� ���
	 	ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
	 	
	 	�� ȸ���̶� - MOM,BOB,ABBA,MADAM,EVE,TXT
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է��ϼ���:");
		String word = sc.nextLine();
		
		boolean palindrome = true;
		
		for(int i = 0; i<word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length()-1-i))
				palindrome = false;
		}
		
		if(palindrome) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
	}
}
