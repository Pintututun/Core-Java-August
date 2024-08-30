package hasheset_programs;

import java.util.HashSet;

public class CompareTwoSetsAndRetainElementsThatAreSame {
public static void main(String[] args) {
	HashSet<String> hset1=new HashSet<>();
	hset1.add("Orange");
	hset1.add("Yellow");
	hset1.add("Blue");
	hset1.add("Green");
	hset1.add("White");
	System.out.println("HashSet elements:"+hset1);
	HashSet<String> hset2=new HashSet<>();
	hset2.add("Black");
	hset2.add("Violet");
	hset2.add("Blue");
	hset2.add("Green");
	hset2.add("White");
	System.out.println("HashSet elements:"+hset2);
	hset1.retainAll(hset2);
	System.out.println("HashSet elements:"+hset1);
}
}
