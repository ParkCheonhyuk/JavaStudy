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
		
			return String.format("�̸� : %s ���� : %d �ּ� : %s", name, age, address);
		}
	}
	
	/*
	 	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	 	 
	 	 1. phonebook���� �׷� / ��ȭ��ȣ / �̸��� ������ �� �ִ�
		 2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�
		 3. ���� HashMap�� ��ȭ��ȣ�� ������ �̸��� ���� �� �ִ�
		 
		# �����ؾ� �� �޼���
		
		 1. ���ο� �׷��� �߰��ϴ� �޼���
		 2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
		 3. ��ϵ� ��� ��ȣ�� ������ �׸� �������� ����/������������ �����ִ� �޼���
		 4. �̸��� �Ϻθ� �Է��ϸ� �ش��ϴ� ��� ������ �˻��Ǵ� �޼���
		 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	*/
	static HashMap<String, HashMap<String, Info>> phonebook = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String group = null;
		while(true) {
			
			System.out.println("1.�׷� �߰��ϱ�");
			System.out.println("2.��ȭ��ȣ �߰��ϱ�");
			System.out.println("3.��ϵ� ��ȣ Ȯ���ϱ�(�׸� ����)");
			System.out.println("4.�̸����� ���� �˻��ϱ�");
			System.out.println("5.��ȭ��ȣ�� ���� �˻��ϱ�");
			System.out.println("6.����");
			
			int num = sc.nextInt();
			
			if(num==1) {
				phonebook.put(new_group(), new HashMap<>());
			}else if(num==2) {
				System.out.println("� �׷쿡 �߰� �Ͻðڽ��ϱ�?");
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
		System.out.print("�߰��� �׷���� �Է��ϼ���:");
		return sc.next();
	}
	
	public static HashMap<String, Info> input_data(){
		
		HashMap<String, Info> map = new HashMap<>();
		
		String number;
		String name;
		String address;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� :");
		name = sc.next();
		System.out.print("��ȭ��ȣ :");
		number = sc.next();
		System.out.print("���� :");
		age = sc.nextInt();
		System.out.print("�ּ� :");
		address = sc.next();
		map.put(number, new Info(name, age, address));
		return map;
	}
	
	public static void search_name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = sc.next();
		HashMap<String, Info> book = new HashMap<>();
		
		for(String key : phonebook.keySet()) {
			if(phonebook.get(key)== null) continue;
			book.putAll(phonebook.get(key));
		}
		
		for(Entry<String, Info> en : book.entrySet()) {
			System.out.println("����������������������������������������������������������������������");
			if(en.getValue().name.contains(name)) {
				System.out.println("�̸� : " + en.getValue().name);
				System.out.println("��ȭ��ȣ : " + en.getKey());
				System.out.println("�ּ� : " + en.getValue().address);
				System.out.println("���� :" + en.getValue().age);
			}
			System.out.println("����������������������������������������������������������������������");
		}
		pause();
	}
	
	public static void search_number() {

		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ��ȣ : ");
		String num = sc.next();
		HashMap<String, Info> book = new HashMap<>();
		
		for(String key : phonebook.keySet()) {
			if(phonebook.get(key)== null) continue;
			book.putAll(phonebook.get(key));
		}
		
		for(Entry<String, Info> en : book.entrySet()) {
			System.out.println("����������������������������������������������������������������������");
			if(en.getKey().contains(num)) {
				System.out.println("�̸� : " + en.getValue().name);
				System.out.println("��ȭ��ȣ : " + en.getKey());
				System.out.println("�ּ� : " + en.getValue().address);
				System.out.println("���� :" + en.getValue().age);
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



