package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {
	/* 
	 	����ڷ� ���� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
	 	(switch-case���� ����� ��)
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String season;
		int month;
		
		System.out.print("���� �Է����ּ��� :");
		month = sc.nextInt();

		
		switch (month) {
		case 3:	case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		default:
			season = "����";
			break;
		}
		if(month <1 || month > 12) {
			System.out.println("�߸��� �����Դϴ�.");
		}else {
			System.out.printf("%d���� %s�Դϴ�.\n",month,season);
		}
	}
}
