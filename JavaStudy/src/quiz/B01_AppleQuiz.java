package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	/*
	 	사과를 10개씩 담을 수 있는 바구니가 있다.
	 	
	 	사용자가 구매하고 싶은 사과의 개수를 입력하면
	 	사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
	 */
	public static void main(String[] args) {
		int basket;
		int apple;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고 싶은 사과의 갯수를 입력하세요:");
		apple = sc.nextInt();
		basket = apple/10;
		if(apple%10 != 0) {
			basket += 1;
		}
		//Math.ceil(a) : a를 소수 첫째 자리에서 올린다
		//Math.floor(a) : a를 소수 첫째 자리에서 내린다
		if(apple<0) {
			System.out.println("올바른 사과 개수가 아닙니다.");
		} else {
			System.out.printf("필요한 바구니의 개수는 %d개 입니다.",basket);
		}
	}
}
