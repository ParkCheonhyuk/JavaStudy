package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {
	/* 
	 	사용자로 부터 달을 입력받으면 해당하는 계절을 출력해보세요
	 	(switch-case문을 사용할 것)
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String season;
		int month;
		
		System.out.print("월을 입력해주세요 :");
		month = sc.nextInt();

		
		switch (month) {
		case 3:	case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		default:
			season = "없음";
			break;
		}
		if(month <1 || month > 12) {
			System.out.println("잘못된 계절입니다.");
		}else {
			System.out.printf("%d월은 %s입니다.\n",month,season);
		}
	}
}
