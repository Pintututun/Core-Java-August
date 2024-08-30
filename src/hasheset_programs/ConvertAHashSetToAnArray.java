package hasheset_programs;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertAHashSetToAnArray {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Orange");
	hset.add("Yellow");
	hset.add("White");
	hset.add("Red");
	hset.add("Blue");
	hset.add("Green");
	System.out.println("Original hashset:"+hset);
	String new_Array[]=new String[hset.size()];
	hset.toArray(new_Array);
	System.out.println("HashSet converted to array:"+Arrays.toString(new_Array));
//	int a[]=new int[2];
//	a[0]=2;
//	a[1]=5;
//	System.out.println(Arrays.toString(a));
}
}
