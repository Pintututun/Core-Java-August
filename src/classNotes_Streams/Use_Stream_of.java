package classNotes_Streams;

import java.util.stream.Stream;

public class Use_Stream_of {
public static void main(String[] args) {
	Stream<Integer> stream=Stream.of(1,2,3,4,5,6,8,9);
	stream.forEach(p->System.out.println(p));
	System.out.println("-----------------------------------");
	Stream<Integer> strm=Stream.of(new Integer[] {15,29,45,8,16});
	strm.forEach(p->System.out.println(p));
} 
}
