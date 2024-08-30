package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertSpecifiedElementAtSpecifiedPosition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Green");
	list.add("Blue");
	list.add("Black");
	System.out.println("Original Linked list:"+list);
	System.out.print("Enter the position want to insert:");
	int pos=Integer.parseInt(sc.nextLine());
	System.out.print("Enter the element to insert:");
	String element=sc.nextLine();
	list.add(pos-1, element);
	System.out.println("Linked list after modification:"+list);
	
}
}
