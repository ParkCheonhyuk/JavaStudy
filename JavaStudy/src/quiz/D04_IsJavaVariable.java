package quiz;

import java.util.Scanner;

public class D04_IsJavaVariable {
	/*
	 	����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� ���� �� �ִ���
	 	�˻��ϴ� �޼��带 ����� �׽�Ʈ�غ�����
	*/
	
	public static void main(String[] args) {
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check("String".toCharArray()));
		
	}
	
	public static boolean check(char[] str) {
		boolean check = Character.isJavaIdentifierStart(str[0]);
		for(int i = 1; i < str.length; ++i) {
			Character.isJavaIdentifierPart(str[i]); 
		}
		return check;
	}
}
