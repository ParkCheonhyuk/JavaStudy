package quiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class D07_CheackValidPhoneNumber {
	/*
	  사용자로부터 입력받은 문자열이 핸드폰 번호인지 구분하는 프로그램을 만들어보세요
	 	(- 포함)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호를 입력하세요(- 포함) :");
		String phoneNumber = sc.next();
		inNumber(phoneNumber);
		
		
		
	}
	
	public static void inNumber(String phoneNumber) {
		
		StringTokenizer st = new StringTokenizer(phoneNumber,"-");
		String[] part = new String[st.countTokens()];
		int i = 0;
		boolean check = false;
		
		while(st.hasMoreElements()) {
			part[i++] = st.nextToken();
		}
		
		for(i=0; i <part.length; i++) {
			if(i==0) {
				if(part[i].length() > 3 || part[i].length() < 3) {
					check = false;
					break;
				}
				if(!part[i].equals("010")) {
					check = false;
					break;
				}
			}else {
				if(part[i].length() > 4 || part[i].length() < 4) {
					check = false;
					break; 
				}
			}
				
			check = part[i].replaceAll("[+-]?\\d", "").equals("")? true : false;
		}
		System.out.println(phoneNumber + " 는 " + (check ? "올바른 번호입니다." : "올바르지 않은 번호입니다."));
	}
}
