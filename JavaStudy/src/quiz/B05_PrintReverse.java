package quiz;

import java.util.Scanner;

public class B05_PrintReverse {
	// ����ڰ� � ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է��ϼ���:");
		String word = sc.nextLine();
		
		for(int i = word.length() - 1; i > -1; --i) {
			System.out.print(word.charAt(i));
		}
	}
}
