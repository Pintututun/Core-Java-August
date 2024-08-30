package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveASpecifiedElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Red");
	list.add("Green");
	System.out.println("Original list:"+list);
	System.out.print("Enter the element to remove:");
	String ele=sc.nextLine();
	if(list.remove(ele))
	{
		System.out.println("Element removed");
		System.out.println("New list:"+list);
	}
	else
	{
		System.out.println("Element not removed");
		System.out.println("Same list:"+list);
	}
}
}
