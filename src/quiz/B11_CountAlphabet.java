package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
	/*
	 	사용자로부터 문장을 하나 입력받고
	 	해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
	 	(대소문자도 구분할 것)
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 하나 입력 해주세요:");
		String text = sc.next();
		
		int[] lowercount = new int[26];
		int[] uppercount = new int[26];

		for(int i = 0, len = text.length(); i<len; ++i) {
			char ch = text.charAt(i);
			
			if(ch >='a' && ch<='z') {
				lowercount[ch-'a']++;
			}else if(ch >='A' && ch <='Z') {
				uppercount[ch-'A']++;
			}
		}
		
		for(int i = 0; i<uppercount.length; ++i) {
			System.out.printf("대문자 %c는 %d번 등장했습니다.\n",'A'+i,uppercount[i]);
		}
		for(int i = 0; i<uppercount.length; ++i) {
			System.out.printf("대문자 %c는 %d번 등장했습니다.\n",'a'+i,lowercount[i]);
		}
		
//		char[] alphabet = new char[52];
//		int[] count = new int[alphabet.length];
//
//		for (int i = 0; i<alphabet.length; ++i) {
//			if(i<26)
//				alphabet[i] = (char)(i+65);
//			else
//				alphabet[i] = (char)(i+71);
//		}
//		
//		for(int i = 0; i<text.length(); ++i) {
//			for(int j = 0; j<alphabet.length; ++j) {
//				if(text.charAt(i) == alphabet[j]) {
//					count[j]++;
//					break;
//				}
//			}
//		}
//		
//		for(int i = 0; i<alphabet.length; ++i) {
//			
//			System.out.print(alphabet[i]+" : "+count[i]+" 개 |");
//			if(i==25)
//				System.out.println();
//			
//		}
	}
}
