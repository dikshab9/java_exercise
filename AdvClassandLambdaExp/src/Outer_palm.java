/* Create an interface named Hand with a method facepalm, and implement that interface by
defining in an inner class named Palm within a method of the outer class, which returns a reference
to your interface. */
public class Outer_palm {
	Hand getInnerObj() {
	class Palm implements Hand{
		public void facepalm(){
			System.out.println("Inside palm");
			
		}
	}
	Palm palm=new Palm();
	return palm;

}
	public static void main(String[] args) {
		Outer_palm outerpalm=new Outer_palm();
		Hand hand=outerpalm.getInnerObj();
		hand.facepalm();
		
	}
}
