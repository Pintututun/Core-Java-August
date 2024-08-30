package arrayListProgram;

import java.util.ArrayList;

public class Clone_AnArrayList_To_AnotherArrayList {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Yellow");
	al.add("Orange");
	al.add("Black");
	al.add("White");
	al.add("Blue");
	System.out.println("List before cloning:"+al);
	ArrayList<String> al1=(ArrayList<String>)(al.clone());
	System.out.println("List after cloning:"+al1);
}
}
