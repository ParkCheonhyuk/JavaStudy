package quiz;

import myobj.school.MachineLearningStudent;
import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

abstract public class C07_school {
	/*
	 	1. �� ���� ������ 30���̴�
	 	
	 	2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�
	 	
	 	2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�
	 	
	 	2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	 	
	 	3. ��� �л��� ���� ������ �̸��� �������� �����Ѵ�.
	 	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
	 	  
	 	4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.
	*/
	public static void main(String[] args) {
		
		Student[] school = new Student[30];
		for(int i = 0; i < school.length; ++i) {
			school[i] = new MachineLearningStudent();
			school[i].printGradeCard();
		}
	}
}

