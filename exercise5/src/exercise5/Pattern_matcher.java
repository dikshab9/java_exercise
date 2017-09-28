package exercise5;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pattern_matcher {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String s=sc.nextLine();
		
		Pattern p=Pattern.compile("Harry");
		Matcher m=p.matcher(s);
		if(m.matches()) {
			System.out.println("true ");
		}
		else {
			System.out.println("false ");
		}
	}

}

