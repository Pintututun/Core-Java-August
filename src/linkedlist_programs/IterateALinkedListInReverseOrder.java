package linkedlist_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateALinkedListInReverseOrder {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Red");
	list.add("Green");
	list.add("Blue");
	list.add("Yellow");
	list.add("Orange");
	ListIterator<String> itr=list.listIterator(list.size());
	
	while( itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
}
}
