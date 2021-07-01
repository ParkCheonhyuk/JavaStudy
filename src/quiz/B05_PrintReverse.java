package quiz;

import java.util.Scanner;

public class B05_PrintReverse {
	// 사용자가 어떤 문장을 입력하면 그 문장을 거꾸로 출력해보세요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요:");
		String word = sc.nextLine();
		
		for(int i = word.length() - 1; i > -1; --i) {
			System.out.print(word.charAt(i));
		}
	}
}
