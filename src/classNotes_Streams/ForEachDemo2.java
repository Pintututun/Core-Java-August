package classNotes_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo2 {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("Ravi");
	names.add("Vijay");
	names.add("Ajay");
	names.add("Shankar");
	Consumer<String> makeUpperCase=new Consumer<String>()
			{
		@Override
		public void accept(String t)
		{
			System.out.println(t.toUpperCase());
		}
			};
		names.forEach(makeUpperCase);	
}
}
