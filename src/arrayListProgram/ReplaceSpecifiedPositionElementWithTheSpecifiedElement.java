package arrayListProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSpecifiedPositionElementWithTheSpecifiedElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> al=new ArrayList<>();
	al.add("Yellow");
	al.add("Orange");
	al.add("Blue");
	al.add("Black");
	al.add("White");
	al.add("Violet");
	System.out.println("Elements before replacing:"+al);
	System.out.print("Enter the position to replace:");
	int pos=Integer.parseInt(sc.nextLine());
	System.out.print("Enter the element to replace:");
	String element=sc.nextLine();
	al.set(pos-1, element);
	System.out.println("Elements after replacing:"+al);
}
}
