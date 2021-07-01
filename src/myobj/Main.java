package myobj;

public class Main {

	public static void main(String[] args) {
	
//		Barrack b1 = new Barrack();
//		
//		b1.createSheep();
//		b1.createSheep();
//		b1.createSheep();
//		b1.createCow();
//		b1.createCow();
//		b1.createCow();
//		
//		System.out.println(b1.queue[0].name);
//		System.out.println(b1.queue[1].name);
//		System.out.println(b1.queue[2].name);
//		System.out.println(b1.queue[3].name);
//		System.out.println(b1.queue[4].name);
		
		Weapon sword = new Weapon("기사단의 보검",10);
		// 객체 지향은 내가 만든 메서드가 메인에서 어떻게 갖다 쓰일지 생각하면서 만드는 것이 좋다
		for(int i = 0; i < 100; ++i) {
			sword.enchant();
			sword.attack();
		}
			
	}
	
}	
