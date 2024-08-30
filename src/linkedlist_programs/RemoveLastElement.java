package linkedlist_programs;

import java.util.LinkedList;

public class RemoveLastElement {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Yellow");
	list.add("Orange");
	list.add("Blue");
	list.add("Red");
	list.add("Green");
	System.out.println("Original list:"+list);
	String element=list.removeLast();
	System.out.println("Last element:"+element);
	System.out.println("New list:"+list);
	
}
}
