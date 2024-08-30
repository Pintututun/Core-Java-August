package arrayListProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchForElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	al.add("Orange");
	al.add("Black");
	al.add("Blue");
	al.add("Violet");
	al.add("Green");
	al.add("Black");
	System.out.println(al);
	System.out.print("Enter the element:");
	String ele=sc.nextLine();
	if(al.contains(ele))
	{
		System.out.println("Element found ");
	}
	else
	{
		System.out.println("Element not found");
	}
	
}
}
