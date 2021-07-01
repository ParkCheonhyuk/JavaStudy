package myobj.pirategame;

public class MrTong {
	
	// true: �ش� ������ ���� ����
	// false: �ش� ������ ���� ���� ����
	boolean[] stabbed;
	boolean[] launch;
	
	// launched�� true�� ��������� �߻�� ����
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		
		// ������ �켱 1 ~ 4�� ����
		for(int i = 0,len = (int)(Math.random() * 4 + 1); i <len; ++i ) {
			launch[i] = true;
		}
		
		// 1000�� ����
		for(int i = 0; i < 1000; ++i) {
			int x = (int)(Math.random() * size);
			int y = (int)(Math.random() * size);
			
			boolean temp = launch[x];
			launch[x] = launch[y];
			launch[y] = temp;
		}
		
	}
	
	// �̹� �� ���̶�� return false, �ƴ϶�� ��� �� �񷶴ٸ� return true
	public boolean stab(int index) {
		if(stabbed[index]) {
			return false;
		} else {
			stabbed[index] = true;
			launched = launch[index];
			return true;
		}
	}
	
	public boolean[] getStabbed(){
		return stabbed;
	}
	
}
