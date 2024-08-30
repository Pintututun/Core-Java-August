package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckParticularElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Yellow");
	list.add("Blue");
	list.add("Green");
	list.add("Red");
	System.out.println("Original list:"+list);
	System.out.print("Enter the element to check:");
	String element=sc.nextLine();
	if(list.contains(element))
	{
		System.out.println("Element is present");
	}
	else
	{
		System.out.println("Element is not present");
	}
}
}
