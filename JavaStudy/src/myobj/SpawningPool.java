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
			 System.out.println("������ Ǯ�� ���� á���ϴ�!");
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
			System.out.println("���ݷ� ���׷��̵�");
			return mineral-100;
		}else {
			System.out.println("�̳׶��� ���ڶ��ϴ�");
			return mineral;
		}
	}
	
	int upgrade_defense(int mineral) {
		if(mineral >= 100) {
			this.defense = true;
			System.out.println("���� ���׷��̵�");
			return mineral-100;
		}else {
			System.out.println("�̳׶��� ���ڶ��ϴ�");
			return mineral;
		}
	}
	
	int[] upgrade_speed(int mineral, int gas) {
		int[] resource = new int[2];
		if(mineral >= 200 && gas >= 200) {
			this.speed = true;
			System.out.println("���ݼӵ� �� �̵��ӵ� ���׷��̵�");
			resource[0] = mineral-200;
			resource[1] = gas - 200;
			return resource;
		}else {
			System.out.println("�̳׶��� ���ڶ��ϴ�");
			System.out.println("������ ���ڶ��ϴ�");
			resource[0] = mineral;
			resource[1] = gas;
			return resource;
		}
	}
	
}
