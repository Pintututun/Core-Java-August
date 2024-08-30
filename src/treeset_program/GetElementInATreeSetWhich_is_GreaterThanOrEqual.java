package treeset_program;

import java.util.TreeSet;

public class GetElementInATreeSetWhich_is_GreaterThanOrEqual {
public static void main(String[] args) {
	TreeSet<Integer> ts1=new TreeSet<>();
	ts1.add(4);
	ts1.add(6);
	ts1.add(10);
	ts1.add(12);
	ts1.add(15);
	ts1.add(2);
	ts1.add(8);
	System.out.println("Treeset elements:"+ts1);
	TreeSet<Integer> ts2=(TreeSet<Integer>)ts1.tailSet(10);
	System.out.println("Elements greater than or equal to 10:"+ts2);
	
}
}
