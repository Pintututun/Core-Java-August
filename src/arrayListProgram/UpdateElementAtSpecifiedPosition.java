package arrayListProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateElementAtSpecifiedPosition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	al.add("Orange");
	al.add("Yellow");
	al.add("Blue");
	al.add("White");
	al.add("Black");
	al.add("Brown");
	System.out.println(al);
	System.out.println("Enter the position to update:");
	int pos=Integer.parseInt(sc.nextLine());
	System.out.println("Enter the element to update:");
	String newElement=sc.nextLine();
	al.set(pos-1, newElement);
	System.out.println(al);
	
}
}
