package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertSpecifiedElementAtEnd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Red");
	list.add("Blue");
	list.add("Pink");
	System.out.println("Original linked list:"+list);
	System.out.print("Enter the element to insert at end:");
	String endEle=sc.nextLine();
	list.offerLast(endEle);
	System.out.println("Linked list after inserting:"+list);
}
}
