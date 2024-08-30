package stream_api_programs;

import java.util.Arrays;
import java.util.List;

public class CountTheNumberOfStringsThatStartWithASpecificCharacter {
public static void main(String[] args) {
	List<String> colors=Arrays.asList("Red","Green","Blue","Pink","Brown");
	System.out.println("Original list of strings(colors):"+colors);
	char startingLetter='B';
	//Count strings starting with a specific letter
	long ctr=colors.stream().filter(s->s.startsWith(String.valueOf(startingLetter))).count();
	System.out.println("\n Number of colors starting with "+startingLetter+" is:"+ctr);
	char startingLetter1='Y';
	//Count strings with a specific letter
	ctr=colors.stream().filter(s->s.startsWith(String.valueOf(startingLetter1))).count();
	System.out.println("\n Number of colors starting with "+startingLetter1+" is:"+ctr);
}
}
