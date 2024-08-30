package arrayListProgram;

import java.util.ArrayList;

public class PrintAllElementsUsingElementsPosition {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Orange");
	al.add("Yellow");
	al.add("Brown");
	al.add("Blue");
	al.add("Red");
	al.add("White");
	
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i)+"\t"+i);
	}
}
}
