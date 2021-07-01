import java.util.Scanner;

public class B06_is_contain_alpha {
	/*
	 	1. 사용자가 입력한 문자열에
	 	알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력	 	
	 	
	 	2. 사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true, 아니면 false
	 	
	 	3. 사용자가 허락한 문자만으로 이루어진 문자열이라면 true, 아니면 false
	 		(허락한 문자: 알파벳 소문자, 숫자, _, $, 첫번째 문자에 숫자 불가)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요:");
		String word = sc.nextLine();
		
		int length = word.length();
		
		boolean alphabet = false;
		boolean check = true;
		boolean letter_check = true;
	
		for(int i = 0; i<length; i++) {
			if((word.charAt(i)>='A' && word.charAt(i)<='Z') || (word.charAt(i)>='a' && word.charAt(i)<='z')) {
				alphabet = true;
				break;
			}
		}
		System.out.println(alphabet);
		
		for(int i = 0; i<length; i++) {
			if((word.charAt(i)>='A' && word.charAt(i)<='Z') || (word.charAt(i)>='a' && word.charAt(i)<='z')) {
				continue;
			}
			check = false;
			break;
		}
		
		System.out.println(check);
		
		for(int i = 0; i<length; i++) {
			char ch = word.charAt(i);
			if(word.charAt(0)>='0'&& word.charAt(0)<='9') {
				letter_check= false;
				break;
			}
			if(!((ch>='a' && ch<='z')||(ch>='0' && ch<='9')||(ch=='_')||(ch=='$'))) {
				letter_check = false;
				break;
			}
		}
		System.out.println(letter_check);
	}
}
