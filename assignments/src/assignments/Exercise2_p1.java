package assignments;
import java.util.Scanner;

public class Exercise2_p1 {
	public static void main(String args[])
	   {
	      int n, reverse = 0,temp,r,sum=0;
	 
	      System.out.println("Enter the number to reverse: ");
	      Scanner sc = new Scanner(System.in);
	      n = sc.nextInt();
	 
	      while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is: "+reverse);
	      temp=reverse;
	      while(reverse>0) {
	    	  r=reverse%10;
	    	  sum=(sum*10)+r;
	    	  reverse=reverse/10;
	      }
	      if(temp==sum) {
	    	  
	    	  System.out.println("the string is palindrome");
	    	
	    	  
	      }
	      else {
	    	  System.out.println("the string is not palindrome");
	      }
	 
	   }

}
