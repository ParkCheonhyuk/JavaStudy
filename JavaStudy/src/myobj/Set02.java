package myobj;
import java.util.TreeSet;

class Pet implements Comparable<Pet>{
	
    String[] species = {"������","�����","�޹���","������","�ݺؾ�"};
    
    String specie;
    
    String[] habitats = {"����","����","����"};
    
    String habitat;
    
    String name;
    
    String[] names = {"����","����","����","����","����","����","����","��","���","���","����"};
    
    int age;
    
    double weight;

    Pet() {
    
    name = names[(int)(Math.random()*names.length)];
    	
    specie = species[(int)(Math.random()*species.length)];
    if(specie.equals("������")||specie.equals("�����")||specie.equals("������")) {
    	habitat = habitats[0];
    }else if(specie.equals("�ݺؾ�")) {
    	habitat = habitats[1];
    }else {
    	habitat = habitats[2];
    }
    
    age = (int)(Math.random()*21+1);
    
    weight = Math.random()*100+20;
    }

    @Override
    public String toString() {
    
    	return String.format("�̸�: %s |���� %d | ��: %s | ȯ��: %s\n",name,age,specie,habitat);
    }
    
	@Override
	public int compareTo(Pet o) {
		
		return this.age - o.age;
		
	}
}

public class Set02 {

    public static void main(String[] args) {

        TreeSet<Pet> hs = new TreeSet<Pet>();

        for(int i = 0; i < 100; ++i) {
        	Pet p = new Pet();
        	hs.add(p);
        	System.out.println(p);
        }
        
        System.out.println(hs.size());
        Pet from = new Pet();
        Pet to = new Pet();
        from.weight = 20.0;
        to.weight = 50.0;
        System.out.println("����(10~18)�� ������ ��"+hs.subSet(from, to).size()+"���� �Դϴ�.");
    }

}