package quiz;

import java.util.Scanner;

public class B09_GCD {
	/*
	 	# �ִ�����
	 	 
	 	 �� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
	 	 
	 	 - �� ������ ����� �� ���� ū �����
	  	20[1,2,4,5,10,20]
	  	50[1,2,5,10,25,50]
	  		
	  	�� ��� 10�� �ִ� �����
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է�:");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		int num2 = sc.nextInt();
		
		int min = num1>num2 ? num2 : num1;
		
//		int max = Math.max(num1, num2);
//		int min = Math.min(num1, num2);
		
		int gcd=0;
		for(int i=min;i>=1; i--) {
			if(num1%i==0&&num2%i==0) {
				gcd=i;
				break;
			}
				
		}
		
		System.out.println("�ִ� �������"+gcd+"�Դϴ�.");
	}
}
