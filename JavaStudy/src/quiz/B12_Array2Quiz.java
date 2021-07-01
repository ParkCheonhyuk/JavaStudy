package quiz;

public class B12_Array2Quiz {
	
	public static void main(String[] args) {
		int[][] numArr = new int[][] {
			{1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1},
			{1,1},
			{1,1,1,1}
		};

		int count = 0;
		int tot = 0;
		double avg = 0;
		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ� ������
		for(int row = 0; row < numArr.length; ++row) {
			for(int col = 0; col < numArr[row].length; ++col) {
				numArr[row][col] = (int)(Math.random()*101);
			}
		}
		// 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� ��° �ڸ�)�� ���ؼ� ����غ�����
		for(int row = 0; row < numArr.length; ++row) {
			for(int col = 0; col < numArr[row].length; ++col) {
				System.out.print(numArr[row][col]+"\t");
				tot +=numArr[row][col];
				count++;
			}
			System.out.println();
		}
		
		avg = (double)tot/count;
		System.out.printf("���� : %d\n",tot);
		System.out.printf("��� : %.2f\n",avg);
		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		int[] row_sum = new int[numArr.length];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int col = 0; col < numArr[row].length; ++col) {
				row_sum[row] += numArr[row][col];
				
			}
		}
		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		int max_len = 0;
		
		for(int row = 0; row < numArr.length; ++row) {
			max_len = Math.max(max_len, numArr[row].length);
		}
		
		int[] col_sum = new int[max_len];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int col = 0; col < numArr[row].length; ++col) {
				col_sum[col] += numArr[row][col];
			}
		}
		System.out.println(java.util.Arrays.toString(row_sum));
		System.out.println(java.util.Arrays.toString(col_sum));
	}	
}
