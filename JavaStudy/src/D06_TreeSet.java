import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class D06_TreeSet {
	/*
		TreeSet
		
		 - ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
		 - �ߺ��� ������� �ʴ´� (Set�� Ư¡)
		 - �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
		 - �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴�
		 - �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�
	*/
	
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers);
		
		//TreeSet�� ���ϴ� Comparator�� ����ϱ� (���� ��������)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				/*	
				 	�ڸ��� �ٲٰ� �ʹٸ� ��� ����
				 	�ڸ��� �ٲٱ� ������ ���� ����
				 	�� ���� ���� ���̸� 0 ���� 
				 */
				
				return o2 - o1;
			}
		});
	
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);

		//���� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first?"+numbers.first());
		System.out.println("last?"+numbers.last());
		
		System.out.println("pollFirst?" + numbers.pollFirst());
		System.out.println(numbers);
		
		System.out.println("pollLast?" + numbers.pollLast());
		System.out.println(numbers);
		
		System.out.println("subSet(30, 70)?"+numbers.subSet(30, 70));
		
		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> number3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());
		System.out.println("list: "+list);
		
		System.out.println("contatins 41?"+ numbers2.contains(41));
		System.out.println("contatins 42?"+ numbers2.contains(42));
		
		//�Ʒ��� �ڵ尡 true�� �������� null�� �ٸ� ������ �ٲ㺸���� (3���� �̻�)
		
		List<Integer> numbers4 = new ArrayList<>(numbers.subSet(10, 90));
		List<Integer> numbers5 = new ArrayList<>(numbers.pollLast());
		
//		System.out.println(list.containsAll(numbers));
//		System.out.println(list.containsAll(numbers4));
//		System.out.println(list.containsAll(numbers5));
		
		// �л� �ν��Ͻ��� 100�� �����, Ʈ���¿� ��� ���� ������ ������ ��
		// ��� ������ 50������ 70�� ������ �л��� ��� ������� �������
		
		TreeSet<Student1> student = new TreeSet<Student1>(); 
		for(int i = 0; i < 100; ++i) {
			student.add(new Student1());

		}
		
		System.out.println("====================================");
		Student1 from = new Student1();
		Student1 to = new Student1();
		
		from.avg = 50.0;
		to.avg = 70.0;
		System.out.println(student);
		System.out.println(student.subSet(from, to).size());
		
			
			
	}
	
}

class Student1 implements Comparable<Student1>{
	
	final static int MAX_SCORE = 100;
	
	static String[] lastNameArray = {
			"��", "��", "��", "��", "��", "��", "��", "��",
			"��", "����", "����", "��", "��", "��", "��", "��", "��",
			"��","��", "��", "��", "��"};
	
	static String[] firstNameArray = {
			"��ȯ", "�Ǽ�", "����", "����", "õ��", "�ҿ�", "��ö", "�¸�",
			"����", "�¹�", "����", "����", "��ȣ", "�ѳ�", "����", "�ν�",
			"����", "��ȣ"};
	
	static String generateRandomName() {
		return lastNameArray[(int)(Math.random()*lastNameArray.length)]
				+firstNameArray[(int)(Math.random()*firstNameArray.length)];
	}
	
	static int generateRandomScore() {
		return (int)(Math.random()*(MAX_SCORE+1));
	}
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public Student1() {
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
		math = generateRandomScore();
		total = kor+eng+math;
		avg = total/3.0;
	}
	
	@Override
	public String toString() {
		return String.format("%s �л��� ��� ������ %.2f�Դϴ�.\n",name,avg);
	}

	@Override
	public int compareTo(Student1 o) {
		return (int)Math.ceil(this.avg - o.avg) != 0 ? (int)Math.ceil(this.avg -o.avg) : this.total - o.total;
		
	}
}