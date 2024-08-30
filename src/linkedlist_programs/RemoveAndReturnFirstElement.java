package linkedlist_programs;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Black");
	list.add("Red");
	System.out.println("Original list:"+list);
	String first=list.pop();
	System.out.println("New list after removing first element:"+list);
	System.out.println("First element is removed:"+first);
}
}
