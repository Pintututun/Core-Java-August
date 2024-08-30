package treeset_program;

import java.util.TreeSet;

public class RetrieveLastElementAndRemoveIt {
public static void main(String[] args) {
	TreeSet<Integer> ts1 = new TreeSet<>();
	ts1.add(4);
	ts1.add(6);
	ts1.add(10);
	ts1.add(12);
	ts1.add(15);
	ts1.add(2);
	ts1.add(8);
	System.out.println("Treeset elements:" + ts1);
    System.out.println("Retrieve and remove last element:"+ts1.pollLast());
    System.out.println("TreeSet list after removing:"+ts1);
}
}
