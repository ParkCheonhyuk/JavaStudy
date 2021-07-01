public class A03_VarTypes {
	
	public static void main(String[] args) {
		/*
		 	# ���� Ÿ��
		 	 - byte		(1byte)	-128 ~ +127
		 	 	
		 	 	1byte => 8bit
		 	 	
		 	  	0000 0000(0) ~ 1111 1111(255) (��ȣ�� ���°�� 0 ~ 255���� ǥ�� ����)
		 	  	
		 	  	��ȣ�� ����ϴ� ��쿡�� ù ��° bit�� ��ȣ ��Ʈ�� ����Ѵ�
		 	  	
		 	  	byteŸ���� ��� ���� 0000 0000(0) ~ 0111 1111(127)
		 	  	byteŸ���� ���� ���� 1000 0000(-128) ~ 1111 1111(-1)
		 	  	
		 	 - short	(2byte) -32,768 ~ +32767 
		 	 - char 	(2byte unsigned ��ȣ����) 0 ~ 65,535 �� ���� �ڵ� �����
		 	 - int		(4byte) -2,147,483,648 ~ +2,147,483,647
		 	 - long		(8byte) -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		 */
		byte a = 127;
		short b = 10;
		char c = 10;
		int d = 10;
		long e = 10;
		
		byte _byte = 127;
		short _short = 32767;
		char _char = 65535;
		int _int = 2100000000;
		// ����Ÿ�� ���ͷ��� �⺻������ intŸ���̴�.
		// intŸ���� ������ ����� ���� ����ϰ� �ʹٸ� �ڿ� l �Ǵ� L�� �ٿ��� �Ѵ�
		long _long = 2100000000000000000L;
		System.out.println(a);
		
		/*
		 	# �Ǽ� Ÿ��
		 	
		 	- float		(4byte)
		 	- double	(8byte)
		 	
		 	�Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�.
		 	�ε� �Ҽ��� ��ñ� ����Ѵ�.
		 */
		// �Ҽ� ���ͷ��� �⺻������ doubleŸ���̹Ƿ� doubleŸ�� �������� �ƹ� �������� ����
		double _double = 123.1234;
		
		// �Ҽ� �ڿ� f �Ǵ� F�� �����ָ� floatŸ�� ���ͷ��̶�� ǥ�ð� �ȴ�
		float _float = 123.123F;
		
		/*
		 	# ��/���� Ÿ��
		 	 - boolean
		 	 
		 	 �� �� �ִ� ���� true �� false �ۿ� ����
		 */
		boolean male = true;
		boolean female = true;
		boolean powerOn = false;
		boolean goonpil = true;
		boolean computerScience = true;
		
		/*
		 	# ������ Ÿ��
		 	
		 		������ Ÿ���� �빮�ڷ� �����Ѵ�.
		 		�ҹ��ڷ� �����ϴ� Ÿ���� ��� �⺻�� Ÿ���̶�� �θ���.
		 		
		 		- String
		 		- �� �� ��� Ŭ������..
		 */
		String welcome_message ="hello,World";
		System.out.println(welcome_message);
		
		
		//char Ÿ���� ���� �ڵ带 �����ϴ� ���� Ÿ���̴�
		char ch = 120;
		
		char ch2 = 'x';
		int num ='x';
		System.out.println("char�� ����� ��: " + ch);
		System.out.println("'x'�� ������ char Ÿ�� ������ ���: " + ch2);
		System.out.println("'x'�� ������ int Ÿ�� ������ ���: " + num);
	}
}
