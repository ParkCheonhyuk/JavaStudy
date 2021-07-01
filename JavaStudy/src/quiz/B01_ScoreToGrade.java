package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {

	public static void main(String[] args) {
		
		// ※ 입력을 받았을 때는 잘못된 값을 먼저 거르는 것이 좋다
		
		double score;
		char grade ='Z';
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요:");
		score = sc.nextDouble();
		if(score<0 || score>100) {
			System.out.println("올바른 점수를 입력하세요.");
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
			System.out.printf("당신의 등급은 %c 입니다.\n",grade);
		}
	}

