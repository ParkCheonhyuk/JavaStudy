package quiz;

import java.util.Scanner;

public class A06_CelToFahr {
	/*
	 	사용자로부터 섭씨 온도를 입력받으면 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	 	(변환 공식은 검색 허용, 출력은 소수 첫째 자리까지)
	 */
	public static void main(String[] args) {
		double cel, fahr;
		Scanner sc = new Scanner(System.in);

		System.out.print("섭씨온도를 입력해주세요:");
		cel = sc.nextDouble();
		fahr = 1.8*cel+32;
		System.out.printf("섭씨:%.1f℃는 화씨:%.1f℉입니다.",cel,fahr);
	}
	
}
