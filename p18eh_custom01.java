class TooYoungException  extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
	
}


class TooOldException  extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
	
}


class CustExceptionDemo
{
	public static void main(String[] args)
	{
		int age=Integer.parseInt(args[0]);

       if(age>60)
		{
		   throw new TooYoungException("Your age crossed marrage age and no chance of getting marrage...");
		}
		else if(age<18)
		{
            throw new TooOldException("wait for some time...definitly you will get better chance..");
		}
		else
		{
			System.out.println("You will get Match Details soon through Email....");
		}

	}
}



