package quiz;

import java.util.Scanner;

public class A06_CelToFahr {
	/*
	 	����ڷκ��� ���� �µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
	 	(��ȯ ������ �˻� ���, ����� �Ҽ� ù° �ڸ�����)
	 */
	public static void main(String[] args) {
		double cel, fahr;
		Scanner sc = new Scanner(System.in);

		System.out.print("�����µ��� �Է����ּ���:");
		cel = sc.nextDouble();
		fahr = 1.8*cel+32;
		System.out.printf("����:%.1f�ɴ� ȭ��:%.1f���Դϴ�.",cel,fahr);
	}
	
}
