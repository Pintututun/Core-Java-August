package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapsTwoElements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	al.add("Yellow");
	al.add("Orange");
	al.add("Blue");
	al.add("Black");
	al.add("White");
	System.out.println("Elements before swap:"+al);
	System.out.print("Enter the intial position to swap:");
	int initialPos=Integer.parseInt(sc.nextLine());
	System.out.print("Enter the final psition to swap:");
	int finalPos=Integer.parseInt(sc.nextLine());
	Collections.swap(al, initialPos-1, finalPos-1);
	System.out.println("Elements after swap:"+al);
	
}
}
