package quiz;

import java.util.Scanner;

public class A06_GuessAge {
	/*
	 	사용자로부터 태어난 해와 올해의 년도를 입력받으면
	 	그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		int year1, year2, age ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 연도를 입력하시오:");
		year1 = sc.nextInt();
		System.out.print("올해의 년도를 입력하시오:");
		year2 = sc.nextInt();
		age = year2-year1;
		System.out.println("당신의 나이는 "+ (age+1) + "세 입니다.");
	}
	
}
