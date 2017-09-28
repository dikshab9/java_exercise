package assignments;
import java.util.Scanner;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character or number or expression: ");
		char ch=sc.next(".").charAt(0);
		if(ch>=65&&ch<=90) {
			System.out.println("You've entered a capital letter ");
		}
		else if(ch>=79&&ch<=122) {
			System.out.println("You've entered a small letter ");
		}
		else if(ch>0&&ch<=47||ch>=58&&ch<=64||ch>=91&&ch<=96||ch>=123&&ch<=127) {
			System.out.println("You've entered a special character  ");
		}
	}
	

}
