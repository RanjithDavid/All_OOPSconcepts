package dynamicPolymorphism;
interface A{
	void add(int a,int b);//Overriding interface method
}
interface B{
	void display();
}
class Overriding_Interface implements A,B
{		
	Overriding_Interface(){
		System.out.println("Calculating...");
	}
	@Override
	public void add(int a,int b)//Overriding interface method
	{
		int ans=a+b;
		System.out.println("Adding two numbers Ans:"+ans);
	}
	public void display() {
		System.out.println("Messi");
	}
	public static void main(String[] args) {
		Overriding_Interface S=new Overriding_Interface();
		S.add(20,50);
		S.display();
	}
}
