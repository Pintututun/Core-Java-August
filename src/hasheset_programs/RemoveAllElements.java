package hasheset_programs;

import java.util.HashSet;

public class RemoveAllElements {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Orange");
	hset.add("Yellow");
	hset.add("Blue");
	hset.add("Green");
	hset.add("Red");
	System.out.println("Original hashset:"+hset);
	hset.clear();
	System.out.println("HashSet after removing all:"+hset);
}
}
