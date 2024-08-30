package stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAListOfStringsToUpperCaseOrLowerCase {
public static void main(String[] args) {
	List<String> colors=Arrays.asList("Red","green","White","Orange","Pink");
	System.out.println("List of strings:"+colors);
	List<String> uppercaseStrings=colors.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println("\n Uppercase Strings:"+uppercaseStrings);
	//Convert strings to lowercase using streams
	List<String> lowercaseStrings=colors.stream().map(String::toLowerCase).collect(Collectors.toList());
	System.out.println("Lowercase Strings:"+lowercaseStrings);
}
}
