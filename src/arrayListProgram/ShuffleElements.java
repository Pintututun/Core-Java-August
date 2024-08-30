package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElements {
public static void main(String[] args) {
	List<String> al=new ArrayList<>();
	al.add("Red");
	al.add("Orange");
	al.add("Yellow");
	al.add("Blue");
	al.add("Black");
	System.out.println("List before shuffle:"+al);
	Collections.shuffle(al);
	System.out.println("List after shuffle:"+al);
}
}
