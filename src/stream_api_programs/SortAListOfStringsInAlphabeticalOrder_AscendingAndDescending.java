package stream_api_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAListOfStringsInAlphabeticalOrder_AscendingAndDescending {
public static void main(String[] args) {
	List<String> colors=Arrays.asList("Red","Green","Blue","Pink","Brown");
	System.out.println("Original list of strings(colors):"+colors);
	//Sort strings in ascending order
	List<String> ascendingOrder=colors.stream().sorted().collect(Collectors.toList());
	//Sort strings in descnding order
	List<String> descendingOrder=colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("\n Sorted in Ascending Order:"+ascendingOrder);
	System.out.println("\n Sorted in Descending Order:"+descendingOrder);
}
}
