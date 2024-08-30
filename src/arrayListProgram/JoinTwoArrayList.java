package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {
public static void main(String[] args) {
	List<String> list1=new ArrayList<>();
	list1.add("Yellow");
	list1.add("Orange");
	list1.add("Blue");
	list1.add("Black");
	System.out.println("First list elements:"+list1);
	List<String> list2=new ArrayList<>();
	list2.add("White");
	list2.add("Pink");
	list2.add("Violet");
	list2.add("Blue");
	System.out.println("Second list elements:"+list2);
	List<String> joinList=new ArrayList<>();
	joinList.addAll(list1);
	joinList.addAll(list2);
	System.out.println("List after joining two array list:"+joinList);
}
}
