//Write a program to create interface with single method and use it as lambda expression to multiply the given value by 
//2. When creating the lambda expression we declare the type of the parameter s1 to have the Integer type.  
//Input: 4  Output: 1- Result : 8

package com.lambda;

import java.util.Scanner;

public class LambdaExpMultiply {
 interface GetNumber{
	 int multiply(int num);
 }
 public static void main(String[] args) {
	 System.out.println("Enter a number: ");
	 Scanner sc=new Scanner(System.in);
	 int num_entered=sc.nextInt();
	 GetNumber getnumber=num->num*2;
	 System.out.println(getnumber.multiply(num_entered));
 }
}
