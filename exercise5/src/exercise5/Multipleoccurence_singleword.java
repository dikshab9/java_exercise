package exercise5;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Multipleoccurence_singleword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		Pattern p=Pattern.compile("se");
		Matcher m=p.matcher(s);
		 while(m.find()) {
	            System.out.println("Found at:  "+m.start()+"-"+m.end());
	        }
	}

}
