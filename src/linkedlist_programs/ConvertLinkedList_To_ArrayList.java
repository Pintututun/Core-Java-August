package linkedlist_programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedList_To_ArrayList {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Green");
	list.add("Red");
	System.out.println("Original Linked list:"+list);
	ArrayList<String> al=new ArrayList<>(list);
	System.out.println("Array list:"+al);
}
}
