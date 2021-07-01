import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	  	# ����ǥ���� (Regular Expression)
	  	
	  	 - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
	  	 - Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�
	  	 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
	  	
	  	# Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
	  	
	  	 - Pattern
	  	 - Matcher
	*/
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[l@]eep", "sleep"));
		System.out.println(Pattern.matches("s[l@]eep", "sheep"));
		System.out.println(Pattern.matches("s[l@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[l@]eep", "saeep"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijk]", "sleek"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijkABCDEFG]", "sleeK"));
		
		/*	
		 	[abc] : �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ��� 
		 	[^abc] : �ش� �ڸ��� abc�� ������ ��� ���� ���
		 	[a-z] : a���� z���� ��� ���
		 	[A-Z] : A���� Z���� ��� ���
		 	[\\-] : ���ڷμ� -�� ��� (Escape)
		 	[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ���(������)
		*/
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]eep", "saeep"));
		
		/*
		 	# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		 	. : ��� ����
		 	\d : ��� ����
		 	\D : ���ڸ� ������ ��� ��
		 	\s : ��� ���� (\t, \n, \r, ' ')
		 	\S : ������ ������ ��� ��
		 	\w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 	\W : \w�� ������ ��� ��
		*/
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		
		/*
		 	# �ش� ������ ����� ������ ������ �����ϴ� ���
		 	
		 	 [.]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 	 [.]{n, m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�
		 	 [.]{n, } : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
		 	 [.]? : {}���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�
		 	 [.]+ : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�
		 	 [.]* : * ���� ������ 0�� �̻� ���;� �Ѵ�
		*/
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", "abs.."));
		System.out.println(Pattern.matches("[.]{2,5}","."));
		System.out.println(Pattern.matches("[.]{2,5}",".."));
		System.out.println(Pattern.matches("[.]{2,5}","..."));
		System.out.println(Pattern.matches("[.]{2,5}","...."));
		System.out.println(Pattern.matches("[.]{2,5}","....."));
		System.out.println(Pattern.matches("[.]{2,5}","......"));
		System.out.println(Pattern.matches("s?heep", "sheep"));
		System.out.println(Pattern.matches("s?heep", "sssheep"));
		System.out.println(Pattern.matches("s?heep", "heep"));
		System.out.println(Pattern.matches("s?heep", "kheep"));
		System.out.println(Pattern.matches("s+heep", "sssssheep"));
		System.out.println(Pattern.matches("s+heep", "heep"));
		
		// �������� : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("010-?\\d{4}-?\\d{4}", "01012341234"));
		
		// �������� : �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		String socialNumber = "970309-1078947";
		
		System.out.println(Pattern.matches("[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])-?[1-4][0-9]{6}", socialNumber));
		
		// �������� : �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		String email = "abc_123@seoul.co.kr";
		
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?", email));
		
		// # Matcher ����ؼ� �� ���ڿ� �˻��ϱ�
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("na");
		
		// Pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while(matcher.find()) {
			System.out.println("ã�� ��: " + matcher.group());
			System.out.println("��ġ : " + matcher.start() + "����" + matcher.end()+"����");
		}
	}
}