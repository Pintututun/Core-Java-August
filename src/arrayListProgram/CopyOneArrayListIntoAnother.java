package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CopyOneArrayListIntoAnother {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<String>();
	al.add("1");
	al.add("2");
	al.add("3");
	al.add("4");
	al.add("5");
	System.out.println("First List elements:"+al);
	List<String> al1=new ArrayList<>();
	al1.add("Red");
	al1.add("Orange");
	al1.add("Yellow");
	al1.add("Black");
	System.out.println("Second List elements:"+al1);
	Collections.copy(al, al1);
	System.out.println("After coping Second list to first list:"+al);
	System.out.println("After coping Second list to first list:"+al1);
}
}
