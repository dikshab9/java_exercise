// Write a class named Outer that contains an inner class named Inner. Add a method to Outer that returns an object of 
// type Inner. In main( ), create and initialize a reference to an Inner. 
public class Outer {
	Inner method(String s) {
		System.out.println(s);
		Inner inner=new Inner();
		return inner;
	}
 class Inner{
	 
 }
 public static void main(String[] args) {
	 Outer outer=new Outer();
	 Inner inner1=outer.method("havana oh na na");
 }
}
