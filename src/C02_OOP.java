
public class C02_OOP {
	/*
	 	# 객체지향 프로그래밍 (OOP : Object Oriented Programming)
	 	 
	 	 - 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
	 	 - 변수와 함수를 무분별하게 사용하기 보다는
	 	   현실에 존재하는 객체 단위로 묶어서 표현하여 가독성을 올린다
	 	 - 객체(Object) : 세상에 존재하는 모든 것 (사물, 개념, .. 등)
	 	 
	 	 ex : 사과
	 	 	- 사과의 변수 : 크기, 당도, 색깔, 칼로리, 유통기한, 모양...
	 	 	- 사과의 메서드 : (변수를 변화시키는 것들)
	 	 		먹는다 (크기가 줄어들면서 칼로리만큼 먹은 사람의 칼로리 증가)
	 	    	색이 변한다
	 	    	유통기한이 줄어든다 
	 	    	던진다 (크기만큼의 데미지를 입힌다)
	 	    	냉장고에 보관한다 (유통기한이 느리게 감소한다)
	 	    	
	 	  ※ 클래스에 딸려 이는 함수들을 메서드라고 부른다 (JAVA에는 메서드밖에 없다)
	 	  
	 	# 클래스 (Class)
	 	
	 	 - 객체를 프로그래밍 언어로 표현한 것
	 	 - 클래스는 해당 객체의 설계도다 (정의한 시점에서는 실체가 없다)
	 	 - 설계도대로 찍어내는 실제 객체를 '인스턴스'라고 부른다
	*/
	
	// main은 반드시 public class 내부에 존재해야 한다. 
	// (파일이름과 똑같은 이름의 클래스에 존재해야 찾을 수 있다)
	public static void main(String[] args) {
		String[] flavor = {"초코","바닐라","딸기","바닐라","바닐라","망고"};
		String[] color ={"민트색","노란색","딸기색","초록색","갈색","망고색"};
		int price =1500;
		int calorie =800;
		String product ="농심";
		String type ="콘";
		
		// new를 통해 인스턴스 생성
		Icecream gugucon = new Icecream();
		System.out.println(gugucon.price);
		System.out.println(gugucon.color);
		Box box = new Box();
		doSomthig(box);
}

public static void doSomthig(int a, String b, char c, float d, double e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

public static void doSomthig(Box box) {
	System.out.println(box.a);
	System.out.println(box.b);
	System.out.println(box.c);
	System.out.println(box.d);
	System.out.println(box.e);
	}
}

class Icecream{
	String flavor;
	String color;
	int price;
	int calorie;
	String product;
	String type;
}

class Box{
	int a;
	String b;
	char c;
	float d;
	double e;
}

class Apple{
	/*
	 	# 인스턴스 변수
	 	 - 클래스 내부에 선언한 변수
	 	 - 인스턴스 마다 각자의 영역을 가지고 있다
	 	 - aka, 필드, 속성, 멤버 변수, 멤버, 상태 ...
	 */
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
		# 인스턴스 메서드
		 - 인스턴스 변수를 통해 해당 인스턴스의 상태를 변화시키는 메서드
	*/
	void eat() {
		size--;
		calorie -= 10;
	}
}

/*
  연습문제: 현실의 객체를 참고하여 클래스를 하나 생성한 후 인스턴스를 생성하고 값을 채운다음 출력해보세요
  
  ※ 인스턴스 변수는 3개 이상, 인스턴스 메서드 2개 이상, 과일 금지
*/

class Car{
	double fuel;
	int speed;
	String color;
	String carType;
	boolean lock;
	public Car() {
		carType = "국산차";
	}
	
	void start() {
		fuel --;
		speed += 10;
	}
	
	void changeColor(String color) {
		this.color = color;
	}
	
	void lock() {
		lock = true;
	}
	
	void unlock() {
		lock = false;
	}
	
	void status() {
		System.out.printf("이 차문은 %s\n", lock ? "잠겨있습니다." : "열려있습니다.");
	}
	
	String getStatus() {
		//String.format : 서식을 이용해 원하는 문자열을 생성한다
		return String.format("이 차문은 %s\n", lock ? "잠겨있습니다." : "열려있습니다.");
	}
}
