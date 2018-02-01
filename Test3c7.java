
class Parent
{
	Parent(int a)
	{
		System.out.println("This is 1 org parent constructor....");
	}

}

class Child extends Parent
{
	Child()
	{
		
		System.out.print("child class constructor...");
	}
		public static void main(String[] args )
	{
			new Child();
	}
}

// if no this super the compiler genares super at 1 st line