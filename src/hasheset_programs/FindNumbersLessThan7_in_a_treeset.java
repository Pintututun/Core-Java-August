package hasheset_programs;

import java.util.HashSet;
import java.util.TreeSet;

public class FindNumbersLessThan7_in_a_treeset {
public static void main(String[] args) {
	HashSet<Integer> hset=new HashSet<>();
	hset.add(2);
	hset.add(5);
	hset.add(7);
	hset.add(8);
	hset.add(10);
	hset.add(13);
	System.out.println("HashSet elements:"+hset);
	TreeSet<Integer> ts=new TreeSet<>(hset);
	TreeSet<Integer> new_ts=(TreeSet<Integer>)ts.headSet(7);
	System.out.println("Elements less than 7:"+new_ts);
}
}
