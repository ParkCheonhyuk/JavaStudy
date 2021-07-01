import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
public class D07_HashMap {
	/*
	  	# Map
	  	
	  	 - �����͸� Key�� Value �� ������ �����ϴ� ����� �ڷᱸ��
	  	 - Key���� ���� Value�� ������ �� �ִ�
	  	 - Key�� �ߺ��� ������� �ʴ´�
	*/
	
	public static void main(String[] args) {
		
		// ù ���� ���׸��� Key�� Ÿ���̰�, �� ��° ���׸��� value�� Ÿ���̴�
		HashMap<String, String> addr = new HashMap<>();
		// Map.put(key, value)
		// Map.putAll(Map)
		// Map.putIfAbsent(Key, value)
		//  -�ش� Ű ���� ��������� �ְ�, ���� ������ �����ش�, ���� ��� null�� �����Ѵ�
		addr.put("�츮��", "����Ư���� ���ı� ��ǵ�...");
		addr.put("����", "����Ư���� ������ �������84�� 16 11, 12��");
		addr.put("����2", "����Ư���� ����3��");
		
		System.out.println(addr.putIfAbsent("�츮��", "���� �� �ִ�"));
		System.out.println(addr.putIfAbsent("�츮��2", "���� �� �ִ�"));
		
		// �̹� �����ϴ� Ű�� ���� �߰��ϸ� value�� �����Ѵ�
		addr.put("����", "������");
		
		System.out.println(addr.get("�츮��"));
		System.out.println(addr.get("����"));
		System.out.println(addr.get("����2"));
		System.out.println(addr.get("�츮��2"));
		
		// ���� ������Ÿ�Ե� ����� �� �ִ�
		HashMap<Integer, Student1> students = new HashMap<>();
		
		students.put(1, new Student1());
		students.put(2, new Student1());
		
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		
		// �������� Ÿ���� ����� �� �ִ�
		HashMap<String, Object> info = new HashMap<>();
		
		info.put("�̸�", "ȫ�浿");
		info.put("����", "23");
		info.put("��ȭ��ȣ", "010-1234-1234");
		info.put("�����ϴ� ��", new String[] {"��ȭ","�","�ܹ���"});
		info.put("ģ�� ���", new ArrayList<>());
		
		// �������� : ģ�� ��Ͽ� �����͸� 3���� �߰��غ�����
		
		
		
		ArrayList<String> friend = (ArrayList<String>) info.get("ģ�� ���");
		friend.add("�Ѹ�");
		friend.add("��ġ");
		friend.add("�����");
		System.out.println(info.get("ģ�� ���"));
		
		/*
		 	# �ݺ������� MapŸ�� Ȱ���ϱ�
		 	 - Map.KeySet() : Key��� �̷���� Set�� ��ȯ�Ѵ�
		 	 - Map.values() : ����� �̷���� Collection�� ��ȯ�Ѵ�
		 	 - Map.entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�
		*/
		System.out.println(info.keySet());
		
		for(String key : info.keySet()) {
			System.out.println("�ݺ������� ���� ����: " + info.get(key));
		}
		
		System.out.println("----------------------------------------");
		
		System.out.println(info.values());
		
		List value_list = new ArrayList<>(info.values());
		System.out.println(value_list);
		
		for(Object value : info.values()) {
			System.out.println(value);
		}
		System.out.println("-----------------------------------");
		for(Entry<String, Object> entry : info.entrySet()) {
			System.out.print(entry.getKey() + ":");
			System.out.println(entry.getValue());
		}
	}
}
