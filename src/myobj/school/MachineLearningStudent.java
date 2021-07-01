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
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.printf( "│이름 : %s │ 총점 : %d | 평균 : %.2f\t      |\n", name, getSum(), getAverage());
		System.out.println("│국어\t영어\t수학\t통계학\tPL\t      │");
		System.out.println("│---------------------------------------------│");
		System.out.printf( "│%d\t%d\t%d\t%d\t%d\t      │\n", kor, eng, math, statistics, pl);
		System.out.println("└─────────────────────────────────────────────┘");
	}

}
