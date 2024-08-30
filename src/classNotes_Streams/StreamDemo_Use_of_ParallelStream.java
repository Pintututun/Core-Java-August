package classNotes_Streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo_Use_of_ParallelStream {
public static void main(String[] args) {
	System.out.println("Using Stream");
	List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    listOfNumbers.stream().forEach(number ->
    System.out.println(number + " " + Thread.currentThread().getName()));

	System.out.println(".........................................................................");
	System.out.println("Using Parallel Stream");
	List<Integer> listOfNumbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    listOfNumbers1.parallelStream().forEach(number ->
    System.out.println(number + " " + Thread.currentThread().getName())
);
}
}
