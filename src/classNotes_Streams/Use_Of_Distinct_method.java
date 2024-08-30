package classNotes_Streams;

import java.util.stream.Stream;

public class Use_Of_Distinct_method {
public static void main(String[] args) {
	Stream<String> s=Stream.of("Virat","Rohit","Dhoni","Virat","Rohit");
	s.distinct().forEach(System.out::println);
}
}
