package linkedlist_programs;

import java.util.LinkedList;

public class RetrieveButNotRemoveFirstElement {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("yellow");
	list.add("Blue");
	list.add("Green");
	list.add("Red");
	System.out.println("Original list:"+list);
	String element=list.peekFirst();
	System.out.println("First element:"+element);
	System.out.println("New list:"+list);
}
}
