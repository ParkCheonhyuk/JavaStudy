package quiz;

public class B08_WhileBasicQuiz {

	/*
	 	while���� �̿��Ͽ� ������ ���Ͻÿ�.
	 	
	 	1. 1 ���� 100 ���̿� �ִ� 3�� ����� ����
	 	
	 	2. 355 ���� 237���� ���
	 	
	 	3. continue�� �ݵ�� ����Ͽ� 3000���� 5000������ 7�� ����� ����ϱ�
	 	
	 	4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	*/
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		System.out.print("���� 1�� : ");
		while (num<100) {
			if(num%3==0)
			sum +=num; 
			num++;
		}
		System.out.print(sum);
		
		int num2 = 355;
		System.out.print("\n���� 2�� : ");
		while (num2>=237) {
			System.out.print(num2--+" ");
			
		}
		
		int num3 = 3000;
		System.out.print("\n���� 3�� : ");
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
		System.out.print("\n���� 4�� : ");
		while (num4<=200) {
			if(num4%2!=0&&num4%3!=0) {
				sum2+=num4;
			} 
			num4++;
		}
		System.out.print(sum2);
	}
}