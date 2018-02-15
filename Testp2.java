abstract class Test
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	
}

abstract class  Test1 extends Test
{
	void m1()
	{
		System.out.println("This is method m1");
	}
}


abstract class  Test2 extends Test1
{
	void m2()
	{
		System.out.println("This is method m2");
	}
}

class Test3 extends Test2
{
	void m3()
	{
		System.out.println("This is method m3");
	}

	void m4()
	{
		System.out.println("This is method m4");
	}


public static void main(String[] args) 
	{
		Test3 t=new Test3();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		Test1 t1=new Test3();
        t1.m1();
		t1.m2();
		t1.m3();
		//t1.m4();

		
	}

}

	

