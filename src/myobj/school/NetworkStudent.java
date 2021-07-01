package myobj.school;

public class NetworkStudent extends Student{
	int linux;
	int network;
	int ccna;
	
	public NetworkStudent() {
		linux = generateRandomScore();
		network = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	int getSum() {
		return (kor+eng+linux+network+ccna);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.printf( "���̸� : %s �� ���� : %d | ��� : %.2f\t      |\n", name, getSum(), getAverage());
		System.out.println("������\t����\t������\t��Ʈ��ũ\tCCNA\t      ��");
		System.out.println("��---------------------------------------------��");
		System.out.printf( "��%d\t%d\t%d\t%d\t%d\t%d\t      ��\n", kor, eng, linux, network, ccna);
		System.out.println("����������������������������������������������������������������������������������������������");
	}
	
}
