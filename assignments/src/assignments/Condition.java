package assignments;
import java.util.Scanner; 

public class Condition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		if(number>=20 && number<=30) {
			if(number%2==0) {
				System.out.println("Jerry");
			}
			else {
				System.out.println("Tom");
			}
		}
		
	}

}