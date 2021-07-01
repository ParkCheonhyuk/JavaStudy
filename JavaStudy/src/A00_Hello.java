// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ� 
public class A00_Hello {
	// ���� ���� ������ ���� �װ��� ���콺 Ŀ���� �ΰų� F2�� ������
	// �ش� ������ ���� ������ �ذ�å�� ��  �� �ִ�
	
	/*
	 
	 #Eclipse ����Ű
	 	-Ctrl + F11 : Run
	 	-Ctrl + [+,-] : �۾� ũ�� ����
	 	-Ctrl + M : ���� ȭ�� �ִ�/�ּ�ȭ
	 	-Ctrl + x : �߶󳻱�
	 	-Ctrl + c : �����ϱ�
	 	-Ctrl + v : �ٿ��ֱ�
	 	-Alt + ����Ű : �� �̵�
	 	-Home : ���� �� ������ �̵�
	 	-Shift + Home : ���� Ŀ�� ��ġ���� ���� �� �ձ��� �������
	 	-End : ���� �� �ڷ� �̵�
	 	-Shift + End : ���� Ŀ�� ��ġ���� ���� �� �ڱ��� �������
	 	-Tab : �鿩����
	 	-Shift + Tab : ������ �鿩����
	 	-Ctrl + Shift + F : �ڵ����� �鿩���� ����
	 
	 #windows ����Ű
	 	-win +. : �̸�Ƽ��
	 	-win + Shift + s : ĸ��
	 	-win + D : ����ȭ��
	 	-win + E : Ž����
	 	-win + ����Ű : ȭ�� ���� ����	
	 	
	 */
	
	/*
	  #main()�Լ�
	  - ���α׷��� ���� ����
	  - ����ڰ� ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ѵ�
	  - main() �Լ��� ������ �߰�ȣ{}�� �����ȴ�
	  - �߰�ȣ�� ������ �˱� ���� �ϱ� ���� �鿩����(Tab)�� ����Ѵ�
	  - main() �Լ��� ������ ���α׷��� ����ȴ� (���߿� �ƴϴ�)
	  
	  # �Լ���?
	  - � �ܾ� �ڿ� ()�� �ִ� ���� ��� �Լ���� �θ���
	  
	 */
	public static void main(String[] args) {
		//���α׷��� ����
		
		/*
		 	# System.out.println() �Լ�
		 	- ()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
		 	
		 	#�ܼ�(Console)
		 	- ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
		 	- Eclipse������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����Ѵ� (���� ������)
		 	- ��Ŭ�������� Ctrl + F11�� ������ �츮�� ���� ���α׷��� �׽�Ʈ�� �ֿܼ��� �����غ� �� �ִ�
		 	- �츮�� ���� �ҽ� �ڵ�(.java)�� ������ �����(.class)�� bin������ ����Ǿ� �ִ� 
		 	
		 	# �����ݷ� (;)
		 	- ��ɾ� �� �ڿ� �ٿ� ��ɾ �������� �˸��� �뵵
		 */
		System.out.println("Hello, World!");
		
		System.out.println("��������������������������������������");
		System.out.println("��                 ��");
		System.out.println("��      Hello!     ��");
		System.out.println("��                 ��");
		System.out.println("��������������������������������������");
		
		/*
		  #JAVA�� ������ ���� (���ͷ�)
		  - ""���̿� ���� �͵� : ���ڿ�(String), ���ڸ� ������ �� �� �ִ� ������ Ÿ��
		  - ''���̿� ���� �� : ����(character), ���� �� �ϳ��� �� �� �ִ� ������ Ÿ��
		  - ���ڸ� ���� �� : ����(Integer)
		  - �Ҽ��� ���� �� : �Ǽ�(Float,Double)
		  - true, false
		 */
		System.out.println("ABCDEFG");
		System.out.println('A');
		
		// �� ���ڿ��� ������ ����
		System.out.println(123456789+10);
		System.out.println("123456789"+10);
		
		System.out.println(123.12345 + 0.0333);
		
		System.out.println(true);
		System.out.println(false);
		
		// ''�� ����ϴ� ���� Ÿ�� �����ʹ� �����δ� ���ڰ��� ������ �ִ�
		// ���ڿ� ������ �����δ� ���� ���� Ÿ���̸� ���� ��굵 �����ϴ�
		System.out.println('A');
		System.out.println((int)'A'); // 'A'�� ���ڷ� ǥ���϶�� ��
		
		System.out.println(66);
		System.out.println((char)66); // 66�� ���ڷ� ǥ���϶�� ��
		
		// 'D'�� 'A'���� �󸶳� �ڿ� �ִ� �������� �� �� ����
		System.out.println('D' - 'A');
		
		// ������ ���ڸ� ����ϸ� ������ �ȴ�
		System.out.println('A' + 3);
		
		System.out.println((char)('A' + 0));
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((char)('A' + 3));
		System.out.println((char)('A' + 4));
		System.out.println((char)('A' + 25));
		System.out.println((char)('A' + 26));
		
		System.out.println((int)'��');
		System.out.println((int)'��');
		
		// ""�� ����ϴ� ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ°��� �ƴ϶� �̾���δ�
		System.out.println("10"+10);
		System.out.println(10+10);
		
		// ���� + �Ǽ��� ����� �Ǽ���
		System.out.println(3.14 + 10);
		
		// �Ǽ��� ������ ��ȯ�ϸ� �Ҽ��� �Ʒ��� �����Ѵ�
		System.out.println((int)33.999999);
		System.out.println((int)3.5+3.5);
		System.out.println((int)(3.5+3.5));
		
		//���α׷��� ��
	}
}

