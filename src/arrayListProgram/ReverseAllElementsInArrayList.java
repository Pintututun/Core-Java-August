package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAllElementsInArrayList {
public static void main(String[] args) {
	List<String> al=new ArrayList<>();
	al.add("Red");
	al.add("Orange");
	al.add("Yellow");
	al.add("Green");
	al.add("Black");
	System.out.println("List before reversing:"+al);
	Collections.reverse(al);
	System.out.println("List after reversing:"+al);
}
}
