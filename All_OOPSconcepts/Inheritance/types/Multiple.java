package types;

/*Please note that Java does not support multiple inheritance with classes.
In java, we can achieve multiple inheritance only through Interfaces.

Hybrid inheritance is also not possible with classes. 
In java, we can achieve hybrid inheritance only through Interfaces.*/

public class Multiple {
	// Java program to illustrate the 
	// concept of Multiple inheritance  

	interface one 
	{ 
		public void print_geek(); 
	} 

	interface two 
	{ 
		public void print_for(); 
	} 

	interface three extends one,two 
	{ 
		public void print_geek(); 
	} 
	class child implements three 
	{ 
		@Override
		public void print_geek() { 
			System.out.println("Geeks"); 
		} 

		public void print_for() 
		{ 
			System.out.println("for"); 
		} 
	} 

	// Driver class 
	public class Main 
	{ 
		public void main(String[] args) 
		{ 
			child c = new child(); 
			c.print_geek(); 
			c.print_for(); 
			c.print_geek(); 
		} 
	} 
}
