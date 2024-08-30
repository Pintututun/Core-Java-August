package arrayListProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddsomeColorsAndPrint {
public static void main(String[] args) {
	List<String> al=new ArrayList<>(List.of("Red","White"));
	al.add("Orange");
	al.add("Yellow");
	al.add("Blue");
	al.add("Violet");
	al.add("Green");
	System.out.println("Colors:");
	System.out.println(al);
}
}
