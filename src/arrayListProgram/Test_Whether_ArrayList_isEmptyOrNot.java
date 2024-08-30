package arrayListProgram;

import java.util.ArrayList;

public class Test_Whether_ArrayList_isEmptyOrNot {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Orange");
	al.add("Yellow");
	al.add("Blue");
	al.add("Black");
	al.add("White");
	System.out.println("Original array list:"+al);
	System.out.println("Original array list is empty or not:"+al.isEmpty());
	al.removeAll(al);
	System.out.println("Array list after removing each element:"+al);
	System.out.println("New array list is empty or not:"+al.isEmpty());
}
}
