package quiz;

import java.util.Scanner;

public class A06_GuessAge {
	/*
	 	����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
	 	�� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	 */
	public static void main(String[] args) {
		int year1, year2, age ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ ������ �Է��Ͻÿ�:");
		year1 = sc.nextInt();
		System.out.print("������ �⵵�� �Է��Ͻÿ�:");
		year2 = sc.nextInt();
		age = year2-year1;
		System.out.println("����� ���̴� "+ (age+1) + "�� �Դϴ�.");
	}
	
}
