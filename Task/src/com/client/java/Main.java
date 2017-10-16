package com.client.java;
import com.stackroute.java.robo.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

	       System.out.println("Enter num1 and num2");
	       int num1= sc.nextInt();
	       int num2 = sc.nextInt();
	       System.out.println("Enter the operator");
	       String operation= sc.next();
	       Robo rob=new Robo();
	       float x=rob.compute(num1,num2,operation);

	       System.out.println(x);
		
	}

}
