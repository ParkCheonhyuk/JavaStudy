package quiz;

import java.util.Scanner;

public class D04_IsJavaVariable {
	/*
	 	사용자로부터 문자열을 입력받으면 해당 문자열이 자바의 변수로써 사용될 수 있는지
	 	검사하는 메서드를 만들고 테스트해보세요
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
