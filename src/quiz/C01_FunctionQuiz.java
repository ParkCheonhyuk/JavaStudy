package quiz;

import java.util.Scanner;

public class C01_FunctionQuiz {
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 	
	 	1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 	4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 	5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	*/
	
	public static boolean check_alpha(char ch) {
		return ch>='A' && ch<='Z'||ch>='a' && ch<='z';
	}
	
	public static boolean multiple(int number) {
		return number%3==0;
	}
	
	
	public static String even_odd(int number) {
		return number%2==0  ? "¦���Դϴ�":"Ȧ���Դϴ�";
	}
	
	public static int[] check_yaksu(int number) {
		boolean[] divided = new boolean[number];
		
		int count = 0;
		for(int i = 1; i<=number; ++i) {
			if(number%i==0) {
				divided[i-1] = true; // �迭�� ������ ������ ���ڵ��� ǥ�� �س���
				count++;
			}
		}
		int[] yaksu = new int[count];
		int index = 0;
		for(int i = 0; i<number; ++i) {
			if(divided[i]) {
				yaksu[index++] = i + 1;
			}
		}
		
		return yaksu;
	}
	
	public static boolean prime(int number) {
		if(number <2) {
			return false;
		} else if(number ==2) {
			return true;
		} else if(number % 2 == 0) {
			return false;
		}
		for(int i = 3; i<Math.sqrt(number); i+=2) {
				if(number%i==0) {
					return false;
				}	
		}
		return true;
	}
	
	public static int factorial(int number) {
		int result = 1;
		for(int i = number; i > 0; --i) {
			result *= i;
		}
		return result;

//		� �Լ��� �ڱ� �ڽ��� �ҷ��� ����ϴ� ���� ����Լ���� �θ���(���� ������,  �Ѹ�)
//		if(number==1)
//			return 1;
//		else
//			return number*factorial(number-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String str = "�ѱ� Hanguel";
//		
//		for(int i = 0; i < str.length(); ++i) {
//			char ch = str.charAt(i);
//			
//			if(check_alpha(ch)) {
//				System.out.println(i+"��° ���ڴ� �����Դϴ�.");
//			}else {
//				System.out.println(i+"��° ���ڴ� ��� �ƴմϴ�.");
//			}
//		}
		
		System.out.print("���ڸ� �Է�:");
		int number = sc.nextInt();
		
		System.out.println(multiple(number));
		System.out.println(even_odd(number));
		System.out.println(java.util.Arrays.toString(check_yaksu(number)));
		System.out.println(prime(number));
		System.out.println(factorial(number));
	}
	
}
