package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortAnArrayList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	al.add("Red");
	al.add("Black");
	al.add("Green");
	al.add("Orange");
	al.add("White");
	al.add("Blue");
	al.add("Violet");
	System.out.println("List before sort:"+al);
	Collections.sort(al);
	System.out.println("List after sort:"+al);
}
}
