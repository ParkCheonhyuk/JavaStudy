package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
	/*
	 	����ڰ� ���ڸ� �Է� ���� ��
	 	
	 	1. 10���� �Է��� ���ڱ����� ������ ���غ�����
	 	
	 	2. 1000���� �Է��� ���ڱ��� ������� ������ ��������
	 	
	 	3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();
		int sum = 0;
		int start, end;
		
		if(number > 10) {
			start = 10;
			end = number; 
		} else {
			start = number;
			end = 10;
		}
			for(int i=start; i<=end; i++) {
					sum += i;
			}
			
			System.out.printf("10���� %d���� ������ %d�Դϴ�.\n",number,sum);
			
			if(number > 1000) {
				for(int i=1000; i<=number; ++i) {
					System.out.printf("1000���� %d���� ���: %d\n",number,i);
				}
			} else {
				for(int i=1000; i>=number; --i) {
					System.out.printf("1000���� %d���� ���: %d\n",number,i);
				}
			}
			
			if(number>1) {
				for(int i = 1; i<=number; ++i) {
					if(i%5==0)
						System.out.printf("1���� %d���� 5�� ����� ���: %d\n",number,i);
				}
			} else {
				for(int i = 1; i>=number; --i) {
					if(i%5==0)
						System.out.printf("1���� %d���� 5�� ����� ���: %d\n",number,i);
				}
			}
		}
	}
