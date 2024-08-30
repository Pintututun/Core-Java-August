package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertSomeElementsAtSpecifiedPosition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Red");
	list.add("Violet");
	System.out.println("Original linked list:"+list);
	LinkedList<String> list1=new LinkedList<>();
	list1.add("Pink");
	list1.add("White");
	System.out.print("Enter the position you want to insert:");
	int pos=Integer.parseInt(sc.nextLine());
	list.addAll(pos-1, list1);
	System.out.println("Linked list after inserting:"+list);
	
}
}
