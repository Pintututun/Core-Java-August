package linkedlist_programs;

import java.util.LinkedList;

public class RemoveFirstAndLastElements {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Yellow");
	list.add("Orange");
	list.add("Blue");
	list.add("Green");
	list.add("Red");
	System.out.println("Original list:"+list);
	list.removeFirst();
	System.out.println("New list after removing first element:"+list);
	list.removeLast();
	System.out.println("New list after removing last element:"+list);
	
}
}
