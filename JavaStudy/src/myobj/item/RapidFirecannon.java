package myobj.item;

public class RapidFirecannon extends Item{

	public RapidFirecannon(String name, int price) {
		super(name, price);
	}

	@Override
	public void use() {
		System.out.println(name+"�� ȿ���� �ߵ��˴ϴ�.");
	}
}
