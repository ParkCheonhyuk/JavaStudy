package quiz;

public class C01_FunctionQuiz2 {
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ���  �����ϴ��� �׽�Ʈ �غ�����2
	 	 1. �ִ밪�� �Ű������� ���޹�����
	 	 	0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	 	range �Լ��� ��������
	 	 	
	 	 	ex: range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	 	
	 	 2. �ּҰ��� �ִ밪�� �Ű������� ���޹�����
	 	 	�ּҰ� ���� �ִ밪 �̸��� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	 	range �Լ��� ��������
	 	 	
	 	 	ex: range(5,10)�� ��� ->[5, 6, 7, 8 , 9]
	 	 	
	 	 3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
	 	 	�ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	 	range �Լ��� ��������
	 	 	
	 	 	ex: range(40, 50, 3)�� ��� ->[40, 43, 46, 49]
	 	 		range(40, 45, 5)�� ��� ->[40]
	*/
	/*
	 	# �Լ� �����ε� (overloading)
	 	  - �Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �Ȱ��� �Լ����� ����� �� �ִ�
	*/
	public static int[] range(float num) {
		// println()���� �پ��� Ÿ�Ե��� �����ε��� �����Ѵ�
		System.out.println(123);
		System.out.println("123");
		System.out.println('A');
		
		return null;
	}
	
	public static int[] range(int num) {
		int[]range = new int[num];
		for(int i = 0; i<range.length; i++) {
			range[i] = i;
		}
		return range;
	}
	
	public static int[] range(int start, int end) {
		int increase = start > end ? -1 : 1;
		int[] arr = new int[increase < 0 ? start - end : end - start];
		for(int i = start, index = 0; i != end; i += increase) {
			arr[index++] = i;
		}
		return arr;
	}
	/**
	 	����ȭ �ּ� ( �� ��ɿ� ���� ������ �� �� �ִ�)
	  	@start 
	  		�����ϴ� ���� ��������
	  	@end
	  		������ ���� ��������
	  	@return
	  		�߸��� ���� �Է��ϸ� null�� ������, ����� �����ø� int[]�� ���ɴϴ�.
	 */
	public static int[] range(int start, int end, int increase) {
        if (increase < 0 && start <= end) {
                return null;
        } else if (increase > 0 && start >= end) {
                return null;
        } else if (increase == 0) {
                return null;
        }
        
        int size;
        
        if (increase > 0) {
                int range = end - start;
                size = range % increase == 0 ? range / increase : range / increase + 1; 
        } else {
                int range = start - end;
                size = range % (increase * -1) == 0 ? 
                                range / (increase * -1) : range / (increase * -1) + 1;
        }
         
        System.out.println("size:  " + size);
        int[] arr = new int[size];
        
        for (int value = start, index = 0; 
                        increase > 0 ? value < end : value > end; value += increase) {
                                        
                arr[index++] = value;
                System.out.printf("arr[%d] : %d\n", index - 1, value);
        }                
        return arr;                
}
	
	public static void main(String[] args) {
		System.out.println(java.util.Arrays.toString(range(50, 100)));
		System.out.println(java.util.Arrays.toString(range(100, 80)));
		System.out.println(java.util.Arrays.toString(range(1, 99, 3)));
		System.out.println(java.util.Arrays.toString(range(99, 5, -2)));
	}
}
