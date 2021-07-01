package quiz;

import java.util.Scanner;

public class C01_FunctionQuiz {
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	 	5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	*/
	
	public static boolean check_alpha(char ch) {
		return ch>='A' && ch<='Z'||ch>='a' && ch<='z';
	}
	
	public static boolean multiple(int number) {
		return number%3==0;
	}
	
	
	public static String even_odd(int number) {
		return number%2==0  ? "짝수입니다":"홀수입니다";
	}
	
	public static int[] check_yaksu(int number) {
		boolean[] divided = new boolean[number];
		
		int count = 0;
		for(int i = 1; i<=number; ++i) {
			if(number%i==0) {
				divided[i-1] = true; // 배열에 나누어 떨어진 숫자들을 표시 해놓음
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

//		어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다(성능 안좋음,  겉멋)
//		if(number==1)
//			return 1;
//		else
//			return number*factorial(number-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String str = "한글 Hanguel";
//		
//		for(int i = 0; i < str.length(); ++i) {
//			char ch = str.charAt(i);
//			
//			if(check_alpha(ch)) {
//				System.out.println(i+"번째 문자는 영어입니다.");
//			}else {
//				System.out.println(i+"번째 문자는 영어가 아닙니다.");
//			}
//		}
		
		System.out.print("숫자를 입력:");
		int number = sc.nextInt();
		
		System.out.println(multiple(number));
		System.out.println(even_odd(number));
		System.out.println(java.util.Arrays.toString(check_yaksu(number)));
		System.out.println(prime(number));
		System.out.println(factorial(number));
	}
	
}
