//PE 5. Write a program to assign a lambda expression to its functional interface. Then we execute the lambda 
//expression by calling the method defined in the functional interface and pass in a parameter. 
//Input: Java Lambda Expression Demo      
//Output : 27
package com.lambda;

public class LambdaExpDemo {
	interface StringLengthLambda{
		int getlength(String s);
	}
	public static void main(String[] args) {
		StringLengthLambda myLengthLambda=s->s.length();
		System.out.println(myLengthLambda.getlength("java lambda exp demo"));
	}
		
	

}
