package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	
	public static void main(String[] args) {
		char a,b,c,d,e,f;
		
		a = 'q';
		System.out.println("1. º¯¼ö a°ªÀÌ q ¶Ç´Â QÀÎ°¡?"+(a=='q'||a=='Q'));
		
		b = ' ';
		System.out.println("2. º¯¼ö b°ªÀÌ °ø¹é ÀÌ³ª ÅÇÀÌ ¾Æ´Ñ°¡?"+(b!='\t' && b!=' '));
		
		c ='9';
		System.out.print("3. º¯¼ö c°¡ ¹®ÀÚ('0' ~ '9')ÀÎ°¡?");
		System.out.println(c>='0' && c<='9');
		
		d ='z';
		System.out.print("4. º¯¼ö c°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÎ°¡?");
		System.out.println((d>='a' && d<='z')||(d>='A' && d<='Z'));
		
		e='°ª';
		System.out.print("5. º¯¼ö e°¡ ÇÑ±ÛÀÎ°¡?");
		System.out.println(e>='°¡' && e<'ÆR');
		
		d='ªâ';
		System.out.print("6. º¯¼ö d°¡ ÀÏº»¾îÀÎ°¡?");
		System.out.println(((int)d >= 12353 && (int)d < 12439) || ((int)d >= 12449 && (int)d < 12538));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¹®ÀÚ¿­ ÀÔ·Â : ");
		String word = sc.nextLine();
		
		System.out.print("\n7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÎ°¡?");
		System.out.println(word.equals("exit"));
		
	}
	
}
