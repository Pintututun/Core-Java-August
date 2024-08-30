package hasheset_programs;

import java.util.HashSet;

public class Test_HashSet_isEmpty_OrNot {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Orange");
	hset.add("Yellow");
	hset.add("Blue");
	hset.add("Red");
	hset.add("Green");
	System.out.println("HashSet elements:"+hset);
	if(hset.isEmpty())
	{
		System.out.println("Hashset is empty");
	}
	else
	{
		System.out.println("Hashset is not empty");
	}
	hset.removeAll(hset);
	if(hset.isEmpty())
	{
		System.out.println("Hashset is empty");
	}
	else
	{
		System.out.println("Hashset is not empty");
	}
}
}
