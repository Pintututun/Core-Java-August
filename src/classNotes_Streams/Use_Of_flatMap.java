package classNotes_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Use_Of_flatMap {
public static void main(String[] args) {
	List<String> list1=Arrays.asList("A","B","C");
	List<String> list2=Arrays.asList("D","E","F");
	List<String> list3=Arrays.asList("G","H","I");
	List<List<String>> listOfLists=Arrays.asList(list1,list2,list3);
	List<String> listOfAllStrings=listOfLists.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	System.out.println(listOfAllStrings);
}
}
