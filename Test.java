class A 
{
	int a=10;
	int b=20;
}
class B extends A
{
	int a=100;
	int b=200;
void sum(int a,int b)
	{
	System.out.println(a+b);
System.out.println(this.a+this.b);
System.out.println(super.a+super.b);
}
public static void main(String[] args)
	{
	new B().sum(1000,2000);
	}

}

