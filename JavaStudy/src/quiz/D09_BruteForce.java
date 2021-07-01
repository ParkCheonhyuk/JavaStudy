package quiz;

import java.util.Scanner;

public class D09_BruteForce {
	
	static String charset = "abcdefghijklmnopqestuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 길이를 입력하세요>>");
		int password_size = sc.nextInt();
		bruteforce(password_size);
	}
	public static void bruteforce(int password_size){
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_password = (long)Math.pow(charset.length(),password_size) ;
		
		for(long i = 0; i < all_password; ++i) {
			long value = i;
			
			String password ="";
			while(value > 0) {
				password += arr[(int)(value % len)];
				value /= len;
			}
			
			if(password.length() < password_size) {
				int gap = password_size - password.length();
				for(int j = 0; j < gap; ++j) {
					password = "a"+password;
				}
			}
			
			System.out.println(password);
		}
		
		System.out.println("len : " + len);
	}
}