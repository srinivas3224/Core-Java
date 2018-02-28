class Test 
{
	static ArithmeticException e;
	public static void main(String[] args) 
	{
		throw e;
	}
}

/*


D:\DS_JAVA_PROGRAMES\Exception Handling>java Test
Exception in thread "main" java.lang.NullPointerException
        at Test.main(P14Exception_handling_throw3.java:6)

D:\DS_JAVA_PROGRAMES\Exception Handling>


*/

