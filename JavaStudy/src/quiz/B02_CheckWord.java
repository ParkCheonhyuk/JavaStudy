package quiz;

import java.util.Scanner;

public class B02_CheckWord {
	/*
	 	사용자로부터 단어를 하나 입력받고
	 	첫 번째 글자가 영어이면서 마지막 번째 글자가 일치하면 "OK"를 출력하고
	 	일치하지 않으면 "NOT OK"를 출력해보세요
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력해주세요:");
		String word = sc.nextLine();
		if(((word.charAt(0)>='A' && word.charAt(0)<='Z') || (word.charAt(0)>='a' && word.charAt(0)<='z')) && word.charAt(0)==word.charAt(word.length()-1)) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
		
	}
	
}
