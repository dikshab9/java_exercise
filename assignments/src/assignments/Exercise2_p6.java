package assignments;
import java.util.Scanner;

public class Exercise2_p6 {
	public static void main(String[] args) {
		int sum=0,max_marks,min_marks;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students: ");
		int n=sc.nextInt();
		int mark[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter marks of student "+(i+1));
			mark[i]=sc.nextInt();
			sum+=mark[i];
		}
		avg=sum/n;
		System.out.println("Average marks= " +avg);
		max_marks=mark[0];
		for(int i=0;i<n;i++) {
			if(max_marks<mark[i]) {
				max_marks=mark[i];
			}
		}
		System.out.println("Maximum marks= " +max_marks);
		min_marks=mark[0];
		for(int i=0;i<n;i++) {
			if(min_marks>mark[i]) {
				min_marks=mark[i];
			}
		}
		System.out.println("Maximum marks= " +min_marks);
	}

}