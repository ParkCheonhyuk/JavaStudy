
public class B08_While {
	
	/*
	 	# while
	 	 - for문과 사용법이 약간 다른 반복문
	 	 - 초기값과 증가값의 위치가 정해져 있지 않다
	 	 - ()안의 조건이 참인 동안 {}안의 내용을 반복한다
	*/
	public static void main(String[] args) {
		
		int i = 0;
		
		//1 ~ 10 : 10개
		//0 ~ 9 : 10개
		//1 ~ 9 : 9개
		
		while(i < 10) {
			System.out.println(i++);
		}
		
		// while문에서도 break와 continue를 사용할 수 있다.
		i = 0;
		
		while (true) {
			System.out.println(++i);
			if(i == 140) {
				break;
			}
		}
	}
}
