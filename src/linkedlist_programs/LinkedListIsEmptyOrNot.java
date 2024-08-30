package linkedlist_programs;

import java.util.LinkedList;

public class LinkedListIsEmptyOrNot {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Green");
	list.add("Blue");
	list.add("Red");
	System.out.println("Original list:"+list);
	if(list.isEmpty())
	{
		System.out.println("List is empty");
	}
	else
	{
		System.out.println("List is not empty");
	}
	list.removeAll(list);
	System.out.println("New list after removing:"+list);
	if(list.isEmpty())
	{
		System.out.println("List is empty");
	}
	else
	{
		System.out.println("List is not empty");
	}
	
	
}
}
