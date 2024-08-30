package classNotes_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Use_of_filter_collect_toList {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Ravi", "Rahul", "Akshar", "Roshan","Raj","Ankit");

	Stream<String> stream = list.stream();

	List<String> startWithR = stream.filter(i -> i.startsWith("A")).collect(Collectors.toList());

	System.out.println(startWithR);
}
}
