// Static blocks are executed only once at the time of class loading

class Parent 
{
	
	static {
		System.out.println("Parent class static Block..");
	}
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
	
	static {
		System.out.println("Child class static Block..");
	}
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
