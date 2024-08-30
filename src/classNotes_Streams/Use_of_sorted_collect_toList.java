package classNotes_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Use_of_sorted_collect_toList {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Zaheer","Rahul","Aryan","Sailesh");
	List<String> sortedName=names.stream().sorted().collect(Collectors.toList());
	sortedName.forEach(str->System.out.println(str));
}
}
