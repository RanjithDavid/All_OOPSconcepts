package Wrap_CodeData;

class Encapsulation {

	private String Footballer; //private variables and attributes

	public String getFootballer() //declare public get methods
	{
		return Footballer;
	}

	public void setFootballer(String FootballPlayer) //declare public set methods
	{
		this.Footballer=FootballPlayer; 
	} 

	public static void main(String [] args) {
		
		Encapsulation s=new Encapsulation();
		
		//setting private variable data
		s.setFootballer("Ricardo KaKa");	
		//getting set private variable data
		System.out.println("Footballer :\t"+ s.getFootballer());	
	}
}