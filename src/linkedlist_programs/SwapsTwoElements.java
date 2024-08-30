package linkedlist_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class SwapsTwoElements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<>();
	list.add("Orange");
	list.add("Blue");
	list.add("Yellow");
	list.add("Green");
	list.add("Red");
	System.out.println("Original list:"+list);
	System.out.print("Enter first element to swap:");
	String firstEle=sc.nextLine();
	System.out.print("Enter second element to swap:");
	String secondEle=sc.nextLine();
	if(list.contains(secondEle)&&list.contains(firstEle))
	{
		int firstPos=list.indexOf(firstEle);
		int secondPos=list.indexOf(secondEle);
		list.set(firstPos, secondEle);
		list.set(secondPos, firstEle);
		System.out.println("New list after swap:"+list);
	}
	else
	{
		System.out.println("Elements are not present");
	}
}
}
