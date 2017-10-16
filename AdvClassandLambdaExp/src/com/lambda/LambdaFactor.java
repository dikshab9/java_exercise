package com.lambda;

import java.util.Scanner;

public class LambdaFactor {
	
	
	interface FindFactor{
		int checkfactor(int x,int y);
	}
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		FindFactor findfactor=(x,y)->x%y;
		int result=findfactor.checkfactor(num1, num2);
		if(result==0) {
			System.out.println(""+num2 +" is a factor of "+num1);
		}
		else
			System.out.println(""+num2 +" is not a factor of "+num1);
	}

}
