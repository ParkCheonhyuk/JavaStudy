package quiz;

import java.util.Scanner;

public class B07_Prime {
	
	/*
	  ����ڷκ��� ����(���)�� �Է¹�����
	  1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	  (������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
	  �ؼҼ�: ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ����
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���:");
		int prime = sc.nextInt();
		
		for(;prime<0;) {
				System.out.print("���ڸ� �ٽ� �Է����ּ���:");
				prime = sc.nextInt();
			}
		System.out.print("2 ");
		for(int i = 3; i<=prime; i+=2) {
			boolean prime_true = true;
			for(int j = 3; j<=Math.sqrt(i); j+=2) {
				if(i%j==0) {
					prime_true = false;
				}
			}
			if(prime_true) {
				System.out.print(i+" ");
			}	
		}
	}	
}
