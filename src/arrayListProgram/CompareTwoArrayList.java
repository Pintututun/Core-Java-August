package arrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
public static void main(String[] args) {
	List<String> list1=new ArrayList<>();
	list1.add("Yellow");
	list1.add("Red");
	list1.add("Blue");
	list1.add("Black");
	list1.add("Green");
	System.out.println("First list elements:"+list1);
	List<String> list2=new ArrayList<>();
	list2.add("Black");
	list2.add("White");
	list2.add("Yellow");
	list2.add("Red");
	System.out.println("Second list elements:"+list2);
	List<String> check=new ArrayList<>();
	for(String each:list1)
	{
		check.add(list2.contains(each)?"Yes":"No");
	}
	System.out.println(check);
}
}
