package quiz;

public class B08_WhileBasicQuiz {

	/*
	 	while문을 이용하여 다음을 구하시오.
	 	
	 	1. 1 부터 100 사이에 있는 3의 배수의 총합
	 	
	 	2. 355 부터 237까지 출력
	 	
	 	3. continue를 반드시 사용하여 3000부터 5000사이의 7의 배수만 출력하기
	 	
	 	4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	*/
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		System.out.print("문제 1번 : ");
		while (num<100) {
			if(num%3==0)
			sum +=num; 
			num++;
		}
		System.out.print(sum);
		
		int num2 = 355;
		System.out.print("\n문제 2번 : ");
		while (num2>=237) {
			System.out.print(num2--+" ");
			
		}
		
		int num3 = 3000;
		System.out.print("\n문제 3번 : ");
		while (num3<=5000) {
			if(num3%7!=0) {
				num3++;
				continue;
			}
			System.out.print(num3+" ");
			num3++;
		}
		
		int sum2 = 0;
		int num4 = 1;
		System.out.print("\n문제 4번 : ");
		while (num4<=200) {
			if(num4%2!=0&&num4%3!=0) {
				sum2+=num4;
			} 
			num4++;
		}
		System.out.print(sum2);
	}
}