package classNotes_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreationOfStream {
public static void main(String[] args) {
	List<String> items=new ArrayList<String>();
	items.add("Apple");
	items.add("Orange");
	items.add("Mango");
	Stream<String> strm=items.stream();
	strm.forEach(p->System.out.println(p));
}
}
