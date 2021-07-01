package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	/*
	 �ʸ� �Է� ������ ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
	 �� ��, �ʿ���� ������ ������� �� ��
	 ex: 0�� 0�� 13�ð� 0�� 5���� ��� - > 13�ð� 0�� 5�ʸ� ���;� ��
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
		String[] units = {"��","��","��","��"}; 
		
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
		System.out.printf("%d��",inputSecond);
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
//			System.out.print(year + "�� ");
//			exist = true;
//		}
//		if(day != 0 || exist) {
//			System.out.print(day + "�� ");
//			exist = true;
//		}
//		if(hour != 0 || exist) {
//			System.out.print(hour + "�� ");
//			exist = true;
//		}
//		if(minute != 0 || exist) {
//			System.out.print(minute + "�� ");
//			exist = true;
//		}
//			System.out.print(inputSecond+"��");
		
	}
}
