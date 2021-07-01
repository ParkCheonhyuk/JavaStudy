package myobj;

public class Zergling {
	int attack;
	int defense;
	double speed;
	int attack_speed;
	int life;
	
	
	Zergling() {
		this.attack = 5;
		this.defense = 0;
		this.speed = 2.612;
		this.life = 35;
		this.attack_speed = 8;
	}
	
	String burrow(boolean check_burrow) {
		return check_burrow ? "burrow on" : "burrow off";
	}
}
