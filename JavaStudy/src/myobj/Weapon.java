package myobj;

public class Weapon {
	
	/*
	 	무기의 속성
	 	 - 공격력
	 	 - 현재 강화 등급
	 	 - 레벨별 강화 확률 (등급마다 강화 확률이 다름)
	 	 - 레벨별 공격력 증가폭
	 	
	 	무기의 메서드
	 	 - 강화하기
	 	   레벨별 강화 확률에 따라 강화가 성공하거나 실패한다 (랜덤)
	 	   성공하면 강화 등급이 1 증가한다
	 	   실패하면 강화 등급이 그대로 유지 (원한다면 떨어뜨려도 좋음)
	 	
	 	 - 공격하기
	 	   공격력을 확인할 수 있다
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
		name = "목검";
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
			System.out.printf("\"%s %+d\"강화에 성공하셨습니다!\n",name,rating);
			rating++;
			return true;
		}else {
			System.out.println("강화 실패...");
			return false;
		}
 		
	}
	
	public void attack() {
		int attack = demage;
		for(int i = 0; i< rating; ++i) {
			attack += attack_increment[i];
		}
		System.out.printf("\"%s %+d\"를 휘둘렀습니다. [데미지:%d]\n",
				name,rating,attack);
	}
	
}
