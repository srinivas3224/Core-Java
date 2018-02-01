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
		super()
		System.out.println("child class 0 org constructor");
		}

Child(int a)
	{

	System.out.println("child class 1 org constructor");
		
	}
	
public static void main(String[] args)
	{
	new Child();
	}

}

//D:\DS_JAVA_PROGRAMES\inheritence>javac Test3c2.java
//Test3c2.java:20: error: call to super must be first statement in constructor
    //            super();
                     //