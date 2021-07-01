package quiz;

public class B07_Gugudan {
	/*
	 	1. 구구단을 다음과 같이 가로로 출력해보세요
	 	
	 	2. 구구단을 다음과 같이 세로로 출력해보세요
	*/
	public static void main(String[] args) {
	
		for(int i = 2; i<=9; i++) {
			
			System.out.print(i+"단: ");
			
			for(int j = 1; j<=9; j++) {
				
				System.out.printf("%dx%d=%-2d ",i,j,i*j);
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i = 2; i<=9; i++) {
			
			System.out.printf("%d단\t",i);
			
		}
		
		System.out.println();
		
		for(int i = 1; i<=9; i++) {
			
			for(int j = 2; j<=9; j++) {
				
				System.out.printf("%dx%d=%d\t",j,i,i*j);
				
			}
			System.out.println();
		}
	}
}
