package arrayListProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveAnElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	al.add("Orange");
	al.add("White");
	al.add("Black");
	al.add("Yellow");
	al.add("Pink");
	al.add("Blue");
	System.out.println(al);
	System.out.print("Enter the position to remove:");
	int pos=Integer.parseInt(sc.nextLine());
	al.remove(pos-1);
	System.out.println(al);
}
}
