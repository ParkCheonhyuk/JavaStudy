package myobj.school;

public class ProgrammingStudent extends Student {
	
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return(kor + eng + math + pl + al + ds);
	}
	
	double getAverage() {
		return getSum() / 6.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.printf( "弛檜葷 : %s 弛 識薄 : %d | ゎ敕 : %.2f\t      |\n", name, getSum(), getAverage());
		System.out.println("弛措橫\t艙橫\t熱з\tPL\tAL\tDS    弛");
		System.out.println("弛---------------------------------------------弛");
		System.out.printf( "弛%d\t%d\t%d\t%d\t%d\t%d    弛\n", kor, eng, math, pl, al, ds);
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
	}
}
