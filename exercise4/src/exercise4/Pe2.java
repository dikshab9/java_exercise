package exercise4;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pe2 {
	
	 public static void main(String[] args) {
	       
	      Map<String,Integer> map = new HashMap<String,Integer>();
	       
	       String abc = "one one -one___two,,three,one @three*one?two";
	       
	       String arr[] = {"one","two","three"};
	       
	       for(int i=0;i<arr.length;i++) {
	           
	       int count =0;
	       Pattern pattern = Pattern.compile(arr[i]);
	       Matcher m = pattern.matcher(abc);
	       
	       while(m.find()) {
	           count++;
	       }
	       map.put(arr[i],count);
	       
	       }
	       
	       System.out.println(map);
	   }

}
