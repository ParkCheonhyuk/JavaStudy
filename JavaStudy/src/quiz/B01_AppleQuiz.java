package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	/*
	 	����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	 	
	 	����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
	 	����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
	 */
	public static void main(String[] args) {
		int basket;
		int apple;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ� ���� ����� ������ �Է��ϼ���:");
		apple = sc.nextInt();
		basket = apple/10;
		if(apple%10 != 0) {
			basket += 1;
		}
		//Math.ceil(a) : a�� �Ҽ� ù° �ڸ����� �ø���
		//Math.floor(a) : a�� �Ҽ� ù° �ڸ����� ������
		if(apple<0) {
			System.out.println("�ùٸ� ��� ������ �ƴմϴ�.");
		} else {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�.",basket);
		}
	}
}
