import java.util.Scanner;

public class B11_Array {
	/*
	 	# �迭 (Array)
	 	 - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
	 	 - ���� �̸����� ������ ������ ������ �� �ε����� �����Ѵ�
	 	 - �迭�� �ε���(�� ��ȣ)�� 0���� ��ü ���� -1���� �ִ�
	 	 - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
	 	 - �����ʹ� �ٸ��� �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ� �ִ�
	 	   (���� : 0, �Ǽ� 0.0, boolean : false, ������ : null)
	 	 - ��� Ÿ���� �迭�� �ѹ��� ������ �� �ִ�
	*/
	public static void main(String[] args) {
		
		Scanner[] scanner = new Scanner[10];
		scanner[0] = new Scanner(System.in);
		scanner[1] = new Scanner(System.in);
		scanner[2] = new Scanner(System.in);
		
		System.out.println("ù ��° ��ĳ��: " +scanner[0]);
		System.out.println("�� ��° ��ĳ��: " +scanner[1]);
		System.out.println("�� ��° ��ĳ��: " +scanner[2]);
		System.out.println("�� ��° ��ĳ��: " +scanner[3]);
		
		int[] randomNumbers = new int[100];
		randomNumbers[5] = 17;
		
		System.out.println(randomNumbers[0]);
		System.out.println(randomNumbers[1]);
		System.out.println(randomNumbers[2]);
		System.out.println(randomNumbers[3]);
		System.out.println(randomNumbers[4]);
		System.out.println(randomNumbers[5]);
		
		// �迭.length�� ���� �迭�� ��ü ���̸� �� �� �ִ�
		System.out.println("randomNumbers�� ����:"+randomNumbers.length);
		System.out.println("randomNumbers�� ������ �ε��� ��ȣ:"+(randomNumbers.length-1));
		System.out.println("scanner�� ����:"+scanner.length);
		System.out.println("scanner�� ������ �ε��� ��ȣ:"+(scanner.length-1));
		
		/*
			# �迭 ���� ���
			
			1. Ÿ��[] ������ = new Ÿ��[ũ��];
			2. Ÿ��[] ������ = {��1, ��2, ��3, ... };
			3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3, ...};
		
		*/
		int[] numbers = new int[10];
		char[] blacklist = {'#','@','&','^','\\',65,111};
		boolean[] passExam = new boolean[] {true, false, false, true};
		
		int[] unit = {
				365 * 24 * 60 * 60, 
				24 * 60 * 60,
				60 * 60,
				60
		};
		
		// �迭�� �ݺ����� �Բ� ������ ����Ǿ� �ִ�.
		for(int i = 0; i<blacklist.length;++i) {
			System.out.println(blacklist[i]);
		}
		// String�� char[]�� ��ȯ�� �� �ִ�
		char[] hello ="Hello, world!".toCharArray();
		
		for(int i = 0; i<hello.length;++i) {
			System.out.printf("hello[%d] : %c\n",i,hello[i]);
		}
	}
}
