package myinterface;

import java.util.Random;

public class Honggildong implements Tribe {
	String[] color = {"���","Ȳ��","���","������","�Ķ���"};
	String[] tri = {"����","�����","�ΰ�"};
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
