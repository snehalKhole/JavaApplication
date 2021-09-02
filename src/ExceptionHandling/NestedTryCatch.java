package ExceptionHandling;

import java.io.IOException;

public class NestedTryCatch {

	public static void main(String[] args) throws IOException {

		try
		{
			int a=10;
			int b=0;
			System.out.println("Division:"+a/b);
			
			try 
			{
				int x=10;
				int y=20;
				System.out.println("Multiplication:"+x*y);
				
				try
				{
					int s=30;
					int d=11;
					System.out.println("Addition:"+(s+d));
				}
				catch(ArithmeticException  e)
				{
					System.out.println(e.getMessage());
				}
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("plz do not divide number by zero");
		}
	}

}
