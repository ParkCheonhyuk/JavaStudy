package quiz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class D07_PhoneBook {
	
	public static class Info implements Comparable<Info>{
		String name;
		int age;
		String address;
		public Info(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}
		@Override
		public int compareTo(Info o) {
			return this.age - o.age;
		}
		
		@Override
		public String toString() {
		
			return String.format("이름 : %s 나이 : %d 주소 : %s", name, age, address);
		}
	}
	
	/*
	 	# HashMap을 이용해 전화번호부를 구현해보세요
	 	 
	 	 1. phonebook에는 그룹 / 전화번호 / 이름을 저장할 수 있다
		 2. 그룹명을 키값으로 넣으면 해당 그룹에 해당하는 HashMap을 꺼낼 수 있다
		 3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다
		 
		# 구현해야 할 메서드
		
		 1. 새로운 그룹을 추가하는 메서드
		 2. 그룹에 새로운 전화번호를 등록하는 메서드
		 3. 등록된 모든 번호를 선택한 항목 기준으로 오름/내림차순으로 보여주는 메서드
		 4. 이름의 일부를 입력하면 해당하는 모든 정보가 검색되는 메서드
		 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	*/
	static HashMap<String, HashMap<String, Info>> phonebook = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String group = null;
		while(true) {
			
			System.out.println("1.그룹 추가하기");
			System.out.println("2.전화번호 추가하기");
			System.out.println("3.등록된 번호 확인하기(항목 기준)");
			System.out.println("4.이름으로 정보 검색하기");
			System.out.println("5.전화번호로 정보 검색하기");
			System.out.println("6.종료");
			
			int num = sc.nextInt();
			
			if(num==1) {
				phonebook.put(new_group(), new HashMap<>());
			}else if(num==2) {
				System.out.println("어떤 그룹에 추가 하시겠습니까?");
				for(String key : phonebook.keySet()) {
					System.out.print(key);
				}
				 group = sc.next();
				phonebook.put(group, input_data());
			}else if(num==3) {
				show_numbers();
			}else if(num==4) {
				search_name();
			}else if(num==5){
				search_number();
			}else if(num==6){
				break;
			}
		}
	}
	
	public static void show_numbers() {
		HashMap<String, Info> book = new HashMap<>();
		ArrayList<Info> data = new ArrayList<>();
		for(String key : phonebook.keySet()) {
			if(phonebook.get(key) == null) continue;
			book.putAll(phonebook.get(key));
			for(String k : book.keySet()) {
				data.add(book.get(k));
			}
		}
		Collections.sort(data);
		System.out.println(data);
	}
	
	public static String new_group() {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 그룹명을 입력하세요:");
		return sc.next();
	}
	
	public static HashMap<String, Info> input_data(){
		
		HashMap<String, Info> map = new HashMap<>();
		
		String number;
		String name;
		String address;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		name = sc.next();
		System.out.print("전화번호 :");
		number = sc.next();
		System.out.print("나이 :");
		age = sc.nextInt();
		System.out.print("주소 :");
		address = sc.next();
		map.put(number, new Info(name, age, address));
		return map;
	}
	
	public static void search_name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		HashMap<String, Info> book = new HashMap<>();
		
		for(String key : phonebook.keySet()) {
			if(phonebook.get(key)== null) continue;
			book.putAll(phonebook.get(key));
		}
		
		for(Entry<String, Info> en : book.entrySet()) {
			System.out.println("───────────────────────────────────");
			if(en.getValue().name.contains(name)) {
				System.out.println("이름 : " + en.getValue().name);
				System.out.println("전화번호 : " + en.getKey());
				System.out.println("주소 : " + en.getValue().address);
				System.out.println("나이 :" + en.getValue().age);
			}
			System.out.println("───────────────────────────────────");
		}
		pause();
	}
	
	public static void search_number() {

		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 : ");
		String num = sc.next();
		HashMap<String, Info> book = new HashMap<>();
		
		for(String key : phonebook.keySet()) {
			if(phonebook.get(key)== null) continue;
			book.putAll(phonebook.get(key));
		}
		
		for(Entry<String, Info> en : book.entrySet()) {
			System.out.println("───────────────────────────────────");
			if(en.getKey().contains(num)) {
				System.out.println("이름 : " + en.getValue().name);
				System.out.println("전화번호 : " + en.getKey());
				System.out.println("주소 : " + en.getValue().address);
				System.out.println("나이 :" + en.getValue().age);
			}
		}
		pause();
	
	}
	
	public static void add_phone() {
		
	}
	
	public static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}



