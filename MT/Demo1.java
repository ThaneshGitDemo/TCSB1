class A extends Thread 
{
	public void run()
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
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("B :"+i );
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class C extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("C :"+i );
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class D extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("D :"+i );
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class Demo1
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		a.start();
		b.start();
		c.start();
		d.start();
	
	}
}
// 	
		extends Thread 
		call start 
		overide run 
