
// P05Exception_handling_ce1.java
import java.io.*;
class Test 
{
	public static void main(String[] args) 
	{
		PrintWriter pw=new PrintWriter("MVR.txt");
		pw.print("Hello World!");
	}
}


/*

D:\DS_JAVA_PROGRAMES\Exception Handling>javac P05Exception_handling_ce1.java
P05Exception_handling_ce1.java:6: error: unreported exception FileNotFoundException; 
must be caught or declared to be thrown
                PrintWriter pw=new PrintWriter("MVR.txt");
                               ^
1 error

D:\DS_JAVA_PROGRAMES\Exception Handling>
*/