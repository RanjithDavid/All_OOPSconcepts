package staticPolymorphism;

public class Student_OverloadingExample {
	int id;  
	String name;  
	int age;
	Student_OverloadingExample() 
	{
		//id=12;name=" Kiran";age=25;
		System.out.println("id"+" " +"name"+" "+" age");
	}  
	Student_OverloadingExample(int i,String n)
	{  
		id = i;  name = n; 
	}  
	Student_OverloadingExample(int i,String n,int a)
	{  
		id = i;  name = n;  age=a;  
	}  
	void StudentFail(int i,String n)
	{	
		System.out.println(i+" "+n);
	}
	void StudentPass(int i,String n,int a) 
	{
		System.out.println(i+" "+n+" "+" "+a);
	}
	void display() {}  

	public static void main(String[] args) {
		Student_OverloadingExample s = new Student_OverloadingExample();  //Object creation for Overload method Student()
		s.display();s.StudentFail(1,"Karan"); s.StudentFail(2,"Amir");s.StudentPass(001,"Aryan",18);
		s.StudentPass(002,"Arnab",18);s.StudentPass(003,"Bobby",18);s.StudentPass(004,"Bijjo",18);
	}
}
