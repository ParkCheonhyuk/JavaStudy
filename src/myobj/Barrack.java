package myobj;

public class Barrack {
	
	final int MAX_QUEUE_SIZE = 5;
	
	Unit[] queue;
	int queue_index;
	
	 Barrack() {
		 queue = new Unit[5];
		 queue_index = 0;
	 }
	 
	 boolean checkMaxQueue() {
		 return queue_index == MAX_QUEUE_SIZE;
	 }
	 
	 void createSheep() {
		 if(checkMaxQueue()) {
			 System.out.println("생산 대기열이 가득 찼습니다!");
			 return;
			 //void 타입 함수도 return을 할 수 있다.
			 // 호출한 곳에 값을 돌려주지는 않고 함수만 종료한다.
		 }
		 queue[queue_index++] = new Unit("양",5);
	 }
	 
	 void createCow() {
		 if(checkMaxQueue()) {
			 System.out.println("생산 대기열이 가득 찼습니다!");
			 return;
		 }
		 queue[queue_index++] = new Unit("소", 7);
	 }
}
