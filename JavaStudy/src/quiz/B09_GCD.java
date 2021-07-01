package quiz;

import java.util.Scanner;

public class B09_GCD {
	/*
	 	# 최대공약수
	 	 
	 	 두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요
	 	 
	 	 - 두 숫자의 공약수 중 가장 큰 공약수
	  	20[1,2,4,5,10,20]
	  	50[1,2,5,10,25,50]
	  		
	  	의 경우 10이 최대 공약수
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력:");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력:");
		int num2 = sc.nextInt();
		
		int min = num1>num2 ? num2 : num1;
		
//		int max = Math.max(num1, num2);
//		int min = Math.min(num1, num2);
		
		int gcd=0;
		for(int i=min;i>=1; i--) {
			if(num1%i==0&&num2%i==0) {
				gcd=i;
				break;
			}
				
		}
		
		System.out.println("최대 공약수는"+gcd+"입니다.");
	}
}
