package myobj.item;

public class Stormrazor extends Item{

	public Stormrazor(String name, int price) {
		super(name, price);
	}

	@Override
	public void use() {
		System.out.println(name+"�� ȿ���� �ߵ��˴ϴ�.");
	}
	
}
