package quiz;

import java.util.ArrayList;
import java.util.Random;

public class D01_StudentList {
	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	1. �� �л��� ������ �������� ����
	 	
	 	2. ������ ��/��/��
	 	
	 	3. 30���� ��� ������ ���
	 	
	 	4. 30�� �� ���� ��� ������ ���� �л��� ������ ���
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
		System.out.println("���� ���� ���� : " + Student.best_avg);
		System.out.println("���� ���� ������ �л��� �й� : " + Student.best_avg_snum );
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
		return String.format("[%d]�� �л��� ��� ������ %.2f�Դϴ�.", snum,avg);
	}
}