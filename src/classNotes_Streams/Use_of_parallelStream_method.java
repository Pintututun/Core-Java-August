package classNotes_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Use_of_parallelStream_method {
public static void main(String[] args) {
	List<String> items=new ArrayList<String>();
	items.add("Apple");
	items.add("Orange");
	items.add("Mango");
	items.add("Guava");
	items.add("Grapes");
	items.add("Banana");
	Stream<String> strm=items.parallelStream();
	strm.forEach(p->System.out.println(p));
}
}
