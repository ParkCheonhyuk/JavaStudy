package myobj;

public class Weapon {
	
	/*
	 	������ �Ӽ�
	 	 - ���ݷ�
	 	 - ���� ��ȭ ���
	 	 - ������ ��ȭ Ȯ�� (��޸��� ��ȭ Ȯ���� �ٸ�)
	 	 - ������ ���ݷ� ������
	 	
	 	������ �޼���
	 	 - ��ȭ�ϱ�
	 	   ������ ��ȭ Ȯ���� ���� ��ȭ�� �����ϰų� �����Ѵ� (����)
	 	   �����ϸ� ��ȭ ����� 1 �����Ѵ�
	 	   �����ϸ� ��ȭ ����� �״�� ���� (���Ѵٸ� ����߷��� ����)
	 	
	 	 - �����ϱ�
	 	   ���ݷ��� Ȯ���� �� �ִ�
	*/
	
	final int MAX_RATING = 5;
	
	String name;
	int demage;
	int rating;
	int[] upgrade_chance = {
			90, 90, 80, 80, 80, 
			70, 70, 30, 30, 30,
			15, 15, 15, 10, 10, 
			10, 10, 5, 5, 5
			};
	int[] attack_increment = {
			10, 30, 100, 150, 200, 300, 700, 700, 700, 700,
			1000, 1000, 1000, 1000, 1500, 1500, 2500, 2500, 3000, 3500
	};
	
	Weapon() {
		name = "���";
		demage = 5;
		rating = 0;
	}
	
	Weapon(String name, int demage){
		this.name = name;
		this.demage = demage;
		rating = 0;
	}
	
	boolean enchant() {
		int value = (int)(Math.random() *  100);
		
		if(value < upgrade_chance[rating]) {
			System.out.printf("\"%s %+d\"��ȭ�� �����ϼ̽��ϴ�!\n",name,rating);
			rating++;
			return true;
		}else {
			System.out.println("��ȭ ����...");
			return false;
		}
 		
	}
	
	public void attack() {
		int attack = demage;
		for(int i = 0; i< rating; ++i) {
			attack += attack_increment[i];
		}
		System.out.printf("\"%s %+d\"�� �ֵѷ����ϴ�. [������:%d]\n",
				name,rating,attack);
	}
	
}
