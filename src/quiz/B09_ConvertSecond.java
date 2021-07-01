package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	/*
	 초를 입력 받으면 년/일/시간/분/초로 변환하여 출력해보세요
	 ※ 단, 필요없는 단위는 출력하지 말 것
	 ex: 0년 0일 13시간 0분 5초인 경우 - > 13시간 0분 5초만 나와야 함
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputSecond = sc.nextInt();
		
		int[] converted = new int[4];
		int[] seconds = new int[4];

		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		String[] units = {"년","일","시","분"}; 
		
		for(int i = 0; i < converted.length; ++i) {
			converted[i] = inputSecond/seconds[i];
			inputSecond %= seconds[i];
		}
		
		boolean exist = false;
		
		for(int i =0; i<converted.length; ++i) {
			if(converted[i] !=0) {
				System.out.printf("%d%s",converted[i],units[i]);
				exist = true;
			}
		}
		System.out.printf("%d초",inputSecond);
		System.out.println();
		
//		int year = 0,day = 0 ,hour = 0 ,minute = 0;
//		
//		final int SECOND_PER_YAER = 365 * 24 * 60 * 60;
//		final int SECOND_PER_DAY = 24 * 60 * 60;
//		final int SECOND_PER_HOUR = 60 * 60;
//		final int SECOND_PER_MINUTE = 60;
//		
//		year = inputSecond / SECOND_PER_YAER;
//		inputSecond %= SECOND_PER_YAER;
//		
//		day = inputSecond / SECOND_PER_DAY;
//		inputSecond %= SECOND_PER_DAY;
//		
//		hour = inputSecond / SECOND_PER_HOUR;
//		inputSecond %= SECOND_PER_HOUR;
//		
//		minute = inputSecond / SECOND_PER_MINUTE;
//		inputSecond %= SECOND_PER_MINUTE;
//		
//		boolean exist = false;
//		
//		if(year != 0) {
//			System.out.print(year + "년 ");
//			exist = true;
//		}
//		if(day != 0 || exist) {
//			System.out.print(day + "일 ");
//			exist = true;
//		}
//		if(hour != 0 || exist) {
//			System.out.print(hour + "시 ");
//			exist = true;
//		}
//		if(minute != 0 || exist) {
//			System.out.print(minute + "분 ");
//			exist = true;
//		}
//			System.out.print(inputSecond+"초");
		
	}
}
