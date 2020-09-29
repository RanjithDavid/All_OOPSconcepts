package twoWays;

public abstract class AbstractClass {

	public abstract void Ab1(); // Abstract method (does not have a body)

	public void Ab2() // Regular method (has a body)
	{
		System.out.println("Last Stop your BMW vehicle");
	}
}

//Subclass (inherit from Abstract)
class Abstract2 extends AbstractClass {

	// The body of Abstract method Ab1() implementation done by derived class 
	public void Ab1() {
		System.out.println("First Start your BMW vehicle");
	}
}

class A{
	public static void main(String[] args) {
		Abstract2 BMW = new Abstract2();
		BMW.Ab1();BMW.Ab2();
	}
}