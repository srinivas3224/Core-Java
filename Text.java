class Parent
{
}
class Child extends Parent
{
Child()
{
System.out.println("this is child class 0 arg cons");
}
Child(int a)
{
System.out.println("this is child class 1 arg cons");
}
public static void main(String args[])
{
new Child();
}
}