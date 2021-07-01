package myobj.item;

public class LoLitems {
	
	int money;
		public LoLitems() {
			money = 10000;
		}
	
	public static void main(String[] args) {
		StatikkShiv statikk = new StatikkShiv("스태틱 단검", 3500);
		RapidFirecannon rapid = new RapidFirecannon("고속 연사포", 3000);
		Stormrazor storm = new Stormrazor("폭풍 갈퀴", 2500);
		
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
		System.out.println(item.name +"을 사고 "+ this.money +"원이 남았습니다");
	}
}





