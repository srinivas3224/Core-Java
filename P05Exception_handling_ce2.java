import java.io.*;
class Test 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		PrintWriter pw=new PrintWriter("MVR.txt");
		pw.print("Hello World!");
		System.out.println(10/0);
	}
}


/*
D:\DS_JAVA_PROGRAMES\Exception Handling>javac P05Exception_handling_ce2.java

D:\DS_JAVA_PROGRAMES\Exception Handling>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(P05Exception_handling_ce2.java:8)

D:\DS_JAVA_PROGRAMES\Exception Handling>
*/