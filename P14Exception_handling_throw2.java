class Test 
{
	public static void main(String[] args) 
	{
		throw new ArithmeticException("/ by Zero");
	}
}

/*
D:\DS_JAVA_PROGRAMES\Exception Handling>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(P14Exception_handling_throw1.java:5)

D:\DS_JAVA_PROGRAMES\Exception Handling>javac P14Exception_handling_throw2.java

D:\DS_JAVA_PROGRAMES\Exception Handling>java Test
Exception in thread "main" java.lang.ArithmeticException: / by Zero
        at Test.main(P14Exception_handling_throw2.java:5)

D:\DS_JAVA_PROGRAMES\Exception Handling>
*/