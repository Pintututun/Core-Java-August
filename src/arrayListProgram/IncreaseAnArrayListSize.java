package arrayListProgram;

import java.util.ArrayList;

public class IncreaseAnArrayListSize {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>(3);
	al.add("Orange");
	al.add("Blue");
	al.add("Red");
	System.out.println("Array list elements:"+al);
	al.add("Black");
	System.out.println("New array list:"+al);
	al.ensureCapacity(6);
	al.add("Yellow");
	al.add("Brown");
	al.add("White");
	System.out.println("New array list after inserting:"+al);
}
}
