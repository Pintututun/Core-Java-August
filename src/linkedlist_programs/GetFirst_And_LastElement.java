package linkedlist_programs;

import java.util.LinkedList;

public class GetFirst_And_LastElement {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Yellow");
	list.add("Red");
	list.add("Blue");
	list.add("Brown");
	list.add("Orange");
	System.out.println("Original linked list:"+list);
	String firstElement=list.getFirst();
	String lastElement=list.getLast();
	System.out.println("First element is:"+firstElement);
	System.out.println("Last element is:"+lastElement);
}
}
