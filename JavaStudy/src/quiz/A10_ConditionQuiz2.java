package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	
	public static void main(String[] args) {
		char a,b,c,d,e,f;
		
		a = 'q';
		System.out.println("1. ���� a���� q �Ǵ� Q�ΰ�?"+(a=='q'||a=='Q'));
		
		b = ' ';
		System.out.println("2. ���� b���� ���� �̳� ���� �ƴѰ�?"+(b!='\t' && b!=' '));
		
		c ='9';
		System.out.print("3. ���� c�� ����('0' ~ '9')�ΰ�?");
		System.out.println(c>='0' && c<='9');
		
		d ='z';
		System.out.print("4. ���� c�� ������(�빮�� �Ǵ� �ҹ���)�ΰ�?");
		System.out.println((d>='a' && d<='z')||(d>='A' && d<='Z'));
		
		e='��';
		System.out.print("5. ���� e�� �ѱ��ΰ�?");
		System.out.println(e>='��' && e<'�R');
		
		d='��';
		System.out.print("6. ���� d�� �Ϻ����ΰ�?");
		System.out.println(((int)d >= 12353 && (int)d < 12439) || ((int)d >= 12449 && (int)d < 12538));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String word = sc.nextLine();
		
		System.out.print("\n7. ����ڰ� �Է��� ���ڿ��� exit�ΰ�?");
		System.out.println(word.equals("exit"));
		
	}
	
}
