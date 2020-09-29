package staticPolymorphism;

public class Overloading {

	int calculation; int result;
	Overloading()//Constructor
	{
		System.out.println("System Loading");
	}
	Overloading (int a,int b)//Overloading method
	{
		calculation=result;
	}
//------------------------------------------------------------------------
	void display()//Constructor
	{ 
		System.out.println("System Loaded");
	}
	void add(int a,int b)//Overloading method
	{
		result=a+b;
		System.out.println("The Add value of calculation=" +result);
	}
	void sub(int a,int b)//Overloading method
	{	
		result=a-b;
		System.out.println("The Sub value of calculation=" +result);
	}
	public static void main(String[] args) {
		Overloading S=new Overloading();//Object for Overloading method
		S.display();S.add(10,15);S.sub(50, 30);
	}
}