package exercise4;
import java.util.*;
public class Compare_arraylist {
	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Java");           
		c1.add("C");           
		c1.add("C++");           
		c1.add("Python");           
		c1.add("JavaScript");          
		ArrayList<String> c2= new ArrayList<String>();           
		c2.add("Java");          
		c2.add("Angular");           
		c2.add("C++");           
		c2.add("JavaScript"); 
		
		ArrayList<String> c3=new ArrayList<String>(c1);
		c3.retainAll(c2);
		
		System.out.println(c3);
	}

}