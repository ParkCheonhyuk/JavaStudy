package myinterface;

import java.util.Random;

public class Honggildong implements Tribe {
	String[] color = {"흑색","황색","백색","붉은색","파란색"};
	String[] tri = {"엘프","오우거","인간"};
	int w = 70;
	
	@Override
	public String skin() {
		
		Random ran = new Random();
	
		return color[ran.nextInt(color.length)];
	}

	@Override
	public String name(String name) {
		
		return name;
	}

	@Override
	public int weight() {
		
		return w;
	}

	@Override
	public String player_Tribe() {
		
		return null;
	}

}
