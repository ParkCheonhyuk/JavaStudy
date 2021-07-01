package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {
	/*
	 	����ڷκ��� ���ڸ� �Է¹����� �ش� ���� ��ŭ�� ���� ������ �����Ѵ�
	 	(�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach)
	 	
	 	�� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();
		String[] fruit = {"apple","banana","kiwi","orange","grape","peach","blueberry"};
		int[] fruitCount = new int[fruit.length];
		
		for(int i = 0; i<number; ++i) {
			int random = (int)(Math.random()*fruit.length);
			System.out.println(fruit[random]);
			fruitCount[random]++;
		}
		
		for(int i = 0; i<fruitCount.length; ++i) {
			System.out.println("["+fruit[i]+"] "+fruitCount[i]+"�� ����");
		}
	}
}
