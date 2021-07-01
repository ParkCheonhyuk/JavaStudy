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
		
		System.out.print("1. a가 10보다 크고 20보다 작은가? ");
		System.out.println(a>10 && a<20);
		
		System.out.print("2. b가 짝수인가? ");
		System.out.println(b%2==0);
		
		System.out.print("3. c가 7의 배수인가? ");
		System.out.println(c%7==0);
		
		System.out.print("4. hour가 0미만 24이상이 아니고, 12 이상인가? ");
		System.out.println(hour>0 && hour<=24 && hour>=12);
		
		System.out.print("5. d와e의 차이가 30인가? ");
		System.out.println(Math.abs(d - e) == 30);
		
		System.out.print("6. year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않는가? ");
		System.out.println(year%400==0 || (year%4==0 && year%100!=0));
		
		System.out.print("7. 민수가 철수보다 2살 많은가? ");
		System.out.println(minsu-cheolsu==2);
		
		System.out.print("8. 민수가 철수보다 생일이 3달 빠른가? ");
		System.out.println(m_birth-c_birth==3);
		
		System.out.print("9. 전원이 켜져 있는가? ");
		System.out.println(!powerOn);
		
		String str2 = "yes";
		String str3 = new String("yes");
				
		
		
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다
		System.out.print("10. 문자열 참조변수 str이\"yes\"인가 ");
		System.out.println(str== "yes");
		
		// 참조형 변수의 ==은 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다
		System.out.println("str == \"str2\":"+(str == str2));
		System.out.println("str == \"str3\":"+(str == str3));
		
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다
		System.out.println(str.equals("yes"));
		
		//소문자로 시작하는 타입 변수들은 stack에 차곡차곡 쌓인다
		//대문자로 시작하는 타입 변수들은 stack에는 주소값만 보관하고 실체는 heap에 존재한다
		//대문자로 시작하는 타입 변수에는 주소값이 저장되어 있고, 
		//거기에 .을 찍고 실제 데이터를 참조할 수 있다
		
		}
	
}
