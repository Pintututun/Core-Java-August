package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class InsertAnElementAtFirstPosition {
public static void main(String[] args) {
	List<String> al=new ArrayList<>();
	al.add("Pink");
	al.add("Orange");
	al.add("Blue");
	al.add("Green");
	al.add("Violet");
	System.out.println(al);
	System.out.println("Element want to insert in first position:");
	al.add(1, "White");
	System.out.println("Elemets after inserting:");
	System.out.println(al);
	
}
}
