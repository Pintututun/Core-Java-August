package arrayListProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractAPortionOfAnArrayList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	al.add("Red");
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	al.add("Red");
	al.add("Blue");
	System.out.println(al);
	System.out.print("Enter the initial position :");
	int initialPos=Integer.parseInt(sc.nextLine());
	System.out.print("Enter the final position:");
	int finalPos=Integer.parseInt(sc.nextLine());
	List<String> newList=al.subList(initialPos-1, finalPos);
	System.out.println("Elements in new list:"+newList);
}
}
