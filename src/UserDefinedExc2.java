import java.lang.Exception;
class MyException extends Exception
{ 
	MyException(int a)
	{	
		System.out.println("Invalid Input:"+a);	
	} 
}
class UserDefinedExc2 {
	static void compute(int a) throws MyException{
		if (a>10)
		{
			throw new MyException(a);} System.out.println("Valid Input:"+a);
		}
	public static void main(String args[])
	{
		try
		{
			compute(10); compute(20);
		}
		catch (MyException e)
		{
			System.out.println("MyException is caught");
		}
	}
}
