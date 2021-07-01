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
		
		 - 순서가 있는 Set (순서가 없는 것은 Hash의 특징)
		 - 중복은 허용하지 않는다 (Set의 특징)
		 - 데이터를 추가할 때 값을 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다
		 - 미리 정렬이 되어 있기 때문에 정렬된 순서로 값을 꺼내기 편리한 Set이다
		 - 해당 TreeSet 인스턴스에서 사용할 Comparator를 지정할 수 있다
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
		
		//TreeSet에 원하는 Comparator를 사용하기 (정수 내림차순)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				/*	
				 	자리를 바꾸고 싶다면 양수 리턴
				 	자리를 바꾸기 싫으면 음수 리턴
				 	두 값이 같은 값이면 0 리턴 
				 */
				
				return o2 - o1;
			}
		});
	
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		// * TreeSet은 Set의 일부분을 리턴하는데에 특화된 기능이 많다
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);

		//원래 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환한다
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
		
		//아래의 코드가 true가 나오도록 null을 다른 것으로 바꿔보세요 (3가지 이상)
		
		List<Integer> numbers4 = new ArrayList<>(numbers.subSet(10, 90));
		List<Integer> numbers5 = new ArrayList<>(numbers.pollLast());
		
//		System.out.println(list.containsAll(numbers));
//		System.out.println(list.containsAll(numbers4));
//		System.out.println(list.containsAll(numbers5));
		
		// 학생 인스턴스를 100개 만들고, 트리셋에 평균 점수 순으로 저장한 후
		// 평균 점수가 50점에서 70점 사이인 학생이 모두 몇명인지 세어보세요
		
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
			"강", "고", "구", "권", "김", "나", "박", "이",
			"최", "남궁", "제갈", "배", "서", "현", "안", "임", "유",
			"백","오", "신", "양", "진"};
	
	static String[] firstNameArray = {
			"수환", "의성", "종운", "지수", "천혁", "소영", "은철", "승모",
			"수빈", "승민", "수영", "덕중", "지호", "한나", "소윤", "두식",
			"웅빈", "진호"};
	
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
		return String.format("%s 학생의 평균 점수는 %.2f입니다.\n",name,avg);
	}

	@Override
	public int compareTo(Student1 o) {
		return (int)Math.ceil(this.avg - o.avg) != 0 ? (int)Math.ceil(this.avg -o.avg) : this.total - o.total;
		
	}
}