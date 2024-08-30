package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertElementsIntoLinkedListAtFirstAndLastPositions {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Red");
	list.add("Violet");
	System.out.println("Linked List before inserting:"+list);
	System.out.print("Enter element at first position:");
	String firstEle=sc.nextLine();
	list.addFirst(firstEle);
	System.out.print("Enter element at last position:");
	String lastEle=sc.nextLine();
	list.addLast(lastEle);
	System.out.println("Linked list after inserting:"+list);
	
}
}
