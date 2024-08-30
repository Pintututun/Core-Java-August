package arrayListProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateThroughAllElements {
public static void main(String[] args) {
	List<String> al=new ArrayList<>();
	al.add("Orange");
	al.add("Yellow");
	al.add("Pink");
	al.add("Blue");
	al.add("Green");
	Iterator<String> itr=al.iterator();
	System.out.println("Elements:");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
