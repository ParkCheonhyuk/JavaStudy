
public class C02_OOP {
	/*
	 	# ��ü���� ���α׷��� (OOP : Object Oriented Programming)
	 	 
	 	 - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	 	 - ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ�
	 	   ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
	 	 - ��ü(Object) : ���� �����ϴ� ��� �� (�繰, ����, .. ��)
	 	 
	 	 ex : ���
	 	 	- ����� ���� : ũ��, �絵, ����, Į�θ�, �������, ���...
	 	 	- ����� �޼��� : (������ ��ȭ��Ű�� �͵�)
	 	 		�Դ´� (ũ�Ⱑ �پ��鼭 Į�θ���ŭ ���� ����� Į�θ� ����)
	 	    	���� ���Ѵ�
	 	    	��������� �پ��� 
	 	    	������ (ũ�⸸ŭ�� �������� ������)
	 	    	����� �����Ѵ� (��������� ������ �����Ѵ�)
	 	    	
	 	  �� Ŭ������ ���� �̴� �Լ����� �޼����� �θ��� (JAVA���� �޼���ۿ� ����)
	 	  
	 	# Ŭ���� (Class)
	 	
	 	 - ��ü�� ���α׷��� ���� ǥ���� ��
	 	 - Ŭ������ �ش� ��ü�� ���赵�� (������ ���������� ��ü�� ����)
	 	 - ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	*/
	
	// main�� �ݵ�� public class ���ο� �����ؾ� �Ѵ�. 
	// (�����̸��� �Ȱ��� �̸��� Ŭ������ �����ؾ� ã�� �� �ִ�)
	public static void main(String[] args) {
		String[] flavor = {"����","�ٴҶ�","����","�ٴҶ�","�ٴҶ�","����"};
		String[] color ={"��Ʈ��","�����","�����","�ʷϻ�","����","�����"};
		int price =1500;
		int calorie =800;
		String product ="���";
		String type ="��";
		
		// new�� ���� �ν��Ͻ� ����
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
	 	# �ν��Ͻ� ����
	 	 - Ŭ���� ���ο� ������ ����
	 	 - �ν��Ͻ� ���� ������ ������ ������ �ִ�
	 	 - aka, �ʵ�, �Ӽ�, ��� ����, ���, ���� ...
	 */
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
		# �ν��Ͻ� �޼���
		 - �ν��Ͻ� ������ ���� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	*/
	void eat() {
		size--;
		calorie -= 10;
	}
}

/*
  ��������: ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
  
  �� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
*/

class Car{
	double fuel;
	int speed;
	String color;
	String carType;
	boolean lock;
	public Car() {
		carType = "������";
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
		System.out.printf("�� ������ %s\n", lock ? "����ֽ��ϴ�." : "�����ֽ��ϴ�.");
	}
	
	String getStatus() {
		//String.format : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�
		return String.format("�� ������ %s\n", lock ? "����ֽ��ϴ�." : "�����ֽ��ϴ�.");
	}
}
