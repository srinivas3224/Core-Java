class A 
{
	void m1(){System.out.println("This parent m1 method");}
}
class B extends A
{
	void m1(){System.out.println("This is child m1 method");}

void m2()
	{
	this.m1();
	super.m1();
	}
	
public static void main(String[] args)
	{
	new B().m2();
	}

}

