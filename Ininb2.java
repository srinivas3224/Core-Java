class Parent 
{
	
	{
		System.out.println("Parent class Instance Block..");
	}
	Parent()
	{
			System.out.println("Parent class o reg cons..");
	}
}
class Child extends Parent
{
	
	{
		System.out.println("Child class Instance Block..");
	}
	Child()
	{
		// super() this code is genarated by compiler
			System.out.println("child class 0 org Constructor Block..");
	}
	public static void main(String[] args)
	{
		new Child();
		new Child();
	}
}
