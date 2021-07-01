import java.util.Iterator;

public class B05_For {
	/*
	# �ݺ��� (loop)
		- for, while, do-while(X), for each
		- �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�
	# for��
		
		for (�ʱⰪ; �ݺ�����; ������){
			����� �ִ� �ݺ� ������ true�� ���� �ݺ��� ��ɾ���� ���� ��
		}
 	
	 */
	public static void main(String[] args) {
		
		/*
		 	1. ���� �⺻���� ������ for��
		 	 - �ʱⰪ���� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�
		 	 - ������ 1�� �Ѵ�
		 	 - ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� ������ for��
		*/
		for (int i = 0; i<= 10; ++i) {
			System.out.println("Hello,World "+ i);
		}
		
		/*
	 		2. �ʱⰪ, ������, ������ ������� ������ �� �ִ�
		*/
		for (int i = 100; i>0; i-=7) {
			System.out.println("Hello,World "+ i);
		}
		
		/*
		 	3. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�
		 */
		int a = 123;
		for(; a<234;) {
			a+=5;
			System.out.println("Hello!"+a);

		}
		
		/*
	 		4. �ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����� �� �ִ�
		*/	
		for(int month = 1; month <= 12; ++month) {
			String season;
			switch (month) {
			case 3:	case 4: case 5:
				season = "��";
				break;
			case 6: case 7: case 8:
				season = "����";
				break;
			case 9: case 10: case 11:
				season = "����";
				break;
			case 12: case 1: case 2:
				season = "�ܿ�";
				break;
			default:
				season = "����";
				break;
			}
			System.out.printf("%d���� %s�Դϴ�.\n",month,season);
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�");
	}
	
}
