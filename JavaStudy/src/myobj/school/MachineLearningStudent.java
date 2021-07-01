package myobj.school;

public class MachineLearningStudent extends Student {
	
	int math;
	int statistics;
	int pl;
	
	public MachineLearningStudent() {
		math = generateRandomScore();
		statistics = generateRandomScore();
		pl = generateRandomScore();
	}
	
	int getSum() {
		return (kor+eng+math+statistics+pl);
	}
	
	double getAverage() {
		return getSum() / 6.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.printf( "���̸� : %s �� ���� : %d | ��� : %.2f\t      |\n", name, getSum(), getAverage());
		System.out.println("������\t����\t����\t�����\tPL\t      ��");
		System.out.println("��---------------------------------------------��");
		System.out.printf( "��%d\t%d\t%d\t%d\t%d\t      ��\n", kor, eng, math, statistics, pl);
		System.out.println("����������������������������������������������������������������������������������������������");
	}

}
