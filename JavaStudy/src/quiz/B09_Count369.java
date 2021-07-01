package quiz;

import java.util.Scanner;

public class B09_Count369 {
	/*
	 ����ڷκ��� ������ �ϳ� �Է¹��� ��
	 �ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������
	 
	 (�� 33, 36,39... ���� ���ڴ� ������Ĩ�ϴ�.)
	*/
	
	public static void main(String[] args) {
		
		/*
		 	���� �ذ�� - ������ Ǫ�� ���� ã�� ��
		 	������ - �����س� ���� �ڵ�� �����ϴ� ��
		 	��� ���ط� - ����ϴ� �� ���� ���� ���ص�
		 	
		 	���� - �ѱ��� ������ �� �־�� ��
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���:");
		int player = sc.nextInt();
		int count = 0;
			
		for(int i = 1; i<=player; i++) {
			int checkNum = i;
			
			System.out.printf("[%d]\t:",checkNum);
			while(checkNum !=0) {
				
				int digit = checkNum % 10;
				
				if(digit != 0 && digit % 3==0) {
					System.out.print("¦");
					count++;
				}
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n",count);
	}
	
}
