package myobj.item;

public class LoLitems {
	
	int money;
		public LoLitems() {
			money = 10000;
		}
	
	public static void main(String[] args) {
		StatikkShiv statikk = new StatikkShiv("����ƽ �ܰ�", 3500);
		RapidFirecannon rapid = new RapidFirecannon("��� ������", 3000);
		Stormrazor storm = new Stormrazor("��ǳ ����", 2500);
		
		statikk.use();
		rapid.use();
		storm.use();
		
		statikk.info();
		rapid.info();
		storm.info();
	
		LoLitems l = new LoLitems();
		l.purchase(statikk);
		l.purchase(rapid);
		l.purchase(storm);
		
	}
	public void purchase(Item item) {
		this.money -= item.price;
		System.out.println(item.name +"�� ��� "+ this.money +"���� ���ҽ��ϴ�");
	}
}





