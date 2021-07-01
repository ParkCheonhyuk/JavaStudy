

public class A09_Operator02 {

	public static void main(String[] args) {
		
		/*
		 	# �� ������
		 		
		 		- �� ���� ���ϴ� ����
		 		- �� ������ ����� boolean Ÿ���̴� (�� �Ǵ� ����)
		 		- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
		  
		 */
		int a = 10, b = 7;
		System.out.println(a>b);
		System.out.println(a<b);
		
		// �� �ݵ�� �ε�ȣ�� ���� ���;� �� (��ȣ�� ���� ������ �ȵ�)
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		
		System.out.println(a==b);// �� ���� ���� ������ true
		System.out.println(a!=b);// �� ���� ���� �ٸ��� true
		
		/*
		 	# �� ������
		  		
		  		- boolean Ÿ�� ������ �ϴ� ����
		  		- �� ����� �� ������ �Բ� ������ �� ������ ���� ����Ѵ�
		  		- && : �� ���� ���� ��� true�� ���� true (AND)
		  		- || : �� ���� �� �� �ϳ��� true���� true (OR)
		  		- ! : true�� false, false�� true (NOT)
		  
		 */
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println(!true);
		System.out.println(!false);
		
		int c = 52;
		
		System.out.println("c�� ¦���ΰ���? " + (c%2==0));
		
		System.out.println("c�� Ȧ���ΰ���? " + (c%2==1));
		
		System.out.println("c�� ¦���̸鼭 50���� ū����?" + (c%2==0 && c>50));
		System.out.println("c�� ¦���̰ų� 50���� ū����?" + (c%2==0 || c>50));
		
		// ��������: ���� x, y, z�� ��� 3�� ����� �ƴ� �� true�� �Ǵ� �� ������ ����� ������
		
		int x,y,z;
		x = 10;
		y = 11;
		z = 13;
		
		System.out.printf("x=%d,y=%d,z=%d\n��� 3�� ����� �ƴѰ�? ",x,y,z);
		System.out.print(x%3!=0 && y%3!=0 && z%3!=0);
	}
	
}
