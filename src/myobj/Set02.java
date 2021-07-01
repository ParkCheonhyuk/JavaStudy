package myobj;
import java.util.TreeSet;

class Pet implements Comparable<Pet>{
	
    String[] species = {"강아지","고양이","앵무새","도마뱀","금붕어"};
    
    String specie;
    
    String[] habitats = {"육지","수조","공중"};
    
    String habitat;
    
    String name;
    
    String[] names = {"똘이","봄이","솜이","코코","보리","츄츄","초코","별","사랑","까미","몽이"};
    
    int age;
    
    double weight;

    Pet() {
    
    name = names[(int)(Math.random()*names.length)];
    	
    specie = species[(int)(Math.random()*species.length)];
    if(specie.equals("강아지")||specie.equals("고양이")||specie.equals("도마뱀")) {
    	habitat = habitats[0];
    }else if(specie.equals("금붕어")) {
    	habitat = habitats[1];
    }else {
    	habitat = habitats[2];
    }
    
    age = (int)(Math.random()*21+1);
    
    weight = Math.random()*100+20;
    }

    @Override
    public String toString() {
    
    	return String.format("이름: %s |나이 %d | 종: %s | 환경: %s\n",name,age,specie,habitat);
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
        System.out.println("나이(10~18)인 동물은 총"+hs.subSet(from, to).size()+"마리 입니다.");
    }

}