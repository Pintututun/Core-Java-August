package linkedlist_programs;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateThroughAllElements {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Yellow");
	list.add("Blue");
	list.add("Red");
	list.add("Green");
	list.add("Black");
	Iterator<String> list_Itr=list.iterator();
	while(list_Itr.hasNext())
	{
		System.out.println(list_Itr.next());
	}
}
}
