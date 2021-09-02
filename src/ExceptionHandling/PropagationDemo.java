package ExceptionHandling;

import java.io.IOException;

public class PropagationDemo {

	public void demo1()throws IOException
	{
		demo2();
	}
	public void demo2()throws IOException
	{
		demo3();
	}
	public void demo3()throws IOException
	{
		try
		{
			demo2();
		}
		catch(IOException e)
		{
			System.out.println("IOException propagated");
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
			try {
				new PropagationDemo().demo1();
			} 
			catch (IOException e) {
				System.out.println(e);
			}
	}

}
