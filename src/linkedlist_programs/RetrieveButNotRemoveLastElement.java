package linkedlist_programs;

import java.util.LinkedList;

public class RetrieveButNotRemoveLastElement {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Blue");
	list.add("Red");
	list.add("Green");
	list.add("Yellow");
	System.out.println("Original list:"+list);
	String element=list.peekLast();
	System.out.println("Last element:"+element);
	System.out.println("New list:"+list);
	
}
}
