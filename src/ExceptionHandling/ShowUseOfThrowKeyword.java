package ExceptionHandling;

import java.util.InputMismatchException;

public class ShowUseOfThrowKeyword {

	public static void main(String[] args) {
		try
		{
		int a=34;
		int b=0;
		System.out.println("Division:"+a/b);
		throw new InputMismatchException("number must not be divide by zero");

		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
