package linkedlist_programs;

import java.util.Collections;
import java.util.LinkedList;

public class CopyALinkedListToAnother {
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
	Collections.copy(list1, list2);
	System.out.println("First list after copying:"+list1);
	System.out.println("Second list after copying:"+list2);
}
}
