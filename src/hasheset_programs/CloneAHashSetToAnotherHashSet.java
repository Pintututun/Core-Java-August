package hasheset_programs;

import java.util.HashSet;

public class CloneAHashSetToAnotherHashSet {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Orange");
	hset.add("Yellow");
	hset.add("Green");
	hset.add("Blue");
	hset.add("Red");
	System.out.println("Original HashSet:"+hset);
	HashSet<String> new_hset=new HashSet<>();
	new_hset=(HashSet<String>)hset.clone();
	System.out.println("Cloned HashSet:"+new_hset);
}
}
