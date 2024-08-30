package hasheset_programs;

import java.util.HashSet;

public class CompareTwoHashSet {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Orange");
	hset.add("Yellow");
	hset.add("Blue");
	hset.add("Green");
	hset.add("Red");
	System.out.println("First HashSet elements:"+hset);
	HashSet<String> hset1=new HashSet<>();
	hset1.add("White");
	hset1.add("Black");
	hset1.add("Blue");
	hset1.add("Violet");
	hset1.add("Red");
	System.out.println("Second HashSet elements:"+hset1);
	HashSet<String> hset2=new HashSet<>();
	for(String element:hset)
	{
		hset2.add(hset1.contains(element)?"Yes":"No");
	}
	System.out.println("After comparing:"+hset2);
}
}
