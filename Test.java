abstract class Test
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
System.out.println("This is method m4");
	}
}
class  Test1 extends Test
{
	void m1()
	{
		System.out.println("This is method m1");
	}

void m2()
	{
		System.out.println("This is method m2");
	}

	void m3()
	{
		System.out.println("This is method m3");
	}


	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
}
