class Test 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);

		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.print(e);
		 System.out.print(e.getMessage());
		}
	}
}
