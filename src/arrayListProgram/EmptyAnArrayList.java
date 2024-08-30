package arrayListProgram;

import java.util.ArrayList;

public class EmptyAnArrayList {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Yellow");
	al.add("Blue");
	al.add("Black");
	al.add("Orange");
	System.out.println("Original Array list:"+al);
	al.removeAll(al);
	System.out.println("Array list after removing each element:"+al);
}
}
