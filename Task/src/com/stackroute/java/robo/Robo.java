package com.stackroute.java.robo;



public class Robo {
	
	public float compute(float num1, float num2, String operation) {
		if(operation.equals("+")) {
			
		return num1+num2;
		}
		else if(operation.equals("-")) {
			return num1-num2;
		}
		else
			return num1*num2;
	}
	    		

}
