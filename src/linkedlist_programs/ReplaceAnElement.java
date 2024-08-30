package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class ReplaceAnElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Green");
	list.add("Red");
	System.out.println("Original list:"+list);
	System.out.print("Enter the element to replace:");
	String element=sc.nextLine();
	System.out.print("Enter the position to replace:");
	int pos=Integer.parseInt(sc.nextLine());
	list.set(pos-1, element);
	System.out.println("New list after replacing :"+list);
	
}
}
