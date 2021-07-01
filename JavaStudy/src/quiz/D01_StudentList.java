package quiz;

import java.util.ArrayList;
import java.util.Random;

public class D01_StudentList {
	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	 	
	 	1. 각 학생의 점수는 랜덤으로 설정
	 	
	 	2. 과목은 국/영/수
	 	
	 	3. 30명의 평균 점수를 출력
	 	
	 	4. 30명 중 가장 평균 점수가 높은 학생의 성적을 출력
	*/
	public static void main(String[] args) {
		
		ArrayList<Student> student_list = new ArrayList<>();
		int best_score_index = 0;
		double students_avg = 0;
		
		for(int i = 0; i < 30; ++i) {
			student_list.add(new Student());	
		}
		
		for(Student student : student_list) {
			System.out.println(student);
		}
		System.out.println("가장 높은 점수 : " + Student.best_avg);
		System.out.println("가장 높은 점수인 학생의 학번 : " + Student.best_avg_snum );
	}
}

class Student{

	public int snum;
	public int kor;
	public int eng;
	public int math;
	public double avg;
	
	public static double best_avg = 0;
	public static int best_avg_snum = 0;
	
	final private int MAX_SCORE = 101;
	final private int NUM_OF_SUBJECT = 3; 
	
	private static int curr_snum = 1000;
	private static Random ran = new Random();

	
	public Student() {
		snum = curr_snum++;
		kor = ran.nextInt(MAX_SCORE);
		eng = ran.nextInt(MAX_SCORE);
		math = ran.nextInt(MAX_SCORE);
		avg = (kor+eng+math)/(double) NUM_OF_SUBJECT;
		
		if(avg > best_avg) {
			best_avg = avg;
			best_avg_snum = snum;
		}
	}
	
	@Override
	public String toString() {
		return String.format("[%d]번 학생의 평균 점수는 %.2f입니다.", snum,avg);
	}
}