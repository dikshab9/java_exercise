package assignments;
import java.util.*;
public class Program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String s=sc.next();
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		System.out.print(s);
		for(int i=0;i<n;i++) {
			for(int j=s.length()-n;j<=s.length()-1;j++) {
				System.out.print(s.charAt(j));
			}
		}
		 
	}

}
