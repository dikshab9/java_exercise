package exercise5;
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}

public class Custom_exception {
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age not valid");
		}
		else
			System.out.println("valid age");
		
	}
	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch(Exception e) {
			System.out.println("exception:  "+e);
		}
		finally {
			System.out.println("i was there");
		}
       		
	}

}
