package classNotes_Streams;

import java.util.ArrayList;
import java.util.List;

public class LambdaUse {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("Ravi");
	names.add("Vijay");
	names.add("Ajay");
	names.add("Shankar");
	names.forEach(x->System.out.println(x.toUpperCase()));
}
}
