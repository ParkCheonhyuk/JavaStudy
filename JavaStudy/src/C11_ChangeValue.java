
public class C11_ChangeValue {
	public static void main(String[] args) {
		// 두 변수의 값을 서로 바꾸는 방법
		
		int x = 10;
		int y = 20;
		
		int temp = x;
		 x = y;
		 y = temp;
		 
		 System.out.println(x);
		 System.out.println(y);
	}
}
