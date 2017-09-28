package assignments;

import java.util.*;

class Palindrome
{
   public static void main(String args[])
   {
    int r,sum=0,temp;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a number to check if it is a palindrome: ");
      int n = in.nextInt();
      
      temp=n;
      while(n>0) {
    	  r=n%10;
    	  sum=(sum*10)+r;
    	  n=n/10;
      }
      if(temp==sum) {
    	  
    	  System.out.println("the string is palindrome");
    	
    	  
      }
      else {
    	  System.out.println("the string is not palindrome");
      }
 
     
   }
}