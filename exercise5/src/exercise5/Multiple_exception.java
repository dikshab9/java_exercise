package exercise5;

public class Multiple_exception {
	public static void main(String args[]) {
	    int result = 0;                                          
	    int arraySize = 3;
	    int badSize = -1;       // A negative size to generate NegativeArraySizeException.
	    int[] array = null;             // Define an integer array variable.
	 
	    for(int choice = 0; choice<3 ; ++choice)
	    try {
	      switch(choice) {
	        case 0:
	         result = array[0];         // Generates a NullPointerException.
	         break;
	        case 1:
	         array = new int[badSize];      // Generates a NegativeArraySizeException.
	         break;
	        case 2:
	         array = new int[arraySize];
	         result = array[arraySize];            // Generates an ArrayIndexOutOfBoundsException.
	         break;
	      }
	    } catch(NullPointerException e) {                                  // Catch the NullPointerException:
	      System.out.println("Null pointer exception caught: "+e);
	      
	    } catch(NegativeArraySizeException e) {                            // Catch the NegativeArraySizeException:
	      System.out.println("Negative array size excpetion caught: "+e);
	      
	    } catch(ArrayIndexOutOfBoundsException e) {                        // Catch the ArrayIndexOutOfBoundsException:
	      System.out.println("Aray index out of bounds exception caught: "+e);
	      
	    }
	  }
}
