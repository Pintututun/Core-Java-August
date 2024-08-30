package linkedlist_programs;

import java.util.LinkedList;

public class AppendSpecifiedElementToEndOfALinkedList {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Yellow");
	list.add("Blue");
	list.add("Red");
	list.add("Green");
	list.add("White");
	System.out.println("Elements of linked list:");
	list.forEach(x->System.out.println(x));
}
}
