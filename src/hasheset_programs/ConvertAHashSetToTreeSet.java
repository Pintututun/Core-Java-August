package hasheset_programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertAHashSetToTreeSet {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Orange");
	hset.add("Yellow");
	hset.add("Blue");
	hset.add("Green");
	hset.add("Red");
	System.out.println("Original hashset:"+hset);
	Set<String> ts=new TreeSet<>(hset);
	System.out.println("TreeSet elements:");
	System.out.println(ts);
}
}
