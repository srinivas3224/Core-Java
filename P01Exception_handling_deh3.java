class Test 
{
	public static void main(String[] args) 
	{
		mvr();
	}

	public static void mvr()
	{
		srinivas();
	}
	public static void srinivas()
	{
		srithan();
		System.out.println(32/0);
	}
	public static void srithan()
	{
		System.out.println("hello");
	}
}
/*
D:\DS_JAVA_PROGRAMES\Exception Handling>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.srithan(P01Exception_handling_deh2.java:18)
        at Test.srinivas(P01Exception_handling_deh2.java:14)
        at Test.mvr(P01Exception_handling_deh2.java:10)
        at Test.main(P01Exception_handling_deh2.java:5)

D:\DS_JAVA_PROGRAMES\Exception Handling>

D:\DS_JAVA_PROGRAMES\Exception Handling>javac P01Exception_handling_deh3.java

D:\DS_JAVA_PROGRAMES\Exception Handling>java Test
hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.srinivas(P01Exception_handling_deh3.java:15)
        at Test.mvr(P01Exception_handling_deh3.java:10)
        at Test.main(P01Exception_handling_deh3.java:5)

*/