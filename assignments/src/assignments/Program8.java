package assignments;
import java.util.Scanner;
public class Program8 {
	public static void main(String[] args) {
		int n=35;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		do {
		if(a>50) {
			System.out.println("enter numbers less than 50");
			
		}
		if(a>35) {
			System.out.println("number is greater than target");
			 System.out.println("try another number");
            a = sc.nextInt();
             continue;
		}
		else if(a<35) {
			System.out.println("number is smaller than target");
			 System.out.println("try another number");
             a = sc.nextInt();
             continue;
		}
		else
			System.out.println("number is equal to target");
		break;
		}while(true);
		
	}

}
