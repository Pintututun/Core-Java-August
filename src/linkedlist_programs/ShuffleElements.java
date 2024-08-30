package linkedlist_programs;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleElements {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Black");
	list.add("Red");
	list.add("Green");
	System.out.println("Original list:"+list);
	Collections.shuffle(list);
	System.out.println("New list after shuffling:"+list);
}
}
