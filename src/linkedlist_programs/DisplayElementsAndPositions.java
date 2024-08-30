package linkedlist_programs;

import java.util.LinkedList;

public class DisplayElementsAndPositions {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Red");
	list.add("Blue");
	System.out.println("Index\tElement");
	System.out.println("-------------------");
	for(String ele:list)
	{
		System.out.println("  "+list.indexOf(ele)+"\t"+ele);
	}
}
}
