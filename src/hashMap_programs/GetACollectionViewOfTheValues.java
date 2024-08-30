package hashMap_programs;

import java.util.Collection;
import java.util.HashMap;

public class GetACollectionViewOfTheValues {
public static void main(String[] args) {
	HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
    hash_map.put(1,"Red");
  hash_map.put(2,"Green");
  hash_map.put(3,"Black");
  hash_map.put(4,"White");
  hash_map.put(5,"Blue");
       
   // checking collection view of the map
  Collection<String> v= hash_map.values();
   System.out.println("Collection view is: "+v);
}
}
