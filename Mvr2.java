abstract class  Test
{
	Test()
	{
System.out.println("This is abstract class Constructor...");
	}

	abstract void m1();
}

class Test1 extends Test
{
	Test1()
	{
System.out.println("This is Main class Constructor...");

	}
	void m1()
	{
		System.out.println("This is m1 method...");

	}
	public static void main(String[] args)
	{
		new Test1().m1();
	}
}
