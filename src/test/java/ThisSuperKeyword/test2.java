package ThisSuperKeyword;

public class test2 extends test1{
	
	int a=20; //global variable from same class
	
	public void m1()
	{
		int a=30; //local variable
		System.out.println("local variable "+ a);
		System.out.println("Global variable from same class "+this.a);
		System.out.println("Global variable from diff class "+super.a);
	}

}
