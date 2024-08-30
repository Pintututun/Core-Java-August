package arrayListProgram;

import java.util.ArrayList;

public class TrimmingTheCapacityOfAnArrayList {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Orange");
	al.add("Yellow");
	al.add("Black");
	al.add("Blue");
	al.add("Red");
	System.out.println("Array list before trimming the capacity:"+al);
	al.trimToSize();
	System.out.println("Array list after trimming the capacity:"+al);
}
}
