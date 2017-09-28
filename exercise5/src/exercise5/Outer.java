package exercise5;



public class Outer {
	int data=20;
	class Inner{
		void msg() {
		System.out.println("data: " +data);
	}
}
	Inner disp() {
		Inner in=new Inner();
		return in;
	}
	public static void main(String[] args) {
		Outer obj=new Outer();
		Outer.Inner obj1=obj.new Inner();
		obj1.msg();
		Inner in;
		in=obj.disp();
	}

}
