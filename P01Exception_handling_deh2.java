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
	}
	public static void srithan()
	{
		System.out.println(32/0);
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
*/