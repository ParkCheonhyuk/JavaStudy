package myobj.item;

public class StatikkShiv extends Item{

	public StatikkShiv(String name, int price) {
		super(name, price);
	}

	@Override
	public void use() {
		System.out.println(name+"�� ȿ���� �ߵ��˴ϴ�.");
	}
}
