package hasheset_programs;

import java.util.HashSet;

public class EmptyAnHashSet {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Orange");
	hset.add("Yellow");
	hset.add("Green");
	hset.add("Blue");
	hset.add("Red");
	System.out.println("HashSet elements:"+hset);
	hset.removeAll(hset);
	System.out.println("HashSet elements after removing all:"+hset);
}
}
