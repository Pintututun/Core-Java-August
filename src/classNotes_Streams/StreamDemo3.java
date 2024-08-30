package classNotes_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	//Without Stream
	List<Integer> listEven=new ArrayList<Integer>();
	for(Integer i:list)
	{
		if(i%2==0)
			listEven.add(i);
	}
	System.out.println(listEven);
	System.out.println("-------------------------------------------");
	//With Stream
	Stream<Integer> stream=list.stream();
	List<Integer> even=stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(even);
}
}
