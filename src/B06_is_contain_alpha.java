import java.util.Scanner;

public class B06_is_contain_alpha {
	/*
	 	1. ����ڰ� �Է��� ���ڿ���
	 	���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���	 	
	 	
	 	2. ����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true, �ƴϸ� false
	 	
	 	3. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϸ� false
	 		(����� ����: ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���:");
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
