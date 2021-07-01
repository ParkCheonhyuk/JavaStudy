package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
	/*
	 	사용자가 숫자를 입력 했을 때
	 	
	 	1. 10부터 입력한 숫자까지의 총합을 구해보세요
	 	
	 	2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어보세요
	 	
	 	3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();
		int sum = 0;
		int start, end;
		
		if(number > 10) {
			start = 10;
			end = number; 
		} else {
			start = number;
			end = 10;
		}
			for(int i=start; i<=end; i++) {
					sum += i;
			}
			
			System.out.printf("10부터 %d까지 총합은 %d입니다.\n",number,sum);
			
			if(number > 1000) {
				for(int i=1000; i<=number; ++i) {
					System.out.printf("1000부터 %d까지 출력: %d\n",number,i);
				}
			} else {
				for(int i=1000; i>=number; --i) {
					System.out.printf("1000부터 %d까지 출력: %d\n",number,i);
				}
			}
			
			if(number>1) {
				for(int i = 1; i<=number; ++i) {
					if(i%5==0)
						System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n",number,i);
				}
			} else {
				for(int i = 1; i>=number; --i) {
					if(i%5==0)
						System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n",number,i);
				}
			}
		}
	}
