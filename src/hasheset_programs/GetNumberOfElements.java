package hasheset_programs;

import java.util.HashSet;

public class GetNumberOfElements {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Red");
	hset.add("Green");
	hset.add("White");
	hset.add("Blue");
	hset.add("Yellow");
	System.out.println("Hashset elements:"+hset);
	System.out.println("Size of hashset:"+hset.size());
}
}
