package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {

	public static void main(String[] args) {
		
		// �� �Է��� �޾��� ���� �߸��� ���� ���� �Ÿ��� ���� ����
		
		double score;
		char grade ='Z';
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ �Է��ϼ���:");
		score = sc.nextDouble();
		if(score<0 || score>100) {
			System.out.println("�ùٸ� ������ �Է��ϼ���.");
			grade ='F';
		} else if(score>=90) {
			grade ='A';
		} else if(score>=80) {
			grade ='B';
		} else if(score>=70) {
			grade ='C';
		} else if(score>=60) {
			grade ='D';
		} else {
			grade ='F';
			}	
			System.out.printf("����� ����� %c �Դϴ�.\n",grade);
		}
	}

