package exercise4;
import java.util.*;
public class pe6 {
	public static void main(String args[]) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Harry");set.add("Oliver");set.add("Alice");set.add("Bluto");set.add("Eugene");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(" Sorted Set: "+itr.next());
		}
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		System.out.println(" Arraylist: "+list);
		
	}

}
