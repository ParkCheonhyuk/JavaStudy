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
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.printf( "│이름 : %s │ 총점 : %d | 평균 : %.2f\t      |\n", name, getSum(), getAverage());
		System.out.println("│국어\t영어\t리눅스\t네트워크\tCCNA\t      │");
		System.out.println("│---------------------------------------------│");
		System.out.printf( "│%d\t%d\t%d\t%d\t%d\t%d\t      │\n", kor, eng, linux, network, ccna);
		System.out.println("└─────────────────────────────────────────────┘");
	}
	
}
