package quiz;

public class A09_ConditionQuiz {
	
	public static void main(String[] args) {
		
		int a,b,c,d,e;
		int hour;
		int year;
		int minsu,cheolsu;
		int m_birth,c_birth;
		boolean powerOn;
		String str;
		
		a = 12;
		b = 7;
		c = 14;
		d = 50;
		e = 20;
		
		hour = 25;
		
		year = 2021;
		
		minsu = 25;
		cheolsu = 21;
		
		m_birth = 1;
		c_birth = 12;
		
		powerOn = true;
		
		str = "yes";
		
		System.out.print("1. a�� 10���� ũ�� 20���� ������? ");
		System.out.println(a>10 && a<20);
		
		System.out.print("2. b�� ¦���ΰ�? ");
		System.out.println(b%2==0);
		
		System.out.print("3. c�� 7�� ����ΰ�? ");
		System.out.println(c%7==0);
		
		System.out.print("4. hour�� 0�̸� 24�̻��� �ƴϰ�, 12 �̻��ΰ�? ");
		System.out.println(hour>0 && hour<=24 && hour>=12);
		
		System.out.print("5. d��e�� ���̰� 30�ΰ�? ");
		System.out.println(Math.abs(d - e) == 30);
		
		System.out.print("6. year�� 400���� ������ �������ų� �Ǵ� 4�� ������ �������� 100���� ������ �������� �ʴ°�? ");
		System.out.println(year%400==0 || (year%4==0 && year%100!=0));
		
		System.out.print("7. �μ��� ö������ 2�� ������? ");
		System.out.println(minsu-cheolsu==2);
		
		System.out.print("8. �μ��� ö������ ������ 3�� ������? ");
		System.out.println(m_birth-c_birth==3);
		
		System.out.print("9. ������ ���� �ִ°�? ");
		System.out.println(!powerOn);
		
		String str2 = "yes";
		String str3 = new String("yes");
				
		
		
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�
		System.out.print("10. ���ڿ� �������� str��\"yes\"�ΰ� ");
		System.out.println(str== "yes");
		
		// ������ ������ ==�� �� ������ ���� ���� �ּҸ� ���ϰ� �ִ����� ���Ѵ�
		System.out.println("str == \"str2\":"+(str == str2));
		System.out.println("str == \"str3\":"+(str == str3));
		
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�
		System.out.println(str.equals("yes"));
		
		//�ҹ��ڷ� �����ϴ� Ÿ�� �������� stack�� �������� ���δ�
		//�빮�ڷ� �����ϴ� Ÿ�� �������� stack���� �ּҰ��� �����ϰ� ��ü�� heap�� �����Ѵ�
		//�빮�ڷ� �����ϴ� Ÿ�� �������� �ּҰ��� ����Ǿ� �ְ�, 
		//�ű⿡ .�� ��� ���� �����͸� ������ �� �ִ�
		
		}
	
}
