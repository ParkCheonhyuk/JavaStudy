package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	
	public static void main(String[] args) {
		char a,b,c,d,e,f;
		
		a = 'q';
		System.out.println("1. 변수 a값이 q 또는 Q인가?"+(a=='q'||a=='Q'));
		
		b = ' ';
		System.out.println("2. 변수 b값이 공백 이나 탭이 아닌가?"+(b!='\t' && b!=' '));
		
		c ='9';
		System.out.print("3. 변수 c가 문자('0' ~ '9')인가?");
		System.out.println(c>='0' && c<='9');
		
		d ='z';
		System.out.print("4. 변수 c가 영문자(대문자 또는 소문자)인가?");
		System.out.println((d>='a' && d<='z')||(d>='A' && d<='Z'));
		
		e='값';
		System.out.print("5. 변수 e가 한글인가?");
		System.out.println(e>='가' && e<'힣');
		
		d='も';
		System.out.print("6. 변수 d가 일본어인가?");
		System.out.println(((int)d >= 12353 && (int)d < 12439) || ((int)d >= 12449 && (int)d < 12538));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String word = sc.nextLine();
		
		System.out.print("\n7. 사용자가 입력한 문자열이 exit인가?");
		System.out.println(word.equals("exit"));
		
	}
	
}
