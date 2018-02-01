class Parent 
{
	Parent()
		{
		System.out.println("parent class 0 org constructor");
		}
}
class Child extends Parent
{
	Child()
		{
		this(10);
		System.out.println("child class 0 org constructor");
		}

Child(int a)
	{
	super();
	System.out.println("child class 1 org constructor");}
	
public static void main(String[] args)
	{
	new Child();
	}

}

