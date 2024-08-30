package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertSpecifiedElementAtFront {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<String>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Green");
	list.add("Red");
	System.out.println("Original linked list:"+list);
	System.out.print("Enter the element to insert at first position:");
	String element=sc.nextLine();
	list.offerFirst(element);
	System.out.println("Linked list after inserting in first position:"+list);
}
}
