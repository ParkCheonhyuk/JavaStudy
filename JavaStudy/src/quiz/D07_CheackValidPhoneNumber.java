package quiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class D07_CheackValidPhoneNumber {
	/*
	  ����ڷκ��� �Է¹��� ���ڿ��� �ڵ��� ��ȣ���� �����ϴ� ���α׷��� ��������
	 	(- ����)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڵ��� ��ȣ�� �Է��ϼ���(- ����) :");
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
		System.out.println(phoneNumber + " �� " + (check ? "�ùٸ� ��ȣ�Դϴ�." : "�ùٸ��� ���� ��ȣ�Դϴ�."));
	}
}
