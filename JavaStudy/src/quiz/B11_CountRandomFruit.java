package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {
	/*
	 	사용자로부터 숫자를 입력받으면 해당 개수 만큼의 랜덤 과일을 선택한다
	 	(랜덤으로 등장하는 과일 - apple, banana, kiwi, orange, grape, peach)
	 	
	 	그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();
		String[] fruit = {"apple","banana","kiwi","orange","grape","peach","blueberry"};
		int[] fruitCount = new int[fruit.length];
		
		for(int i = 0; i<number; ++i) {
			int random = (int)(Math.random()*fruit.length);
			System.out.println(fruit[random]);
			fruitCount[random]++;
		}
		
		for(int i = 0; i<fruitCount.length; ++i) {
			System.out.println("["+fruit[i]+"] "+fruitCount[i]+"번 등장");
		}
	}
}
