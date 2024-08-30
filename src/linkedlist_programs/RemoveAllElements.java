package linkedlist_programs;

import java.util.LinkedList;

public class RemoveAllElements {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Yellow");
	list.add("Orange");
	list.add("Blue");
	list.add("Red");
	list.add("Green");
	System.out.println("Original list:"+list);
	list.removeAll(list);
	System.out.println("New list after removing all elements:"+list);
}
}
