package twoWays;

// Interface = Full Abstraction(data hiding)

interface Footballer {
	
	abstract void Forward(); // abstract methods are allowed (does not have a body)
	public void Defender(); //	Regular (interface) method (does not have a body)
}

// FootballMatch "implements" the Footballer interface
class FootballMatch implements Footballer {
	
	// The body of abstract and regular methods implementation done by derived class
	public void Forward() 	{	System.out.println("Forward:Kicks the ball to Score");	}
	public void Defender() 	{	System.out.println("Defender:Kicks the ball to Defend");}
}

class MainClass {
	public static void main(String[] args) {
		FootballMatch match = new FootballMatch();  
		match.Forward();	match.Defender();
	}
}

