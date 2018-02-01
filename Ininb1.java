class Parent 
{
	
	{
		System.out.println("Parent class Instance Block..");
	}
	
}
class Child extends Parent
{
	
	{
		
		System.out.println("Child class Instance Block..");
	}
	
	public static void main(String[] args)
	{
		new Child();
		new Child();
	}
}
