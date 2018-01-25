class A
{

	static {
		System.out.println(" This is Static Block A");
	}


   public static void main(String[] args) throws  ClassNotFoundException
	{
	   Class.forName("B");
	   Class.forName("C");
	
	}
}
/*
D:\DS_JAVA_PROGRAMES\ib>javac A.java B.java C.java
A.java:11: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
           Class.forName("B");
                        ^
A.java:12: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
           Class.forName("C");
                        ^
2 errors

D:\DS_JAVA_PROGRAMES\ib>javac A.java B.java C.java

D:\DS_JAVA_PROGRAMES\ib>java A
 This is Static Block A
 This is Static Block B
 This is Static Block C

D:\DS_JAVA_PROGRAMES\ib>
*/