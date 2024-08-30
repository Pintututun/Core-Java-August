package stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RmovesAllDuplicateElements {
public static void main(String[] args) {
	List<Integer> nums=Arrays.asList(10,23,22,24,24,33,15,10,15);
	System.out.println("Original list of numbers:"+nums);
	//Remove duplicates
	List<Integer> distinctNumbers=nums.stream().distinct().collect(Collectors.toList());
	System.out.println("After removing duplicates from the said list:"+distinctNumbers);
}
}
