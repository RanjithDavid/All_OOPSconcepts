package dynamicPolymorphism;

public class Overriding_Inheritance {
	Overriding_Inheritance(){
		System.out.println("College Details");
	}
	void data() {	//Overriding method data()
		System.out.println();
		System.out.println("College name : PSG");
	}
}
//--------------------------------------------------------
class Teacher extends Overriding_Inheritance{
	Teacher(){	
		System.out.println();
		System.out.println("State : TamilNadu");
	}
	@Override
	void data(){ //Overriding method data()
		System.out.println();
		System.out.println("District: Coimbatore ");
		super.data();//To inherit the Overriding data() details
	}
	public static void main(String[] args) {
		Teacher OI=new Teacher();//Object for Overriding method
		OI.data();
	}
}
