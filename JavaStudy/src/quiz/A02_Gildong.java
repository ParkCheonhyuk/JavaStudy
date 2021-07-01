package quiz;

public class A02_Gildong {
	
	public static void main(String[] args) {
		// byte타입은 데이터 전송시에 사용하는 경우가 대부분이다
		// 숫자 범위가 작다고해서 byte타입을 사용하지는 않는다
		int age = 20;
		float weight = 75F;
		float height = 178.5F;
		String bloodtype ="O"; 
		String name = "홍길동";
		String phone = "010-1234-1234";
		String banner = "=========== 출력 결과 ===========";
		boolean marriage = true;
		
		System.out.println(banner);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("Tel : " + phone);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("혈액형 : " + bloodtype);
		System.out.println("결혼여부 : " + marriage);
		
	}
	
}
