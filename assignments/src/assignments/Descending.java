package assignments;
import java.util.Scanner;
public class Descending
{
    public static void main(String[] args) 
    {
        int n, temp,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n-1 ; i++) 
        {
            System.out.print(a[i] + ",");
        }
       System.out.print(a[n - 1]+ "    ");
       for(int i=0;i<a.length;i++) {
    	   if(a[i]%2==0) {
    		   sum+=a[i];
    	   }
       }
       System.out.println("Sum of even numbers: "+sum);
       if(sum>15)
    	   System.out.println("TRUE");
       else
    	   System.out.println("false");
    }
}