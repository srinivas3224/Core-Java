
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
		 super(10);
		System.out.print("child class constructor...");
	}
		public static void main(String[] args )
	{
			new Child();
	}
}