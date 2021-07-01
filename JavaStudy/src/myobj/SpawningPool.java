package myobj;

public class SpawningPool {
	
	final int MAX_QUEUE_SIZE = 5;
	
	Zergling[] queue;
	int queue_index;
	boolean attack = false;
	boolean defense = false;
	boolean speed = false;
	
	SpawningPool() {
		queue = new Zergling[5];
		queue_index = 0;
	}
	
	void createZergling() {
		
		 if(queue_index==MAX_QUEUE_SIZE) {
			 System.out.println("스포닝 풀이 가득 찼습니다!");
			 return;
		 }
		 
		 
		 queue[queue_index] = new Zergling();
		 
		 if(attack)
			 queue[queue_index].attack++;
		 if(defense)
			 queue[queue_index].defense++;
		 
		 if(speed) {
			 queue[queue_index].attack_speed-=3;
			 queue[queue_index].speed+=1.305;
		 }
		 
		 queue_index++;
	 }
	
	int upgrade_attack(int mineral) {
		if(mineral >= 100) {
			this.attack = true;
			System.out.println("공격력 업그레이드");
			return mineral-100;
		}else {
			System.out.println("미네랄이 모자랍니다");
			return mineral;
		}
	}
	
	int upgrade_defense(int mineral) {
		if(mineral >= 100) {
			this.defense = true;
			System.out.println("방어력 업그레이드");
			return mineral-100;
		}else {
			System.out.println("미네랄이 모자랍니다");
			return mineral;
		}
	}
	
	int[] upgrade_speed(int mineral, int gas) {
		int[] resource = new int[2];
		if(mineral >= 200 && gas >= 200) {
			this.speed = true;
			System.out.println("공격속도 및 이동속도 업그레이드");
			resource[0] = mineral-200;
			resource[1] = gas - 200;
			return resource;
		}else {
			System.out.println("미네랄이 모자랍니다");
			System.out.println("가스가 모자랍니다");
			resource[0] = mineral;
			resource[1] = gas;
			return resource;
		}
	}
	
}
