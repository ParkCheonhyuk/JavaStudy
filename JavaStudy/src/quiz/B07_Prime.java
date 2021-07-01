package quiz;

import java.util.Scanner;

public class B07_Prime {
	
	/*
	  사용자로부터 숫자(양수)를 입력받으면
	  1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	  (음수를 입력하면 다시 제대로 입력하게 하기)
	  ※소수: 나누어 떨어지는 수가 1과 자기 자신밖에 없는 숫자
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요:");
		int prime = sc.nextInt();
		
		for(;prime<0;) {
				System.out.print("숫자를 다시 입력해주세요:");
				prime = sc.nextInt();
			}
		System.out.print("2 ");
		for(int i = 3; i<=prime; i+=2) {
			boolean prime_true = true;
			for(int j = 3; j<=Math.sqrt(i); j+=2) {
				if(i%j==0) {
					prime_true = false;
				}
			}
			if(prime_true) {
				System.out.print(i+" ");
			}	
		}
	}	
}
