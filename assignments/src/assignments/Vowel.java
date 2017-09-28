package assignments;

import java.util.Scanner;

public class Vowel {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		 
	      System.out.println("Enter a string : ");
	      String s=in.next();
	      for(int i=0;i<s.length();i++) {
	    	  switch(s.charAt(i)) {
	    	  case 'a':
	    	  case 'e':
	    	  case 'i':
	    	  case 'o':
	    	  case 'u':
	    		  System.out.println(s.charAt(i)+" is vowel");
	    		  break;
	    		 default:
	    			 System.out.println(s.charAt(i)+" is consonant"); 
	    	  }
	      }

	}

}
