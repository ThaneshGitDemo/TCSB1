class A
{
	void abc()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("A :"+i );
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class Demo2
{
	public static void main(String args[])
	{
			A a = new A();
			a.abc();
		

	
	}
}