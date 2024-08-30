package linkedlist_programs;

import java.util.LinkedList;

public class CompareTwoLinkedList {
public static void main(String[] args) {
	LinkedList<String> list1=new LinkedList<>();
	list1.add("Orange");
	list1.add("Yellow");
	list1.add("Blue");
	list1.add("Green");
	System.out.println("First list:"+list1);
	LinkedList<String> list2=new LinkedList<>();
	list2.add("Black");
	list2.add("Pink");
	list2.add("White");
	list2.add("Red");
	System.out.println("Second list:"+list2);
	LinkedList<String> list3=new LinkedList<>();
	for(String element:list1)
	{
		list3.add(list2.contains(element)?"Yes":"No");
	}
	System.out.println("Checked list:"+list3);
}
}
