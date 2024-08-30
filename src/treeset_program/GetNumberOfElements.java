package treeset_program;

import java.util.TreeSet;

public class GetNumberOfElements {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<>();
	ts.add("Pink");
	ts.add("Orange");
	ts.add("Blue");
	ts.add("Black");
	ts.add("White");
	ts.add("Red");
	System.out.println("Tree set elements:"+ts);
	System.out.println("Number of elements:"+ts.size());
}
}
