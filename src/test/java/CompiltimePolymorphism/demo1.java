package CompiltimePolymorphism;

public class demo1 {
	
	//method declaration is going to binded to its definition during compiletime based on argument/parameter/inputs
	//is called compiletime polymorphism
	//Declaraing multiple method with same name but different argument/parameter in same class is called method overloading
	
	public void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	public void addition(int a,int b,int c) 
	{
		int sum= a+b+c;
		System.out.println(sum);
	}
	

}
