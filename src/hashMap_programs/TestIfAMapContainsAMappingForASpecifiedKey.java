package hashMap_programs;

import java.util.HashMap;

public class TestIfAMapContainsAMappingForASpecifiedKey {
public static void main(String[] args) {
	HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
	  hash_map.put("Red", 1);
	  hash_map.put("Green", 2);
	  hash_map.put("Black", 3);
	  hash_map.put("White", 4);
	  hash_map.put("Blue", 5);
	  // print the map
	  System.out.println("The Original map: " + hash_map);
	  System.out.println("1. Is key 'Green' exists?");
	  if (hash_map.containsKey("Green")) {
	   //key exists
	   System.out.println("yes! and value- " + hash_map.get("Green"));
	  } else {
	   //key does not exists
	   System.out.println("no!");
	  }

	  System.out.println("\n2. Is key 'orange' exists?");
	  if (hash_map.containsKey("orange")) {
	   System.out.println("yes! and value - " + hash_map.get("orange"));
	  } else {
	   System.out.println("no!");
}
}
}
