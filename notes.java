Abstraction:


The processof Highlating services and 
hiding implemantations in chaild class is called abstraction.



Normal Method:


Abstract Method:


abstract void mvr();


Normal class:

Abstract class:



abstract modifier is applicable for method and class

How to prvent Object creation?
How to prevent Inheritence?
How to prevent Method overriding?

===================================
Example 1:
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

===============================================================================

Example 2:


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

public static void main(String[] args) 
	{
		Test3 t=new Test3();
		t.m1();
		t.m2();
		t.m3();
		

	}

}
=============================================

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
		//t1.m4();????

		
	}

}

	

============================================================



abstract class   Cse4
{
	public static void main(String[] args) 
	{
		System.out.println("Technotsav on 23/02/2017 and 24/02/2017");
	}
}



===================================================================


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




D:\DS_JAVA_PROGRAMES\abstraction>java Test1
This is abstract class Constructor...
This is Main class Constructor...
This is m1 method...

D:\DS_JAVA_PROGRAMES\abstraction>
===================================================================================
	

=========================================================================
